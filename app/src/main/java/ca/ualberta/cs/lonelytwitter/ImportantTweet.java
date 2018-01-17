package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Created by devon on 16/01/18.
 */

public class ImportantTweet extends Tweet {
    public ImportantTweet(String message) {
        super(message);
    }

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    public Boolean isImportant() {
        return true;
    }
}
