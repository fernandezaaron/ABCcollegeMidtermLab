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
    /*
         @Method - Set number of modules based on the given constraints.
         @parameter:
             int numberOfModules - the number of modules of the student between 0 and 6.
     */
    public void setNumberOfModules(int numberOfModules) {
        if(numberOfModules >= 0  && numberOfModules <= 6) {
            this.numberOfModules = numberOfModules;
            this.tuitionfee += this.numberOfModules * this.modulePrice;
        }
    }

    public int getNumberOfRepeatModules() {
        return numberOfRepeatModules;
    }
    /*
         @Method - Set number of repeating modules of a student based on the constraints that it should not be more than 2.
         @parameter:
             int numberOfRepeatModules - the number of repeating modules of the student between 0 and 2.
    */
    public void setNumberOfRepeatModules(int numberOfRepeatModules) {
        if(numberOfRepeatModules >= 0 && numberOfRepeatModules <= 2) {
            this.numberOfRepeatModules = numberOfRepeatModules;
            this.tuitionfee += this.numberOfRepeatModules * repeatedModulePrice;
        }
    }

    public int getAmountPaid() {
        return amountPaid;
    }
    /*
         @Method - Set number amount paid by the student and calculate the total balance of the student where the
         amount paid is deducted to the tuition fee.
         @parameter:
             int amountPaid - payment transaction of the student used to calculate the balance.
    */
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
