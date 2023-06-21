public class CreditPaymentService {
    public int calculate(int amountCredit, int termYears, double interestRate){
        double monthlyInterestRate = interestRate / (12 * 100);
        double totalMonths = termYears * 12;

        double monthlyPayment = amountCredit * monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, - totalMonths));

        return (int) monthlyPayment;
    }
}