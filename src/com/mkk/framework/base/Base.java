package com.mkk.framework.base;

import com.mkk.framework.controls.api.ControlFactory;

/**
 * Created by mboyaci on 27.12.2017.
 */
public class Base {

    public static BasePage CurrentPage;

    public <TPage extends BasePage> TPage GetInstance(Class<TPage> page)
    {
        //Object obj = PageFactory.initElements(DriverContext.Driver, page);
        //Custom control page factory page initialization
        Object obj = ControlFactory.initElements(DriverContext.Driver, page);
        return page.cast(obj);
    }

}
