package edu.knoldus.operation.classes.assignment.twitter;

import twitter4j.*;
import twitter4j.auth.AccessToken;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.CompletableFuture;

public class TwitterOperation {
    private String hashTag;
    private Twitter twitter = new TwitterFactory().getInstance();
    private Query query;

    public TwitterOperation(String hashTag) {
        this.hashTag = "#" + hashTag;
        Properties prop = new Properties();
        try {
            InputStream input = new FileInputStream("/home/knoldus/Desktop/Assignments/java8assignment2/src/main/resources/config.properties");
            prop.load(input);
            twitter.setOAuthConsumer(prop.getProperty("consumerKey"), prop.getProperty("consumerSecret"));
            twitter.setOAuthAccessToken(new AccessToken(prop.getProperty("accessToken"), prop.getProperty("accessSecret")));
            query = new Query(this.hashTag);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @return number of tweets in form of Completable future formatted in a string
     */
    public CompletableFuture<String> getNumberOfTweets() {
        return CompletableFuture.supplyAsync(() -> {
            Integer noOfTweets = 0;
            try {
                noOfTweets = twitter.search(query).getTweets().size();
            } catch (TwitterException e) {
                e.printStackTrace();
            }
            return noOfTweets;
        }).thenApply((Integer noTweets) -> noTweets + " is the number of tweets for hashTag " + this.hashTag);
    }

    /**
     * @return average tweets per day in form of Completable future formatted in a string
     */
    public CompletableFuture<String> averageTweetsPerDay() {
        return CompletableFuture.supplyAsync(() -> {
            Double avreageTweets = 0.0;
            try {
                avreageTweets = twitter.search(query).getTweets().size() / 10.0;
            } catch (TwitterException e) {
                e.printStackTrace();
            }
            return avreageTweets;
        }).thenApply(average -> "average tweets per day are " + average);
    }

    /**
     * @return average likes and retweets in form of Completable future formatted in a string
     */
    public CompletableFuture<String> averageLikesAndReTweets() {
        return CompletableFuture.supplyAsync(() -> {
            String result = null;
            try {
                List<Status> list = twitter.search(query).getTweets();
                Double averageLikes = list.parallelStream()
                        .map(Status::getFavoriteCount).reduce((a, b) -> a + b).get() / list.size() + 0.0;
                Double averageRetweetts = list.parallelStream()
                        .map(Status::getRetweetCount).reduce((a, b) -> a + b).get() / list.size() + 0.0;
                result = "average retweets are " + averageRetweetts + " and average likes are " + averageLikes;
            } catch (TwitterException e) {
                e.printStackTrace();
            }
            return result;
        });
    }
}
