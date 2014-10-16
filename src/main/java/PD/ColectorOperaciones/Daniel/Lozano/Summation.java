package PD.ColectorOperaciones.Daniel.Lozano;

public class Summation extends Operations{
	
    public Summation(int operator1, int operator2) {
		super(operator1, operator2);
		// TODO Auto-generated constructor stub
	}

    public int calcular() {
        return this.getOperator1() + this.getOperator2();
    }

    @Override
    public String toString() {
        return "[" + this.getOperator1() + "+" + this.getOperator2() + "]";
    }

}
