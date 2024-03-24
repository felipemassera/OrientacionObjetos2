package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Twitter {

	private List<User> users;

	public Twitter() {
		this.users = new ArrayList<>();
	}

	public boolean newUser(String userName) {
		boolean done = false;
		if (findUser(userName)!=null) {
			this.users.add(new User(userName));
			done = true;
		}
		return done;
	}

	public Boolean deleteUser(String userName) {
		Boolean done = false;
		User User = findUser(userName);
		if (User != null) {
			User.deleteUser();
			this.users.remove(User);
			done = true;
		}
		return done;
	}

	private User findUser(String userName) {
		return this.users.stream().filter(u -> u.whoAmI(userName)).findFirst().orElse(null);
	}

	public Tweet createTweet(String text, String userName) {
		Tweet tweet = null;
		User user = findUser(userName);
		if (user != null) {
			tweet = user.newTweet(text);
		}
		return tweet;
	}
}
