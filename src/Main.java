public class Main {
    public static void main(String[] args) {

      Kalkulator kalkulator1 = new Kalkulator();
        kalkulator1.setOperand1(6);
        kalkulator1.setOperand2(3);
      double sum=kalkulator1.add();
        System.out.println(" sum " + sum);
        double sum2=kalkulator1.sub();
        System.out.println(" sum2 " + sum2);
    }
}