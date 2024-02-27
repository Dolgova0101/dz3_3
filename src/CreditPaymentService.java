public class CreditPaymentService {
    public double calculate(double credit, double years, double percent) {
        double bid = percent / 100 / 12;
        double months = years * 12;
        double sam = credit;

        double payment = (bid * Math.pow((1 + bid), months) / ((Math.pow((1 + bid), months) - 1))) * sam;
        return payment;


    }


}



