package PD.Daniel.Lozano.Vehiculos;

public class AltaCoche extends AltaVehiculo {
	
	private Categoria categoria;
	
	public Coche crearVehiculo() {
		Coche coche= new Coche(Integer.toString(contador_id),"soy un coche",new CategoriaA());
		contador_id++;
		return coche;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
