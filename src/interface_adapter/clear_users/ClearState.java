package interface_adapter.clear_users;

// TODO Complete me

public class ClearState {
    private String usernames = "";
    private String usernameError = null;

    public ClearState() {
    }
    public ClearState(interface_adapter.clear_users.ClearState copy) {
        usernames = copy.usernames;
        usernameError = copy.usernameError;
    }

    // Because of the previous copy constructor, the default constructor must be explicit.

    public String getUsernames() {
        return usernames;
    }

    public String getUsernameError() {
        return usernameError;
    }

    public void setUsernames(String username) {
        this.usernames = username;
    }

    public void setUsernameError(String usernameError) {
        this.usernameError = usernameError;
    }

    @Override
    public String toString() {
        return "ClearState{" +
                "usernames='" + usernames;
    }
}

