package cleancode.minesweeper.tobe.cell;

public class LandMineCell implements Cell {

    private static final String LAND_MINE_SIGN = "☼";

    private final CellStatus cellStatus = CellStatus.initialize();

    @Override
    public boolean isLandMine() {
        return true;
    }

    @Override
    public boolean hasLandMineCount() {
        return false;
    }

    @Override
    public String getSign() {
        if (cellStatus.isOpened()) {
            return LAND_MINE_SIGN;
        }
        if (cellStatus.isFlagged()) {
            return FLAG_SIGN;
        }
        return UNCHECKED_SIGN;
    }

    @Override
    public void flag() {
        cellStatus.flag();
    }

    @Override
    public void open() {
        cellStatus.open();
    }

    @Override
    public boolean isChecked() {
        return cellStatus.isChecked();
    }

    @Override
    public boolean isOpened() {
        return cellStatus.isOpened();
    }
}
