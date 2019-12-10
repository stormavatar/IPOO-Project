import java.util.Scanner;


public class Game {

    public static void main(String[] args) {
        Character player = new Character();
        player.setName("John");
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
        

            if ("quit".equals(input)) {
                System.out.println("Exit!");
                break;
            }

            System.out.println();
            System.out.println("-----------\n");
        }
        scanner.close();

    }

    enum Commands {
        MYSELF,
        SEE,
        SEE_CHEST,
        SEE_BAG, 
        GET, 
        DROP, 
        MOVE, 
        ATTACK, 
        USE, 
        SHOW, 
        HELP, 
        QUIT
    }
}