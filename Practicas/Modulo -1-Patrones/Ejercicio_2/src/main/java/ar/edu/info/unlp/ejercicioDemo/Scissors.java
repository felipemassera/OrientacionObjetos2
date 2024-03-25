package ar.edu.info.unlp.ejercicioDemo;

public class Scissors implements Move {

	@Override
	public String match(Move playVS) {
		return playVS.vsScissors();
	}

	@Override
	public String vsStone() {
		return "Stone";
	}

	@Override
	public String vsScissors() {
		return "Tie";
	}

	@Override
	public String vsPaper() {
		return "Scissors";
	}

	@Override
	public String vsSpock() {
		return "Spock";
	}

	@Override
	public String vsLizzard() {
		return "Scissors";
	}
  

}
