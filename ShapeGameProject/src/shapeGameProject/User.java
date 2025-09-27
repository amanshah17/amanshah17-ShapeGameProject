package shapeGameProject;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game g = new Game();
        char c;

        do {
            g.selectShape();
            System.out.print("\nEnter Y to continue, any other key to exit: ");
            c = sc.next().charAt(0);
        } while (c == 'Y' || c == 'y');

        System.out.println("\n===== Game Ends =====");
        sc.close();
    }
}
