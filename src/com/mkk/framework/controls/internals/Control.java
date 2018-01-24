package com.mkk.framework.controls.internals;

import com.mkk.framework.controls.api.ImplementedBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.Locatable;
import org.openqa.selenium.internal.WrapsElement;

/**
 * Created by mboyaci on 04.01.2018.
 */

@ImplementedBy(ControlBase.class)
public interface Control extends WebElement, WrapsElement, Locatable{
}
