import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Calculator;
import org.junit.jupiter.api.Assertions;

public class MyStepdefs {
    @Given("cucumber is downloaded")
    public void cucumberIsDownloaded() {
        System.out.println("works");
    }

    @When("I try to run a scenario")
    public void iTryToRunAScenario() {
        System.out.println("works");
    }

    @Then("cucumber works")
    public void cucumberWorks() {
        System.out.println("works");
    }

    Calculator c = new Calculator();
    int actual;
    @Given("I have a calculator")
    public void iHaveACalculator() throws Exception {
        if(c == null)
            throw new Exception();
    }

    @When("I add {int} and {int}")
    public void iAddAnd(int arg0, int arg1) {
        actual = c.add(arg0, arg1);
    }

    @Then("the result is {int}")
    public void theResultIs(int expected) {
        Assertions.assertEquals(actual, expected);
    }

}
