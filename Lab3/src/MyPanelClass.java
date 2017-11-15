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
                        int ovalRadius = 55 / 2;
 
                        //Paint the background
                        g.setColor(Color.GREEN);
                        g.fillRect(x1, y1, width + 1, height + 1);
//                        //Draw a border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
//                        //Draw an inner border
//                        g.setColor(Color.RED);
//                        g.drawRect(x1 + 5, y1 + 5, width - 10, height - 10);
                        //Draw diagonal line
                        g.setColor(Color.WHITE);
                        g.drawLine(x1, y1, x2, y2);
                        //Draw second diagonal line
                        g.setColor(Color.BLUE);
                        g.drawLine(x1 + width, y1, x1, y2);
                        //Draw an oval
                        g.setColor(Color.LIGHT_GRAY);
                        g.fillOval((width / 2) - (ovalRadius), (height / 2) - (ovalRadius), 55, 55);
            }
}