public class Calculator {
    private double amount;
    private int years;
    private double interestRate;
    private double monthlyInterestRate;

    public Calculator() {

    }
    public Calculator(double amount, int years, double interestRate) {
        this.amount = amount;
        this.years = years;
        this.interestRate = interestRate;
        this.monthlyInterestRate = interestRate / 1200;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getYears() {
        return years;
    }
    public void setYears(int years) {
        this.years = years;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public void computeAndSetMonthlyInterestRate() {
        monthlyInterestRate = interestRate / 1200;
    }
    public double getMonthlyInterestRate() {
        return monthlyInterestRate;
    }
    public double getFutureValue() {
        return amount * Math.pow(1 + monthlyInterestRate, years * 12);
    }


}
