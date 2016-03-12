package edu.cs.ubbcluj;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Zete-Örs on 2016.03.11..
 */
@RunWith(Parameterized.class)
public class ValidFileNameTest {

    public String fInput;
    public boolean fExpected;
    LogAnalyzer logAnalyzer;

    public ValidFileNameTest(String fInput, Boolean fExpected){
        this.fInput = fInput;
        this.fExpected = fExpected;
    }


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"", false},
                {"sl", false},
                {"slr", true},
                {"akarmislr", true},
                {"valamislrr", false}
        });
    }

    @Before
    public void setUp() throws Exception{
        logAnalyzer = new LogAnalyzer();
    }
    @After
    public void tearDown() throws Exception{

    }

    @Test
    public void isValidFileNameReturnTrue(){
        Assert.assertEquals(fExpected, logAnalyzer.isValidLogFileName(fInput));
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void isValidLogFileNameToShortExceptionThrown(){

        try {
            logAnalyzer.isValidLogFileName("jghh");
            Assert.fail("Expected exception to be thrown");
        }catch (IllegalArgumentException e){

        }
    }



}