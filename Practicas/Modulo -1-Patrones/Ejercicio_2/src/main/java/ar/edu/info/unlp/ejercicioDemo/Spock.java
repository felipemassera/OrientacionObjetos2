package ar.edu.info.unlp.ejercicioDemo;

public class Spock implements Move {

	@Override
	public String match(Move playVS) {
		return playVS.vsSpock();
	}

	@Override
	public String vsStone() {
		return "Spock";
	}

	@Override
	public String vsScissors() {
		return "Spock";
	}

	@Override
	public String vsPaper() {
		return "Paper";
	}

	@Override
	public String vsSpock() {
		return "Tie";
	}

	@Override
	public String vsLizzard() {
		return "Lizzard";
	}
  

}
