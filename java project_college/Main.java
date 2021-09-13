import javax.swing.JFrame;
import java.util.*;
import java.awt.Color;
import java.awt.event.*;
 class Main {
	public static int Cpp=0,java=0,html=0,python3=0,css=0,t = 1,cre = 0;
	public static String user;
	public static ArrayList<question> Cpplist = new ArrayList<question>(Cpp);
	public static ArrayList<question> javalist = new ArrayList<question>(java);
	public static ArrayList<question> htmllist = new ArrayList<question>(html);
	public static ArrayList<question> python3list = new ArrayList<question>(python3);
	public static ArrayList<question> csslist = new ArrayList<question>(css);
	public static ArrayList<Creden> crelist = new ArrayList<Creden>();
	public static void main(String[] args){
		Readfile r = new Readfile();
		r.readFile("Cpp.txt");
		r.readFile("java.txt");
		r.readFile("html.txt");
		r.readFile("python3.txt");
		r.readFile("css.txt");
		r.readFile("credentials.txt");
		Bharat bharat = new Bharat();
		bharat.setVisible(true);
		bharat.setSize(1100,700);
		bharat.setLocation(400, 100);
		bharat.getContentPane().setBackground( new Color(244,208,63) );
		bharat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bharat.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent event) {
				Writefile w = new Writefile();
				w.writeFile("Cpp.txt");
				w.writeFile("java.txt");
				w.writeFile("html.txt");
				w.writeFile("python3.txt");
				w.writeFile("css.txt");
				w.writeFile("credentials.txt");
			}
		});
	}
}