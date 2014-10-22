package PD.Daniel.Lozano.Vehiculos;

public abstract class Vehiculo {

	private String id_vehiculo;
	private String descripcion;

	public Vehiculo(String id_vehiculo,String descripcion){
		this.id_vehiculo=id_vehiculo;
		this.descripcion=descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getIdVehiculo() {
		return id_vehiculo;
	}

	public abstract Vehiculo crearVehiculo();
}
