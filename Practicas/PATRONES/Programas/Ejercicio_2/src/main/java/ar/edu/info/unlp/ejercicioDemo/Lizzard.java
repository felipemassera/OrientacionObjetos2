package ar.edu.info.unlp.ejercicioDemo;

public class Lizzard implements Move {

	@Override
	public String match(Move playVS) {
		return playVS.vsLizzard();
	}

	@Override
	public String vsStone() {
		return "Stone";
	}

	@Override
	public String vsScissors() {
		return "Scissors";
	}

	@Override
	public String vsPaper() {
		return "Lizzard";
	}

	@Override
	public String vsSpock() {
		return "Lizzard";
	}

	@Override
	public String vsLizzard() {
		return "tie";
	}
  
}
