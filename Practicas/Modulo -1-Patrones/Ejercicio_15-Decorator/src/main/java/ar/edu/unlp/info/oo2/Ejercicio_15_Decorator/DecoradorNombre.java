package ar.edu.unlp.info.oo2.Ejercicio_15_Decorator;

public class DecoradorNombre extends Decorador {

    public DecoradorNombre(File002 file) {
        super(file);
    }

    @Override
    public String prettyPrint() {
        return super.prettyPrint() + " Nombre- " + this.getNombre() + "\n";
    }

}