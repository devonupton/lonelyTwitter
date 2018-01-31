/*
 * Tweet
 *
 * Version 1.0
 *
 * January 30, 2018
 *
 * Copyright (c) 2018. Template copyright notice.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

import ca.ualberta.cs.lonelytwitter.moods.Mood;

/**
 * Represents a tweet.
 * @author doupton
 * @version 1.0
 * @see ImportantTweet
 * @see NormalTweet
 */
public abstract class Tweet implements Tweetable {

    private String message;
    private Date date;
    private ArrayList<Mood> moods = new ArrayList<Mood>();

    /**
     * Construct a tweet object.
     * @param message tweet message
     */
    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    /**
     * Constructs a tweet object.
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    /**
     * Get the tweet message
     * @return tweet message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Sets a tweet message.
     *
     * @param message tweet message
     * @throws TweetTooLongException The message exceeds 140 characters.
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() < 140) {
            this.message = message;
        } else {
            throw new TweetTooLongException();
        }
    }

    /**
     * Get the tweet date.
     * @return tweet date
     */
    public Date getDate() {
        return this.date;
    }

    /** Set the tweet date
     * @param date tweet date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Return true if the tweet is important, else false.
     * @return true if important
     */
    public abstract Boolean isImportant();

    /**
     * Get a list of moods for this tweet.
     * @return list of moods
     */
    public ArrayList<Mood> getMoods(){
        return this.moods;
    }

    /**
     * Convert to string based on date and message
     * @return date + message as a string
     */
    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
}
