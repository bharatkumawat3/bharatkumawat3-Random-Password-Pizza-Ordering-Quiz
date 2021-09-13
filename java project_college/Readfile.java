import java.io.*;
import java.util.*;
public class Readfile {
	private Scanner x;
	public void readFile(String s) {
		try {
			x = new Scanner(new File(s));
		}
		catch(Exception e) {
			System.out.println("You have committed a error");
		}
		if(s.equals("Cpp.txt")) {
			while(x.hasNext()) {
				String type = x.nextLine();
				question q = new question(type);
				q.ques = x.nextLine();
				if(type.equals("mcq")) {
					q.str[0] = x.nextLine();
					q.str[1] = x.nextLine();
					q.str[2] = x.nextLine();
					q.str[3] = x.nextLine();
					q.str[4] = x.nextLine();
				}
				else if(type.equals("blank")) 
					q.str[5] = x.nextLine();
				else
					q.str[6] = x.nextLine();
				Main.Cpplist.add(q);
				Main.Cpp++;
				}
			}
		else if(s.equals("java.txt"))
		{
			while(x.hasNext()) {
				String type = x.nextLine();
				question q = new question(type);
				q.ques = x.nextLine();
				if(type.equals("mcq")) {
					q.str[0] = x.nextLine();
					q.str[1] = x.nextLine();
					q.str[2] = x.nextLine();
					q.str[3] = x.nextLine();
					q.str[4] = x.nextLine();
				}
				else if(type.equals("blank")) 
					q.str[5] = x.nextLine();
				else
					q.str[6] = x.nextLine();
				Main.javalist.add(q);
				Main.java++;
			}
		}
		else if(s.equals("html.txt"))
		{
			while(x.hasNext()) {
				String type = x.nextLine();
				question q = new question(type);
				q.ques = x.nextLine();
				if(type.equals("mcq")) {
					q.str[0] = x.nextLine();
					q.str[1] = x.nextLine();
					q.str[2] = x.nextLine();
					q.str[3] = x.nextLine();
					q.str[4] = x.nextLine();
				}
				else if(type.equals("blank.txt")) 
					q.str[5] = x.nextLine();
				else
					q.str[6] = x.nextLine();
					Main.htmllist.add(q);
				Main.html++;
			}
		}
		else if(s.equals("credentials.txt")) {
			while(x.hasNext()) {
				Creden c = new Creden();
				c.user = x.nextLine();
				c.pass = x.nextLine();
				c.n = x.nextLine();
				Main.crelist.add(c);
				Main.cre++;
			}
		}
		else if(s.equals("css.txt"))
		{
			while(x.hasNext()) {
				String type = x.nextLine();
				question q = new question(type);
				q.ques = x.nextLine();
				if(type.equals("mcq")) {
					q.str[0] = x.nextLine();
					q.str[1] = x.nextLine();
					q.str[2] = x.nextLine();
					q.str[3] = x.nextLine();
					q.str[4] = x.nextLine();
				}
				else if(type.equals("blank.txt")) 
					q.str[5] = x.nextLine();
				else
					q.str[6] = x.nextLine();
				Main.csslist.add(q);
				Main.css++;
			}
		}
		else
		{
			while(x.hasNext()) {
				String type = x.nextLine();
				question q = new question(type);
				q.ques = x.nextLine();
				if(type.equals("mcq")) {
					q.str[0] = x.nextLine();
					q.str[1] = x.nextLine();
					q.str[2] = x.nextLine();
					q.str[3] = x.nextLine();
					q.str[4] = x.nextLine();
				}
				else if(type.equals("blank")) 
					q.str[5] = x.nextLine();
				else
					q.str[6] = x.nextLine();
				Main.python3list.add(q);
				Main.python3++;
			}
		}
		x.close();
	}
}