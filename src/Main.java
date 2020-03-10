import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Main {

    public static void main(String[] args) {
        drawGrid();
    }

    public static void drawGrid() {
        // setup
        JFrame window = new JFrame();
        window.setSize(400,400);
        window.setTitle("Untitled Window Game");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // screen size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();


        Grid grid = new Grid(screenWidth, screenHeight);

        window.add(grid);

        window.setVisible(true);




    }
}
