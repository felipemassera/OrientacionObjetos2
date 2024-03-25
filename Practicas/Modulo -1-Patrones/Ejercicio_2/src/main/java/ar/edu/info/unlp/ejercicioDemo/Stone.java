package ar.edu.info.unlp.ejercicioDemo;

public class Stone implements Move {

	@Override
	public String match(Move playVS) {
		return playVS.vsStone();
	}

	@Override
	public String vsStone() {
		return "tie";
	}

	@Override
	public String vsScissors() {
		return "Stone";
	}

	@Override
	public String vsPaper() {
		return "Paper";
	}

	@Override
	public String vsSpock() {
		return "Spock";
	}

	@Override
	public String vsLizzard() {
		return "Stone";
	}
  
}
