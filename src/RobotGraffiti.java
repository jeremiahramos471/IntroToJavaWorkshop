import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {

public static void main(String[] args) {
	Robot ETPLC=new Robot("batman");
	ETPLC.setSpeed(200);
	ETPLC.move(180);
	ETPLC.penDown();
	ETPLC.turn(180);
	ETPLC.move(180);
	ETPLC.turn(55);
	ETPLC.move(90);
	ETPLC.turn(90);
	ETPLC.move(90);
	ETPLC.penUp();
	ETPLC.move(180);
	ETPLC.penDown();
	ETPLC.turn(215);
	ETPLC.move(180);
	ETPLC.turn(55);
	ETPLC.move(75);
	ETPLC.turn(90);
	ETPLC.move(90);
	ETPLC.turn(180);
	
	
}
}
