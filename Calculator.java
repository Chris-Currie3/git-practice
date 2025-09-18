//Name: Christopher Currie
//Computing ID: xwh4tz@virginia.edu
//Homeowrk Name: HW 2 - Calculator
//Resource used: n/a

public class Calculator {
    //instance data
    private int mem1;
    private int mem2;
    private String op;


//default constructor, if no values are inputed
    public Calculator() {
        mem1 = 0;
        mem2 = 0;
        op = " ";
    }


    //over load constructor, if values are given, sets them to input as long as op is valid if op is not valid sets op to space
    public Calculator(int op1, int op2, String newOp){
        mem1 = op1;
        mem2 = op2;
        if (newOp.equals("+") || newOp.equals("-") || newOp.equals("*") || newOp.equals("/") || newOp.equals("^")) {
            op = newOp;
        }else {
            op = " ";
        }
    }
    //Accessor methods
    public int getMem1() { //returns value of mem1
        return mem1;
    }

    public int getMem2() {//returns value of mem2
        return mem2;
    }

    public String getOp() {//returns values of op
        return op;
    }

    //Mutator methods
    public void setMem1(int op1) {//sets mem1 to input
        mem1 = op1;
    }
    public void setMem2(int op2) {//sets mem2 to input
        mem2 = op2;
    }
    public void setOp(String newOp) {//sets op to input only if valid if not sep op to space
        if (newOp.equals("+") || newOp.equals("-") || newOp.equals("*") || newOp.equals("/") || newOp.equals("^")) {
            op = newOp;
        }
    }

    //toString Method
    public String toString(){//override to String method to display clean
        return mem1 + " " +  op + " " + mem2;
    }

    public int perform(){ //does operation based on values of mem1, mem2, and operator
        if (op.equals("+")) {
            mem2 = mem1 + mem2;
        }else if (op.equals("-")) {
            mem2 = mem1 - mem2;
        }else if (op.equals("*")) {
            mem2 = mem1 * mem2;
        }else if (op.equals("^")) {
            mem2 = (int)Math.pow(mem1, mem2);
        } else if (op.equals("/") && mem2 != 0) {

                mem2 = mem1 / mem2;
        }
        return mem2;
    }

    public double performDiv(){ //if division and mem2 is not 0 does double divison and returns
        if (op.equals("/") && mem2 != 0) {
            double result = (mem1 /1.0 ) / (mem2);
            return result;
        }

        return 0.0;
    }

    public void swap(){//swaps values of mem1 and mem2
        int temp = mem1;
        mem1 = mem2;
        mem2 = temp;
    }



}
