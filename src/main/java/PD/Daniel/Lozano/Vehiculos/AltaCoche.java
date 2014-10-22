package PD.Daniel.Lozano.Vehiculos;

public class AltaCoche extends AltaVehiculo {
	
	protected Categoria categoria;
	
	public Vehiculo crearVehiculo() {
		Coche coche= new Coche(this.vehiculo_id,this.descripcion,categoria);
		return coche;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


}
