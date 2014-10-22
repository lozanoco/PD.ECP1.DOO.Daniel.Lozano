package PD.Daniel.Lozano.Vehiculos;

public abstract class AltaVehiculo {
	
	protected String vehiculo_id;
	protected String descripcion;

	public abstract Vehiculo crearVehiculo();

	public void setVehiculo_id(String vehiculo_id) {
		this.vehiculo_id = vehiculo_id;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
