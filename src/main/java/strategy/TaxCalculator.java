package strategy;

public class TaxCalculator {
    private TaxStrategy taxStrategy;

    public TaxCalculator(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double calculate(double income) {
        return taxStrategy.calculateTax(income);
    }
}