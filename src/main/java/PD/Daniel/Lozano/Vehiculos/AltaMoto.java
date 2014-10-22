package PD.Daniel.Lozano.Vehiculos;

public class AltaMoto extends AltaVehiculo {

	@Override
	public Vehiculo crearVehiculo() {
		Moto moto= new Moto(this.vehiculo_id,this.descripcion);
		return moto;
	}


}
