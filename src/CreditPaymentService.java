public class CreditPaymentService {
    public double calculate(double sam, double years, double percent) {
        double p = percent / 100 / 12;
        if (years == 1) {
            double payment = (p * Math.pow((1 + p), 12) / ((Math.pow((1 + p), 12) - 1))) * sam;
            return payment;

        } else if (years == 2) {
            double payment = (p * Math.pow((1 + p), 24) / ((Math.pow((1 + p), 24) - 1))) * sam;
            return payment;
        } else {
            double payment = (p * Math.pow((1 + p), 36) / ((Math.pow((1 + p), 36) - 1))) * sam;
            return payment;

        }


    }


}



