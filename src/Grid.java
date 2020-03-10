import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Grid extends JComponent {

    int numOfRows = 45, numOfColumns, squareSize;
    Random r = new Random();
    GridSpace[][] matrix;

    public Grid(int screenWidth, int screenHeight) {
        // defines the size of the gridSpaces and the number of columns
        // based on the vertical screen resolution
        this.squareSize = screenHeight / this.numOfRows;
        this.numOfColumns = screenWidth / this.squareSize;

        matrix = new GridSpace[this.numOfRows][this.numOfColumns];

        // fills the matrix with GridSpace objects
        for (int n = 0; n < this.numOfRows; n++) {
            int y = (n * this.squareSize) + ((screenHeight % squareSize) / 2);
            for (int i = 0; i < this.numOfColumns; i++) {
                int x = (i * this.squareSize) + ((screenWidth % squareSize) / 2);
                matrix[n][i] = new GridSpace(x, y, this.squareSize, r.nextBoolean());
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

        // paints the grid of gridSpace objects
        for (int n = 0; n < this.numOfRows; n++) {
            for (int i = 0; i < this.numOfColumns; i++) {
                GridSpace gridSpace = matrix[n][i];

                g2.setColor(Color.BLACK);
                g2.draw(gridSpace);
                if (gridSpace.isWall())
                    g2.setColor(Color.BLACK);
                else if (gridSpace.isPlayer())
                    g2.setColor(Color.RED);
                else
                    g2.setColor(Color.LIGHT_GRAY);
                g2.fill(gridSpace);
            }
        }

        // paints the square according to its identity
//
    }
}
