package com.herokuapp.theinternet.dropdowntests;

import com.herokuapp.theinternet.base.TestUtilities;
import com.herokuapp.theinternet.pages.DropdownPage;
import com.herokuapp.theinternet.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest extends TestUtilities {

    @Test
    public void optionTwoTest() {
        log.info("Starting optionTwoTest");

        // open main page
        WelcomePage welcomePage = new WelcomePage(driver, log);
        welcomePage.openPage();

        // click on Dropdown link
        DropdownPage dropdownPage = welcomePage.clickDropdownLink();

        // select option 2
        dropdownPage.selectOption(2);

        // verify option 2 is selected
        String seletedOption = dropdownPage.getSelectedOption();
        Assert.assertTrue(seletedOption.equals("Option 2"),
                "Option 2 is not selected. Instead selected - " + seletedOption);
    }
}
