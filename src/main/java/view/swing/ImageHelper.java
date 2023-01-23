package view.swing;

import view.util.ImageConstants;

import javax.swing.*;
import java.awt.*;

public class ImageHelper {

    public static Image getImageByType(ImageType imageType) {
        return getImageByName(imageType.getImageName());
    }

    public static Image getImageByName(String name) {
        final String fileName = ImageConstants.IMAGE_DIR_PATH + name.toLowerCase() + ImageConstants.IMAGE_TYPE_POSTFIX;
        final ImageIcon icon = new ImageIcon(ImageHelper.class.getResource(fileName));
        return icon.getImage();
    }
}
