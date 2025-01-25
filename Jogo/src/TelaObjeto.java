import java.awt.*;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaObjeto extends JPanel {

    private final int ALTURA = 600;
    private final int LARGURA = 600;

    private double pontuacao = 0;

    private JLabel placarLabel;
    private Image [] sprites =  {new ImageIcon("Jogo\\src\\sprites\\sprite-mao.png").getImage()}; 
    Random random = new Random();
    private Alvo alvo;

    public int tamanhoObj = 40;

    public TelaObjeto(Alvo alvo){
        this.alvo = alvo;
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


        desenharAlvo(g2);

    }
    
    public void spawnar(){
        alvo.setxPos(random.nextInt(15, LARGURA - 50));
        alvo.setyPos(random.nextInt(15, ALTURA - 50));
    }

    public void desenharAlvo(Graphics2D g2){
        int tamanho = alvo.getTamanho();
        int xPos = alvo.getxPos();
        int yPos = alvo.getyPos();
        
        g2.drawRect(xPos, yPos, tamanho, tamanho);
        g2.setColor(Color.GREEN);
        g2.drawOval(xPos, yPos, tamanho,tamanho);
        g2.setColor(Color.GREEN);
        g2.fillOval(xPos, yPos, tamanho, tamanho);

    }

    public void aumentarVelocidade(){
        alvo.setVelocidadeHorizontal(alvo.getVelocidadeHorizontal()+3);
        alvo.setVelocidadeVertical(alvo.getVelocidadeVertical()+4);
    }

    public void mudaDirecaoHorizontal(){
        alvo.setVelocidadeHorizontal(alvo.getVelocidadeHorizontal() * -1);
    }

    public void mudaDirecaoVertical(){
        alvo.setVelocidadeVertical(alvo.getVelocidadeVertical() * -1);
    }

    public void moverElementoX(){
        alvo.setxPos( alvo.getxPos()+alvo.getVelocidadeHorizontal());
    }

    public void moverElementoY(){
        alvo.setyPos( alvo.getyPos()+alvo.getVelocidadeVertical());
    }

    public boolean confereLargura(){
        int tamanhoAlvo = alvo.getTamanhoX();
        int xPosAlvo = alvo.getxPos();

        if (tamanhoAlvo>=LARGURA ||  xPosAlvo <= 0) {
            return false;            
        }

        return true;
   }

   public boolean confereAltura(){
        int tamanhoAlvo = alvo.getTamanhoY();
        int yPosAlvo = alvo.getyPos();

        if (tamanhoAlvo >= ALTURA  || yPosAlvo <= 0) {
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

    
}