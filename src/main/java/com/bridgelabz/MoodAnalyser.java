package com.bridgelabz;
public class MoodAnalyser {
    private String message;
    public MoodAnalyser(){

    }
    public MoodAnalyser(String message){
        this.message=message;
    }
    public String analyseMood(){
        /**
         * add exception when user provide any mood like null
         */
        try {
            if (message.contains("sad")) {
                return "SAD";
            }
            else {
                return "HAPPY";
            }
        }catch (NullPointerException e){
            return "HAPPY";
        }
    }
}
