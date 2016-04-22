package edu.cs.ubbcluj;

/**
 * Created by Zete-Örs on 2016.04.22..
 */
public class ManualWebService implements WebService{


    private String lastError;

    public void logError(String lastError){
        this.lastError = lastError;
    }

    @Override
    public String getLastError() {
        return lastError;
    }


}
