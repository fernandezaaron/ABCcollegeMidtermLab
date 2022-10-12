import java.util.ArrayList;
import java.util.Scanner;

public class main {



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
        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student();
        String studentName;
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
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
        }while(choice < 1 || choice > 7);
//        scanner.close();
        switch(choice){
            case 1:
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

                System.out.println("Enter Number of Modules: ");
                student.setNumberOfModules(scanner.nextInt());

                System.out.println("Enter Number of Repeated Modules: ");
                student.setNumberOfRepeatModules(scanner.nextInt());

                System.out.println("Enter Amount Paid: ");
                student.setAmountPaid(scanner.nextInt());

                students.add(student);
                System.out.println(students.get(0).getId());
                System.out.println(students.get(0).getFirstName());
                System.out.println(students.get(0).getLastName());
                System.out.println(students.get(0).getAddress());
                System.out.println(students.get(0).getPhoneNumber());
                System.out.println(students.get(0).getGender());
                break;
            case 2:
                System.out.println("Enter Student ID to update: ");
                studentID = scanner.nextInt();

                for (int i=0; i<students.size(); i++){
                    if(students.get(i).id == studentID){
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

                        System.out.println("Enter Number of Modules: ");
                        student.setNumberOfModules(scanner.nextInt());

                        System.out.println("Enter Number of Repeated Modules: ");
                        student.setNumberOfRepeatModules(scanner.nextInt());

                        System.out.println("Enter Amount Paid: ");
                        student.setAmountPaid(scanner.nextInt());
                        students.set(i,student);
                    }

                }

                break;
            case 3:
                System.out.println("Enter Student ID to update: ");
                studentID = scanner.nextInt();

                for (int i=0; i<students.size(); i++){
                    if(students.get(i).id == studentID) {
                        students.remove(student);
                    }
                }
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
    }

    //@Method - This is used to create the menu to choose to modify teachers
    public static void teacherMenu(){
        ArrayList<Teacher> teachers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1 - Add new teacher");
            System.out.println("2 - Update teacher");
            System.out.println("3 - Delete teacher");
            System.out.println("4 - Calculate salary of a teacher");
            System.out.println("5 - Show all teachers");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
        }while(choice < 1 || choice > 5);
        scanner.close();
        switch(choice){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
    }
}
