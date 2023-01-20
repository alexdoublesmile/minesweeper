package model;

public enum Box {
    ZERO,
    NUM1,
    NUM2,
    NUM3,
    NUM4,
    NUM5,
    NUM6,
    NUM7,
    NUM8,
    BOMB,
    OPENED,
    CLOSED,
    FLAGGED,
    BOMBED,
    NOBOMB;

    public Object image;

    public Box nextNumberBox() {
        return values()[ordinal() + 1];
    }

    public int getNumber() {
        return 0;
    }
}
