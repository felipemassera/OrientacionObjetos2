package ar.edu.info.unlp.ejercicioDemo;

public class Tweet {
private String text;
	
	public Tweet (String text) {
		this.text = text;
	}
		
	public String getText() {
		return text;
	}

	public void editTweet(String newText) {
		this.text = newText;
	}
	
	public void deleteTweet() {
		this.editTweet("this tweet has been deleted");
	}
}
