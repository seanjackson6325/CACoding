package use_case.clear_users;

// TODO Complete me

import use_case.login.LoginOutputData;

public class ClearOutputData {

    private String[] usernames;

    public ClearOutputData(String[] usernames)
    {
        this.usernames = usernames;
    }

    public String[] getUsernames()
    {
        return usernames;
    }

}
