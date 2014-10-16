package PD.ColectorOperaciones.Daniel.Lozano;

public class Subtraction extends Operations{
	
    public Subtraction(int operator1, int operator2) {
		super(operator1, operator2);
		// TODO Auto-generated constructor stub
	}

	private final int operator1, operator2;


    public int getOperator1() {
        return operator1;
    }

    public int getOperator2() {
        return operator2;
    }

    public int calcular() {
        return this.operator1 - this.operator2;
    }

    @Override
    public String toString() {
        return "[" + operator1 + "-" + operator2 + "]";
    }

}
