package PD.Daniel.Lozano.Vehiculos;

public abstract class AltaCoche extends AltaVehiculo {
	
	protected String categoria;
	
	public AltaCoche(String categoria) {
		this.categoria=categoria;
	}

	public abstract Vehiculo crearVehiculo();

}
