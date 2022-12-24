package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void testMoodAnalysis(){
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String result=moodAnalyser.analyseMood("I am in sad mood");
        Assert.assertEquals("SAD",result);
    }
    @Test
    public void givenHappyMessage_shouldReturnHappy(){
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String result=moodAnalyser.analyseMood("I am in any mood");
        Assert.assertEquals("HAPPY",result);
    }
}
