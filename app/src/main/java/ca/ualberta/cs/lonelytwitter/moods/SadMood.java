/*
 * SadMood
 *
 * Version 1.0
 *
 * January 30, 2018
 *
 * Copyright (c) 2018. Template copyright notice.
 */

package ca.ualberta.cs.lonelytwitter.moods;

import java.util.Date;

/**
 * Created by devon on 19/01/18.
 */

public class SadMood extends Mood {

    /**
     * Construct a SadMMood object
     */
    public SadMood(){
        super();
    }

    /**
     * Construct a SadMood object
     * @param date mood date
     */
    public SadMood(Date date){
        super(date);
    }

    /**
     * Returns sad mood
     * @return sad
     */
    public String getMood() {
        return "Sad";
    }
}
