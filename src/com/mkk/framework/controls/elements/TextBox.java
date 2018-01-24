package com.mkk.framework.controls.elements;

import com.mkk.framework.controls.api.ImplementedBy;
import com.mkk.framework.controls.internals.Control;

/**
 * Created by mboyaci on 04.01.2018.
 */

@ImplementedBy(TextBoxBase.class)
public interface TextBox extends Control{

    void EnterText(String text);
    String GetTextValue();
}
