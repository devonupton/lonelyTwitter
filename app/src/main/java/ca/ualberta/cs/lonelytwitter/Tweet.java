package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

import ca.ualberta.cs.lonelytwitter.moods.Mood;

/**
 * Created by devon on 16/01/18.
 */

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;
    private ArrayList<Mood> moods = new ArrayList<Mood>();

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() < 140) {
            this.message = message;
        } else {
            throw new TweetTooLongException();
        }
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract Boolean isImportant();

    public ArrayList<Mood> getMoods(){
        return this.moods;
    }

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
}
