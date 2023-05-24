package com.lin.test.framework;

import com.lin.test.framework.services.Service1;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractStepDefinition extends BaseTestRunner{

    @Autowired
    Service1 service1;


    public Service1 service1() {
        return service1;
    }
}
