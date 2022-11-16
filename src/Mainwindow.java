import javax.swing.*;

public class Mainwindow extends JFrame {
    public Mainwindow(){
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,345);
        setLocation(400,400 );
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        Mainwindow mw=new Mainwindow();

    }

}
