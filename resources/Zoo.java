package resources;

import java.util.ListResourceBundle;

public class Zoo extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {"name", "London resources.Zoo"}
        };
    }
}