package alt.util;

import alt.model.Cell;
import alt.model.CellType;
import alt.model.Field;
import lombok.experimental.UtilityClass;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

@UtilityClass
public class CellUtil {
    final Random RANDOM = new Random();

//    public static boolean isValidCoords(Cell cell, Cell[][] cells) {
//        return Stream.of(cells)
//                .flatMap(Arrays::stream)
//                .anyMatch(cell::equals);
//    }

    public static Cell getNoBombRandomCell(Field field) {
        Cell randomCell;
        do {
            randomCell = getRandomCell(field);
        } while (randomCell.getType() == CellType.BOMB);

        return randomCell;
    }

    private static Cell getRandomCell(Field field) {
        int randomRow = RANDOM.nextInt(field.getNumberOfRows());
        int randomColumn = RANDOM.nextInt(field.getNumberOfColumns());

        return field.getCells()[randomRow][randomColumn];
    }

    public static boolean isValidCoords(int row, int column, Field field) {
        return row >= 0 && row < field.getNumberOfRows()
                && column >= 0 && column < field.getNumberOfColumns();
    }
}
