package PD.Daniel.Lozano.Vehiculos;

public class Moto extends Vehiculo {
	static final int TARIFA_NORMAL = 8;
	static final int TARIFA_REDUCIDA = 7;
	static final int DIA_EMPIEZA_DESCUENTO = 7;

	public Moto(String id_vehiculo,String description){
		super(id_vehiculo, description);
	}

	@Override
	public String toString() {
		return "\nTipo: "+ this.getClass().getSimpleName() + " \nid_vehiculo: " +this.getIdVehiculo() + " \ndescripcion: " + this.getDescripcion();
	}

	@Override
	public double calcularAlquiler(int dias) {
		double precio=0;
		if(dias>DIA_EMPIEZA_DESCUENTO){
			precio = dias*TARIFA_REDUCIDA; 
		}
		else if(dias<=DIA_EMPIEZA_DESCUENTO){
			precio=dias*TARIFA_NORMAL;
		}
		else{
			assert false : "numero de dias imposible";
		} 
		return precio;
	}

}
