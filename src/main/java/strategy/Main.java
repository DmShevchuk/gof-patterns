package strategy;

public class Main {
    public static void main(String[] args) {
        TaxStrategy flatTaxStrategy = new FlatTaxStrategy(0.20);
        double[] brackets = {10000, 30000, 100000};
        double[] rates = {0.10, 0.20, 0.30};
        TaxStrategy progressiveTaxStrategy = new ProgressiveTaxStrategy(brackets, rates);

        TaxCalculator calculator = new TaxCalculator(flatTaxStrategy);
        double income = 50000;

        System.out.println("Flat Tax: " + calculator.calculate(income));

        calculator.setTaxStrategy(progressiveTaxStrategy);
        System.out.println("Progressive Tax: " + calculator.calculate(income));
    }
}
