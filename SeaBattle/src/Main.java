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
    {}
}
