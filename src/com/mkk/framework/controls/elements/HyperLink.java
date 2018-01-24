package com.mkk.framework.controls.elements;

import com.mkk.framework.controls.api.ImplementedBy;
import com.mkk.framework.controls.internals.Control;

/**
 * Created by mboyaci on 05.01.2018.
 */
@ImplementedBy(HyperLinkBase.class)
public interface HyperLink extends Control {


    void ClickLink();
    String GetUrlText();
    boolean CheckUrlTextContains(String containsText);
}
