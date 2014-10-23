package PD.Daniel.Lozano.Vehiculos;

public  class AltaCocheB extends AltaCoche {
	
	public AltaCocheB(){
		super("CategoriB");
	}
	
	public Vehiculo crearVehiculo(){
		Coche coche= new Coche(this.vehiculo_id,this.descripcion,new CategoriaB());
		return coche;
	}

}
