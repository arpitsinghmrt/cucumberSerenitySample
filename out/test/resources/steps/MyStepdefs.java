package steps;

import cucumber.api.PendingException;

public class MyStepdefs {
    public MyStepdefs() {
        Given("^this is my test step$", () -> {
            throw new PendingException();
        });
    }
}
