package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefsFull {
    private CalculatorFull calculatorFull;
    private int value1;
    private int value2;
    private String value3;
    private int result;

    @Before
    public void before() {
        calculatorFull = new CalculatorFull();
    }

    @Given("^Tree input values, (-?\\d+), (-?\\d+) and ([*/^])$")
    public void treeInputValuesAnd(int arg0, int arg1, String arg2) {
        value1 = arg0;
        value2 = arg1;
        value3 = arg2;
    }

    @When("^I press Calculate button$")
    public void iPressCalculateButton() {
        result = calculatorFull.calculatorFull(value1, value2, value3);
        System.out.println(result);
    }

    @Then("^Expected result is (-?\\d+)$")
    public void expectedResultIs(int arg0) {
        Assert.assertEquals(arg0, result);
    }
}
