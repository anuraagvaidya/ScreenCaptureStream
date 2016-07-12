package com.bysness.screencapturestream;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/**
 * Created by Anuraag on 7/12/2016.
 */
public class ScreenCapture {
    void getSnapshot(){
        Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        try {
            BufferedImage buffImage = new Robot().createScreenCapture(screenRect);

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(buffImage, "png", baos);
            InputStream is = new ByteArrayInputStream(baos.toByteArray());
            while (is.available()>0)
            {
                System.out.write(is.read());
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        //System.exit(0);
    }
}
