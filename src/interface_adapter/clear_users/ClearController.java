package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;
import use_case.clear_users.ClearInputData;

// TODO Complete me
public class ClearController {

    final ClearInputBoundary clearUseCaseInteractor;

    public ClearController(ClearInputBoundary clearUseCaseInteractor)
    {
        this.clearUseCaseInteractor = clearUseCaseInteractor;
    }

    public String[] execute()
    {
        return this.clearUseCaseInteractor.execute(new ClearInputData());
    }
}
