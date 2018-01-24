package com.mkk.framework.controls.elements;

import com.mkk.framework.controls.internals.ControlBase;
import org.openqa.selenium.WebElement;

/**
 * Created by mboyaci on 04.01.2018.
 */
public class TextBoxBase extends ControlBase implements TextBox{

    public TextBoxBase(WebElement element) {
        super(element);
    }

    @Override
    public void EnterText(String text) {
        getWrappedElement().sendKeys(text);
    }

    @Override
    public String GetTextValue() {
        return getWrappedElement().getText();
    }
}
