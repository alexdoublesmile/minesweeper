package alt.view.swing;

import alt.model.CellImgType;

import javax.swing.*;
import java.awt.*;

public class ImageHelper {

    public static Image getImageByType(CellImgType imgType) {
        return getImageByName(imgType.name().toLowerCase());
    }

    public static Image getImageByName(String name) {
        final String fileName = "../../../img/" + name.toLowerCase() + ".png";
        final ImageIcon icon = new ImageIcon(ImageHelper.class.getResource(fileName));
        return icon.getImage();
    }
}