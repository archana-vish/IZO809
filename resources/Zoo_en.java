package resources;

import java.util.ListResourceBundle;

public class Zoo_en extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {"greetings", "Hello!"}
        };
    }
}
