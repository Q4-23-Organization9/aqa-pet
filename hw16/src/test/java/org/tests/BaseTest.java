package org.tests;

import org.testng.annotations.*;
import org.utils.UserOperationsImpl;

import java.util.logging.Logger;




public class BaseTest {

    private static final Logger logger = Logger.getLogger(BaseTest.class.getName());

    protected UserOperationsImpl userOperations;

    @BeforeTest
    public void setUp() {
        logger.info("Initializing UserOperationsImpl for testing");
        userOperations = new UserOperationsImpl();
    }

    @AfterTest
    public void tearDown() {
        logger.info("Cleaning up after testing");

    }

    @BeforeMethod
    public void beforeEachTest() {
        logger.info("Setting up before each test method");
        userOperations = new UserOperationsImpl();
    }

    @AfterMethod
    public void afterEachTest() {
        logger.info("Cleaning up after each test method");
    }


}
