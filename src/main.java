import java.util.ArrayList;
import java.util.Locale;
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
            System.out.println("0 - Exit Program");
            System.out.print("Enter your choice: ");
            choose = scanner1.nextInt();
        }while(choose < 0 || choose > 2);
//        scanner1.close();
        switch(choose){
            case 0:
                System.exit(0);
                break;
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
            System.out.print("Enter your choice: ");
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
                while (!scanner.hasNextInt()){
                    System.out.print("Enter Student ID: ");
                    scanner.next();
                }
                student.setId(scanner.nextInt());

                scanner.nextLine();
                System.out.print("Enter First name: ");
                student.setFirstName(scanner.nextLine());

                System.out.print("Enter Last name: ");
                student.setLastName(scanner.nextLine());

                System.out.print("Enter Gender: ");
                student.setGender(scanner.next());

                scanner.nextLine();
                System.out.print("Enter Address: ");
                student.setAddress(scanner.nextLine());

                System.out.print("Enter Phone number: ");
                while (!scanner.hasNextInt()){
                    System.out.print("Enter Phone number: ");
                    scanner.next();
                }
                student.setPhoneNumber(String.valueOf(scanner.nextInt()));


                System.out.print("Enter Number of Modules: ");
                while (!scanner.hasNextInt()){
                    System.out.print("Enter Number of Modules: ");
                    scanner.next();
                }
                student.setNumberOfModules(scanner.nextInt());

                System.out.print("Enter Number of Repeated Modules: ");
                while (!scanner.hasNextInt()){
                    System.out.print("Enter Number of Repeated Modules: ");
                    scanner.next();
                }

                student.setNumberOfRepeatModules(scanner.nextInt());
                while(student.getNumberOfRepeatModules() > 2 || student.getNumberOfRepeatModules() < 0){
                    System.out.print("Enter Number of Repeated Modules: ");
                    student.setNumberOfRepeatModules(scanner.nextInt());
                }

                System.out.print("Enter Amount Paid: ");
                while (!scanner.hasNextInt()){
                    System.out.print("Enter Amount Paid: ");
                    scanner.next();
                }
                student.setAmountPaid(scanner.nextInt());

                students.add(student);

                studentMenu();
                break;

            case 2:
                System.out.println("Enter Student ID to update: ");
                studentID = scanner.nextInt();

                for (int i=0; i<students.size(); i++){
                    if(students.get(i).id == studentID){
                        scanner.nextLine();
                        System.out.print("Enter First name: ");
                        students.get(i).setFirstName(scanner.nextLine());

                        System.out.print("Enter Last name: ");
                        students.get(i).setLastName(scanner.nextLine());

                        System.out.print("Enter Gender: ");
                        students.get(i).setGender(scanner.next());

                        scanner.nextLine();
                        System.out.print("Enter Address: ");
                        students.get(i).setAddress(scanner.nextLine());

                        System.out.print("Enter Phone number: ");
                        while (!scanner.hasNextInt()){
                            System.out.print("Enter Phone number: ");
                            scanner.next();
                        }
                        students.get(i).setPhoneNumber(String.valueOf(scanner.nextInt()));

                        System.out.println("Enter Number of Modules: ");
                        while (!scanner.hasNextInt()){
                            System.out.print("Enter Number of Modules: ");
                            scanner.next();
                        }
                        students.get(i).setNumberOfModules(scanner.nextInt());

                        System.out.println("Enter Number of Repeated Modules: ");
                        while (!scanner.hasNextInt()){
                            System.out.print("Enter Number of Repeated Modules: ");
                            scanner.next();
                        }

                        students.get(i).setNumberOfRepeatModules(scanner.nextInt());
                        while(students.get(i).getNumberOfRepeatModules() > 2 || students.get(i).getNumberOfRepeatModules() < 0){
                            System.out.print("Enter Number of Repeated Modules: ");
                            students.get(i).setNumberOfRepeatModules(scanner.nextInt());
                        }

                        System.out.println("Enter Amount Paid: ");
                        while (!scanner.hasNextInt()){
                            System.out.print("Enter Amount Paid: ");
                            scanner.next();
                        }
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
            System.out.print("Enter your choice: ");
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
                while (!scanner.hasNextInt()){
                    System.out.print("Enter Teacher ID: ");
                    scanner.next();
                }
                teacher.setId(scanner.nextInt());

                scanner.nextLine();
                System.out.print("Enter First name: ");
                teacher.setFirstName(scanner.nextLine());

                System.out.print("Enter Last name: ");
                teacher.setLastName(scanner.nextLine());

                System.out.print("Enter Gender: ");
                teacher.setGender(scanner.next());

                scanner.nextLine();
                System.out.print("Enter Address: ");
                teacher.setAddress(scanner.nextLine());

                System.out.print("Enter Phone number: ");
                while (!scanner.hasNextInt()){
                    System.out.print("Enter Phone number: ");
                    scanner.next();
                }
                teacher.setPhoneNumber(String.valueOf(scanner.nextInt()));

                System.out.print("Enter Department(Business/Computing): ");
                teacher.setDepartment(scanner.next());

                while (!teacher.getDepartment().equals("Computing") && !teacher.getDepartment().equals("Business")){
                    System.out.print("Enter Department(Business/Computing): ");
                    teacher.setDepartment(scanner.next());
                }

                System.out.print("Enter Designation(HOF/CO/L): ");
                teacher.setDesignation(scanner.next());

                while (!teacher.getDesignation().equals("HOF") && !teacher.getDesignation().equals("CO") && !teacher.getDesignation().equals("L")){
                    System.out.print("Enter Designation(HOF/CO/L): ");
                    teacher.setDesignation(scanner.next());
                }


                System.out.print("Enter Teaching Hours: ");
                while (!scanner.hasNextInt()){
                    System.out.print("Enter Teaching Hours: ");
                    scanner.next();
                }
                teacher.setTeachingHours(scanner.nextInt());

                teachers.add(teacher);
                teacherMenu();
                break;

            case 2:
                System.out.print("Enter Teacher ID: ");
                teacherID = scanner.nextInt();

                for (int i=0; i<teachers.size(); i++){
                    if(teacherID == teachers.get(i).getId()){

                        scanner.nextLine();
                        System.out.print("Enter First name: ");
                        teachers.get(i).setFirstName(scanner.nextLine());

                        System.out.print("Enter Last name: ");
                        teachers.get(i).setLastName(scanner.nextLine());

                        System.out.print("Enter Gender: ");
                        teachers.get(i).setGender(scanner.next());

                        scanner.nextLine();
                        System.out.print("Enter Address: ");
                        teachers.get(i).setAddress(scanner.nextLine());

                        System.out.print("Enter Phone number: ");
                        while (!scanner.hasNextInt()){
                            System.out.print("Enter Phone number: ");
                            scanner.next();
                        }
                        teachers.get(i).setPhoneNumber(String.valueOf(scanner.nextInt()));

                        System.out.print("Enter Department(Business/Computing): ");
                        teachers.get(i).setDepartment(scanner.next());
                        if(!teachers.get(i).getDepartment().equals("computing") || !teachers.get(i).getDepartment().equals("business")){
                            System.out.print("Enter Department(Business/Computing): ");
                            teachers.get(i).setDepartment(scanner.next());
                        }

                        System.out.print("Enter Designation(HOF/CO/L): ");
                        teachers.get(i).setDesignation(scanner.next());
                        if(!teachers.get(i).getDepartment().equals("HOF") || !teachers.get(i).getDepartment().equals("CO") || !teachers.get(i).getDepartment().equals("L")){
                            System.out.print("Enter Designation(HOF/CO/L): ");
                            teachers.get(i).setDesignation(scanner.next());
                        }


                        System.out.print("Enter Teaching Hours: ");
                        while (!scanner.hasNextInt()){
                            System.out.print("Enter Teaching Hours: ");
                            scanner.next();
                        }
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
