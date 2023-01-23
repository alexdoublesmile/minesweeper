package alt.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@EqualsAndHashCode(of = {"row", "column"})
public class Cell {
    private int row;
    private int column;
    private CellType type;
    private boolean isOpen;
    private boolean isFlagged;
    private boolean isLosing;

    @ToString.Exclude
    @Builder.Default
    private List<Cell> aroundCells = new ArrayList<>();

    public List<Cell> getAroundCells() {
        return new ArrayList<>(aroundCells);
    }

    public void addAroundCell(Cell aroundCell) {
        aroundCells.add(aroundCell);
    }
}
