package use_case.clear_users;

// TODO Complete me

import use_case.login.LoginInputBoundary;
import use_case.login.LoginInputData;
import use_case.login.LoginOutputBoundary;

public class ClearInteractor implements ClearInputBoundary {

    ClearUserDataAccessInterface clearUserDataAccessInterface;

    ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary)
    {
        this.clearUserDataAccessInterface = clearUserDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }

    @Override
    public String[] execute(ClearInputData clearInputData) {
        String[] usernames = clearUserDataAccessInterface.clear();
        System.out.println(usernames);
        ClearOutputData message = new ClearOutputData(usernames);
        clearPresenter.prepareSuccessView(message);
        return usernames;
    }
}
