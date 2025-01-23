import java.util.Scanner;

public class Main {

    // constructor
    public Main() {
//        System.out.println(x);
//        System.out.println("Welcome " + nama + (x + x));
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        input.nextLine();
        String nama = input.nextLine();

        System.out.println(nama + " Umur " + x + " Tahun");
    }

    public static void main (String[] args) {
        new Main(); // create object from class Main
    }
}