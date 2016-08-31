import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.DARK_GRAY);
                        g.fillRect(x1, y1, width+1, height+1);
                        //Draw a border
//                        g.setColor(Color.ORANGE);
//                        g.drawRect(x1, y1, width, height);
//                        g.setColor(Color.WHITE);
//                        g.drawRect(x1+10, y1+10, width-20, height-20);
//                        g.setColor(Color.BLUE);
//                        g.drawLine(x1, y1, x2, y2);
//                        g.setColor(Color.RED);
//                        g.drawLine(x2, y1, x1, y2);
                        //Draw Oval
                        g.setColor(Color.LIGHT_GRAY);
                        g.fillOval(width/3, height/3, 55, 55);
            }
}