import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MayinTarlasi implements MouseListener {
    JFrame frame;
    Btn[][] board = new Btn[10][10];
    int openButton;
    public MayinTarlasi() {
        frame = new JFrame();
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(10, 10));
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                Btn btn = new Btn(row, col);
                frame.add(btn);
                btn.addMouseListener(this);
                board[row][col] = btn;
            }
        }
        mayinTurret();
        //printMayin();
        yeniSayac();
       // print();



        frame.setVisible(true);
    }

    public void mayinTurret() {
        int i = 0;
        while (i < 10) {
            int rasgeleRow = (int) (Math.random() * board.length);
            int rasgeleCol = (int) (Math.random() * board[0].length);

            while (board[rasgeleRow][rasgeleCol].isMayin()) {
                rasgeleRow = (int) (Math.random() * board.length);
                rasgeleCol = (int) (Math.random() * board[0].length);
            }
            board[rasgeleRow][rasgeleCol].setMayin(true);
            i++;
        }
    }


    public void print() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col].isMayin()) {
                    board[row][col].setIcon(new ImageIcon("C:\\Users\\ömer\\IdeaProjects\\MayinTarlasi\\src\\mine.png"));
                } else {
                    board[row][col].setText(board[row][col].getSayac() + "");
                    board[row][col].setEnabled(false);
                }
            }
        }
    }
    public void printMayin() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col].isMayin()) {
                    board[row][col].setIcon(new ImageIcon("C:\\Users\\ömer\\IdeaProjects\\MayinTarlasi\\src\\mine.png"));

                }
            }
        }
    }

    public void yeniSayac() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col].isMayin()) {
                    sayac(row, col);
                }
            }
        }
    }

    public void sayac(int row, int col) {
        for (int i = row - 1; i <= row + 1; i++) {
            for (int k = col - 1; k <= col + 1; k++) {
                try {
                    int value = board[i][k].getSayac();
                    board[i][k].setSayac(++value);
                } catch (Exception e) {

                }
            }
        }
    }
    public void open(int r, int c) {
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c].getText().length() > 0
                || board[r][c].isEnabled() == false) {
            return;
        } else if (board[r][c].getSayac() != 0) {
            board[r][c].setText(board[r][c].getSayac() + "");
            board[r][c].setEnabled(false);
            openButton++;
        } else {
            openButton++;
            board[r][c].setEnabled(false);
            open(r - 1, c);
            open(r + 1, c);
            open(r, c - 1);
            open(r, c + 1);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Btn b = (Btn) e.getComponent();
        if (e.getButton() == 1) {
            System.out.println("sol tık");
            if (b.isMayin()) {
                JOptionPane.showMessageDialog(frame, "MAYINA BASTINIZ OYUN BİTTİ !! ");
                print();
            } else {
                open(b.getRow(), b.getCol());
                if (openButton == (board.length * board[0].length) - 10) {
                    JOptionPane.showMessageDialog(frame, "Tebrikler Oyunu Kazandınız !");
                    print();
                }

            }
        } else if (e.getButton() == 3) {
            System.out.println("sağ tık");
            if (!b.isBayrak()) {
                b.setIcon(new ImageIcon("C:\\Users\\ömer\\IdeaProjects\\MayinTarlasi\\src\\flag.png"));
                b.setBayrak(true);
            } else {
                b.setIcon(null);
                b.setBayrak(false);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}