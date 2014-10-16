package PD.ColectorOperaciones.Daniel.Lozano;

public abstract class Operations {
    private int operator1;
    private int operator2;

    public Operations(int operator1, int operator2){
    	this.operator1 = operator1;
    	this.operator2 = operator2;
    }

    public int getOperator1() {
        return operator1;
    }

    public int getOperator2() {
        return operator2;
    }
    
    public abstract int calcular();
    
    public abstract String toString();
    
}
