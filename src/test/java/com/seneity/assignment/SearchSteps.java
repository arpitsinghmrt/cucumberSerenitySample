package com.seneity.assignment;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jline.internal.Log;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import steps.SearchContentSteps;
import testDataGenerators.ReadExcel;

import java.io.IOException;

public class SearchSteps {

    @Steps
    private SearchContentSteps searchContentSteps;
    private ReadExcel readExcel = new ReadExcel();

    @Before
    public void genTest() {
        try {
            readExcel.readExcelData();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Given("^I am on IMDB home page$")
    public void iAmOnIMDBHomePage() throws Throwable {
        searchContentSteps.isOnTheHomePage();
        Log.info("My Serenity appication");
    }

    @When("^I select TV Episodes in quick search dropdown$")
    public void iSelectTVEpisodesInQuickSearchDropdown() throws Throwable {
        searchContentSteps.selectQuickSearchOption();
    }

    @And("^I enter (.*) in search text box$")
    public void iEnterWalkingDeadInSearchTextBox(String searchKeyword) throws Throwable {
        searchContentSteps.enterSearchkeyword(searchKeyword);
    }

    @And("^I click search button$")
    public void iClickSearchButton() throws Throwable {
        searchContentSteps.clickSearchButton();
    }

    @Then("^I should see (.*) in the search results$")
    public void iShouldSeeWalkingDeadTVEpisodeInTheSearchResults(String expectedResult) throws Throwable {
        searchContentSteps.verifyResultDisplayed(expectedResult);
    }

    @When("^I select (.*) from Movies, TV and Showtimes menu$")
    public void iSelectMostPopularTVShowsFromMoviesTVAndShowtimesMenu(String selectElement) throws Throwable {
        searchContentSteps.selectOptionFromFirstDropdown(selectElement);
    }

    @And("^I click on (.*) on Most Popular TV Shows page$")
    public void iClickOnTheWalkingDeadOnMostPopularTVShowsPage(String tvShow) throws Throwable {
        searchContentSteps.selectTvShowOnMostPopularTvShowsPage(tvShow);
    }

    @Then("^I should see (.*) on the program Details page$")
    public void iShouldSeeCreatorFrankDarabontOnTheProgramDetailsPage(String directorName) throws Throwable {
        searchContentSteps.verifyDirectorName(directorName);

    }
}
