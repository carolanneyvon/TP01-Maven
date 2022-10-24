package dev;

import java.util.ResourceBundle;
import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
// tp01
//    	String asciiArt = FigletFont.convertOneLine("Hello World!");
//        System.out.println(asciiArt);
		String titre = ResourceBundle.getBundle("application").getString("titre");
		String asciiArt = FigletFont.convertOneLine(titre);
		System.out.println(asciiArt);

		String environnement = ResourceBundle.getBundle("application").getString("environnement");
		System.out.println("Environnement : " + environnement);
	}
}
