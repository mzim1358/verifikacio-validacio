package edu.cs.ubbcluj;

/**
 * Created by Zete-Örs on 2016.04.08..
 */
public class TestableLogAnalyzer extends LogAnalyzer{

    private FakeFileExtMgr fakeFileExtMgr;

    public  TestableLogAnalyzer(FakeFileExtMgr fakeFileExtMgr){
        this.fakeFileExtMgr = fakeFileExtMgr;
    }

    @Override
    public FileExtMgr getFileExtMgr(){
        return fakeFileExtMgr;
    }

}
