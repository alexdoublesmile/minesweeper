package controller;

import model.Coord;
import util.Ranges;

public class Game {
    public Game(int cols, int rows) {
        Ranges.setSize(new Coord(cols, rows));
    }
}
