package move2d;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame{
    
    private static final String[] buttons = {"UP","DOWN","LEFT","RIGHT"};
    private Map<String,Command> com;
    private Character ch;
    private SwingCharacterDisplay display;

    public static void main(String[] args) {
        new Main().execute();
    }
    
    private void execute(){
        this.com = CommandFactory.instance(ch).build();
        setVisible(true);
    }
    
    public Main(){
        setTitle("Move2D");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        display = new SwingCharacterDisplay();
        add(display);
        add(toolbar(), BorderLayout.SOUTH);
        ch = new Character(50,getHeight()/2,getWidth()/2);
        display.show(ch);
        //add(button("Test"));
    }

    private JComponent button(String name) {
        JButton but = new JButton(name);
        but.setName(name);
        but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                com.get(name).execute();
                display.show(ch);
            } 
        });
        return but;
    }

    private JComponent toolbar() {
        JPanel tool = new JPanel();
        for (String but : buttons) {
            tool.add(button(but));
        }
        return tool;
    }
}
