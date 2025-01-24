import java.awt.Dimension;


import javax.swing.JFrame;
import javax.swing.Timer;

public class TelaJogo extends JFrame{

    private TelaObjeto bolinha;
    private Timer timer;
    private Mouse mouse;

    private String placar;

    public TelaJogo(){
        setAlwaysOnTop(true);
        setAutoRequestFocus(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setPreferredSize(new Dimension(600,600));

        
        this.bolinha = new TelaObjeto();
        this.mouse = new Mouse(bolinha, this);
        this.timer = new Timer(10, new Animacao(bolinha, mouse));

        timer.start();
        getContentPane().add(bolinha);
        addMouseListener(mouse);

        pack();
    }

    public void atualizarPlacar(){
        
    }
}