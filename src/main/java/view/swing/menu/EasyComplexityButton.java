package view.swing.menu;

import javax.swing.*;

import static util.ConfigConstants.*;
import static util.PropertyHelper.updateConfig;

public class EasyComplexityButton extends JRadioButtonMenuItem {
    private final GameMenu menuBar;

    public EasyComplexityButton(String name, GameMenu menuBar) {
        super(name, menuBar.getView().getController().isEasyComplexity());
        this.menuBar = menuBar;

        addActionListener(e -> {
            updateConfig(ROWS_NUMBER_PROPERTY_NAME, ROWS_NUMBER_EASY_VALUE);
            updateConfig(COLUMNS_NUMBER_PROPERTY_NAME, COLUMNS_NUMBER_EASY_VALUE);
            updateConfig(BOMBS_NUMBER_PROPERTY_NAME, BOMBS_NUMBER_EASY_VALUE);
        });
    }
}
