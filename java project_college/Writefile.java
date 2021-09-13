import java.io.*;
import java.lang.*;
import java.util.*;
public class Writefile {
	private Formatter x;
	public void writeFile(String s) {
		try {
			x = new Formatter(s);
		}
		catch(Exception e){
			System.out.println("You have committed a mistake");
		}
		if(s.equals("Cpp.txt"))
		{
			for(question q: Main.Cpplist)
			{
				if(q.type.equals("mcq"))
				{
					x.format("%s\n%s\n%s\n%s\n%s\n%s\n%s\n", q.type,q.ques,q.str[0],q.str[1],q.str[2],q.str[3],q.str[4]);
				}
				else if(q.type.equals("blank"))
					x.format("%s\n%s\n%s\n", q.type,q.ques,q.str[5]);
				else
					x.format("%s\n%s\n%s\n", q.type,q.ques,q.str[6]);
			}
		}
		else if(s.equals("credentials.txt")) {
			for(Creden c:Main.crelist) {
				if(c.user.equals(Main.user))
				{
					x.format("%s\n%s\n%s\n", c.user,c.pass,""+Main.t);
				}
				else
				x.format("%s\n%s\n%s\n", c.user,c.pass,c.n);
			}
		}
		else if(s.equals("java.txt"))
		{
			for(question q: Main.javalist)
			{
				if(q.type.equals("mcq"))
				{
					x.format("%s\n%s\n%s\n%s\n%s\n%s\n%s\n", q.type,q.ques,q.str[0],q.str[1],q.str[2],q.str[3],q.str[4]);
				}
				else if(q.type.equals("blank"))
					x.format("%s\n%s\n%s\n", q.type,q.ques,q.str[5]);
				else
					x.format("%s\n%s\n%s\n", q.type,q.ques,q.str[6]);
			}
		}
		else if(s.equals("html.txt"))
		{
			for(question q: Main.htmllist)
			{
				if(q.type.equals("mcq"))
				{
					x.format("%s\n%s\n%s\n%s\n%s\n%s\n%s\n", q.type,q.ques,q.str[0],q.str[1],q.str[2],q.str[3],q.str[4]);
				}
				else if(q.type.equals("blank"))
					x.format("%s\n%s\n%s\n", q.type,q.ques,q.str[5]);
				else
					x.format("%s\n%s\n%s\n", q.type,q.ques,q.str[6]);
			}
		}
		else if(s.equals("css.txt"))
		{
			for(question q: Main.csslist)
			{
				if(q.type.equals("mcq"))
				{
					x.format("%s\n%s\n%s\n%s\n%s\n%s\n%s\n", q.type,q.ques,q.str[0],q.str[1],q.str[2],q.str[3],q.str[4]);
				}
				else if(q.type.equals("blank"))
					x.format("%s\n%s\n%s\n", q.type,q.ques,q.str[5]);
				else
					x.format("%s\n%s\n%s\n", q.type,q.ques,q.str[6]);
			}
		}
		else
		{
			for(question q: Main.python3list)
			{
				if(q.type.equals("mcq"))
				{
					x.format("%s\n%s\n%s\n%s\n%s\n%s\n%s\n", q.type,q.ques,q.str[0],q.str[1],q.str[2],q.str[3],q.str[4]);
				}
				else if(q.type.equals("blank"))
					x.format("%s\n%s\n%s\n", q.type,q.ques,q.str[5]);
				else
					x.format("%s\n%s\n%s\n", q.type,q.ques,q.str[6]);
			}
		}
		x.close();
	}
}
