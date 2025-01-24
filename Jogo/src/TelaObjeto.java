import java.awt.*;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;
import java.awt.Dimension;

import javax.swing.JPanel;

public class TelaObjeto extends JPanel {

    public int xPos = 0;
    public int yPos = 0;
    public int velocidadeHorizontal = 2;
    public int velocidadeVertical = 1;



    public int tamanhoObj = 40;

    private final int ALTURA = 600;
    private final int LARGURA = 600;
    
    public void mover(){
        
        repaint();
    }

    public void moverDireita(){
        this.xPos =+ xPos+velocidadeHorizontal;
    }

    public void moverEsquerda(){
        this.xPos =+ xPos-velocidadeHorizontal*1;
    }

    public void moverBaixo(){
        this.yPos =+ yPos+velocidadeVertical;
    };

   public boolean confereLargura(){
        if (xPos+40>=LARGURA ||  (xPos+40) <= 0) {
            return false;            
        }

        return true;
   }


   public boolean confereAltura(){
        if (yPos+40 >= ALTURA || yPos+40 <= 0) {
            return false;
        }

        return true;
   }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(xPos, yPos, tamanhoObj, tamanhoObj);
        g.setColor(Color.GREEN);
        g.drawOval(xPos, yPos, tamanhoObj,tamanhoObj);
        g.setColor(Color.GREEN);
        g.fillOval(xPos, yPos, tamanhoObj, tamanhoObj);
    }

    public Dimension setPreferredSize(){
        return new Dimension(ALTURA,LARGURA);
    }

    public int getXpos(){
        return this.xPos;
    }

    
    public int getYpos(){
        return this.yPos;
    }

    public int getTamanho(){
        return this.tamanhoObj;
    }
    
}