import java.util.Scanner;

public class TicTacToe {
    private char[][] board;
    private int currentPlayer;

    public TicTacToe(){
        board= new char[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j]=' ';
            }
        }
        currentPlayer=1;
    }
    public void printBoard(){
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(board[i][j]);
                if(j<2){
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if(i<2){
                System.out.println("----------");
            }
        }
    }
    public boolean isBoardFull(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j]==' '){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean makeMove(int row,int col){
        if(row<0 || row >=3 || col <0 || col>=3 || board[row][col]!=' '){
            return false;
        }
        board[row][col]=(currentPlayer==1) ? 'X' :'O' ;
        currentPlayer=3-currentPlayer;
        return true;
    }

    public boolean checkWinner(){
        //check row col diagonals

        for(int i=0;i<3;i++){
            if(board[i][0]!=' '&& board[i][0]== board[i][1] && board[i][1]==board[i][2]){
                return true;
            }
            if(board[0][i]!=' ' && board[0][i]==board[1][i] && board[1][i]==board[2][i]){
                return true;
            }
            if(board[0][0]!=' ' && board[0][0]==board[1][1] && board[1][1]==board[2][2]){
                return true;
            }
            if(board[0][2]!=' ' && board[0][2]==board[1][1] && board[1][1]==board[2][0]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TicTacToe game=new TicTacToe();
        Scanner sc=new Scanner(System.in);
        int row,col;

        while(!game.isBoardFull() && !game.checkWinner()){
            game.printBoard();

            System.out.print("Player " + game.currentPlayer +", enter your move(row and column) : ");
            row=sc.nextInt();
            col=sc.nextInt();

            if(game.makeMove(row,col)){
                System.out.println("Move Successful ");
            }else{
                System.out.println("Invalid move. try Again !");
            }
        }
        game.printBoard();
        if(game.checkWinner()){
            System.out.println("Player "+(3- game.currentPlayer)+ " wins !");
        }else{
            System.out.println("It's a draw!");
        }
        sc.close();
    }
}
