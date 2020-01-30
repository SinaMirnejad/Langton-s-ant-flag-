package studentCode;

import java.awt.Color;

public class ant {
	int X,Y;
	int dir = 0;
	
	
	ant(int X, int Y){
		this.X = X;
		this.Y = Y;
	}
	
	public void draw() {	
		ExampleDriver.grid.setColor(X,Y,Color.RED);
	}
	
	public void logic() {
				
		if (X<0 || X > 49) {
			X = 25;
		}
		
		if(Y<0 || Y > 99) {
			Y =50;
		}
		
		if(ExampleDriver.myobjects[X][Y].state) {
			dir = (dir +1)%4;
		}else {
			dir = (dir -1)%4;
			if(dir==-1) dir = 3;
		}
		
		ExampleDriver.myobjects[X][Y].state = !ExampleDriver.myobjects[X][Y].state;
		
		switch(dir) {
		case 0:
			X--;
			break;
		case 1:
			Y++;
			break;
		case 2:
			X++;
			break;
		case 3:
			Y--;
			break;
		}
		
	}
	
	
}
