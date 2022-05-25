package tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.BaseTest;
import pages.seleniumEasy.DataProviders;

public class RadioButtonsDemo extends BaseTest {

    @BeforeMethod
    public void openLink() {
        pages.seleniumEasy.RadioButtonsDemo.open();
    }

    @Test(dataProvider = "dataForRadioButtonDemo", dataProviderClass = DataProviders.class)
    public void radioButtonDemo(String value) {

        pages.seleniumEasy.RadioButtonsDemo.clickRadioButtonByValue(value);
        pages.seleniumEasy.RadioButtonsDemo.clickGetCheckedValue();
        String message = pages.seleniumEasy.RadioButtonsDemo.readMessage();

        Assert.assertTrue(message.contains(value));
    }

    @Test(dataProvider = "dataForGroupRadioButtonsDemo", dataProviderClass = DataProviders.class)
    public void groupRadioButtonsDemo(String sex, String ageGroup) {

         pages.seleniumEasy.RadioButtonsDemo.clickRadioButtonBySex(sex);
         pages.seleniumEasy.RadioButtonsDemo.clickRadioButtonByAgeGroup(ageGroup);
         pages.seleniumEasy.RadioButtonsDemo.clickGetValues();
         String message = pages.seleniumEasy.RadioButtonsDemo.readMessageSexAgeGroup();

         Assert.assertTrue(message.contains(sex));
         Assert.assertTrue(message.contains(ageGroup));
        }
}

