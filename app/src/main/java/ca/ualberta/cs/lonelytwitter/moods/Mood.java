package ca.ualberta.cs.lonelytwitter.moods;

import java.util.Date;

/**
 * Created by devon on 19/01/18.
 */

public abstract class Mood {
    private Date date;

    public Mood(){
        this.date = new Date();
    }
    public Mood(Date date){
        this.date = date;
    }

    public Date getDate(){
        return this.date;
    }
    public void setDate(Date date){
        this.date = date;
    }

    public abstract String getMood();
}
