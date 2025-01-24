import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class TelaSprite extends JLabel{

    ImageIcon sprites;

    private final int ALTURA = 600;
    private final int LARGURA = 600;

    public TelaSprite(){
        this.sprites = new ImageIcon("src\\sprites\\sprites.png");

        
    }

}
