// Write a function that takes a filename as string,
// open and read it. The file data represents a tic-tac-toe
// game result. Return 'X'/'O'/'draw' based on which player
// has winning situation.
// System.out.println(ticTacResult("win-o.txt"))
// should print O
//
//System.out.println(ticTacResult("win-x.txt"))
// should print X
//
//  System.out.println(ticTacResult("draw.txt"))
// should print draw

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Core_TicTacToe {
    public static void main(String[] args) {
        System.out.println(ticTacResult("game-result_row_x_win.txt"));
        System.out.println(ticTacResult("game-result_col_o_win.txt"));
        System.out.println(ticTacResult("game-result_diagLR_x_win.txt"));
        System.out.println(ticTacResult("game-result_diagRL_o_win.txt"));
        System.out.println(ticTacResult("game-result.txt"));
    }

    public static String ticTacResult(String s) {
        List<String> lines = new ArrayList<>();
        Path filePath = Paths.get(s);
        try {
            lines = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("Cannot open the file.");
        }
        int rowO = 0;
        int rowX = 0;
        int colO = 0;
        int colX = 0;
        int diagonalLRO = 0;
        int diagonalLRX = 0;
        int diagonalRLO = 0;
        int diagonalRLX = 0;
        int i = 0;
        int d = 2;
        while (rowO != 3 && rowX != 3 && colO != 3 && colX != 3 &&
                diagonalLRO != 3 && diagonalLRX != 3 && diagonalRLO != 3 && diagonalRLX != 3 &&
                i < lines.size()) {
            rowO = 0;
            rowX = 0;
            colO = 0;
            colX = 0;
            for (int j = 0; j < 3; j++) {
                if (lines.get(i).charAt(j) == '0') {
                    rowO++;
                } else {
                    rowX++;
                }
                if (lines.get(j).charAt(i) == '0') {
                    colO++;
                } else {
                    colX++;
                }
            }
            if (lines.get(i).charAt(i) == '0') {
                diagonalLRO++;
            } else {
                diagonalLRX++;
            }
            if (lines.get(i).charAt(d) == '0') {
                diagonalRLO++;
            } else {
                diagonalRLX++;
            }
            i++;
            d--;
        }
        if (rowO == 3 || colO == 3 || diagonalRLO == 3 || diagonalLRO == 3) {
            return "Win 0";
        } else if (rowX == 3 || colX == 3 || diagonalRLX == 3 || diagonalLRX == 3) {
            return "Win x ";
        } else return "Draw";
    }
}
