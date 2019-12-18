package move2d;

import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Main extends JFrame{

    public static void main(String[] args) {
        new Main().execute();
    }
    
    private void execute(){
        setVisible(true);
    }
    
    public Main(){
        setTitle("Move2D");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        SwingCharacterDisplay display = new SwingCharacterDisplay(new Character (2));
        add(button("Test"));
    }

    private JComponent button(String name) {
        JButton but = new JButton(name);
        but.setName(name);
        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Test");
            } 
        });
        return but;
    }
}
