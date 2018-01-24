package com.mkk.framework.controls.elements;

import com.mkk.framework.controls.api.ImplementedBy;
import com.mkk.framework.controls.internals.Control;

/**
 * Created by mboyaci on 04.01.2018.
 */
@ImplementedBy(ButtonBase.class)
public interface Button extends Control{
    void PerformClick();
    String GetButtonText();
    void PerformSubmit();
}
