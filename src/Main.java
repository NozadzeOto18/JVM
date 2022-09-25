import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Your Age:");
        int age = scanner.nextInt();
        int currYear = 2022;
        System.out.println("You have born in " + (currYear - age));
    }
}