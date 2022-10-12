public class Student extends Person{
    private int numberOfModules, numberOfRepeatModules, amountPaid;

    public Student(){
        this.id = getId();
        this.firstName = getFirstName();
        this.lastName = getLastName();
        this.gender = getGender();
        this.address = getAddress();
        this.phoneNumber = getPhoneNumber();
        this.numberOfModules = getNumberOfModules();
        this.numberOfRepeatModules = getNumberOfRepeatModules();
        this.amountPaid = getAmountPaid();
        
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
