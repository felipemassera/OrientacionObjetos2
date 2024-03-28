package ar.edu.unlp.info.oo2.Ejercicio_5_Adapter;

public class VideoStreamAdapter extends Media{

	public void play() {
		VideoStream vs = new VideoStream();
		vs.reproduce();
	};
}
