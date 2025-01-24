import java.awt.*;
import java.util.Random;

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
    private double pontuacao = 0;

    private Image [] sprites =  {new ImageIcon("Jogo\\src\\sprites\\sprite-mao.png").getImage()}; 

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

        Graphics2D g2 = (Graphics2D) g;

        //g.drawImage(sprites, LARGURA/14, 200, this);

        g2.drawImage(sprites[0], 110, 275, 400,400, this);

        g2.drawRect(xPos, yPos, tamanhoObj, tamanhoObj);
        g2.setColor(Color.GREEN);
        g2.drawOval(xPos, yPos, tamanhoObj,tamanhoObj);
        g2.setColor(Color.GREEN);
        g2.fillOval(xPos, yPos, tamanhoObj, tamanhoObj);
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