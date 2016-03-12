package edu.cs.ubbcluj;

public class LogAnalyzer {

    public static final String END_NAME = "slr";

    public boolean isValidLogFileName(String fileName){
        /*if(fileName.length() < END_NAME.length()){
            throw new IllegalArgumentException("Name is to short.");
        }*/
        return fileName.endsWith(END_NAME) ? true : false;
    }

    public static void main(String[] args) {
        LogAnalyzer validFileName = new LogAnalyzer();
        System.out.println(validFileName.isValidLogFileName("valamislr"));
    }
}
