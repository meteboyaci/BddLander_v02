package com.mkk.framework.controls.elements;

import com.mkk.framework.controls.internals.ControlBase;
import org.openqa.selenium.WebElement;

public class ComboBoxBase extends ControlBase implements ComboBox{

    public ComboBoxBase(WebElement element) {
        super(element);
    }

    @Override
    public void PerformClick() {
        getWrappedElement().click();
    }

    @Override
    public void PerformDoubleClick()
    {
        getWrappedElement().click();
        getWrappedElement().click();
    }

}
