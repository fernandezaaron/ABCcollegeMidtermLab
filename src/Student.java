public class Student extends Person{
    private int numberOfModules, numberOfRepeatModules, amountPaid;

    private int tuitionfee = 0, balance = 0;

    private final int modulePrice = 525;
    private final int repeatedModulePrice = 110;

    public int feeDeposit(int amountPaid){
        return this.balance -= amountPaid;
    }
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

    public int getTuitionfee() {
        return tuitionfee;
    }

    public void setTuitionfee(int tuitionfee) {
        this.tuitionfee = tuitionfee;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getModulePrice() {
        return modulePrice;
    }

    public int getRepeatedModulePrice() {
        return repeatedModulePrice;
    }
}
