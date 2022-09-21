package org.uvigo.eseidm.simplecalculator.model;

public class Calculator {

    public enum operator{SUM, MINUS, DIV, MULT};

    private Double op1;
    private Double op2;

    public Double getOp1() {
        return op1;
    }

    public void setOp1(Double op1) {
        this.op1 = op1;
    }

    public Double getOp2() {
        return op2;
    }

    public void setOp2(Double op2) {
        this.op2 = op2;
    }

    public Double sum(){
        return op1+op2;
    }



}
