
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animacao implements ActionListener{

    private TelaObjeto bolinha;
   

    public Animacao(TelaObjeto bolinha, Mouse mouse){
        this.bolinha = bolinha;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (!bolinha.confereLargura()) {
            bolinha.velocidadeHorizontal = bolinha.velocidadeHorizontal * -1;
        }

        if (!bolinha.confereAltura()) {
            bolinha.velocidadeVertical = bolinha.velocidadeVertical * -1;
        }

        bolinha.xPos =+ bolinha.xPos+bolinha.velocidadeHorizontal;
        bolinha.yPos =+ bolinha.yPos+bolinha.velocidadeVertical;

        
        
        //System.out.println("X Pos: "+ bolinha.getXpos()+ " Y Pos: "+bolinha.getYpos());
        //System.out.println("X Pos Final: "+ (bolinha.getXpos()+bolinha.getTamanho())+ " Y POs Final: "+(bolinha.getYpos()+bolinha.getTamanho()));
        bolinha.repaint();
        
    }
    
}
