import java.awt.Color;
import java.awt.Graphics;

public class ComposicionApplet extends java.applet.Applet{
    
    @Override
    public void paint(Graphics s){
        s.setColor(Color.BLACK);
        s.fillRect(50, 50, 300, 300);
        s.setColor(Color.PINK);
        s.fillRect(50, 200, 38, 38);
        s.fillRect(125, 200, 38, 38);
        s.fillRect(238, 200, 38, 38);
        s.fillRect(312, 200, 38, 38);
        s.setColor(Color.MAGENTA);
        s.fillRect(88, 200, 38, 38);
        s.fillRect(275, 200, 38, 38);
        s.setColor(Color.GREEN);
        s.fillRect(400, 50, 300, 300);
        s.setColor(Color.BLACK);
        s.fillRect(450, 100, 60, 60);
        s.fillRect(590, 100, 60, 60);
        s.fillRect(510, 160, 80, 40);
        s.fillRect(470, 200, 160, 80);
        s.fillRect(470, 280, 40, 40);
        s.fillRect(590, 280, 40, 40);
        s.setColor(Color.LIGHT_GRAY);
        s.fillRect(750, 50, 300, 300);
        s.setColor(Color.BLACK);
        s.fillRect(790, 180, 75, 40);
        s.fillRect(935, 180, 75, 40);
        s.fillRect(790, 260, 220, 40);
        s.setColor(Color.DARK_GRAY);
        s.fillRect(865, 220, 70, 40); 
    }
}
