package ar.edu.info.unlp.ejercicioDemo;

public interface Move {
	public String match(Move playVS);	
	public String vsStone();
	public String vsScissors();
	public String vsPaper();
	public String vsSpock();
	public String vsLizzard();
}
