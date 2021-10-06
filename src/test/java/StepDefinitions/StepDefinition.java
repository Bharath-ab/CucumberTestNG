package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
    @When("the Maker starts a game")
    public void the_maker_starts_a_game() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the Maker starts a game");
    }
    @Then("the Maker waits for a Breaker to join")
    public void the_maker_waits_for_a_breaker_to_join() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the Maker waits for a Breaker to join");
    }

    @Given("the Maker has started a game with the word {string}")
    public void the_maker_has_started_a_game_with_the_word(String word) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the Maker has started a game with the word: "+word);
    }
    @When("the Breaker joins the Maker's game")
    public void the_breaker_joins_the_maker_s_game() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the Breaker joins the Maker's game");
    }
    @Then("the Breaker must guess a word with {int} characters")
    public void the_breaker_must_guess_a_word_with_characters(Integer val) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("the Breaker must guess a word with " + val + " characters");
    }
        }
