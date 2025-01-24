
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animacao implements ActionListener{

    private TelaObjeto tela;

    public Animacao(TelaObjeto bolinha){
        this.tela = bolinha;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        tela.mover();
    }
    
}
