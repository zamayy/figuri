import java.awt.*;

public class Circle extends Shape{
    @Override
    void equals() {
        super.equals();
    }

    void get(int u, int i, int o, int p){
        super.x = u;
        super.y = i;
        super.a = o;
        super.b = p;
    }
    @Override
    void draw(Graphics erikhan, int x, int y, int a, int b) {
        erikhan.drawOval(x,y,a,b);
    }
}
