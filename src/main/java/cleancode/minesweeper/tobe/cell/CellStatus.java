package cleancode.minesweeper.tobe.cell;

public class CellStatus {

    private boolean isFlagged;
    private boolean isOpened;

    private CellStatus(boolean isFlagged, boolean isOpened) {
        this.isFlagged = isFlagged;
        this.isOpened = isOpened;
    }

    public static CellStatus initialize() {
        return new CellStatus(true, false);
    }

    public void flag() {
        this.isFlagged = true;
    }

    public void open() {
        this.isOpened = true;
    }

    public boolean isChecked() {
        return isFlagged || isOpened;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public boolean isFlagged() {
        return isFlagged;
    }
}
