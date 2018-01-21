package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SearchResultsPage extends PageObject {
    @FindBy(className = "findList")
    WebElementFacade resultTable;

    public String read_result_table_data() {
        return resultTable.getText();
    }

}

