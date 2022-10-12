import java.util.ArrayList;
import java.util.Scanner;

public class main {

    private static ArrayList<Student> students = new ArrayList<>();
    private static ArrayList<Teacher> teachers = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    //@Method - This is used to create the menu to choose between students and teacher
    public static void menu(){
        Scanner scanner1 = new Scanner(System.in);
        int choose;
        do{
            System.out.println("1 - Student");
            System.out.println("2 - Teacher");
            System.out.println("Enter your choice: ");
            choose = scanner1.nextInt();
        }while(choose < 1 || choose > 2);
//        scanner1.close();
        switch(choose){
            case 1:
                studentMenu();
                break;
            case 2:
                teacherMenu();
                break;
        }
    }

    //@Method - This is used to create the menu to choose to modify students
    public static void studentMenu(){

        int studentID;
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1 - Add new student");
            System.out.println("2 - Update student");
            System.out.println("3 - Delete student");
            System.out.println("4 - Show remaining balance");
            System.out.println("5 - Fee deposit");
            System.out.println("6 - Display all students with zero balance");
            System.out.println("7 - Display all students with non-zero balance");
            System.out.println("0 - exit to menu");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
        }while(choice < 0 || choice > 7);
//        scanner.close();
        switch(choice){
            case 0:
                for(int i=0; i<students.size(); i++){
                    printStudents(students.get(i));
                }
                studentMenu();
                break;
//                menu();
            case 1:
                Student student = new Student();

                System.out.print("Enter Student ID: ");
                student.setId(scanner.nextInt());

                System.out.print("Enter First name: ");
                student.setFirstName(scanner.next());

                System.out.print("Enter Last name: ");
                student.setLastName(scanner.next());

                System.out.print("Enter Gender: ");
                student.setGender(scanner.next());

                System.out.print("Enter Address: ");
                student.setAddress(scanner.next());

                System.out.print("Enter Phone number: ");
                student.setPhoneNumber(scanner.next());

                System.out.print("Enter Number of Modules: ");
                student.setNumberOfModules(scanner.nextInt());

                System.out.print("Enter Number of Repeated Modules: ");
                student.setNumberOfRepeatModules(scanner.nextInt());

                System.out.print("Enter Amount Paid: ");
                student.setAmountPaid(scanner.nextInt());

                students.add(student);

                studentMenu();
                break;

            case 2:
                System.out.println("Enter Student ID to update: ");
                studentID = scanner.nextInt();

                for (int i=0; i<students.size(); i++){
                    if(students.get(i).id == studentID){
                        System.out.print("Enter First name: ");
                        students.get(i).setFirstName(scanner.next());

                        System.out.print("Enter Last name: ");
                        students.get(i).setLastName(scanner.next());

                        System.out.print("Enter Gender: ");
                        students.get(i).setGender(scanner.next());

                        System.out.print("Enter Address: ");
                        students.get(i).setAddress(scanner.next());

                        System.out.print("Enter Phone number: ");
                        students.get(i).setPhoneNumber(scanner.next());

                        System.out.println("Enter Number of Modules: ");
                        students.get(i).setNumberOfModules(scanner.nextInt());

                        System.out.println("Enter Number of Repeated Modules: ");
                        students.get(i).setNumberOfRepeatModules(scanner.nextInt());

                        System.out.println("Enter Amount Paid: ");
                        students.get(i).setAmountPaid(scanner.nextInt());
                        students.set(i,students.get(i));

                    }

                }
                studentMenu();

                break;
            case 3:
                System.out.println("Enter Student ID to update: ");
                studentID = scanner.nextInt();

                for (int i=0; i<students.size(); i++){
                    if(students.get(i).id == studentID) {
                        students.remove(i);
                    }
                }
                studentMenu();

                break;
            case 4:
                System.out.println("Enter Student ID to update: ");
                studentID = scanner.nextInt();
                for (int i=0; i<students.size(); i++){
                    if(students.get(i).id == studentID) {
                        System.out.println(students.get(i).getBalance());
                    }
                }
                studentMenu();

                break;
            case 5:
                System.out.println("Enter Student ID to update: ");
                studentID = scanner.nextInt();
                for (int i=0; i<students.size(); i++){
                    if(students.get(i).id == studentID) {
                        System.out.println(students.get(i).getFirstName() + students.get(i).getLastName());
                        System.out.print("Enter Deposit Fee: ");
                        int newAmountpaid = scanner.nextInt();
                        students.get(i).feeDeposit(newAmountpaid);
                    }
                }
                studentMenu();

                break;
            case 6:
                for(int i=0; i<students.size(); i++){
                    if(students.get(i).getBalance() == 0){
                        printStudents(students.get(i));
                    }
                }

                studentMenu();

                break;
            case 7:
                for(int i=0; i<students.size(); i++){
                    if(students.get(i).getBalance() != 0){
                        printStudents(students.get(i));
                    }
                }
                studentMenu();
                break;
        }
    }

    //@Method - This is used to create the menu to choose to modify teachers
    public static void teacherMenu(){
        Scanner scanner = new Scanner(System.in);
        int teacherID;
        int choice;
        do{
            System.out.println("1 - Add new teacher");
            System.out.println("2 - Update teacher");
            System.out.println("3 - Delete teacher");
            System.out.println("4 - Calculate salary of a teacher");
            System.out.println("5 - Show all teachers");
            System.out.println("0 - exit to menu");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
        }while(choice < 0 || choice > 5);
//        scanner.close();
        switch(choice){
            case 0:
                menu();
                break;
            case 1:
                Teacher teacher = new Teacher();
                System.out.print("Enter Teacher ID: ");
                teacher.setId(scanner.nextInt());

                System.out.print("Enter First name: ");
                teacher.setFirstName(scanner.next());

                System.out.print("Enter Last name: ");
                teacher.setLastName(scanner.next());

                System.out.print("Enter Gender: ");
                teacher.setGender(scanner.next());

                System.out.print("Enter Address: ");
                teacher.setAddress(scanner.next());

                System.out.print("Enter Phone number: ");
                teacher.setPhoneNumber(scanner.next());

                System.out.print("Enter Department(Business/Computing): ");
                teacher.setDepartment(scanner.next());

                System.out.print("Enter Designation(HOF/CO/L): ");
                teacher.setDesignation(scanner.next());

                System.out.print("Enter Teaching Hours: ");

                teacher.setTeachingHours(scanner.nextInt());

                teachers.add(teacher);
                teacherMenu();
                break;

            case 2:
                System.out.print("Enter Teacher ID: ");
                teacherID = scanner.nextInt();

                for (int i=0; i<teachers.size(); i++){
                    if(teacherID == teachers.get(i).getId()){
                        System.out.print("Enter First name: ");
                        teachers.get(i).setFirstName(scanner.next());

                        System.out.print("Enter Last name: ");
                        teachers.get(i).setLastName(scanner.next());

                        System.out.print("Enter Gender: ");
                        teachers.get(i).setGender(scanner.next());

                        System.out.print("Enter Address: ");
                        teachers.get(i).setAddress(scanner.next());

                        System.out.print("Enter Phone number: ");
                        teachers.get(i).setPhoneNumber(scanner.next());

                        System.out.print("Enter Department(Business/Computing): ");
                        teachers.get(i).setDepartment(scanner.next());

                        System.out.print("Enter Designation(HOF/CO/L): ");
                        teachers.get(i).setDesignation(scanner.next());

                        System.out.print("Enter Teaching Hours: ");
                        teachers.get(i).setTeachingHours(scanner.nextInt());

                        teachers.set(i, teachers.get(i));
                    }
                }

                teacherMenu();
                break;
            case 3:
                System.out.print("Enter Teacher ID: ");
                teacherID = scanner.nextInt();

                for (int i=0; i<teachers.size(); i++){
                    if(teacherID == teachers.get(i).getId()){
                        teachers.remove(i);
                    }
                }
                teacherMenu();
                break;
            case 4:
                System.out.print("Enter Teacher ID: ");
                teacherID = scanner.nextInt();

                for (int i=0; i<teachers.size(); i++){
                    if(teacherID == teachers.get(i).getId()){
                        System.out.println(teachers.get(i).getNetSalary());
                    }
                }
                teacherMenu();
                break;
            case 5:
                for(int i=0; i<teachers.size(); i++){
                    printTeachers(teachers.get(i));
                }
                teacherMenu();
                break;
        }
    }

    public static void printStudents(Student student){
        System.out.println(student.getId() + " " + student.getFirstName() + " " + student.getLastName() + " " + student.getAddress()
                + " " + student.getPhoneNumber() + " " + student.getGender() + " " + student.getNumberOfModules() + " " + student.getNumberOfRepeatModules() + " " + student.getAmountPaid());
    }

    public static void printTeachers(Teacher teacher){
        System.out.println(teacher.getId() + " " + teacher.getFirstName() + " " + teacher.getLastName() + " " + teacher.getAddress()
                + " " + teacher.getPhoneNumber() + " " + teacher.getGender() + " " + teacher.getDepartment() + " " + teacher.getDesignation() + " " + teacher.getTeachingHours());
    }
}
