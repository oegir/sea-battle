import java.util.*;

public class Main
{
    static final int FIELD_LENGTH =10;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Play 1, please input your name");
        String player1Name = scanner.nextLine();
        System.out.println("Hello, " + player1Name + "!");

        System.out.println("Play 2, please input your name");
        String player2Name = scanner.nextLine();
        System.out.println("Hello, " + player2Name + "!");

        char[][] playerField1 = new char[FIELD_LENGTH][FIELD_LENGTH];
        char[][] playerField2 = new char[FIELD_LENGTH][FIELD_LENGTH];

        char[][] playerBattleField1 = new char[FIELD_LENGTH][FIELD_LENGTH];
        char[][] playerBattleField2 = new char[FIELD_LENGTH][FIELD_LENGTH];
    }

    private static void fillPlayerField(char[][] playerField)
    {
        // i - number of ship desks
        for (int i = 4; i >= 1; i--)
        {
            int ships = 5 - i;

            for (int k = i; k <= ships; k++)
            {
                System.out.println("Расставляем " + i + "-палубный корбль. Осталось расставить: " + (k + 1));

                System.out.println("Input x coord: ");
                int x = scanner.nextInt();

                System.out.println("Input y coord: ");
                int y = scanner.nextInt();
                
                System.out.println("1 - horizontal; 2 - vertical ?");
                int position = scanner.nextInt();
                
                if (position == 1) {
                    
                    for (int q = 0; q < i; q++) {
                        playerField[y][x + q] = '1';
                    }
                } else {
                    
                    for (int m = 0; m < i; m++) {
                        playerField[y + m][x] = '1';
                    }
                }
                
                printField(playerField);
            }
        }
    }
    
    private static void printField(char[][] field) {
        
        for (char[] cells : field) {
            
            for (char cell : cells) {
                
                if (cell == 0) {
                    System.out.print(" |");
                } else {
                    System.out.print(cell + "|");
                }
            }
        }
        
        System.out.println("");
        System.out.println("--------------------");
    }
    
    private static void playGame(String player1Name, String player2Name, char[][] playerField1, char[][] playerField2) {
        char[][] playerBattleField1 = new char[FIELD_LENGTH][FIELD_LENGTH];
        char[][] playerBattleField2 = new char[FIELD_LENGTH][FIELD_LENGTH];
        
        String currentPlayerName = player1Name;
        char[][] currentPlayerField = playerField2;
        char[][] currentPlayerBattleField = playerBattleField1;
        
        while (isPlayerAlive(playerField1) && isPlayerAlive(playerField2)) {
            System.out.println(currentPlayerName + ", please, input x coord of shot");
            int xShot = scanner.nextInt();
            
            System.out.println(currentPlayerName + ", please, input y coord of shot");
            int yShot = scanner.nextInt();
            
            int shotResult = handleShot(currentPlayerBattleField, currentPlayerField, xShot, yShot);
            
            if (shotResult == 0) {
                currentPlayerName = player2Name;
                currentPlayerField = playerField1;
                currentPlayerBattleField = playerBattleField2;
            }
        }
    }
    
    private static int handleShot(char[][] battleFirld, char[][] field, int x, int y) {
        
        if ("1".equals(field[y][x])) {
            field[y][x] = '#';
        }
    }
}
