package model.cell;

import model.Field;

import java.util.List;


public class ClosedEmptyCell extends Cell {
    public ClosedEmptyCell(int row, int column) {
        super(row, column, CellType.EMPTY, false);
    }

    @Override
    public void openCell(int row, int col, Field field) {
        field.makeOpen(row, col);

        field.getCells()[row][col].getAroundCells()
                .stream()
                .filter(Cell::isClosed)
                .filter(Cell::isNotFlagged)
                .forEach(cell -> cell.openCell(cell.getRow(), cell.getColumn(), field));
    }
}
