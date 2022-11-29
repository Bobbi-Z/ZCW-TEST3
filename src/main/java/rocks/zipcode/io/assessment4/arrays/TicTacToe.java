package rocks.zipcode.io.assessment4.arrays;



import java.util.Objects;

import static org.apache.commons.lang3.ArrayUtils.contains;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    private String [][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        String [] row = {board[value][0], board[value][1], board[value][2]};
        return row;
    }

    public String[] getColumn(Integer value) {
        String [] column = {board[0][value], board[1][value], board[2][value]};
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        if(Objects.equals(board[rowIndex][0], board[rowIndex][1]) && Objects.equals(board[rowIndex][1], board[rowIndex][2])){
            return true;
        } else { return false;
        }
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        if (Objects.equals(board[0][columnIndex], board[1][columnIndex]) && Objects.equals(board[1][columnIndex], board[2][columnIndex])){
            return true;
        }

        return false;
    }

    public Boolean isDiagonalHomogeneous(){
        if (Objects.equals(board[0][0], board[1][1]) && Objects.equals(board[1][1], board[2][2])){
            return true;
        }else if (Objects.equals(board[2][0], board[1][1]) && Objects.equals(board[1][1], board[0][2])){
            return true;
        }else{
            return false;
        }


    }

    public String getWinner() {
        for (int index = 0; index < 3; index++) {
            if (isRowHomogenous(index)) {
                String[] rowWins = {board[index][0]};
                if (contains(rowWins, "X")){
                    return "X";
                }else if(contains(rowWins, "O")){
                    return "O";
                }
            }
            if (isColumnHomogeneous(index)) {
                String[] columnWins = {board[0][index]};
                if (contains(columnWins, "X")){
                    return "X";
                }else if(contains(columnWins, "O")){
                    return "O";
                }
            }
        }
        if (isDiagonalHomogeneous()){
            String [] diagonalWins = {board[1][1]};
            if (contains(diagonalWins, "X")){
                return "X";
            }else if(contains(diagonalWins, "O")){
                return "O";
            }
        }

        return "tie";
    }

    public String[][] getBoard() {
        return null;
    }
}
