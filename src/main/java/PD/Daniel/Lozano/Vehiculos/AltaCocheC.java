package PD.Daniel.Lozano.Vehiculos;

public  class AltaCocheC extends AltaCoche {
	
	public AltaCocheC(){
		super("CategoriaC");
	}
	
	public Vehiculo crearVehiculo(){
		Coche coche= new Coche(this.vehiculo_id,this.descripcion,new CategoriaC());
		return coche;
	}

}
