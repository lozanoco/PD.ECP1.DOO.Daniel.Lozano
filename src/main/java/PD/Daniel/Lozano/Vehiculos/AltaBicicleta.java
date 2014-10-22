package PD.Daniel.Lozano.Vehiculos;

public class AltaBicicleta extends AltaVehiculo {

	@Override
	public Bicicleta crearVehiculo() {
		Bicicleta bici= new Bicicleta(Integer.toString(contador_id),"soy una bici");
		contador_id++;
		return bici;
	}


}
