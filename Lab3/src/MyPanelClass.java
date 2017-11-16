import java.awt.Color;

import java.awt.Graphics;

import java.awt.Insets;

import java.awt.Polygon;


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

                        int stripeAmount = 5;

                        int stripeHeight = height/stripeAmount;

                        int xCenter = width/2, yCenter = height/2, xStarCenter = width/5;

                        

                        

                        //Paint the background

                        g.setColor(Color.RED);

                        g.fillRect(x1, y1, width + 1, height + 1);

                        

                        //Paint White Stripes

                        g.setColor(Color.WHITE);

                        g.fillRect(x1, stripeHeight , width + 1, height/5 + 1);

                        g.setColor(Color.WHITE);

                        g.fillRect(x1, 3*stripeHeight , width + 1, height/5 + 1);

                        

//                        //Draw a border

//                        g.setColor(Color.YELLOW);

//                        g.drawRect(x1, y1, width, height);

//                        //Draw an inner border

//                        g.setColor(Color.RED);

//                        g.drawRect(x1 + 5, y1 + 5, width - 10, height - 10);

                        //Draw diagonal line

                        g.setColor(Color.BLUE);

                        g.drawLine(x1, y1, xCenter, yCenter);

                        //Draw second diagonal line

                        g.setColor(Color.BLUE);

                        g.drawLine(xCenter, yCenter, x1, height);

                        g.setColor(Color.BLUE);

                        //Draw triangle

                        Polygon triangle = new Polygon();

                        triangle.addPoint(x1, y1);

                        triangle.addPoint(xCenter, yCenter);

                        triangle.addPoint(x1, height);

                        g.setColor(Color.BLUE);

                        g.fillPolygon(triangle);

                        

//                        //Draw an oval

//                        g.setColor(Color.LIGHT_GRAY);

//                        g.fillOval((width / 2) - (ovalRadius), (height / 2) - (ovalRadius), 55, 55);

//                        Polygon p = new Polygon();

//                        p.addPoint(x1 + 5, y1 + 25);

//                        p.addPoint(x1 + 20, y1 + 10);

//                        p.addPoint(x1 + 35, y1 + 25);

//                        p.addPoint(x1 + 25, y1 + 25);

//                        p.addPoint(x1 + 25, y1 + 45);

//                        p.addPoint(x1 + 15, y1 + 45);

//                        p.addPoint(x1 + 15, y1 + 25);

//                        g.setColor(Color.YELLOW);

//                        g.fillPolygon(p);

                        

                        

                        Polygon p2 = new Polygon();

                        p2.addPoint(xStarCenter - width/11, yCenter - height/40);

                        p2.addPoint(xStarCenter - width/35, yCenter - height/40);

                        p2.addPoint(xStarCenter, yCenter - height/8);

                        p2.addPoint(xStarCenter + width/35, yCenter - height/40);

                        p2.addPoint(xStarCenter + width/11, yCenter - height/40);

                        p2.addPoint(xStarCenter + width/24, yCenter + height/24);

                        p2.addPoint(xStarCenter + width/17,  yCenter + height/7);

                        p2.addPoint(xStarCenter, yCenter + height/14);

                        p2.addPoint(xStarCenter - width/17, yCenter + height/7);

                        p2.addPoint(xStarCenter - width/24, yCenter + height/24);

                        g.setColor(Color.WHITE);

                        g.fillPolygon(p2);

			}

}