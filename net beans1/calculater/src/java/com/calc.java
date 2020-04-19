/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;
/**
 *
 * @author modhv
 */
public class calc {
    private int op1,op2;
    private String operater ;
    private long result;

    public calc() {
        
    }

    public int getOp1() {
        return op1;
    }
    
    public void setOp1(int op1) {
        this.op1 = op1;
    }

    public int getOp2() {
        return op2;
    }
    
    public void setOp2(int op2) {
        this.op2 = op2;
    }


    @Override
    public String toString() {
        return "calc{" + "op1=" + op1 + ", op2=" + op2 + ", result=" + result + '}';
    }

    public String getOperater() {
        return operater;
    }

    public void setOperater(String operater) {
        this.operater = operater;
    }
    
   
        public void setResult(long result) {
        this.result = result;
    }

    public long getResult()
    {
        if(operater.equals("+"))
        {
            result=op1+op2;
        }
        else if(operater.equals("-"))
        {
            result=op1-op2;
        }
        else if(operater.equals("*"))
        {
            result=op1*op2;
        }
        else if("/".equals(operater))
        {
            result=op1/op2;
        } 
        else {
            }
        return 0;

}
}
