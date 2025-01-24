import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



public class Mouse implements MouseListener{

    private TelaObjeto bolinha;
    private TelaJogo tela;
    private Animacao animacao; 

    public Mouse(TelaObjeto bolinha, TelaJogo tela){
        this.bolinha = bolinha;
        this.tela = tela;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        Point xy = e.getPoint();

        if (xy.getX() <= (bolinha.getXpos()+bolinha.getTamanho()) && xy.getX() >= bolinha.getXpos()) {
            System.out.println("Acertou miserable");
            tela.atualizarPlacar();
        }

        System.out.println("XMouse: "+ xy.getX()+ " YMouse: "+xy.getY());
        System.out.println("X Pos: "+ bolinha.getXpos()+ " Y Pos: "+bolinha.getYpos());
        //System.out.println("X: "+ (bolinha.getXpos()+bolinha.getTamanho())+ " Y: "+(bolinha.getYpos()+bolinha.getTamanho()));

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
        //System.out.println("Mouse entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        //System.out.println("Mouse released exited");
        
    }
    
}
