package ar.edu.info.unlp.ejercicioDemo;

public class Paper implements Move {

	@Override
	public String match(Move playVS) {
		return playVS.vsPaper();
	}

	@Override
	public String vsStone() {
		return "Paper";
	}

	@Override
	public String vsScissors() {
		return "Scissors";
	}

	@Override
	public String vsPaper() {
		return "Tie";
	}

	@Override
	public String vsSpock() {
		return "Paper";
	}

	@Override
	public String vsLizzard() {
		return "Lizzard";
	}
  
}
