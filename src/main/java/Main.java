import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedImage result = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
        Graphics erikhan = result.createGraphics();
        Circle circle = new Circle();
        circle.get(100,100,100,100);
        Rectangle rectangle = new Rectangle();
        rectangle.get(100,100,100,100);
        Shape[] q = {circle,rectangle};
        for(int i =0; i< q.length; i++){
            q[i].draw(erikhan,q[i].x,q[i].y,q[i].a,q[i].b);
        }
        File resultfile = new File("result.png");
        try{
            ImageIO.write(result, "png", resultfile);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
