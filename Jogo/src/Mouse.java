import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;





public class Mouse implements MouseListener{

    private TelaObjeto bolinha;
    private TelaJogo tela;
    private Alvo alvo;

    private double mouseX;
    private double mouseY;

    public Mouse(TelaObjeto bolinha, TelaJogo tela, Alvo alvo){
        this.bolinha = bolinha;
        this.tela = tela;
        this.alvo = alvo;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
         
        // TODO Auto-generated method stub
        this.mouseX = e.getPoint().getX();
        this.mouseY = e.getPoint().getY();

        int alvoTamanhoX = alvo.getTamanhoX();
        int alvoXpos = alvo.getxPos();

        int alvoTamanhoY = alvo.getTamanhoY();
        int alvoYpos = alvo.getyPos();



        if ((mouseX >= alvoXpos && mouseX <= alvoTamanhoX) && (mouseY >= alvoYpos)) {
            System.out.println("Acertou miserable");
            bolinha.spawnar();
            bolinha.aumentarVelocidade();
            bolinha.atualizarPlacar();
        }

       
        System.out.println("XMouse: "+ mouseX + " YMouse: "+mouseY);
        System.out.println("XAlvo:" + alvoTamanhoX + " YAlvo: " + alvoTamanhoY);
        //System.out.println("X Pos: "+ bolinha.getXpos()+ " Y Pos: "+bolinha.getYpos());
        //System.out.println("X: "+ bolinha.getXpos()+ " X: "+(bolinha.getXpos()+bolinha.getTamanhoX()));
        //System.out.println("Y: "+ bolinha.getYpos()+ " Y: "+(bolinha.getYpos()+bolinha.getTamanhoY()));

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        //System.out.println("Clicado");
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
       // System.out.println("Mouse released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        //System.out.println("Mouse released exited");
        
    }
    
}
