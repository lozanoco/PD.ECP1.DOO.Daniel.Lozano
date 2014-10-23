package PD.Daniel.Lozano.Vehiculos;

public abstract class Categoria {
		
	private String nombre_categoria;
	public Categoria(){}
	
	public abstract int obtenerPrecioCategoria();

	public String getNombre_categoria() {
		return nombre_categoria;
	}

	public void setNombre_categoria(String nombre_categoria) {
		this.nombre_categoria = nombre_categoria;
	}
	
}
