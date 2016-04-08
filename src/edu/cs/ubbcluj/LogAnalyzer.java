package edu.cs.ubbcluj;

public class LogAnalyzer {

    public boolean isValidLogFileName(String fileName) {

        if(fileName.isEmpty()){
            throw new IllegalArgumentException("File is empty");
        }
        return getFileExtMgr() != null && getFileExtMgr().isValidLogFileName(fileName);
    }

    public FileExtMgr getFileExtMgr(){
        //return new FakeFileExtMgr();
        return null;
    }


}
