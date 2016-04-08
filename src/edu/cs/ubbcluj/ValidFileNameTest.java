package edu.cs.ubbcluj;

import org.junit.*;


/**
 * Created by Zete-Örs on 2016.03.11..
 */
public class ValidFileNameTest {

    private static final String validFileName = "dasd.slr";
    private static final String invalidFileName = "dasd.sl";

    private FakeFileExtMgr fileExtMgr;
    private TestableLogAnalyzer testableLogAnalyzer;
    @Before
    public void setUp() throws Exception{

        fileExtMgr = new FakeFileExtMgr();
        //logAnalyzer.setFileExtMgr(fileExtMgr);
    }
    @After
    public void tearDown() throws Exception{

    }

    @Test
    public void isValidFileNameReturnTrue(){

        fileExtMgr.setValid(true);
        testableLogAnalyzer = new TestableLogAnalyzer(fileExtMgr);
        Assert.assertEquals(true, testableLogAnalyzer.isValidLogFileName(validFileName));
    }
/*
    @Test(expected = IllegalArgumentException.class)
    public void isValidLogFileName_Empty_ExceptionThrow() {
        logAnalyzer.isValidLogFileName("");
    }
*/
}