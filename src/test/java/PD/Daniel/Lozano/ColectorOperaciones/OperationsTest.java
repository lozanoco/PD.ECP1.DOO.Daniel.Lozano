package PD.Daniel.Lozano.ColectorOperaciones;

import org.junit.Before;
import org.junit.Test;

import PD.Daniel.Lozano.ColectorOperaciones.Multiplication;
import PD.Daniel.Lozano.ColectorOperaciones.OperationHandler;
import PD.Daniel.Lozano.ColectorOperaciones.Subtraction;
import PD.Daniel.Lozano.ColectorOperaciones.Summation;
import static org.junit.Assert.assertEquals;

public class OperationsTest {
	private OperationHandler operationHandler;
	private Summation summation;
	private Subtraction substraction;
	private Multiplication multiplication;
	
	   @Before
	    public void before() {
		   this.operationHandler = new OperationHandler();
		   this.summation = new Summation(1,2);
		   this.substraction = new Subtraction(2,1);
		   this.multiplication = new Multiplication(2,2);
	    }

	    @Test
	    public void testSummation() {
	        assertEquals(3, summation.calcular());
	    }	
	    
	    @Test
	    public void testSubstraction() {
	        assertEquals(1, substraction.calcular());
	    }	
	    
	    @Test
	    public void testMultiplication() {
	        assertEquals(4, multiplication.calcular());
	    }	
	    
	    @Test
	    public void testOperationHandler() {
	    	this.operationHandler.add(this.summation);
	        assertEquals(3, operationHandler.total());
	    }	
}
