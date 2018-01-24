package com.mkk.framework.controls.elements;


import com.mkk.framework.controls.api.ImplementedBy;

@ImplementedBy(ComboBoxBase.class)
public interface ComboBox {
    void PerformClick();
    void PerformDoubleClick();
}
