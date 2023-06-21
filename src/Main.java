public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int oneYearMonthlyPayment = service.calculate(1_000_000, 1,9.99);
        System.out.println("Ежемесячный платёж (срок кредита 1 год): " + oneYearMonthlyPayment + " рублей");

        int twoYearsMonthlyPayment = service.calculate(1_000_000, 2,9.99);
        System.out.println("Ежемесячный платёж (срок кредита 2 года): " + twoYearsMonthlyPayment + " рублей");

        int threeYearsMonthlyPayment = service.calculate(1_000_000, 3,9.99);
        System.out.println("Ежемесячный платёж (срок кредита 3 года): " + threeYearsMonthlyPayment + " рублей");
    }
}