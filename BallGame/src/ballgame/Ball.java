package ballgame;
import java.awt.*;
import javax.swing.*;
public class Ball extends JPanel{
public double ballX;
public double ballY;
public int ballHeight;
public int ballWidth;
public Color color = Color.BLUE;
public int box_height = 600;
public int box_width = 800;

public Ball(int ballX, int ballY, int ballHeight, int ballWidth){
    
this.ballY = ballY;
this.ballX = ballX;
this.ballHeight = ballHeight;
this.ballWidth = ballWidth;

}

public void moveBallX(double x){
    ballX= ballX + x;
}
public void moveBallY(double x){
    ballY = ballY - x;
}

@Override
public void paint(Graphics g){   
    g.setColor(Color.BLACK);
    g.fillRect(0, 0, box_width, box_height);
    g.setColor(color);
    g.fillOval((int)ballX-ballWidth/2, (int)ballY-ballHeight/2, ballWidth, ballHeight);
    g.drawString("("+ballX+", "+ballY+")",10,10 );
}

}