import java.util.Scanner;
public class HW6{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        char[][] board={{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
        char currentPlayer='X';
        boolean gameEnded=false;

        while(!gameEnded){
            tictactoe.drawboard(board);
            System.out.println("Player "+currentPlayer+" enter your move(row and column):");
            //int row=0,col=0;
            try{
                int row=s.nextInt();
                int col=s.nextInt();
                if(row>=0 &&row<3 && col>=0 &&col<3 && board[row][col]==' '){
                board[row][col]=currentPlayer;
            }
            else{
            System.out.println("this move at("+row+','+col+") is not valid");
            }
            }
            catch(Exception e){
                    System.out.println("請輸入整數");
                    s.nextLine();//import!
                    continue;
            }
            gameEnded=tictactoe.checkWinner(board, currentPlayer);
            if(!gameEnded){
                currentPlayer=(currentPlayer=='X') ? 'O':'X';
            }

        }
        tictactoe.drawboard(board);
        System.out.println("Player "+currentPlayer+" wins");
    }

    
}

class tictactoe{
    public static void drawboard(char[][] board){
    System.out.println("Board:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(board[i][j]);
                if(j<2)
                    System.out.print("|");
            }
            System.out.println();
            if(i<2)
                System.out.println("-+-+-");
        }   
    }
    public static boolean checkWinner(char[][] board,char currentPlayer){
        for(int i=0;i<3;i++){
            if(board[i][0]==currentPlayer&&board[i][1]==currentPlayer&&board[i][2]==currentPlayer)return true;
            if(board[0][i]==currentPlayer&&board[1][i]==currentPlayer&&board[2][i]==currentPlayer)return true;
        }
        if(board[0][0]==currentPlayer && board[1][1]==currentPlayer&&board[2][2]==currentPlayer) return true;
        if(board[0][2]==currentPlayer && board[1][1]==currentPlayer&&board[2][0]==currentPlayer) return true;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j]==' '){
                    return false;
                }
            }
        }
        System.out.println(("it's a tie"));
        System.exit(0);
        return false;
    }
}