package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapeType = "string";
		boolean isFilled = false;
		double parameter1 = 0;
		double parameter2 = 0;
		double parameter3 = 0;
		double parameter4 = 0;
		int redComponent = 0;
		int blueComponent = 0;
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
