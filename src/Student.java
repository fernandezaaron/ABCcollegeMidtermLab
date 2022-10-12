public class Student extends Person{
    private int numberOfModules, numberOfRepeatModules, amountPaid;

    private int tuitionfee, balance;

    private final int modulePrice = 525;
    private final int repeatedModulePrice = 110;

    public int getNumberOfModules() {
        return numberOfModules;
    }

    public void setNumberOfModules(int numberOfModules) {
        if(numberOfModules >= 0  && numberOfModules <= 6) {
            this.numberOfModules = numberOfModules;
            this.tuitionfee += this.numberOfModules * this.modulePrice;
        }
    }

    public int getNumberOfRepeatModules() {
        return numberOfRepeatModules;
    }

    public void setNumberOfRepeatModules(int numberOfRepeatModules) {
        if(numberOfRepeatModules > 2) {
            this.numberOfRepeatModules = numberOfRepeatModules;
            this.tuitionfee += this.numberOfRepeatModules * repeatedModulePrice;
        }
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
        this.balance = this.tuitionfee - this.amountPaid;
    }
}
