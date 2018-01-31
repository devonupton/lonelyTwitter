/*
 * NormalTweet
 *
 * Version 1.0
 *
 * January 30, 2018
 *
 * Copyright (c) 2018. Template copyright notice.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a normal tweet.
 * @author doupton
 * @version 1.0
 * @see Tweet
 * @see ImportantTweet
 */
public class NormalTweet extends Tweet {

    /**
     * Constructs a NormalTweet
     * @param message tweet message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Constructs a NormalTweet
     * @param message tweet message
     * @param date tweet date
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Returns false since this tweet isn't important
     * @return false
     */
    public Boolean isImportant() {
        return false;
    }
}
