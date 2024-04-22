/* Develop an applet to display the simple message */
import java.awt.*;
import java.applet.*;

public class SimpleApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        Font font = new Font("Arial", Font.BOLD, 16);
        g.setFont(font);
        g.drawString("This is My First Applet",60,110);
    }
}
