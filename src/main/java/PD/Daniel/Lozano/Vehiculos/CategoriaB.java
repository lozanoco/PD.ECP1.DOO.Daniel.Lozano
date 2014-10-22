package PD.Daniel.Lozano.Vehiculos;

public class CategoriaB extends Categoria{
	private static final int PRECIO_CATEGORIA = 15;
	
	public CategoriaB() {
		super();
	}

	@Override
	public int obtenerPrecioCategoria() {
		// TODO Auto-generated method stub
		return CategoriaB.PRECIO_CATEGORIA;
	}

}
