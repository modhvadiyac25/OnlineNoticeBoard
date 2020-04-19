/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author modhv
 */
public class Calculater {
    private int op1=1,op2=1;
    private long result=0;
    private String Operater="+";


    public Calculater() {
    }

    public int getOp1() {
        return op1;
    }

    public int getOp2() {
        return op2;
    }
    
    public long getResult() {
        if(Operater.equals("+"))
        {
           result=op1+op2;
        }
        else if(Operater.equals("-"))
        {
            result=op1-op2;
        }
        else if(Operater.equals("*"))
        {
            result=op1*op2;
        }
        else if(Operater.equals("/"))
        {
            result=op1/op2;
        }
        else 
        {
            String error="invalide input";
             System.out.println(error);
        }
        return result;
    }

    public String getOperater() {
        return Operater;
    }

    public void setOp1(int op1) {
        this.op1 = op1;
    }

    public void setOp2(int op2) {
        this.op2 = op2;
    }

    public void setResult(long result) {
        this.result = result;
    }

    public void setOperater(String Operator) {
        this.Operater = Operater;
    }

    @Override
    public String toString() {
        return "Calculater{" + "op1=" + op1 + ", op2=" + op2 + ", result=" + result + ", Operater=" + Operater + '}';
    }

}
