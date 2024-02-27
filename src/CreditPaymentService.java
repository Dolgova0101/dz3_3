public class CreditPaymentService {
    public double calculate(double sam, double years, double percent) {
        double p = percent / 100 / 12;
        double a = years;
        if (years == 1) {
            a = 12;
        } else if (years == 2) {
            a = 24;
        } else {
            a = 36;
        }
        double b = sam;

        double payment = (p * Math.pow((1 + p), a) / ((Math.pow((1 + p), a) - 1))) * b;
        return payment;


    }


}



