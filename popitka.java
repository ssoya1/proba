package com.company;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.black);
        Polygon pg1=new Polygon();
        pg1.addPoint(100, 100);
        pg1.addPoint(200, 100);
        pg1.addPoint(150, 0);
        g.drawPolygon(pg1);
        g.setColor(Color.blue);
        g.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 20));
        g.drawString("Hello, Sophia", 20, 120);
        g.drawRect(100, 0, 100, 100);
        g.setColor(Color.red);
        g.drawOval(100,0,100,100);
    }
}
