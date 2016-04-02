package edu.cs.ubbcluj;

/**
 * Created by Zete-Örs on 2016.03.25..
 */
public class FakeFileExtMgr implements FileExtMgr {

    private boolean valid;

    @Override
    public boolean isValidLogFileName(String fileName) {
        return valid;
    }

    public void setValid(boolean valid){
        this.valid = valid;
    }
}
