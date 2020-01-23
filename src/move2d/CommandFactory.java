
package move2d;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Delegación Interior
 */
public class CommandFactory {

    private static CommandFactory instance = null;
    private Character ch;
    
    public static CommandFactory instance(Character ch){
        if(instance == null) instance = new CommandFactory(ch);
        return instance;
    }

    private CommandFactory(Character ch) {
        this.ch = ch;
    }
    
    public Map<String,Command> build(){
        Map<String,Command> tb = new HashMap<>();
        tb.put("UP",upCommand());
        tb.put("DOWN",downCommand());
        tb.put("LEFT",leftCommand());
        tb.put("RIGHT",rightCommand());
        return tb;
    }
    
    private Command upCommand(){
        return new Command(){
            @Override
            public void execute() {
                ch.setPosY(ch.getPosY()-ch.getSize());
            }
        };
    }
    
    private Command downCommand(){
        return new Command(){
            @Override
            public void execute() {
                ch.setPosY(ch.getPosY()+ch.getSize());            }
        };
    }
    
    private Command leftCommand(){
        return new Command(){
            @Override
            public void execute() {
                ch.setPosX(ch.getPosX()-ch.getSize());
            }
        };
    }
    
    private Command rightCommand(){
        return new Command(){
            @Override
            public void execute() {
                ch.setPosX(ch.getPosX()+ch.getSize());
            }
        };
    }
    
}
