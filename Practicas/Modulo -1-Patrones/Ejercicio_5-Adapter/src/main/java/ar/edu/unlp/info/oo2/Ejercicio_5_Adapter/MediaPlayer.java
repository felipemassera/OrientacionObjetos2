package ar.edu.unlp.info.oo2.Ejercicio_5_Adapter;

public class MediaPlayer {
	private Media media;
			
	public MediaPlayer() {
		this.media = new Media();
	}

	public void play(){
		this.media.play();
	}
	
	
	
}
