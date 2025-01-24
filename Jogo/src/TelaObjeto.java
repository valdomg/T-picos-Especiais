import java.awt.*;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;
import java.awt.Dimension;

import javax.swing.JPanel;

public class TelaObjeto extends JPanel {

    private int xPos;
    private int yPos;
    private int velocidade = 10;

    
    public void mover(){
        this.xPos =+ xPos+velocidade;
        this.yPos =+ yPos+velocidade;
        repaint();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        g.drawOval(xPos, yPos, 40,40);
        g.setColor(Color.GREEN);
        g.fillOval(xPos, yPos, 40, 40);
    }

    public Dimension setPreferredSize(){
        return new Dimension(600,600);
    }
    
}