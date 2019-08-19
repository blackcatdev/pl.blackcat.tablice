import java.util.Arrays;

public class ChessBoard {
    private static int EMPTY = 0;
    private static int B_PAWN = 1;
    private static int B_ROOK = 2;
    private static int B_BISHOP = 3;
    private static int B_KNIGHT = 4;
    private static int B_QUEEN = 5;
    private static int B_KING = 6;

    private static int W_PAWN = 7;
    private static int W_ROOK = 8;
    private static int W_BISHOP = 9;
    private static int W_KNIGHT = 10;
    private static int W_QUEEN = 11;
    private static int W_KING = 12;

    private int[][] board = new int[8][8];

    private static int[][] DBvsKrd5(){

        return new int[][]{
                new int[]{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                new int[]{B_PAWN, B_PAWN, EMPTY, EMPTY, EMPTY, EMPTY, W_PAWN, EMPTY},
                new int[]{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                new int[]{EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                new int[]{EMPTY, B_KING, B_PAWN, EMPTY, EMPTY, W_KNIGHT, EMPTY, EMPTY},
                new int[]{EMPTY, B_KNIGHT, EMPTY, EMPTY, W_ROOK, EMPTY, W_PAWN, EMPTY},
                new int[]{EMPTY, EMPTY, EMPTY, B_ROOK, EMPTY, EMPTY, EMPTY, EMPTY},
                new int[]{EMPTY, W_KING, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
        };
    }

    public static void main(String[] args) {
        int[][] BoardFinal = DBvsKrd5();
        System.out.println(Arrays.deepToString(BoardFinal));
    }

}
