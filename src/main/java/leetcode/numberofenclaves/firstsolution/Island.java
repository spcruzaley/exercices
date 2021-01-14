package leetcode.numberofenclaves.firstsolution;

public class Island {
    private int x;
    private int y;
    private int level;
    private int singleLands;
    private boolean touchBoundary;
    private Island left, right, up, bottom;

    public Island(int x, int y) {
        this.x = x;
        this.y = y;
        this.left = null;
        this.right = null;
        this.up = null;
        this.bottom = null;
        this.level = 1;
        this.singleLands = 1;
        this.touchBoundary = false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Island getLeft() {
        return left;
    }

    public void setLeft(Island left) {
        left.setLevel(this.getLevel() + 1);
        this.left = left;
    }

    public Island getRight() {
        return right;
    }

    public void setRight(Island right) {
        right.setLevel(this.getLevel() + 1);
        this.right = right;
    }

    public Island getUp() {
        return up;
    }

    public void setUp(Island up) {
        up.setLevel(this.getLevel() + 1);
        this.up = up;
    }

    public Island getBottom() {
        return bottom;
    }

    public void setBottom(Island bottom) {
        bottom.setLevel(this.getLevel() + 1);
        this.bottom = bottom;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getSingleLands() {
        return singleLands;
    }

    public void setSingleLands(int singleLands) {
        this.singleLands = singleLands;
    }

    public boolean isTouchBoundary() {
        return touchBoundary;
    }

    public void setTouchBoundary(boolean touchBoundary) {
        this.touchBoundary = touchBoundary;
    }

    @Override
    public String toString() {
        return "Island{" +
                "x=" + x +
                ", y=" + y +
                ", level=" + level +
                ", singleLands=" + singleLands +
                ", touchBoundary=" + touchBoundary +
                ", left=" + left +
                ", right=" + right +
                ", up=" + up +
                ", bottom=" + bottom +
                '}';
    }
}
