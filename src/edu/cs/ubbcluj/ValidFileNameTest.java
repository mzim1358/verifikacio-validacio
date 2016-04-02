package edu.cs.ubbcluj;

import org.junit.*;


/**
 * Created by Zete-Örs on 2016.03.11..
 */
public class ValidFileNameTest {

    private static final String validFileName = "dasd.slr";
    private static final String invalidFileName = "dasd.sl";

    private LogAnalyzer logAnalyzer;
    private FakeFileExtMgr fileExtMgr;

    @Before
    public void setUp() throws Exception{
        logAnalyzer = new LogAnalyzer();
        fileExtMgr = new FakeFileExtMgr();
        logAnalyzer.setFileExtMgr(fileExtMgr);
    }
    @After
    public void tearDown() throws Exception{

    }

    @Test
    public void isValidFileNameReturnTrue(){
        fileExtMgr.setValid(true);
        Assert.assertEquals(validFileName + " valid", logAnalyzer.isValidLogFileName(invalidFileName), true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isValidLogFileName_Empty_ExceptionThrow() {
        logAnalyzer.isValidLogFileName("");
    }

}