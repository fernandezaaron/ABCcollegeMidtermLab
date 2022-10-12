import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
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
            case 6:
                break;
            case 7:
                break;
        }
    }
}
