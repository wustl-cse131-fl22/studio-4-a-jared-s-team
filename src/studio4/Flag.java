package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		StdDraw.setXscale(0, 16);
		StdDraw.setYscale(0, 16);
		String shapeType = "rectangle";
		boolean isFilled = true;
		double parameter1 = 8;
		double parameter2 = 8;
		double parameter3 = 2;
		double parameter4 = 2;
		int redComponent = 255;
		int blueComponent = 255;
		int greenComponent = 0;
		
		while (in.hasNextLine() == true) {
			shapeType = in.next();
			redComponent = in.nextInt();
			blueComponent = in.nextInt();
			greenComponent = in.nextInt();
			isFilled = in.nextBoolean();
			parameter1 = in.nextDouble();
			parameter2 = in.nextDouble();
			parameter3 = in.nextDouble();
			parameter4 = in.nextDouble();
		}
		
		if (shapeType.equals("rectangle") && isFilled == true){
			StdDraw.setPenColor(redComponent, blueComponent, greenComponent);
			StdDraw.filledRectangle(parameter1,parameter2, parameter3, parameter4);
				
		}
	}
}