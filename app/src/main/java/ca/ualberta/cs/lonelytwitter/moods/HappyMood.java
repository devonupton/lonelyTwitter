package ca.ualberta.cs.lonelytwitter.moods;

import java.util.Date;

/**
 * Created by devon on 19/01/18.
 */

public class HappyMood extends Mood {
    public HappyMood(){
        super();
    }
    public HappyMood(Date date){
        super(date);
    }

    public String getMood() {
        return "I am happy!";
    }
}
