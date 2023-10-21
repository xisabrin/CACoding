package use_case.clear_users;
import entity.User;
import entity.UserFactory;
import java.time.LocalDateTime;

// TODO Complete me
import use_case.signup.*;

public class ClearInteractor implements ClearInputBoundary{
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;
    final UserFactory userFactory;

    public ClearInteractor(ClearUserDataAccessInterface clearDataAccessInterface,
                            ClearOutputBoundary clearOutputBoundary,
                            UserFactory userFactory) {
        this.userDataAccessObject = clearDataAccessInterface;
        this.userPresenter = clearOutputBoundary;
        this.userFactory = userFactory;
    }

    public void execute(ClearInputData clearInputData) {
        if (!userDataAccessObject.hasUsers()) {
            System.out.println("this is a message");
            userPresenter.prepareFailView("No users exist.");
        } else {

            String usernames = userDataAccessObject.clearUsers();

            ClearOutputData clearOutputData = new ClearOutputData(usernames, false);
            userPresenter.prepareSuccessView(clearOutputData);
        }
    }
}