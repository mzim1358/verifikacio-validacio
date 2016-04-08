package edu.cs.ubbcluj;

public class LogAnalyzer implements FileExtMgr{

    public static final String END_NAME = "slr";
    private FileExtMgr fileExtMgr;


    public LogAnalyzer(){
        fileExtMgr = FileMgrFactory.getINSTANCE().createMgr();
    }

    public boolean isValidLogFileName(String fileName) {
        fileExtMgr = FileMgrFactory.getINSTANCE().createMgr();
        if(fileName.isEmpty()){
            throw new IllegalArgumentException("File is empty");
        }
        return fileExtMgr != null && fileExtMgr.isValidLogFileName(fileName);
    }

    public void setFileExtMgr(FileExtMgr fileExtMgr){
        this.fileExtMgr = fileExtMgr;
    }

}
