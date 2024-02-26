//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
           CreditPaymentService service = new CreditPaymentService();
            double payment = service.calculate(1_000_000,3, 9.99);


        System.out.println("Ежемесячный платеж: " + Math.round(payment));
    }
  }