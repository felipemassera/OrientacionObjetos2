package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class ClienteFisico extends Cliente{

	private String dni;
	private static double descuentoFis = 0;
	
	public ClienteFisico(String nombre, String numeroTelefono, String dni) {
		super(nombre, numeroTelefono);
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	public void setDNI(String dni) {
	    this.dni = dni;
	}

	@Override
    public double getDescuento() {
        return this.descuentoFis;
    }

    @Override
    public void setDescuento(double descuento) {
        ClienteFisico.descuentoFis = descuento;
    }
	
}
