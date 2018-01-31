/*
 * Mood
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
 * @see Tweet
 * @see HappyMood
 * @see SadMood
 */
public abstract class Mood {
    private Date date;

    /**
     * Construct a Mood object
     */
    public Mood(){
        this.date = new Date();
    }

    /**
     * Construct a Mood object
     * @param date mood date
     */
    public Mood(Date date){
        this.date = date;
    }

    /**
     * Get the date of the mood
     * @return date
     */
    public Date getDate(){
        return this.date;
    }

    /**
     * Set the date of the mood
     * @param date mood date
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Get the mood as a string
     * @return mood
     */
    public abstract String getMood();
}
