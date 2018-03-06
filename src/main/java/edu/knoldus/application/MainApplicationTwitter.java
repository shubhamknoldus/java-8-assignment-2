package edu.knoldus.application;

import edu.knoldus.operation.classes.assignment.twitter.TwitterOperation;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class MainApplicationTwitter {
    public MainApplicationTwitter() {
    }

    /*public static void main(final String[] args)
            throws InterruptedException, ExecutionException {
        int sleepThread = 10000;
        TwitterOperation obj = new TwitterOperation("virat");
        CompletableFuture<String> numberOfTweets = obj.getNumberOfTweets();
        CompletableFuture<String> averageTweetsPerDay =
                obj.averageTweetsPerDay();
        CompletableFuture<String> averageTweetsAndLikePerTweet =
                obj.averageLikesAndReTweets();
        System.out.println(numberOfTweets.get());
        System.out.println(averageTweetsPerDay.get());
        System.out.println(averageTweetsAndLikePerTweet.get());
    }*/
}
