package PD.Daniel.Lozano.Vehiculos;

public class CategoriaC extends Categoria{
	private static final int PRECIO_CATEGORIA = 20;
	
	public CategoriaC() {
		super();
	}

	@Override
	public int obtenerPrecioCategoria() {
		// TODO Auto-generated method stub
		return CategoriaC.PRECIO_CATEGORIA;
	}

}
