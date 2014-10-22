package PD.Daniel.Lozano.Vehiculos;

public class Bicicleta extends Vehiculo {
	static final int TARIFA_NORMAL = 3;
	static final int TARIFA_REDUCIDA = 2;

	public Bicicleta(String id_vehiculo,String description){
		super(id_vehiculo, description);
	}

	@Override
	public String toString() {
		return "\nTipo: "+ this.getClass().getSimpleName() + " \nid_vehiculo: " +this.getIdVehiculo() + " \ndescripcion: " + this.getDescripcion();
	}

	@Override
	public double calcularAlquiler(int dias) {
		double precio=0;
		if(dias>=2){
			dias-=2;
			precio += 2*TARIFA_NORMAL; 
		}
		else if(dias==1){
			dias=0;
			precio=1*TARIFA_NORMAL;
		}
		else{
			assert false : "numero de dias imposible";
		} 
		precio+=dias*TARIFA_REDUCIDA;
		return precio;
	}

}
