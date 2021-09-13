import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Random;
public class Print {
	private Formatter x,y;
	private BufferedReader xr,yr;
	private String fu;
	private int nq;
	private ArrayList<Integer> a = new ArrayList<Integer>();
	Random rand = new Random();
	public void printTest(String s) {
		int num = 1;
		try {
			x = new Formatter(Main.user+"test("+Main.t+").txt");
			y = new Formatter(Main.user+"AnswerKey("+Main.t+").txt");
		}
		catch(Exception e){
			System.out.println("You have committed a mistake");
		}
		try{
		x.format("\n                           	QUIZ\n\n\n");
		y.format("\n                          ANSWER KEY\n\n\n");
		}
		catch(Exception e){
			System.out.println("The file is open in another application");
			System.exit(0);
		}
		if(s.equals("C++")) {
			nq = Main.Cpp;
			generateRandom(Bharat.g);
			for(int i: a) {
				question di = Main.Cpplist.get(i);
				if(di.str[4].equals("1"))
					fu = "a";
				else if(di.str[4].equals("2"))
					fu = "b";
				else if(di.str[4].equals("3"))
					fu = "c";
				else
					fu = "d";
				if(di.type.equals("mcq")) {
					x.format("%d. %s\t (\t)\n    a) %s\n    b) %s\n    c) %s\n    d) %s\n\n",num,di.ques,di.str[0],di.str[1],di.str[2],di.str[3]);
					y.format("%d. %s\n", num,fu);
				}
				else if(di.type.equals("blank")) {
					x.format("%d. %s\n\n",num, di.ques);
					y.format("%d. %s\n", num,di.str[5]);
				}
				else {
					x.format("%d. %s\t (True\\False)\n\n",num, di.ques);
					y.format("%d. %s\n", num,di.str[6]);
				}
				num++;
			}
		}
		else if(s.equals("Java")) {
			nq = Main.java;
			generateRandom(Bharat.g);
			for(int i: a) {
				question di = Main.javalist.get(i);
				if(di.str[4].equals("1"))
					fu = "a";
				else if(di.str[4].equals("2"))
					fu = "b";
				else if(di.str[4].equals("3"))
					fu = "c";
				else
					fu = "d";
				if(di.type.equals("mcq")) {
					x.format("%d. %s\t (\t)\n    a) %s\n    b) %s\n    c) %s\n    d) %s\n\n",num,di.ques,di.str[0],di.str[1],di.str[2],di.str[3]);
					y.format("%d. %s\n", num,fu);
				}
				else if(di.type.equals("blank")) {
					x.format("%d. %s\n\n",num, di.ques);
					y.format("%d. %s\n", num,di.str[5]);
				}
				else {
					x.format("%d. %s\t (True\\False)\n\n",num, di.ques);
					y.format("%d. %s\n", num,di.str[6]);
				}
				num++;
			}
		}
		else if(s.equals("HTML")) {
			nq = Main.html;
			generateRandom(Bharat.g);
			for(int i: a) {
				question di = Main.htmllist.get(i);
				if(di.str[4].equals("1"))
					fu = "a";
				else if(di.str[4].equals("2"))
					fu = "b";
				else if(di.str[4].equals("3"))
					fu = "c";
				else
					fu = "d";
				if(di.type.equals("mcq")) {
					x.format("%d. %s\t (\t)\n    a) %s\n    b) %s\n    c) %s\n    d) %s\n\n",num,di.ques,di.str[0],di.str[1],di.str[2],di.str[3]);
					y.format("%d. %s\n", num,fu);
				}
				else if(di.type.equals("blank")) {
					x.format("%d. %s\n\n",num, di.ques);
					y.format("%d. %s\n", num,di.str[5]);
				}
				else {
					x.format("%d. %s\t (True\\False)\n\n",num, di.ques);
					y.format("%d. %s\n", num,di.str[6]);
				}
				num++;
			}
		}
		else if(s.equals("CSS")) {
			nq = Main.css;
			generateRandom(Bharat.g);
			for(int i: a) {
				question di = Main.csslist.get(i);
				if(di.str[4].equals("1"))
					fu = "a";
				else if(di.str[4].equals("2"))
					fu = "b";
				else if(di.str[4].equals("3"))
					fu = "c";
				else
					fu = "d";
				if(di.type.equals("mcq")) {
					x.format("%d. %s\t (\t)\n    a) %s\n    b) %s\n    c) %s\n    d) %s\n\n",num,di.ques,di.str[0],di.str[1],di.str[2],di.str[3]);
					y.format("%d. %s\n", num,fu);
				}
				else if(di.type.equals("blank")) {
					x.format("%d. %s\n\n",num, di.ques);
					y.format("%d. %s\n", num,di.str[5]);
				}
				else {
					x.format("%d. %s\t (True\\False)\n\n",num, di.ques);
					y.format("%d. %s\n", num,di.str[6]);
				}
				num++;
			}
		}
		else {
			nq = Main.python3;
			generateRandom(Bharat.g);
			for(int i: a) {
				question di = Main.python3list.get(i);
				if(di.str[4].equals("1"))
					fu = "a";
				else if(di.str[4].equals("2"))
					fu = "b";
				else if(di.str[4].equals("3"))
					fu = "c";
				else
					fu = "d";
					fu = "d";
				if(di.type.equals("mcq")) {
					x.format("%d. %s\t (\t)\n    a) %s\n    b) %s\n    c) %s\n    d) %s\n\n",num,di.ques,di.str[0],di.str[1],di.str[2],di.str[3]);
					y.format("%d. %s\n", num,fu);
				}
				else if(di.type.equals("blank")) {
					x.format("%d. %s\n\n",num, di.ques);
					y.format("%d. %s\n", num,di.str[5]);
				}
				else {
					x.format("%d. %s\t (True\\False)\n\n",num, di.ques);
					y.format("%d. %s\n", num,di.str[6]);
				}
				num++;
			}
		}
		x.close();
		y.close();
	}
	void generateRandom(int n){
		int i = 0;
		while(i<=n-1) {
			rand = new Random();
			int k = rand.nextInt(nq);
			if(!(a.contains(k))){
			a.add(k);i++;}
		}
	}
	public Reader getqReader() {
		try {
		xr = new BufferedReader(new FileReader(Main.user+"test("+Main.t+").txt"));}
		catch(Exception e) {
			System.out.println("You have committed an error here boss");
		}
		return xr;
	}
	public Reader getaReader() {
		try {
		yr = new BufferedReader(new FileReader(Main.user+"AnswerKey("+Main.t+").txt"));
		}
		catch(Exception e) {
			System.out.println("You have committed an error not here.");
		}
		return yr;
	}
}
