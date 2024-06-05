package ar.edu.unlp.oo1.ejercicio1.impl;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.LoggingPermission;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {
	private static Logger implementation = Logger.getLogger("WallPostImpl"); //creo logger
	private String text;
	private int likes;
	private boolean isFeatured;

	public WallPostImpl() {
		this.text = "Undefined post";

	}

	public WallPostImpl(String text, int likes, boolean isFeaured) {
		this.text = text;
		this.likes = likes;
		this.isFeatured = isFeaured;
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public void setText(String text) {
		this.text = text;

	}

	@Override
	public int getLikes() {
		return likes;
	}

	@Override
	public void like() {
		this.likes = this.likes + 1;
		if (likes==10) {
			implementation.warning("Likes = 10 ");
		}

	}

	@Override
	public void dislike() {
		if (likes > 0) {
			this.likes = this.likes - 1;
		}
		if (likes==0) {
			implementation.warning("Likes = 0 ");
		}
	}

	@Override
	public boolean isFeatured() {
		return this.isFeatured;
	}

	@Override
	public void toggleFeatured() {
		this.isFeatured = !this.isFeatured;

	}

	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de
	 * forma adecuada
	 */

	@Override
	public String toString() {
		return "WallPost {" + "text: " + getText() + ", likes: '" + getLikes() + "'" + ", featured: '" + isFeatured()
				+ "'" + "}";
	}

}
