/*
 * ImportantTweet
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
 * Represents an important tweet.
 * @author doupton
 * @version 1.0
 * @see Tweet
 * @see NormalTweet
 */
public class ImportantTweet extends Tweet {

    /**
     * Construct an ImportantTweet
     * @param message tweet message
     */
    public ImportantTweet(String message) {
        super(message);
    }

    /**
     * Constructs an ImportantTweet
     * @param message tweet message
     * @param date tweet date
     */
    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Returns true since this tweet is important
     * @return true
     */
    public Boolean isImportant() {
        return true;
    }
}
