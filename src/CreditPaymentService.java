public class CreditPaymentService {
    public double calculate(double sam, double years, double percent) {
        double p = percent / 100 / 12;
        double a = years * 12;
        double b = sam;

        double payment = (p * Math.pow((1 + p), a) / ((Math.pow((1 + p), a) - 1))) * b;
        return payment;


    }


}



