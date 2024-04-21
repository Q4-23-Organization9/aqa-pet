package com.example.tests;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "userData")
    public Object[][] userData() {
        return new Object[][] {
                {"Olha", "AQA"},
                {"John", "Developer"},
                {"", ""},


        };
    }

    @DataProvider(name = "positiveUserData")
    public Object[][] positiveUserData() {
        return new Object[][] {
                {1},
                {2},
                {3},
                {4},
                {5},
                {6}
        };
    }

    @DataProvider(name = "positiveFixUserData")
    public Object[][] positiveFixUserData() {
        return new Object[][] {
                {1, "UpdatedName1", "UpdatedJob1"},
                {2, "UpdatedName2", "UpdatedJob2"},
                {3, "UpdatedName3", "UpdatedJob3"},
                {4, "UpdatedName4", "UpdatedJob4"},
                {5, "UpdatedName5", "UpdatedJob5"},
                {6, "UpdatedName6", "UpdatedJob6"}
        };
    }

    @DataProvider(name = "wrongEndpointAndUserData")
    public Object[][] wrongEndpointAndUserData() {
        return new Object[][] {
                {"/api/users123", "UserName1", "UserJob1"},
                {"/api/us", "UserName2", "UserJob2"},
                {"/api/us%#*", "UserName3", "UserJob3"},
                {"/api/*", "UserName4", "UserJob4"}

        };
    }

    @DataProvider(name = "nonExistingUserId")
    public Object[][] nonExistingUserId() {
        return new Object[][] {
                {23},
                {28},
                {29},
                {30},
                {111},
                {1125555555}
        };
    }

    @DataProvider(name = "negativeFixUserData")
    public Object[][] negativeFixUserData() {
        return new Object[][] {
                {23, "UpdatedName1", "UpdatedJob1"},
                {28, "UpdatedName2", "UpdatedJob2"},
                {39, "UpdatedName3", "UpdatedJob3"},
                {45, "UpdatedName4", "UpdatedJob4"},
                {57, "UpdatedName5", "UpdatedJob5"},
                {69, "UpdatedName6", "UpdatedJob6"}
        };
    }



}
