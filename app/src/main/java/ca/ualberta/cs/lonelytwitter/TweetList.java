package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by devon on 13/02/18.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void addTweet(Tweet tweet){
        if (this.hasTweet(tweet)){
            throw new IllegalArgumentException("Duplicate tweet");
        }
        tweets.add(tweet);

    }

    public boolean hasTweet(Tweet tweet){
        for (Tweet tw : tweets){
            if (tw.equals(tweet))
                return true;
        }
        return false;
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    public int getCount(){
        return tweets.size();
    }

    public List<Tweet> getTweets(){
        // Source: https://stackoverflow.com/questions/1814095

        List<Tweet> sorted = new ArrayList<>(tweets);
        Collections.sort(sorted, new Comparator<Tweet>() {
            public int compare(Tweet one, Tweet other) {
                return one.getDate().compareTo(other.getDate());
            }
        });
        return sorted;
    }

}
