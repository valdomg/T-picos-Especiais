import java.awt.Dimension;


import javax.swing.JFrame;
import javax.swing.Timer;

public class TelaJogo extends JFrame{

    private TelaObjeto bolinha;
    private Timer timer;

    public TelaJogo(){
        setAlwaysOnTop(true);
        setAutoRequestFocus(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setPreferredSize(new Dimension(600,600));

        this.bolinha = new TelaObjeto();
        this.timer = new Timer(100, new Animacao(bolinha));

        timer.start();

        getContentPane().add(bolinha);

        pack();
    }

    
}