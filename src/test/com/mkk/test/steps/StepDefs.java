package com.mkk.test.steps;

import com.mkk.framework.base.Base;
import com.mkk.framework.base.BasePage;
import com.mkk.framework.base.Browser;
import com.mkk.framework.config.Settings;
import com.mkk.framework.utilities.CucumberUtil;
import com.mkk.framework.utilities.ExcelUtil;
import com.mkk.test.pages.*;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.it.Ma;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import sun.security.jca.GetInstance;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.List;
import java.util.Set;

/**
 * Created by mboyaci on 02.01.2018.
 */
public class StepDefs extends Base{

    private BasePage currentPage;

    @Given("^I ensure that the home page opened$")
    public void iEnsureThatTheHomePageOpened() throws Throwable {
        CurrentPage = GetInstance(HomePage.class);
        Thread.sleep(2000);
        Assert.assertTrue("The login page is not loaded", CurrentPage.As(HomePage.class).IsLoaded());
    }

    @And("^I enter the following on the Google search text field$")
    public void iEnterTheFollowingOnTheGoogleSearchTextField(DataTable dataTable) throws Throwable {
        Thread.sleep(1000);
        CucumberUtil.ConvertDataTableToDict(dataTable);
        CurrentPage.As(HomePage.class).GoogleSearch(CucumberUtil.GetCellValue("searchKey"));
    }

    @And("^I submit the searchKey$")
    public void iSubmitTheSearchKey() throws Throwable {
        CurrentPage.As(HomePage.class).SubmitSearch();
    }
}
