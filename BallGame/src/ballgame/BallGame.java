import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.util.*;

public class BallGame extends JPanel{
public static void main(String[] args) {
    
    int rand1 = 50 + (int)(Math.random()*100);
    Ball ball1 = new Ball(300, 400, rand1, rand1); 
    
    
    
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(ball1);
    frame.setSize(ball1.box_width+15,ball1.box_height+37);
    frame.setVisible(true);
    
    
    double ballXModifier = 2 + (Math.random()*7);
    double ballYModifier = 2 + (Math.random()*7);
    
    while(true){
        try {
            Thread.sleep(20);
        } catch (InterruptedException ex) {
            Logger.getLogger(MovingBallRunner.class.getName()).log(Level.SEVERE, null, ex);
        }    
    ball1.moveBallY(ballYModifier);
    ball1.moveBallX(ballXModifier);
    if(ball1.ballX <= ball1.ballWidth/2||ball1.ballX >= ball1.box_width-ball1.ballWidth/2){
         ballXModifier = -ballXModifier;
         ball1.color = (colorGetter());
    }
    if(ball1.ballY <= ball1.ballHeight/2 || ball1.ballY >= ball1.box_height-ball1.ballHeight/2){
        ballYModifier = -ballYModifier;
        ball1.color = (colorGetter());
    }
       
    frame.getContentPane().repaint();    
    }
    
       
}
public static Color colorGetter(){
    Random rand = new Random();
    float r = rand.nextFloat();
    float g = rand.nextFloat();
    float b = rand.nextFloat();
    Color randomColor = new Color(r,g,b);
    return randomColor;
}


}
