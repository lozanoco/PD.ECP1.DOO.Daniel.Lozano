package PD.Daniel.Lozano.Vehiculos;

public class AltaMoto extends AltaVehiculo {

	@Override
	public Moto crearVehiculo() {
		Moto moto= new Moto(Integer.toString(contador_id),"soy una moto");
		contador_id++;
		return moto;
	}


}
