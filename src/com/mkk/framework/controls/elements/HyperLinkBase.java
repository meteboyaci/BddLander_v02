package com.mkk.framework.controls.elements;

import com.mkk.framework.controls.internals.ControlBase;
import org.openqa.selenium.WebElement;

/**
 * Created by mboyaci on 05.01.2018.
 */
public class HyperLinkBase extends ControlBase implements HyperLink {
    public HyperLinkBase(WebElement element) {
        super(element);
    }

    @Override
    public void ClickLink() {
        getWrappedElement().click();
    }

    @Override
    public String GetUrlText() {
        return getWrappedElement().getText();
    }

    @Override
    public boolean CheckUrlTextContains(String containsText) {
        if (getWrappedElement().getText().contains(containsText))
            return true;
        else
            return false;
    }
}
