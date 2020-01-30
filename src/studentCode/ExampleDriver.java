package studentCode;

import GridTools.MyGrid;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;



public class ExampleDriver {
	public static MyGrid grid; 
	static int size = 50;
	public static FlagObj[][] myobjects;
	
	
	public static void main(String[] args) throws InterruptedException {
		

		
		
		grid = new MyGrid(size);
		FlagObj.Grid = grid;
		
		myobjects = new FlagObj[grid.getHt()][grid.getWd()];
		
			
		for (int i =0; i < grid.getHt(); i++) {
			for (int j =0; j < grid.getWd(); j++) {
				myobjects[i][j] = new FlagObj(j,i);
			}
		}		
		
		ant ANT = new ant((grid.getHt()-1)/2,(grid.getWd())/2);
		
		while(true) {
			ANT.logic();
	
			
			for (int i =0; i < grid.getHt(); i++) {
				for (int j =0; j < grid.getWd(); j++) {
					myobjects[i][j].draw();
				}
			}
			ANT.draw();
			
			grid.REPAINT();
			TimeUnit.MILLISECONDS.sleep(50);

		}
		
		
		
	}	
}
