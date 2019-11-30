import java.util.Scanner;


public class ReadConsole {

    public static void main(String[] args) {
        Character player = new Character();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Enter name : ");
            String input = scanner.nextLine();
            player.setName(input);

            if ("quit".equals(input)) {
                System.out.println("Exit!");
                break;
            }

            System.out.println("name : " + player.getName());
            System.out.println("-----------\n");
        }
        scanner.close();

    }

}