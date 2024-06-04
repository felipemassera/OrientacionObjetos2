package ar.edu.unlp.info.oo2.Ejercicio_15_Decorator;

import java.time.LocalDate;
import java.util.Date;

public class Archivo implements File002 {
    private String nombre;
    private String extension;
    private int tamanio;
    private LocalDate fechaDeCreacion;
    private LocalDate fechaDeModificacion;
    private String permisos;

    public Archivo(String nombre, String extension, int tamanio, String permisos, LocalDate fc, LocalDate fm) {
        this.nombre = nombre;
        this.extension = extension;
        this.tamanio = tamanio;
        this.fechaDeCreacion = fc;
        this.fechaDeModificacion = fm;
        this.permisos = permisos;
    }

    @Override
    public String prettyPrint() {
        return "Datos del Archivo:\n";
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String getExtension() {
        return this.extension;
    }

    @Override
    public String getTamanio() {
        return Integer.toString(this.tamanio);
    }

    @Override
    public String getFechaDeCreacion() {
        return this.fechaDeCreacion.toString();
    }

    @Override
    public String getFechaDeModificacion() {
        return this.fechaDeModificacion.toString();
    }

    @Override
    public String getPermisos() {
        return this.permisos;
    }
}
