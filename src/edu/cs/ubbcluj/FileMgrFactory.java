package edu.cs.ubbcluj;

/**
 * Created by Zete-Örs on 2016.04.08..
 */
public class FileMgrFactory {

    private static FileMgrFactory INSTANCE = new FileMgrFactory();
    private FileExtMgr fileExtMgr;

    private FileMgrFactory(){

    }

    public static FileMgrFactory getINSTANCE(){
        return INSTANCE;
    }

    public FileExtMgr createMgr(){
        if(fileExtMgr != null){
            return fileExtMgr;
        }
        //return true fileExtMgr
        return null;
    }

    public void setFileMgr(FileExtMgr fileExtMgr){
        this.fileExtMgr = fileExtMgr;
    }

}
