public class Student extends Person{
    int numberOfModules, numberOfRepeatModules, amountPaid;

    int tuitionfee, balance;

    final int modulePrice = 525;
    final int repeatedModulePrice = 110;
    public Student(int numberOfModules, int numberOfRepeatModules, int amountPaid){
        this.numberOfModules = numberOfModules;
        this.numberOfRepeatModules = numberOfRepeatModules;
        this.amountPaid = amountPaid;
        this.tuitionfee = (this.numberOfModules * this.modulePrice) + (this.numberOfRepeatModules * repeatedModulePrice);
        this.balance = tuitionfee - this.amountPaid;
    }
    public int getNumberOfModules() {
        return numberOfModules;
    }

    public void setNumberOfModules(int numberOfModules) {
        this.numberOfModules = numberOfModules;
    }

    public int getNumberOfRepeatModules() {
        return numberOfRepeatModules;
    }

    public void setNumberOfRepeatModules(int numberOfRepeatModules) {
        this.numberOfRepeatModules = numberOfRepeatModules;
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }
}
