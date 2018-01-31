/*
 * HappyMood
 *
 * Version 1.0
 *
 * January 30, 2018
 *
 * Copyright (c) 2018. Template copyright notice.
 */

package ca.ualberta.cs.lonelytwitter.moods;

import java.util.Date;

import ca.ualberta.cs.lonelytwitter.Tweet;

/**
 * Represents an mood for a tweet.
 * @author doupton
 * @version 1.0
 * @see Mood
 */
public class HappyMood extends Mood {

    /**
     * Construct a HappyMood object
     */
    public HappyMood(){
        super();
    }

    /**
     * Construct a HappyMood object
     * @param date mood date
     */
    public HappyMood(Date date){
        super(date);
    }

    /**
     * Returns the happy mood
     * @return happy
     */
    public String getMood() {
        return "Happy";
    }
}
