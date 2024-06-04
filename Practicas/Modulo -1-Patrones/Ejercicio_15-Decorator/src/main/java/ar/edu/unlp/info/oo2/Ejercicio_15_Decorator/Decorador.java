package ar.edu.unlp.info.oo2.Ejercicio_15_Decorator;

public class Decorador implements File002 {

    private File002 componente;

    // Constructor
    public Decorador(File002 file) {
        this.componente = file;
    }

    // Getter for the wrapped file
    public File002 getFile() {
        return componente;
    }

    @Override
    public String prettyPrint() {
        return this.getFile().prettyPrint();
    }

    @Override
    public String getNombre() {
        return this.getFile().getNombre();
    }

    @Override
    public String getExtension() {
        return this.getFile().getExtension();
    }

    @Override
    public String getTamanio() {
        return this.getFile().getTamanio();
    }

    @Override
    public String getFechaDeCreacion() {
        return this.getFile().getFechaDeCreacion();
    }

    @Override
    public String getFechaDeModificacion() {
        return this.getFile().getFechaDeModificacion();
    }

    @Override
    public String getPermisos() {
        return this.getFile().getPermisos();
    }

}