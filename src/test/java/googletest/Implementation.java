package googletest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Implementation {
@Given("^\"([^\"]*)\"  has enter \"([^\"]*)\" as e-mail, \"([^\"]*)\" as password \"([^\"]*)\" as city and \"([^\"]*)\" as phone no and Name as \"([^\"]*)\"$")
public void has_enter_as_e_mail_as_password_as_city_and_as_phone_no_and_Name_as(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@When("^Click on \"([^\"]*)\"$")
public void click_on(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
}

@Then("^System Display \"([^\"]*)\"$")
public void system_Display(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  //  throw new PendingException();
}

@Then("^Send a mail with \"([^\"]*)\"$")
public void send_a_mail_with(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  //  throw new PendingException();
}



}
