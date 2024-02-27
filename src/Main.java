//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double years = 1;
        double sam = 1_000_000;
        double payment = service.calculate(sam, years, 9.99);


        System.out.println("Ежемесячный платеж: " + Math.round(payment));
    }
}