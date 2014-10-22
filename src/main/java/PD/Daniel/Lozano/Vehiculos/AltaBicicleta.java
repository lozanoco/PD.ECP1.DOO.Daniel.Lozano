package PD.Daniel.Lozano.Vehiculos;

public class AltaBicicleta extends AltaVehiculo {

	@Override
	public Vehiculo crearVehiculo() {
		Bicicleta bici= new Bicicleta(this.vehiculo_id,this.descripcion);
		return bici;
	}


}
