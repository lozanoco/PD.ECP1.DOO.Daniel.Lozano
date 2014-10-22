package PD.Daniel.Lozano.Vehiculos;

public class Coche extends Vehiculo {
	static final int FACTOR_TARIFA_NORMAL = 1;
	static final double FACTOR_TARIFA_REDUCIDA_1 = 0.8;
	static final double FACTOR_TARIFA_REDUCIDA_2 = 0.5;
	static final int DIA_TARIFA_REDUCIDA_1 = 3;
	static final int DIA_TARIFA_REDUCIDA_2 = 7;
	
	public Categoria categoria;
	
	public Coche(String idVehiculo, String descripcion, Categoria categoria) {
		super(idVehiculo, descripcion);
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "\nTipo: "+ this.getClass().getSimpleName() + " \nid_vehiculo: " +this.getIdVehiculo() + " \ndescripcion: " + this.getDescripcion();
	}

	@Override
	public double calcularAlquiler(int dias) {
		double precio=0;
		if(dias>DIA_TARIFA_REDUCIDA_2){
			precio = this.categoria.obtenerPrecioCategoria() * (DIA_TARIFA_REDUCIDA_1*FACTOR_TARIFA_NORMAL + DIA_TARIFA_REDUCIDA_2* FACTOR_TARIFA_REDUCIDA_1 + (dias-(DIA_TARIFA_REDUCIDA_1+DIA_TARIFA_REDUCIDA_2)*FACTOR_TARIFA_REDUCIDA_2)); 
		}
		else if(dias>DIA_TARIFA_REDUCIDA_1){
			precio = this.categoria.obtenerPrecioCategoria() * (DIA_TARIFA_REDUCIDA_1*FACTOR_TARIFA_NORMAL + (dias-(DIA_TARIFA_REDUCIDA_1)*FACTOR_TARIFA_REDUCIDA_1));  
		}
		else if(dias<=DIA_TARIFA_REDUCIDA_1 && dias >0){
			precio = this.categoria.obtenerPrecioCategoria() * (dias*FACTOR_TARIFA_NORMAL);  
		}
		else{
			assert false : "numero de dias imposible";
		} 
		return precio;
	}



}
