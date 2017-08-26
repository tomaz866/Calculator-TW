package com.kalkulator.kalkuatorkodilla;

public class Calculator {

    public double addAtoB(double a,double b){
        return a + b;
    }

    public double subtractAfromB(double a,double b){
        return a - b;
    }

    public static void main(String[] args){
        Calculator calculator = new Calculator();

        System.out.println(calculator.addAtoB(4,6));

        System.out.println(calculator.subtractAfromB(7,3));
    }
}
