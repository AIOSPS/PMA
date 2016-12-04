package eu.pms.common.tools;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.font.FontRenderContext;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Auther: Mureed F.Al-Alem
 * Date: Oct 30, 2007
 * Time: 10:22:48 AM
 * QOU Portal Project (ICTC)  center
 * version 1.0
 */
public class PasswordImageCreator {


    public static BufferedImage createRandomImage(String imageText,
                                                  String imageFontFile, 
                                                  Float imageFontSize,
                                                  String imageBackgroundColor,
                                                  String imageForgroundColor) {


        String text = eu.pms.common.tools.Randomizer.RandomPassword();

        String fontFile = "";
        Float fontSize = 20.0f;
        Color background = Color.white;
        Color color = Color.black;
        Font font = null;

        if (imageText != null && !imageText.trim().equals("")) {
            text = imageText;
        }

        if (imageFontFile != null && !imageFontFile.trim().equals("")) {
            fontFile = imageFontFile;
            try {
                font = Font.createFont(Font.TRUETYPE_FONT, new FileInputStream(fontFile));

                if (imageFontSize != null) {
                    fontSize = imageFontSize;
                    font = font.deriveFont(fontSize);
                }
            } catch (FontFormatException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            } catch (IOException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }


        if (imageBackgroundColor != null && !imageBackgroundColor.trim().equals("")) {
            background = new Color(Integer.parseInt(imageBackgroundColor, 16));
        }

        if (imageForgroundColor != null && !imageForgroundColor.trim().equals("")) {
            color = new Color(Integer.parseInt(imageForgroundColor, 16));
        }


        BufferedImage buffer = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = buffer.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        FontRenderContext fc = g2.getFontRenderContext();
        Rectangle2D bounds = font.getStringBounds(text, fc);

        // calculate the size of the text
        int width = (int) bounds.getWidth();
        int height = (int) bounds.getHeight();

        // prepare some output
        buffer = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        g2 = buffer.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setFont(font);

        // actually do the drawing
        g2.setColor(background);
        g2.fillRect(0, 0, width, height);
        g2.setColor(color);
        g2.drawString(text, 0, (int) -bounds.getY());


        return buffer;
    }
}
