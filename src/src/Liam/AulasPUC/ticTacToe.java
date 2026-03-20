package Liam.AulasPUC;

public class ticTacToe {
    public static void main(String[] args) {
        final int lines = 3;
        final int columns = 3;
        int x = 0;
        int y = 0;
        enum possible_OP{
            FREE_SPOT, CIRCLE,CROSS
        }
        // Data array!
        possible_OP[][] game = new possible_OP[lines][columns];


        switch (game[x][y]) {
            case CROSS -> System.out.println("X");
            case CIRCLE -> System.out.println("O");
            case FREE_SPOT -> System.out.println("__");
        }
    }
}
