package PD.ColectorOperaciones.Daniel.Lozano;
/*
 * Realizar un buen diseño del ejemplo original (con Addition y sin Multiplication)
 * Cambiar el nombre de la clase “Addition” por “Summation”, e Incorporar la operación “Multiplication”
 * 
 * */

public class Main {

    public static void main(String[] args) {
        OperationHandler operationHandler = new OperationHandler();
        operationHandler.add(new Summation(3, 4));

        System.out.println("Total1:" + operationHandler.total());

        operationHandler.add(new Subtraction(1, 1));
        operationHandler.add(new Summation(3, 5));
        operationHandler.add(new Subtraction(4, 1));
        operationHandler.add(new Summation(3, 6));
        operationHandler.add(new Subtraction(3, 2));

        System.out.println("Total2:" + operationHandler.total());
    }

}
