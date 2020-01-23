package move2d;

public class Character {
    
    private final int size;
    private int[] pos;

    public Character(int size,int h, int w) {
        this.size = size;
        pos = new int[2];
        pos[0] = w;
        pos[1] = h;
    }

    public int getSize() {
        return size;
    }
    
    public int getPosX(){
        return pos[0];
    }
    
    public void setPosX(int pos){
        this.pos[0] = pos;
    }
    
    public int getPosY(){
        return pos[1];
    }
    
    public void setPosY(int pos){
        this.pos[1] = pos;
    }
    
}
