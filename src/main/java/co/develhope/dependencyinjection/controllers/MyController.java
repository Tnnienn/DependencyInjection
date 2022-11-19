package co.develhope.dependencyinjection.controllers;

import co.develhope.dependencyinjection.components.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private MyComponent myComponent;

    @Autowired
    public MyController(MyComponent myComponent) {
        this.myComponent = myComponent;
    }
}
