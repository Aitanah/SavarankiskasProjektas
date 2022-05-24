package pages.seleniumEasy;

import pages.Common;
import pages.Locators;

public class RadioButtonsDemo {

    public static void open() {
        Common.openUrl("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
    }

    public static void clickRadioButtonByValue(String value) {
        Common.clickElement(Locators.SeleniumEasy.RadioButtonsDemo.inputByValue(value));
    }

    public static void clickGetCheckedValue() {
        Common.clickElement(Locators.SeleniumEasy.RadioButtonsDemo.buttonGetCheckedValue);
    }

    public static String readMessage() {
        return Common.getElementText(Locators.SeleniumEasy.RadioButtonsDemo.fieldCheckedValue);
    }
}
