import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Grid extends JComponent {

    int screenWidth, screenHeight, squareSize = 100;
    Random r = new Random();
    GridSpace[] row1 = new GridSpace[10];
    GridSpace[] row2 = new GridSpace[10];
    GridSpace[] row3 = new GridSpace[10];
    GridSpace[] row4 = new GridSpace[10];
    GridSpace[] row5 = new GridSpace[10];
    GridSpace[] row6 = new GridSpace[10];
    GridSpace[][] rows = {row1, row2, row3, row4, row5, row6};


    public Grid(int screenWidth, int screenHeight) {
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;

        for (int n = 0; n < 6; n++) {
            int y = n * squareSize;
            for (int i = 0; i < 10; i++) {
                int x = i * squareSize;
                rows[n][i] = new GridSpace(x, y, squareSize, r.nextBoolean());
                /* TODO: Remove these statements when its all stable
                System.out.print(x);
                System.out.print(' ');
                System.out.print(y);
                */
            }
        }
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        for (int n = 0; n < 6; n++) {
            for (int i = 0; i < 10; i++) {
                GridSpace gridSpace = rows[n][i];

                g2.setColor(Color.BLACK);
                g2.draw(gridSpace);
                if (gridSpace.isWall())
                    g2.setColor(Color.BLACK);
                else if (gridSpace.isPlayer())
                    g2.setColor(Color.RED);
                else
                    g2.setColor(Color.WHITE);
                g2.fill(gridSpace);
            }
        }

        // paints the square according to its identity
//
    }
}
