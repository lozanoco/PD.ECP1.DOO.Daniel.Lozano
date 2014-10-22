package PD.Daniel.Lozano.ColectorOperaciones;

import java.util.ArrayList;

public class OperationHandler {
    private ArrayList<Operations> operators;
    
    public OperationHandler(){
    	this.operators = new ArrayList<Operations>();
    }

    public void add(Operations operator) {
        this.operators.add(operator);
    }

    public void reset() {
    	this.operators = new ArrayList<Operations>();
    }

    public int total() {
        int result = 0;
        String separator = "";
        for (Operations operando : this.operators) {
            if (operando != null) {
                System.out.print(separator + operando.toString());
               	result += operando.calcular();
            }
            separator = "+";
        }
        System.out.print(">>> ");
        return result;
    }

}
