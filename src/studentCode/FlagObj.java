package studentCode;

import java.awt.Color;
import GridTools.MyGrid;


public class FlagObj {
	static MyGrid Grid;
	
	public boolean state = false;
	
	int X,Y;
	
	FlagObj(int X, int Y){
		this.X = X;
		this.Y = Y;
	}
	
	public void draw() {
		if(state) {
			 Grid.setColor(Y,X,Color.BLACK);
		}else{
			 Grid.setColor(Y,X,Color.WHITE);
		}
		
	}
	
	public void Logic() {
		
	}
	
}
