package edu.cs.ubbcluj;

import org.junit.*;
import org.mockito.Mockito;


/**
 * Created by Zete-Örs on 2016.03.11..
 */
public class ValidFileNameTest {

    private static final String validFileName = "dasd.slr";
    private static final String invalidFileName = "dasd.sl";

    private FakeFileExtMgr fileExtMgr;
    private TestableLogAnalyzer testableLogAnalyzer;
    private WebService manualWebService;
    private LogAnalyzer logAnalyzer;

    @Before
    public void setUp() throws Exception{

        fileExtMgr = new FakeFileExtMgr();
        manualWebService = new ManualWebService();
        logAnalyzer = new LogAnalyzer();
        logAnalyzer.setWebService(manualWebService);
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

    @Test
    public void isValidFileName_FileNameTooShort_CallManulaWebService(){
        logAnalyzer.isValidLogFileName("ad");
        Assert.assertEquals("should be to shourt", manualWebService.getLastError(), "ad is too short");
    }

    @Test
    public void isValidFileName_FileNameTooShort_CallMockWebService(){
        WebService mockWebService = Mockito.mock(WebService.class);
        logAnalyzer.setWebService(mockWebService);
        logAnalyzer.isValidLogFileName("sd");
        Mockito.verify(mockWebService, Mockito.times(2)).logError("sd too short");
    }

/*
    @Test(expected = IllegalArgumentException.class)
    public void isValidLogFileName_Empty_ExceptionThrow() {
        logAnalyzer.isValidLogFileName("");ds
    }
*/
}