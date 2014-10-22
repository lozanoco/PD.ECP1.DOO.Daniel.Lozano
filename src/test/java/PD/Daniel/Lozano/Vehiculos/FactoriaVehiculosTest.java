package PD.Daniel.Lozano.Vehiculos;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FactoriaVehiculosTest {

	private Coche cocheCategoriaA;
	private Coche cocheCategoriaB;
	private Coche cocheCategoriaC;
	private Moto moto;
	private Bicicleta bicicleta;

	@Before
	public void inicializar() {
		this.cocheCategoriaA = new Coche("111111", "Seat Leon catA", new CategoriaA());
		this.cocheCategoriaB = new Coche("222222", "Seat Altea catB", new CategoriaB());
		this.cocheCategoriaC = new Coche("333333", "Seat Exeo catC", new CategoriaC());
		this.moto = new Moto("444444", "Yamaha R6");
		this.bicicleta = new Bicicleta("555555","BH");
	}

	 
	 @Test
	    public void testAlquilerCocheCategoriaA3() {
			assertEquals(30.0, this.cocheCategoriaA.calcularAlquiler(3), 10e-5);
	    }
	 
	 @Test
	    public void testAlquilerCocheCategoriaA7() {
			assertEquals(62.0, this.cocheCategoriaA.calcularAlquiler(7), 10e-5);
	    }
	 
	 @Test
	    public void testAlquilerCocheCategoriaA10() {
			assertEquals(77.0, this.cocheCategoriaA.calcularAlquiler(10), 10e-5);
	    }
	 
	 @Test
	    public void testAlquilerCocheCategoriaB3() {
			assertEquals(45.0, this.cocheCategoriaB.calcularAlquiler(3), 10e-5);
	    }
	 
	 @Test
	    public void testAlquilerCocheCategoriaB7() {
			assertEquals(93.0, this.cocheCategoriaB.calcularAlquiler(7), 10e-5);
	    }
	 
	 @Test
	    public void testAlquilerCocheCategoriaB10() {
			assertEquals(115.5, this.cocheCategoriaB.calcularAlquiler(10), 10e-5);
	    }
	 
	 @Test
	    public void testAlquilerCocheCategoriaC3() {
			assertEquals(60.0, this.cocheCategoriaC.calcularAlquiler(3), 10e-5);
	    }
	 
	 @Test
	    public void testAlquilerCocheCategoriaC7() {
			assertEquals(124.0, this.cocheCategoriaC.calcularAlquiler(7), 10e-5);
	    }
	 
	 @Test
	    public void testAlquilerCocheCategoriaC10() {
			assertEquals(154.0, this.cocheCategoriaC.calcularAlquiler(10), 10e-5);
	    }
	 
	 @Test
	    public void testAlquilerMoto7() {
			assertEquals(56.0, this.moto.calcularAlquiler(7), 10e-5);
	    }
	 
	 @Test
	    public void testAlquilerMoto10() {
			assertEquals(70.0, this.moto.calcularAlquiler(10), 10e-5);
	    }
	 
	 @Test
	    public void testAlquilerBici2() {
			assertEquals(6.0, this.bicicleta.calcularAlquiler(2), 10e-5);
	    }
	 
	 @Test
	    public void testAlquilerBici4() {
			assertEquals(10.0, this.bicicleta.calcularAlquiler(4), 10e-5);
	    }	
}
