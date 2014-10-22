package PD.Daniel.Lozano.Vehiculos;

public abstract class AltaVehiculo {
	
	private String vehiculo_id;
	private String descripcion;
	
	protected int contador_id=0;

	public abstract Vehiculo crearVehiculo();

	public void setVehiculo_id(String vehiculo_id) {
		this.vehiculo_id = vehiculo_id;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
