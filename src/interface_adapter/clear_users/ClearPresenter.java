package interface_adapter.clear_users;
import interface_adapter.login.LoginState;
import interface_adapter.login.LoginViewModel;
import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;
import interface_adapter.signup.SignupState;
import interface_adapter.signup.SignupViewModel;

public class ClearPresenter implements ClearOutputBoundary{
    private final ClearViewModel clearViewModel;
    private ViewManagerModel viewManagerModel;

    public ClearPresenter(ViewManagerModel viewManagerModel,
                           ClearViewModel clearViewModel) {
        this.viewManagerModel = viewManagerModel;
        this.clearViewModel = clearViewModel;
    }
    @Override
    public void prepareSuccessView(ClearOutputData response) {
        ClearState clearState = new ClearState();
        clearState.setUsernames(response.getUsernames());
        clearViewModel.setState(clearState);
        clearViewModel.firePropertyChanged();

        viewManagerModel.setActiveView(clearViewModel.getViewName());
        viewManagerModel.firePropertyChanged();
    }

    @Override
    public void prepareFailView(String error) {
        ClearState clearState = clearViewModel.getState();
        clearState.setUsernameError(error);
        clearViewModel.firePropertyChanged();
    }
}

