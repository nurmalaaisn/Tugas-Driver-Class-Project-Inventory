import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Pilih 1. CD atau 2. DVD");
        int pilihan = in.nextInt();
        in.nextLine();

        if (pilihan == 1) {
            System.out.println("Number : ");
            int number = in.nextInt();
            in.nextLine();

            System.out.println("Name : ");
            String name = in.nextLine();

            System.out.println("Quantity : ");
            int quantity = in.nextInt();

            System.out.println("Price : ");
            double price = in.nextDouble();
            in.nextLine();

            System.out.println("Artist : ");
            String artist = in.nextLine();

            System.out.println("Number Song : ");
            int numSong = in.nextInt();
            in.nextLine();

            System.out.println("Label : ");
            String label = in.nextLine();
            
            CD cd1 = new CD(number, name, quantity, price, artist, numSong, label);
            cd1.print();
            
        } else if (pilihan == 2) {
            System.out.println("Number : ");
            int number = in.nextInt();
            in.nextLine();
            
            System.out.println("Name : ");
            String name = in.nextLine();

            System.out.println("Quantity : ");
            int quantity = in.nextInt();

            System.out.println("Price : ");
            double price = in.nextDouble();
            
            System.out.println("Length : ");
            int length = in.nextInt();

            System.out.println("Rating : ");
            int rating = in.nextInt();
            in.nextLine();

            System.out.println("Studio : ");
            String studio = in.nextLine();
            
            DVD dvd1 = new DVD(number, name, quantity, price, length, rating, studio);
            dvd1.print();
        } else {
            System.out.println("Input Salah");
        }
    }
    
}
