package co.develhope.dependencyinjection.components;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private String myComponentName;

    public MyComponent() {
        this.myComponentName = "Antonio";
    }

    public String getMyComponentName() {
        return this.myComponentName;
    }

}
