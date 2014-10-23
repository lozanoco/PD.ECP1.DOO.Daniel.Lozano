package PD.Daniel.Lozano.Vehiculos;

public  class AltaCocheA extends AltaCoche {
	
	public AltaCocheA(){
		super("CategoriA");
	}
	
	public Vehiculo crearVehiculo(){
		Coche coche= new Coche(vehiculo_id,descripcion,new CategoriaA());
		return coche;
	}

}
