package use_case.clear_users;

// TODO Complete me

public class ClearOutputData {
    private final String usernames;
    private boolean useCaseFailed;

    public ClearOutputData(String username, boolean useCaseFailed) {
        this.usernames = username;
        this.useCaseFailed = useCaseFailed;
    }

    public String getUsernames() {
        return usernames;
    }
}

