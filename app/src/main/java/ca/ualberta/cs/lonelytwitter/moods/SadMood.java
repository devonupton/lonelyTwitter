package ca.ualberta.cs.lonelytwitter.moods;

import java.util.Date;

/**
 * Created by devon on 19/01/18.
 */

public class SadMood extends Mood {
    public SadMood(){
        super();
    }
    public SadMood(Date date){
        super(date);
    }

    public String getMood() {
        return "I'm sad...";
    }
}
