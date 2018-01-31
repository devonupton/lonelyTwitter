/*
 * Tweetable
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
 * Represents an interface to get message and date from a tweet.
 * @author doupton
 * @version 1.0
 * @see ImportantTweet
 * @see NormalTweet
 * @see Tweet
 */
public interface Tweetable {

    /**
     * Get the tweet message
     * @return tweet message
     */
    String getMessage();

    /**
     * Get the tweet date.
     * @return tweet date
     */
    Date getDate();
}
