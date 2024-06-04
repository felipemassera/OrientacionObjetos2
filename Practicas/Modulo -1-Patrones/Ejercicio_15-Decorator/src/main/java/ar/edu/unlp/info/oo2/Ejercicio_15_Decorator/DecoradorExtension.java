package ar.edu.unlp.info.oo2.Ejercicio_15_Decorator;

public class DecoradorExtension extends Decorador {

    public DecoradorExtension(File002 file) {
        super(file);
    }

    @Override
    public String prettyPrint() {
        return super.prettyPrint() + " Extension- " + this.getExtension() + "\n";
    }
}