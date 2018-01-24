package com.mkk.framework.controls.elements;

import com.mkk.framework.controls.internals.ControlBase;
import org.openqa.selenium.WebElement;

/**
 * Created by mboyaci on 04.01.2018.
 */
public class ButtonBase extends ControlBase implements Button{

    public ButtonBase(WebElement element) {
        super(element);
    }

    @Override
    public void PerformClick() {
        getWrappedElement().click();
    }

    @Override
    public String GetButtonText() {
        return getWrappedElement().getText();
    }

    @Override
    public void PerformSubmit() {
        getWrappedElement().submit();
    }
}
