public class Kalkulator {
   private double operand1;
   private double operand2;

    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double x) {
        this.operand1 = x;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double y) {

        this.operand2 = y;
    }

    public double add() {
       return this.operand1+this.operand2;
    }
    public double sub() {
        return this.operand1-this.operand2;
    }
}
