package strategy;

public class FlatTaxStrategy implements TaxStrategy {
    private final double rate;

    public FlatTaxStrategy(double rate) {
        this.rate = rate;
    }

    @Override
    public double calculateTax(double income) {
        return income * rate;
    }
}