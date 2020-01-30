package studentCode;

import java.awt.Color;
import GridTools.MyGrid;

public class FlagMaker {

	/* Draws a single flag as indicated by the second parameter */
	/* into the grid passed as the first parameter */
	public static void drawFlag(MyGrid grid, int countryCode) {

		int width = grid.getWd();
		int height = grid.getHt();

		System.out.println("Width: " + width);
		System.out.println("Height " + height);

		if (countryCode == 1 && height % 2 == 0) {
			drawIndonesia(grid, width, height);
		} else {
			drawErrorFlag(grid, width, height);
		}
		if (countryCode == 2 && height % 3 == 0) {
			drawLithuania(grid, width, height);
		}

		if (countryCode == 3 && height % 4 == 0) {
			drawRwanda(grid, width, height);
		}

		if (countryCode == 4 && height > 0) {
			drawMalta(grid, width, height);
		}

		if (countryCode == 5 && height % 3 == 0) {
			drawAfghanistan(grid, width, height);
		}
		if (countryCode == 6) {
			drawEritrea(grid, width, height);
		}

		if (countryCode == 7 && height >= 8 && height % 2 == 0) {
			drawMacedonia(grid, width, height);
		}

		if (countryCode == 8 && height % 3 == 0 && height % 2 == 1) {
			drawBahamas(grid, width, height);
		}
		if (countryCode == 9 && height % 7 == 0) {
			drawZimbabwe(grid, width, height);
		}

	}
	public static void drawErrorFlag(MyGrid grid, int width, int height){
		for (int row = 0; row < height; row++) {
			for (int col = 0; col < width; col++) {
				grid.setColor(row, col, Color.WHITE);
			}
		}
		grid.setColor(0, 0, Color.RED);
		grid.setColor(0, width - 1, Color.YELLOW);
		grid.setColor(height - 1, 0, Color.BLUE);
		grid.setColor(height - 1, width - 1, Color.GREEN);
	}
	
	public static void drawIndonesia(MyGrid grid, int width, int height){
		for (int row = 0; row < width; row++) {
			for (int col = height / 2; col <= height - 1; col++) {
				grid.setColor(col, row, Color.WHITE);
			}
		}
		for (int row = 0; row < height / 2; row++) {
			for (int col = 0; col <= width - 1; col++) {
				grid.setColor(row, col, Color.RED);
			}
		}
	}
	public static void drawLithuania(MyGrid grid, int width, int height){
		for (int row = 0; row <= height / 3; row++) {
			for (int col = 0; col < width; col++) {
				grid.setColor(row, col, Color.YELLOW);
			}
		}
		for (int row = height / 3; row < (4 * height) / 6; row++) {
			for (int col = 0; col < width; col++) {
				grid.setColor(row, col, Color.GREEN);
			}
		}
		for (int row = 4 * height / 6; row < height; row++) {
			for (int col = 0; col < width; col++) {
				grid.setColor(row, col, Color.RED);
			}
		}
	}
	public static void drawRwanda(MyGrid grid, int width, int height){
		for (int row = 0; row <= (height / 2) - 1; row++) {
			for (int col = 0; col < width; col++) {
				grid.setColor(row, col, Color.BLUE);
			}
		}
		for (int row = height / 2; row < (3 * height) / 4; row++) {
			for (int col = 0; col < width; col++) {
				grid.setColor(row, col, Color.YELLOW);
			}
		}
		for (int row = (3 * height) / 4; row < height; row++) {
			for (int col = 0; col < width; col++) {
				grid.setColor(row, col, Color.GREEN);
			}
		}
	}
	public static void drawMalta(MyGrid grid, int width, int height){
		for (int row = 0; row < height; row++) {
			for (int col = 0; col < width / 2; col++) {
				grid.setColor(row, col, Color.WHITE);
			}
		}
		for (int row = 0; row < height; row++) {
			for (int col = width / 2; col < width; col++) {
				grid.setColor(row, col, Color.RED);
			}
		}
	}
	public static void drawAfghanistan(MyGrid grid, int width, int height){
		for (int row = 0; row < height; row++) {
			for (int col = 0; col < width / 3; col++) {
				grid.setColor(row, col, Color.BLACK);
			}
		}
		for (int row = 0; row < height; row++) {
			for (int col = width / 3; col < (2 * width) / 3; col++) {
				grid.setColor(row, col, Color.RED);
			}
		}
		for (int row = 0; row < height; row++) {
			for (int col = (2 * width) / 3; col < width; col++) {
				grid.setColor(row, col, Color.GREEN);
			}
		}
	}
	public static void drawEritrea(MyGrid grid, int width, int height){
		for (int row = 0; row < height / 2; row++) {
			for (int col = 0; col < width; col++) {
				grid.setColor(row, col, Color.GREEN);
			}
		}
		for (int row = height / 2; row < height; row++) {
			for (int col = 0; col < width; col++) {
				grid.setColor(row, col, Color.BLUE);
			}
		}
		for (int row = 0; row < height / 2; row++) {
			for (int col = 0; col < (row * 4) + 4; col++) {
				grid.setColor(row, col, Color.RED);

			}
		}
		for (int row = 0; row < height; row++) {
			for (int col = 0; col < 4; col++) {
				grid.setColor(row, col, Color.RED);
			}
		}
		if (height % 2 == 0) {
			for (int row = height / 2; row < height; row++) {
				for (int col = ((width * 2) - 1) - (4 * row); col >= 0; 
					col--) {
					grid.setColor(row, col, Color.RED);
				}
			}
		} else {
			for (int row = (height + 1) / 2; row < height; row++) {
				for (int col = (width * 2) - 1 - (4 * row); col >= 0; col--)
				{
					grid.setColor(row, col, Color.RED);
				}
			}
			for (int row = height / 2; row == height / 2; row += 1) {
				for (int col = 0; col < width; col++) {
					grid.setColor(row, col, Color.RED);
				}
			}
		}
	}
	public static void drawMacedonia(MyGrid grid, int width, int height){
		for (int row = 0; row < height; row++) {
			for (int col = 0; col < width; col++) {
				grid.setColor(row, col, Color.RED);
			}
		}
		// horizontal line
		for (int row = (height / 2) - 1; row < (height / 2) + 1; row++) {
			for (int col = 0; col < width; col++) {
				grid.setColor(row, col, Color.ORANGE);
			}
		} // vertical line
		for (int row = 0; row < height; row++) {
			for (int col = (width / 2) - 1; col < (width / 2) + 1; col++) {
				grid.setColor(row, col, Color.ORANGE);
			}
		} // diagonal line down
		for (int row = 0; row < height; row++) {
			for (int col = row * 2; col <= (row * 2) + 1; col++) {
				grid.setColor(row, col, Color.ORANGE);
			}
		} // diagonal line up
		for (int row = 0; row < height; row++) {
			for (int col = (width - 1) - 2 * row; col >= (width - 2) - 2 * 
				row; col--) {
				grid.setColor(row, col, Color.ORANGE);
			}
		} // box
		for (int row = (height / 2) - 2; row < (height / 2) + 2; row++) {
			for (int col = (width / 2) - 4; col < (width / 2) + 4; col++) {
				grid.setColor(row, col, Color.ORANGE);
			}
		}
	}
	public static void drawBahamas(MyGrid grid, int width, int height){
		for (int row = 0; row <= height / 3; row++) {
			for (int col = 0; col < width; col++) {
				grid.setColor(row, col, Color.BLUE);
			}
		}
		for (int row = height / 3; row < (4 * height) / 6; row++) {
			for (int col = 0; col < width; col++) {
				grid.setColor(row, col, Color.YELLOW);
			}
		}
		for (int row = 4 * height / 6; row < height; row++) {
			for (int col = 0; col < width; col++) {
				grid.setColor(row, col, Color.BLUE);
			}
		}
		for (int row = 0; row <= height / 2; row++) {
			for (int col = 0; col < row + 1; col++) {
				grid.setColor(row, col, Color.BLACK);
			}
		}
		for (int row = (height - 1) / 2; row < height; row++) {
			for (int col = (width / 2) - row - 1; col >= 0; col--) {
				grid.setColor(row, col, Color.BLACK);
			}
		}
	}
	public static void drawZimbabwe(MyGrid grid, int width, int height){
		for (int row = 0; row < height; row++) {
			for (int col = 0; col < width; col++) {
				grid.setColor(row, col, Color.GREEN);
			}
		}
		for (int row = height / 7; row < (height * 6) / 7; row++) {
			for (int col = 0; col < width; col++) {
				grid.setColor(row, col, Color.YELLOW);
			}
		}
		for (int row = (height * 2) / 7; row < (height * 5) / 7; row++) {
			for (int col = 0; col < width; col++) {
				grid.setColor(row, col, Color.RED);
			}
		}
		for (int row = (height * 3) / 7; row < (height * 4) / 7; row++) {
			for (int col = 0; col < width; col++) {
				grid.setColor(row, col, Color.BLACK);
			}
		}
		for (int row = 0; row < height / 2; row++) {
			for (int col = 0; col < row + 1; col++) {
				grid.setColor(row, col, Color.WHITE);
			}
		}
		for (int row = (height) / 2; row < height; row++) {
			for (int col = (width / 2) - row - 1; col >= 0; col--) {
				grid.setColor(row, col, Color.WHITE);
			}
		}
	}

}