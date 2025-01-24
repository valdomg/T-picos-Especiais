import java.awt.*;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaObjeto extends JPanel {

    private final int ALTURA = 600;
    private final int LARGURA = 600;

    protected int xPos = LARGURA/2;
    protected int yPos = LARGURA/2;

    public int velocidadeHorizontal= 2;
    public int velocidadeVertical = 1;

    private JLabel placarLabel;
    private double pontuacao;

    private Image[] sprites =  {new ImageIcon("src\\sprites\\sprites.png").getImage()}; 

    Random random = new Random();

    public int tamanhoObj = 40;

    public TelaObjeto(){
        spawnar();
        initLabels();
        setPreferredSize(new Dimension(ALTURA,LARGURA));
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.drawImage(sprites[0], xPos, yPos, null);

        g.drawRect(xPos, yPos, tamanhoObj, tamanhoObj);
        g.setColor(Color.GREEN);
        g.drawOval(xPos, yPos, tamanhoObj,tamanhoObj);
        g.setColor(Color.GREEN);
        g.fillOval(xPos, yPos, tamanhoObj, tamanhoObj);
    }
    
    public void spawnar(){
        this.xPos = random.nextInt(15, LARGURA - 50);
        this.yPos = random.nextInt(15, ALTURA - 50);
    }

    public void aumentarVelocidade(){
        velocidadeHorizontal=+velocidadeHorizontal+2;
        velocidadeVertical=+velocidadeVertical+2;
    }

    public boolean confereLargura(){
        if (getTamanhoX()>=LARGURA ||  xPos <= 0) {
            return false;            
        }

        return true;
   }

   public boolean confereAltura(){
        if (getTamanhoY() >= ALTURA  || yPos <= 0) {
            return false;
        }

        return true;
   }

    public void initLabels(){
        placarLabel = new JLabel("Pontuação: 0");
        placarLabel.setBounds(200, 200, 150, 150); // Posição e tamanho
        placarLabel.setFont(new Font("Arial", Font.BOLD, 14)); // Fonte personalizada
        placarLabel.setForeground(Color.black);

        this.add(placarLabel);
    }

    public void atualizarPlacar(){
        this.pontuacao=+250;
        this.placarLabel.setText("Pontuação: " + pontuacao);
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

    public int getTamanhoY(){
        return this.tamanhoObj+this.getYpos();
    }

    public int getTamanhoX(){
        return this.tamanhoObj+this.getXpos();
    }
    
}