import java.awt.Graphics;
import javax.swing.JApplet;
public class Snowman extends JApplet {
	public void paint(Graphics canvas) {
	super.paint(canvas);
	canvas.drawOval(100, 50, 200, 200);
	canvas.fillOval(155, 100, 10, 20);
	canvas.fillOval(230, 100, 10, 20);
	canvas.drawArc(150, 160, 100, 50, 180, 180);
	canvas.drawOval(80, 250, 250, 250);
	canvas.drawOval(50, 500, 300, 300);
	canvas.fillOval(190, 300, 20, 20);
	canvas.fillOval(190, 350, 20, 20);
	canvas.fillOval(190, 400, 20, 20);
	}
	

}
