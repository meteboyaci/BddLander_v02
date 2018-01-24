package com.mkk.test.pages;

import com.mkk.framework.base.BasePage;
import com.mkk.framework.controls.elements.Button;
import com.mkk.framework.controls.elements.TextBox;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class HomePage extends BasePage{


    @FindBy(how = How.XPATH, using = "//*[@id=\"hplogo\"]")
    public WebElement hpLogo;

    @FindBy(how = How.XPATH, using = "//*[@id=\"lst-ib\"]")
    public TextBox txtSearch;




    public boolean IsLoaded()
    {
        return hpLogo.isDisplayed();
    }

    public void GoogleSearch(String searchKey)
    {
        txtSearch.EnterText(searchKey);
    }

    public void SubmitSearch()
    {
        txtSearch.sendKeys(Keys.ENTER);
    }
}
