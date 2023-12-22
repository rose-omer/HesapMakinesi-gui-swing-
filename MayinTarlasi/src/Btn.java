import javax.swing.*;

public class Btn extends JButton {
    private  int row,col,sayac;
    private  boolean mayin ,bayrak;

    public Btn(int row, int col  ) {
        this.row = row;
        this.col =col;
        this.sayac=0;
        this.bayrak=false;
        this.mayin=false;

    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getSayac() {
        return sayac;
    }

    public void setSayac(int sayac) {
        this.sayac = sayac;
    }

    public boolean isMayin() {
        return mayin;
    }

    public void setMayin(boolean mayin) {
        this.mayin = mayin;
    }

    public boolean isBayrak() {
        return bayrak;
    }

    public void setBayrak(boolean bayrak) {
        this.bayrak = bayrak;
    }
}
