package utilities;

import org.testng.annotations.DataProvider;
import tests.BaseTest;
import tests.seleniumEasy.RadioButtonsDemo;

public class DataProviders  {

    @DataProvider(name = "dataForRadioButtonDemo")
    public static Object[][] dataProviderFunction1() {
        return new Object[][] { {"Male"},
                                {"Female"} };
    }

    @DataProvider(name = "dataForGroupRadioButtonsDemo")
    public static Object[][] dataProviderFunction2() {
        return new Object[][]{ {"Male", "0 - 5"},
                               {"Male", "5 - 15"},
                               {"Male", "15 - 50"},
                               {"Female", "0 - 5"},
                               {"Female", "5 - 15"},
                               {"Female", "15 - 50"} };
    }
}

