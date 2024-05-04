package strategy;

public class ProgressiveTaxStrategy implements TaxStrategy {
    private final double[] brackets;
    private final double[] rates;

    public ProgressiveTaxStrategy(double[] brackets, double[] rates) {
        this.brackets = brackets;
        this.rates = rates;
    }

    @Override
    public double calculateTax(double income) {
        double tax = 0;
        double previousBracket = 0;

        for (int i = 0; i < brackets.length; i++) {
            double upperBracket = brackets[i];
            if (income <= upperBracket) {
                tax += (income - previousBracket) * rates[i];
                break;
            } else {
                tax += (upperBracket - previousBracket) * rates[i];
                previousBracket = upperBracket;
            }
        }

        return tax;
    }
}