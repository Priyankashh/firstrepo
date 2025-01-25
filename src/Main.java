import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("lets do this");
        while (true) {


            Scanner input = new Scanner(System.in);
            System.out.println("enter sleep hrs");
            int hours = input.nextInt();

            if (hours < 0) {
                System.out.println("sleep cant be -ve");
                break;
            }
            int count = 1;
            while (count <= 10) {
                System.out.println(count * 5);
                count++;
            }
        }
    }
}
