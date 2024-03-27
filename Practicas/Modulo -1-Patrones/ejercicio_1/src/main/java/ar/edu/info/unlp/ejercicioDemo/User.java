package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String screenName;
	private List<Tweet> tweets;
	private List<reTweet> reTweets;

	public User(String screenName) {
		this.screenName = screenName;
		this.reTweets = new ArrayList<>();
		this.tweets = new ArrayList<>();
	}

	public String getName() {
		return this.screenName;
	}

	public Tweet newTweet(String text) {
		Tweet newTweet = null;
		if ((text.length() > 0) && (text.length() <= 280)) {
			newTweet= new Tweet(text);
			this.tweets.add(newTweet);
		}
		return newTweet;
	}

	public void newReTweet(Tweet tweet) {
		this.reTweets.add(new reTweet(tweet));
	}

	public boolean whoAmI(String userName) {
		return this.screenName.equals(userName);
	}

	// tweet -> change text "this tweet has been deleted" and clear list
	// reTweets clear
	public void deleteUser() {
		this.reTweets.clear();
		this.tweets.stream().forEach(tweet -> tweet.deleteTweet());
		this.tweets.clear();
	}

	public List<Tweet> getTweets() {
		return tweets;
	}

	public List<reTweet> getReTweets() {
		return reTweets;
	}
	
}