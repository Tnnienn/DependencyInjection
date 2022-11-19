package co.develhope.dependencyinjection.components;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private String myComponentName;

    public MyComponent() {
        System.out.println("MyComponent constructor has been called");
        this.myComponentName = "Antonio";
    }

    public String getMyComponentName() {
        System.out.println("MyComponent.getComponentName() has been called");
        return this.myComponentName;
    }

}
