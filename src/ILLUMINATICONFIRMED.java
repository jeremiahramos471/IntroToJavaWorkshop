import org.jointheleague.graphical.robot.Robot;

public class ILLUMINATICONFIRMED {
public static void main(String[] args) {
	Robot LG=new Robot("batman");
	for (int i = 0; i < 3; i++) {
		
		LG.penDown();
		LG.setSpeed(200);
		LG.move(215);
		LG.turn(120);
	}
}
}
