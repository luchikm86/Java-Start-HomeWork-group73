
import java.util.Scanner;

public class Test {



        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your surname: ");
            String surname = scanner.nextLine();
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            System.out.println("I’m " + name + " " + surname + ", " + age + " years old");
        }

}
