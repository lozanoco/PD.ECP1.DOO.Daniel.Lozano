package PD.Daniel.Lozano.Vehiculos;

public class CategoriaA extends Categoria{
	
	private static final int PRECIO_CATEGORIA = 10;
	
	public CategoriaA() {
		super();
	}

	@Override
	public int obtenerPrecioCategoria() {
		// TODO Auto-generated method stub
		return CategoriaA.PRECIO_CATEGORIA;
	}

}
