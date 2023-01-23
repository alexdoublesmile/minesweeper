package view;

import controller.GameController;
import view.swing.GamePanel;
import view.swing.Window;
import view.swing.listener.PanelListener;
import view.util.ViewConstants;

import javax.swing.*;
import java.awt.*;

public class SwingView implements View {
    private final GameController controller;

    private Window window;
    private GamePanel panel;
    private JLabel label;

    public SwingView(GameController controller) {
        this.controller = controller;
    }

    @Override
    public void showWindow() {
        SwingUtilities.invokeLater(this::showWindowSeparateThread);
    }

    private void showWindowSeparateThread() {
        window = new Window();
        panel = new GamePanel(controller.getField());
        label = new JLabel(ViewConstants.GREETING_LABEL);
        window.add(label, BorderLayout.SOUTH);
        window.add(panel);
        window.pack();
        window.setLocationRelativeTo(null);

        panel.addMouseListener(new PanelListener(controller, panel, label));
    }
}
