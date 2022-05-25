package pages;

import org.openqa.selenium.By;

public class Locators {

    public static class SeleniumEasy {

        public static class SimpleFormDemo {
            public static By frameAd = By.xpath("//*[@id='at-cv-lightbox-win']");
            public static By buttonCloseAd = By.xpath("//*[@id='at-cv-lightbox-close']");
            public static By inputMessage = By.xpath("//*[@id='user-message']");
            public static By buttonShowMessage = By.xpath("//*[@id='get-input']//button");
            public static By fieldMessage = By.xpath("//*[@id='display']");
            public static By inputValueA = By.xpath("//*[@id='sum1']");
            public static By inputValueB = By.xpath("//*[@id='sum2']");
            public static By buttonGetTotal = By.xpath("//*[@id='gettotal']//button");
            public static By fieldTotal = By.xpath("//*[@id='displayvalue']");
        }

        public static class CheckboxDemo {
            public static By inputSingleCheckbox = By.xpath("//*[@id='isAgeSelected']");
            public static By fieldSingleCheckbox = By.xpath("//*[@id='txtAge']");
            public static By buttonMultipleCheckbox = By.xpath("//*[@id='check1']");
            public static By inputMultipleCheckbox = By.xpath("//*[@class='cb1-element']");
        }

        public static class SelectDropdownList {
            public static By selectDayOfWeek = By.xpath("//*[@id='select-demo']");
            public static By fieldDayOfWeek = By.xpath("//*[@class='selected-value']");
        }

        public static class RadioButtonsDemo {
            public static By inputByValue(String value) {
                return By.xpath("//*[@name='optradio' and @value='" + value + "']");
            }
            public static By buttonGetCheckedValue = By.xpath("//*[@id='buttoncheck']");
            public static By fieldCheckedValue = By.xpath("//*[@class='radiobutton']");
//           male ir female
            public static By inputBySex(String sex) {
                return By.xpath("//*[@name='gender' and @value='" + sex + "']");
            }
//            age group
            public static By inputByAgeGroup(String ageGroup) {
                return By.xpath("//*[@name='ageGroup' and @value='" + ageGroup + "']");
            }
            public static By buttonGetValues = By.xpath("(//*[@type='button'])[3]");
            public static By fieldSexAndAgeGroup = By.xpath("//*[@class='groupradiobutton']");
        }

        public static class JavascriptAlerts{
            public static By buttonForAlertBox = By.xpath("//*[@class='btn btn-default']");
            public static By buttonForConfirmBox = By.xpath("//*[@class='btn btn-default btn-lg' and text()='Click me!']");
            public static By buttonForPromptBox = By.xpath("//*[@class='btn btn-default btn-lg' and text()='Click for Prompt Box']");
            public static By fieldConfirmBoxMessage = By.xpath("//*[@id='confirm-demo']");
            public static By fieldPromptBoxMessage = By.xpath("//*[@id='prompt-demo']");
        }
    }
}