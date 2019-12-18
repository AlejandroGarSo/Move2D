package move2d;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;



public class SwingCharacterDisplay extends JPanel implements CharacterDisplay{
    
    private Character ch;

    public SwingCharacterDisplay(Character ch) {
        this.ch = ch;
    }

    @Override
    public void show(){
        repaint();
    }
    
    @Override
    public void paint(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.black);
        g.fillRect(ox()-ch.getSize()/2, oy()-ch.getSize()/2, ch.getSize(), ch.getSize());
    }
    
    private int ox(){
        return getWidth()/2;
    }
    
    private int oy(){
        return getHeight()/2;
    }
    
    
    
    

}
