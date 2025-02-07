import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Grafico extends JPanel {
    
    private int a, b;
    private int x = 300;
   // private int y = 300;
    private final int CENTRO = 245;

    public Grafico(){
        setPreferredSize(new Dimension(500, 500));

    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.drawLine(100, 250, 400, 250);
        g.drawLine(250,100, 250, 400);
        desenharOvalComeco(g);
        //desenharOvalFinal(g);
        desenharLinha(g);
        desenharCentro(g);
       
    }

    public void desenharOvalComeco(Graphics g){
        g.drawOval(190, 290, 10,10);
        
    }

    public void desenharOvalFinal(Graphics g){
       g.drawOval(310, 100,10,10);
    }

    public void desenharLinha(Graphics g){
        g.drawLine(190, 310, 290,100);
    }

    public void desenharCentro(Graphics g){
        int yInit = 290;
        int xInit = 120;
        int xFinal = 400;
        //g.drawOval(245,245, 10,10);
        for(int xComeco = xInit; xComeco < 250; xComeco+=2){
            g.setColor(Color.RED);
            g.drawOval(xComeco, yInit, 3, 3);
            g.fillOval(xComeco, yInit, 3, 3);

            yInit-=3;
        }
        /* 
        g.drawOval(215,235, 5,5);
        g.drawOval(205,225, 5,5);
        g.drawOval(195,215, 5,5);
        g.drawOval(185,205, 5,5);
        */
    }

    public void calcFuncao(Graphics g, int a, int b){
        int y = 0;
        y = (a*this.x) + b;

        

        //g.drawLine(a, aFinal, b, y);
    }
}
