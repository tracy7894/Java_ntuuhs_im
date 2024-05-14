import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HW11_1{
    static TicTacToe game=new TicTacToe();
    static JButton btn[][]=new JButton[3][3];
    static  JLabel label;
    public static void main(String args[]){
        //JOptionPane joptp=new JOptionPane();
        JFrame demo=new JFrame("Tic Tac Toe game");
        
        demo.setSize(400, 300);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel=new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        demo.add(panel,BorderLayout.CENTER);

        label=new JLabel("Player "+game.getCurrentPlayer()+"'s turn");
        demo.add(label,BorderLayout.SOUTH);

         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                btn[i][j]=new JButton();
                btn[i][j].setFont(new Font("Arial",Font.BOLD,40));
                final int row=i;
                final int col=j;
                btn[i][j].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    if(game.makeMove(row, col)){
                        btn[row][col].setText(String.valueOf(game.getCurrentPlayer()));
                        if(game.hasWinner()){
                            JOptionPane.showMessageDialog(demo,"Player "+game.getCurrentPlayer()+" wins");
                            label.setText("Player "+game.getCurrentPlayer()+" wins");
                        }
                        else if(game.isBoardFull()){
                            JOptionPane.showMessageDialog(demo,"it's a draw");
                            label.setText("it's a draw");
                        }          
                    else{
                        game.switchPlayer();
                        label.setText("player "+game.getCurrentPlayer()+"'s turn");
                    }        
                }
            }
         });
         panel.add(btn[i][j]);
            }
         }
        demo.setVisible(true);
    }
}