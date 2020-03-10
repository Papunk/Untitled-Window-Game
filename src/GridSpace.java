import java.awt.*;

public class GridSpace extends Rectangle{

    private Rectangle gridSpace;
    private boolean isWall, isPlayer, isObjective;

    public GridSpace(int x, int y, int size, boolean isWall) {
        super(x, y, size, size); // this is necessary for some reason???
        this.gridSpace = new Rectangle(x, y, size, size);
        this.isWall = isWall;
    }

    // accessors and mutators

    public boolean isPlayer() {
        return isPlayer;
    }

    public void setHasPlayer(boolean hasPlayer) {
        this.isPlayer = hasPlayer;
    }

    public boolean isObjective() {
        return isObjective;
    }

    public void setObjective(boolean objective) {
        isObjective = objective;
    }

    public boolean isWall() {
        return isWall;
    }

    public void setWall(boolean occupied) {
        isWall = occupied;
    }

}
