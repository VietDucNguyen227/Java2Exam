import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void menu(){
        System.out.println("=====Menu=====");
        System.out.println("1. Add new customer");
        System.out.println("2. Find by name");
        System.out.println("3. Display all");
        System.out.println("4. Exit");

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CustomerController controller = new CustomerController();


        try{
            while (true){
                menu();
                int ch = sc.nextInt();
                switch (ch){
                    case 1:
                        sc.nextLine();
                        System.out.print("Enter your name: ");
                        String nameAdd = sc.nextLine();
                        System.out.print("Enter your email: ");
                        String email = sc.nextLine();
                        System.out.print("Enter your phone number: ");
                        String phone = sc.nextLine();
                        controller.addCustomer(nameAdd, email, phone);
                        break;
                    case 2:
                        sc.nextLine();
                        System.out.print("Enter the name you want to find: ");
                        String name = sc.nextLine();
                        controller.findCustomerByName(name);
                        break;
                    case 3:
                        controller.displayAll();
                        break;
                    case 4:
                        System.out.println("See you next time!!!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Please check your selection!");
                        break;
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Error!");
        }
    }

}