import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Bharat extends JFrame{
	private JButton Quiz,Change_content;
	private int i;
	public static int g = 1;
	Bharat e = this;
	private String str = "mcq",subject,selectedNumber;
	JLabel user = new JLabel("Username");
	JLabel pass = new JLabel("Password");
	JTextField username = new JTextField(20);
	JPasswordField password = new JPasswordField(20);
	JButton login = new JButton("login");
	JButton loginpseu = new JButton("register");
	Bharat(){
		super("Quiz Generator");
		setLayout(null);
		pin();
	}
	void welcome(){
		getContentPane().removeAll();
						getContentPane().repaint();
						enter();
						validate();
		
	}
	void enter(){
		//setLayout(new FlowLayout());
		Quiz = new JButton("Generate a Quiz");
		Quiz.setToolTipText("Click here to generate quiz");
		Change_content = new JButton("Change Content in Question bank");
		Change_content.setToolTipText("Click here to Change Content");
		add(Quiz);
		add(Change_content);
		Quiz.setBounds(400,170,250,70);
		Quiz.setFont(Quiz.getFont().deriveFont(25f));
		Change_content.setBounds(290,300,490,70);
		Change_content.setFont(Change_content.getFont().deriveFont(25f));
		Quiz.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event) {
						getContentPane().removeAll();
						getContentPane().repaint();
						chooseSubject();
						validate();
					}
				});
		Change_content.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						getContentPane().removeAll();
						getContentPane().repaint();
						chooseAction();
						validate();
					}
				});
	}
	void chooseSubject() {
		subject = "C++";
		JLabel q = new JLabel("Choose Subject: ");
		q.setFont(q.getFont().deriveFont(30f));
		q.setBounds(400,100,300,50);
		JRadioButton cpp = new JRadioButton("C++",true);
		cpp.setFont(cpp.getFont().deriveFont(25f));
		cpp.setBounds(300, 180, 100, 50);
		JRadioButton jav = new JRadioButton("Java");
		jav.setFont(cpp.getFont().deriveFont(25f));
		jav.setBounds(450, 180, 100, 50);
		JRadioButton html = new JRadioButton("HTML");
		html.setFont(cpp.getFont().deriveFont(25f));
		html.setBounds(600, 180, 100, 50);
		JRadioButton pyth3 = new JRadioButton("Python");
		pyth3.setFont(cpp.getFont().deriveFont(25f));
		pyth3.setBounds(380, 250, 120, 50);
		JRadioButton css = new JRadioButton("CSS");
		css.setFont(cpp.getFont().deriveFont(25f));
		css.setBounds(530, 250, 100, 50);
		ButtonGroup group = new ButtonGroup();
		group.add(cpp);
		group.add(jav);
		group.add(html);
		group.add(pyth3);
		group.add(css);
		add(q);
		add(cpp);
		add(jav);
		add(html);
		add(pyth3);
		add(css);
		cpp.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				subject = "C++";
			}
		});
		jav.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				subject = "Java";
			}
		});
		html.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				subject = "HTML";
			}
		});
		pyth3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				subject = "Python";
			}
		});
		css.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				subject = "CSS";
			}
		});
		JButton next = new JButton("Next");
		next.setToolTipText("Click here to select number of questions to generate");
		add(next);
		next.setBounds(600,400,150,50);
		next.setFont(next.getFont().deriveFont(25f));
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getContentPane().removeAll();
				getContentPane().repaint();
				selectNumber();
				validate();
			}
		});
		JButton back = new JButton("Back");
		add(back);
		back.setBounds(250, 400, 150, 50);
		back.setFont(next.getFont().deriveFont(25f));
		back.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						getContentPane().removeAll();
						getContentPane().repaint();
						enter();
						validate();
					}
				});
	}
	void selectNumber() {
		g = 1;
		String[] name;
		JLabel la = new JLabel("How many questions do you want?");
		la.setFont(la.getFont().deriveFont(25f));
		la.setBounds(300,50,500,50);
		JLabel sorry1 = new JLabel("There are no questions in question bank for this subject  :(");
		sorry1.setFont(sorry1.getFont().deriveFont(25f));
		sorry1.setBounds(200,150,700,100);
		JLabel sorry2 = new JLabel("Add some to be able to generate quiz....");
		sorry2.setFont(sorry2.getFont().deriveFont(25f));
		sorry2.setBounds(300,200,700,100);
		int n;
		if(subject=="C++")
			n = Main.Cpp;
		else if(subject=="Java")
			n = Main.java;
		else if(subject=="HTML")
			n = Main.html;
		else if(subject=="Python")
			n = Main.python3;
		else
			n = Main.css;
		name = new String[n];
		for(int i=0;i<n;i++)
			name[i] = ""+(i+1);
		JComboBox list = new JComboBox(name);
		list.setFont(list.getFont().deriveFont(25f));
		list.setBounds(420, 130, 150, 50);
		list.setToolTipText("click the arrow and select");
		
		list.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				if(event.getStateChange()==ItemEvent.SELECTED)
					g = list.getSelectedIndex()+1;
			}
		});
		JButton gen = new JButton("Generate Quiz");
		gen.setFont(gen.getFont().deriveFont(30f));
		gen.setToolTipText("click to Finish the process");
		gen.setBounds(330,220,350,70);
		
		gen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				/*Print p = new Print();
				p.printTest(subject);*/
				getContentPane().removeAll();
				getContentPane().repaint();
				display();
				/*JOptionPane.showMessageDialog(e,"Cheers! Your quiz will be in 'test("+(Main.t-1)+").txt' with its answers in 'AnswerKey("+(Main.t-1)+").txt'","Success",JOptionPane.INFORMATION_MESSAGE);
				enter();*/
				validate();
			}
		});
		if(n==0) {
			add(sorry1);
			add(sorry2);
		}
		else {
			add(la);
			add(list);
			add(gen);
		}
		JButton back = new JButton("Back");
		back.setBounds(50, 550, 150, 50);
		back.setFont(back.getFont().deriveFont(25f));
		add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getContentPane().removeAll();
				getContentPane().repaint();
				chooseSubject();
				validate();
			}
		});
		JButton home = new JButton("Home");
		home.setBounds(50, 480, 150,50);
		home.setFont(home.getFont().deriveFont(25f));
		add(home);
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getContentPane().removeAll();
				getContentPane().repaint();
				enter();
				validate();
			}
		});
	}
	
	void chooseAction()
	{
		subject = "C++";
		JLabel q = new JLabel("Choose Subject: ");
		q.setFont(q.getFont().deriveFont(25f));
		q.setBounds(400,50,250,50);
		JRadioButton cpp = new JRadioButton("C++",true);
		cpp.setFont(cpp.getFont().deriveFont(25f));
		cpp.setBounds(100,120,100,50);
		JRadioButton jav = new JRadioButton("Java");
		jav.setFont(cpp.getFont().deriveFont(25f));
		jav.setBounds(300, 120, 100, 50);
		JRadioButton html = new JRadioButton("HTML");
		html.setFont(cpp.getFont().deriveFont(25f));
		html.setBounds(500, 120, 100, 50);
		JRadioButton pyth3 = new JRadioButton("Python");
		pyth3.setFont(cpp.getFont().deriveFont(25f));
		pyth3.setBounds(700, 120, 120, 50);
		JRadioButton css = new JRadioButton("CSS");
		css.setFont(cpp.getFont().deriveFont(25f));
		css.setBounds(900, 120, 100, 50);
		ButtonGroup group = new ButtonGroup();
		group.add(cpp);
		group.add(jav);
		group.add(html);
		group.add(pyth3);
		group.add(css);
		add(q);
		add(cpp);
		add(jav);
		add(html);
		add(pyth3);
		add(css);
		cpp.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				subject = "C++";
			}
		});
		jav.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				subject = "Java";
			}
		});
		html.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				subject = "HTML";
			}
		});
		pyth3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				subject = "Python";
			}
		});
		css.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				subject = "CSS";
			}
		});
		JLabel command = new JLabel("What do you want to do?");
		command.setFont(command.getFont().deriveFont(25f));
		command.setBounds(350, 200, 300, 50);
		JButton insert = new JButton("INSERT a question");
		insert.setToolTipText("add a question");
		insert.setFont(insert.getFont().deriveFont(25f));
		insert.setBounds(340, 260, 300, 50);
		JButton delete = new JButton("DELETE a question");
		delete.setToolTipText("remove a question");
		delete.setFont(delete.getFont().deriveFont(25f));
		delete.setBounds(340, 320, 300, 50);
		JButton modify = new JButton("MODIFY a question");
		modify.setToolTipText("change a question");
		modify.setFont(insert.getFont().deriveFont(25f));
		modify.setBounds(340, 380, 300, 50);
		add(command);
		add(insert);
		add(delete);
		add(modify);
		insert.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event){
						getContentPane().removeAll();
						getContentPane().repaint();
						insert();
						validate();
					}
				});
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getContentPane().removeAll();
				getContentPane().repaint();
				delete();
				validate();
			}
		});
		modify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getContentPane().removeAll();
				getContentPane().repaint();
				modify();
				validate();
			}
		});
		JButton back = new JButton("Back");
		add(back);
		back.setBounds(50, 550, 150, 50);
		back.setFont(back.getFont().deriveFont(25f));
		back.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						getContentPane().removeAll();
						getContentPane().repaint();
						enter();
						validate();
					}
				});
	}
	void insert() {
		JLabel type = new JLabel("Choose what type of question you wanted to insert: ");
		type.setFont(type.getFont().deriveFont(25f));
		type.setBounds(250, 50, 650, 50);
		JButton mcq = new JButton("Mutliple choice question");
		mcq.setToolTipText("Question with options among which only one is correct");
		mcq.setFont(mcq.getFont().deriveFont(25f));
		mcq.setBounds(350, 120, 350, 50);
		JButton blank = new JButton("Fill in the Blank");
		blank.setToolTipText("Question with a blank space to be filled in");
		blank.setFont(mcq.getFont().deriveFont(25f));
		blank.setBounds(350, 190, 350, 50);
		JButton tf = new JButton("True or False");
		tf.setToolTipText("Question with a statement to be judged true or false");
		tf.setFont(mcq.getFont().deriveFont(25f));
		tf.setBounds(350, 260, 350, 50);
		add(type);
		add(mcq);
		add(blank);
		add(tf);
		JButton back = new JButton("Back");
		back.setBounds(50, 550, 150, 50);
		back.setFont(back.getFont().deriveFont(25f));
		add(back);
		back.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						getContentPane().removeAll();
						getContentPane().repaint();
						chooseAction();
						validate();
					}
				});
		JButton home = new JButton("Home");
		home.setBounds(50, 480, 150,50);
		home.setFont(home.getFont().deriveFont(25f));
		add(home);
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				getContentPane().removeAll();
				getContentPane().repaint();
				enter();
				validate();
			}
		});
		mcq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getContentPane().removeAll();
				getContentPane().repaint();
				mcq();
				validate();
			}
		});
		blank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getContentPane().removeAll();
				getContentPane().repaint();
				blank();
				validate();
			}
		});
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getContentPane().removeAll();
				getContentPane().repaint();
				tf();
				validate();
			}
		});
	}
	void mcq(){
		selectedNumber = "1";
		JLabel ques = new JLabel("Question: ");
		ques.setFont(ques.getFont().deriveFont(20f));
		ques.setBounds(10,5,200,50);
		JLabel o1 = new JLabel("Option 1: ");
		o1.setFont(o1.getFont().deriveFont(20f));
		o1.setBounds(10,55,200,50);
		JLabel o2 = new JLabel("Option 2: ");
		o2.setFont(o2.getFont().deriveFont(20f));
		o2.setBounds(10,105,200,50);
		JLabel o3 = new JLabel("Option 3: ");
		o3.setFont(o3.getFont().deriveFont(20f));
		o3.setBounds(10,155,200,50);
		JLabel o4 = new JLabel("Option 4: ");
		o4.setFont(o4.getFont().deriveFont(20f));
		o4.setBounds(10,205,200,50);
		String[] name = {"1","2","3", "4"};
		JLabel answer = new JLabel("Correct Option number: ");
		answer.setFont(answer.getFont().deriveFont(20f));
		answer.setBounds(10,255,400,50);
		JComboBox ans = new JComboBox(name);
		ans.setFont(ans.getFont().deriveFont(20f));
		ans.setToolTipText("Click arrow and select");
		ans.setBounds(270,260,100,40);
		ans.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				if(event.getStateChange()==ItemEvent.SELECTED)
					selectedNumber = ""+(ans.getSelectedIndex()+1);
			}
		});
		JTextField que= new JTextField(60);
		que.setToolTipText("Enter Question Statement here.");
		que.setFont(que.getFont().deriveFont(20f));
		que.setBounds(120,10,950,35);
		JTextField op1 = new JTextField(20);
		op1.setToolTipText("Enter an option");
		op1.setFont(op1.getFont().deriveFont(20f));
		op1.setBounds(120, 60, 150, 35);
		JTextField op2 = new JTextField(20);
		op2.setToolTipText("Enter an option");
		op2.setFont(op2.getFont().deriveFont(20f));
		op2.setBounds(120,110,150,35);
		JTextField op3 = new JTextField(20);
		op3.setToolTipText("Enter an option");
		op3.setFont(op3.getFont().deriveFont(20f));
		op3.setBounds(120, 160, 150, 35);
		JTextField op4 = new JTextField(20);
		op4.setToolTipText("Enter an option");
		op4.setFont(op4.getFont().deriveFont(20f));
		op4.setBounds(120, 210, 150, 35);
		add(ques);
		add(que);
		add(o1);
		add(op1);
		add(o2);
		add(op2);
		add(o3);
		add(op3);
		add(o4);
		add(op4);
		add(answer);
		add(ans);
		JButton add = new JButton("ADD");
		add.setToolTipText("Click here to finish adding");
		add.setFont(add.getFont().deriveFont(25f));
		add.setBounds(450, 320, 100, 60);
		add(add);
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if(que.getText().equals("")||op1.getText().equals("")||op2.getText().equals("")||op3.getText().equals("")||op4.getText().equals(""))
					JOptionPane.showMessageDialog(e, "You have not completed filling all options or question","Alert!",JOptionPane.WARNING_MESSAGE);
				else {
					question q = new question("mcq");
					q.ques = que.getText();
					q.str[0] = op1.getText();
					q.str[1] = op2.getText();
					q.str[2] = op3.getText();
					q.str[3] = op4.getText();
					q.str[4] = selectedNumber;
					if(subject.equals("C++")){
						Main.Cpp++;
						Main.Cpplist.add(q);
					}
					else if(subject.equals("Java")){
						Main.java++;
						Main.javalist.add(q);
					}
					else if(subject.equals("HTML")){
						Main.html++;
					Main.htmllist.add(q);}
					else if(subject.equals("CSS")){
						Main.csslist.add(q);
						Main.css++;
					}
					else{
						Main.python3list.add(q);
						Main.python3++;
					}
					JOptionPane.showMessageDialog(e, "You have successfully added the question","Success!",JOptionPane.INFORMATION_MESSAGE);
					getContentPane().removeAll();
					getContentPane().repaint();
					actionAnother("add");
					validate();
				}
			}
		});
		JButton back = new JButton("Back");
		back.setBounds(50, 550, 150, 50);
		back.setFont(back.getFont().deriveFont(25f));
		add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getContentPane().removeAll();
				getContentPane().repaint();
				insert();
				validate();
			}
		});
		JButton home = new JButton("Home");
		add(home);
		home.setBounds(50, 480, 150,50);
		home.setFont(home.getFont().deriveFont(25f));
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getContentPane().removeAll();
				getContentPane().repaint();
				enter();
				validate();
			}
		});
	}
	void blank() {
		JLabel Sta = new JLabel("Question Statement: ");
		Sta.setBounds(10, 5, 250, 50);
		Sta.setFont(Sta.getFont().deriveFont(20f));
		JTextField que= new JTextField(70);
		que.setToolTipText("Enter Question Statement here.");
		que.setFont(que.getFont().deriveFont(20f));
		que.setBounds(220,10,850,35);
		JLabel ans = new JLabel("Answer: ");
		ans.setFont(ans.getFont().deriveFont(20f));
		ans.setBounds(10, 55, 200, 50);
		JTextField answer = new JTextField(15);
		answer.setToolTipText("Enter the answer here.");
		answer.setFont(answer.getFont().deriveFont(20f));
		answer.setBounds(120, 60, 150, 35);
		add(Sta);
		add(que);
		add(ans);
		add(answer);
		JButton add = new JButton("ADD");
		add.setToolTipText("Click here to finish adding");
		add.setBounds(450, 120, 100, 60);
		add.setFont(add.getFont().deriveFont(25f));
		add(add);
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if(que.getText().equals("") || answer.getText().equals(""))
					JOptionPane.showMessageDialog(e, "You have not filled both question and answer completely","Alert!",JOptionPane.WARNING_MESSAGE);
				else {
					question q = new question("blank");
					q.ques = que.getText();
					q.str[5] = answer.getText();
					if(subject.equals("C++")){
						Main.Cpp++;
						Main.Cpplist.add(q);
					}
					else if(subject.equals("Java")){
						Main.java++;
						Main.javalist.add(q);
					}
					else if(subject.equals("HTML")){
						Main.html++;
					Main.htmllist.add(q);}
					else if(subject.equals("CSS")){
						Main.csslist.add(q);
						Main.css++;
					}
					else{
						Main.python3list.add(q);
						Main.python3++;
					}
					JOptionPane.showMessageDialog(e, "You have successfully added the question","Success!",JOptionPane.INFORMATION_MESSAGE);
					getContentPane().removeAll();
					getContentPane().repaint();
					actionAnother("add");
					validate();
				}
			}
		});
		JButton back = new JButton("Back");
		back.setBounds(50, 550, 150, 50);
		back.setFont(back.getFont().deriveFont(25f));
		add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getContentPane().removeAll();
				getContentPane().repaint();
				insert();
				validate();
			}
		});
		JButton home = new JButton("Home");
		add(home);
		home.setBounds(50, 480, 150,50);
		home.setFont(home.getFont().deriveFont(25f));
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getContentPane().removeAll();
				getContentPane().repaint();
				enter();
				validate();
			}
		});
	}
	void tf() {
		selectedNumber = "True";
		JLabel sta = new JLabel("Question Statement: ");
		sta.setBounds(10, 5, 250, 50);
		sta.setFont(sta.getFont().deriveFont(20f));
		JTextField que= new JTextField(70);
		que.setToolTipText("Enter Question Statement here.");
		que.setFont(que.getFont().deriveFont(20f));
		que.setBounds(220,10,850,35);
		JLabel ans = new JLabel("Choose if your statement is True or False: ");
		ans.setFont(ans.getFont().deriveFont(20f));
		ans.setBounds(10, 55, 500, 50);
		String[] name = {"True", "False"};
		JComboBox list = new JComboBox(name);
		list.setFont(list.getFont().deriveFont(20f));
		list.setToolTipText("Click arrow and selct");
		list.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				if(event.getStateChange()==ItemEvent.SELECTED)
				{
					if(list.getSelectedIndex()==1)
						selectedNumber = "False";
					else
						selectedNumber = "True";
				}
			}
		});
		list.setBounds(430, 60,100,40);
		add(sta);
		add(que);
		add(ans);
		add(list);
		JButton add = new JButton("ADD");
		add.setBounds(450, 120, 100, 60);
		add.setToolTipText("Click here to finish adding");
		add.setFont(add.getFont().deriveFont(25f));
		add(add);
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if(que.getText().equals(""))
					JOptionPane.showMessageDialog(e, "Enter the Statement.","Alert!",JOptionPane.WARNING_MESSAGE);
				else {
					question q = new question("tf");
					q.ques = que.getText();
					q.str[6] = selectedNumber;
					if(subject.equals("C++")){
						Main.Cpp++;
						Main.Cpplist.add(q);
					}
					else if(subject.equals("Java")){
						Main.java++;
						Main.javalist.add(q);
					}
					else if(subject.equals("HTML")){
						Main.html++;
					Main.htmllist.add(q);}
					else if(subject.equals("CSS")){
						Main.csslist.add(q);
						Main.css++;
					}
					else{
						Main.python3list.add(q);
						Main.python3++;
					}
					JOptionPane.showMessageDialog(e, "You have successfully added the question","Success!",JOptionPane.INFORMATION_MESSAGE);
					getContentPane().removeAll();
					getContentPane().repaint();
					actionAnother("add");
					validate();
				}
			}
		});
		JButton back = new JButton("Back");
		back.setBounds(50, 550, 150, 50);
		back.setFont(back.getFont().deriveFont(25f));
		add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getContentPane().removeAll();
				getContentPane().repaint();
				insert();
				validate();
			}
		});
		JButton home = new JButton("Home");
		home.setBounds(50, 480, 150,50);
		home.setFont(home.getFont().deriveFont(25f));
		add(home);
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getContentPane().removeAll();
				getContentPane().repaint();
				enter();
				validate();
			}
		});
	}
	void actionAnother(String an) {
		JLabel qe = new JLabel("Do you want to "+ an +" another question in the subject?");
		qe.setFont(qe.getFont().deriveFont(25f));
		qe.setBounds(200, 50, 800, 50);
		JButton yes = new JButton("Yes");
		yes.setFont(yes.getFont().deriveFont(25f));
		yes.setBounds(300, 150, 150, 70);
		JButton no = new JButton("No");
		no.setFont(no.getFont().deriveFont(25f));
		no.setBounds(500, 150, 150, 70);
		add(qe);
		add(yes);
		add(no);
		yes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getContentPane().removeAll();
				getContentPane().repaint();
				if(an.equals("add"))
					insert();
				else if(an.equals("remove"))
					delete();
				else
					modify();
				validate();
			}
		});
		no.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getContentPane().removeAll();
				getContentPane().repaint();
				enter();
				validate();
			}
		});
	}
	void delete() {
		int n;
		boolean b = true;
		if (subject.equals("C++")) {
			n = Main.Cpp;
			}
			else if(subject.equals("Java")) {
				n = Main.java;
			}
			else if(subject.equals("HTML")) {
				n = Main.html;
			}
			else if(subject.equals("CSS")) {
				n = Main.css;
			}
			else {
				n = Main.python3;
			}
		JLabel sta = new JLabel("Choose a question to view and delete:");
		sta.setFont(sta.getFont().deriveFont(25f));
		sta.setBounds(250, 55, 750, 50);
		
		JLabel sorry = new JLabel("There are no questions to delete in this subject.");
		sorry.setFont(sorry.getFont().deriveFont(25f));
		sorry.setBounds(210, 150, 650, 50);
		
		JRadioButton[] a = new JRadioButton[n];
		ButtonGroup g = new ButtonGroup();
		int	k = 20; //reset k if you wanted to add more buttons to the screen in a row
		for(i=0;i<n;i++) {
			a[i] = new JRadioButton(""+(i+1),b);
			b = false;
			a[i].setFont(a[i].getFont().deriveFont(20f));
			a[i].setBounds(50+(i%k)*50, 115+(i/k)*40, 50, 50);
			g.add(a[i]);
			add(a[i]);
		}
		
		JButton view = new JButton("View");
		view.setFont(view.getFont().deriveFont(25f));
		view.setBounds(450, 330, 150, 50);
		view.setToolTipText("Click here to view and then delete.");
		if(n==0)
		{
			add(sorry);
		}
		else {
			add(view);
			add(sta);
		}
		view.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				for(i=0;i<n;i++)
					if(a[i].isSelected()) {
						break;
				}
				getContentPane().removeAll();
				getContentPane().repaint();
				view(i);
				validate();
			}
		});
		JButton back = new JButton("Back");
		add(back);
		back.setBounds(50, 550, 150, 50);
		back.setFont(back.getFont().deriveFont(25f));
		back.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						getContentPane().removeAll();
						getContentPane().repaint();
						chooseAction();
						validate();
					}
				});
		JButton home = new JButton("Home");
		home.setBounds(50, 480, 150,50);
		home.setFont(home.getFont().deriveFont(25f));
		add(home);
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				getContentPane().removeAll();
				getContentPane().repaint();
				enter();
				validate();
			}
		});	
	}
	void modify() {
		int n;
		boolean b = true;
		JLabel sta = new JLabel("Choose a question to view and modify:");
		sta.setFont(sta.getFont().deriveFont(25f));
		sta.setBounds(250, 5, 750, 50);
		if (subject.equals("C++"))
				n = Main.Cpp;
		else if(subject.equals("Java"))
			n = Main.java;
		else if(subject.equals("HTML"))
			n = Main.html;
		else if(subject.equals("CSS"))
			n = Main.css;
		else
			n = Main.python3;
		JLabel sorry = new JLabel("There are no questions to modify in this subject.");
		sorry.setFont(sorry.getFont().deriveFont(25f));
		sorry.setBounds(210, 150, 650, 50);
		
		JRadioButton[] a = new JRadioButton[n];
		ButtonGroup g = new ButtonGroup();
		int k = 20;
		for(int i=0;i<n;i++) {
			a[i] = new JRadioButton(""+(i+1),b);
			b = false;
			a[i].setFont(a[i].getFont().deriveFont(20f));
			a[i].setBounds(50+(i%k)*50, 65+(i/k)*50, 50, 50);
			g.add(a[i]);
			add(a[i]);
		}
		JButton mod = new JButton("Modify");
		mod.setFont(mod.getFont().deriveFont(25f));
		mod.setBounds(450, 330, 150, 50);
		mod.setToolTipText("Click here to Modify.");
		if(n==0)
		{
			add(sorry);
		}
		else {
			add(mod);
			add(sta);
		}
		mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getContentPane().removeAll();
				getContentPane().repaint();
				for(i=0;i<n;i++)
					if(a[i].isSelected())
						break;
				modifyadd(i);
				validate();
			}
		});
		JButton back = new JButton("Back");
		add(back);
		back.setBounds(50, 550, 150, 50);
		back.setFont(back.getFont().deriveFont(25f));
		back.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						getContentPane().removeAll();
						getContentPane().repaint();
						chooseAction();
						validate();
					}
				});
		JButton home = new JButton("Home");
		home.setBounds(50, 480, 150,50);
		home.setFont(home.getFont().deriveFont(25f));
		add(home);
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event)
			{
				getContentPane().removeAll();
				getContentPane().repaint();
				enter();
				validate();
			}
		});	
		
	}
	void modifyadd(int p) {
		question di;
		if (subject.equals("C++")) {
		di = Main.Cpplist.get(p);
		Main.Cpplist.remove(p);
		}
		else if(subject.equals("Java")) {
			di = Main.javalist.get(p);
			Main.javalist.remove(p);
		}
		else if(subject.equals("HTML")) {
			di = Main.htmllist.get(p);
			Main.htmllist.remove(p);
		}
		else if(subject.equals("CSS")) {
			di = Main.csslist.get(p);
			Main.csslist.remove(p);
		}
		else {
			di = Main.python3list.get(p);
			Main.python3list.remove(p);
		}
		if(di.type.equals("mcq"))
		{
			JLabel ques = new JLabel("Question: ");
			ques.setFont(ques.getFont().deriveFont(20f));
			ques.setBounds(10,5,200,50);
			JLabel o1 = new JLabel("Option 1: ");
			o1.setFont(o1.getFont().deriveFont(20f));
			o1.setBounds(10,55,200,50);
			JLabel o2 = new JLabel("Option 2: ");
			o2.setFont(o2.getFont().deriveFont(20f));
			o2.setBounds(10,105,200,50);
			JLabel o3 = new JLabel("Option 3: ");
			o3.setFont(o3.getFont().deriveFont(20f));
			o3.setBounds(10,155,200,50);
			JLabel o4 = new JLabel("Option 4: ");
			o4.setFont(o4.getFont().deriveFont(20f));
			o4.setBounds(10,205,200,50);
			String[] name = {"1","2","3", "4"};
			JLabel answer = new JLabel("Correct Option number: ");
			answer.setFont(answer.getFont().deriveFont(20f));
			answer.setBounds(10,255,400,50);
			JComboBox ans = new JComboBox(name);
			ans.setFont(ans.getFont().deriveFont(20f));
			ans.setToolTipText("Click arrow and select");
			ans.setBounds(270,260,100,40);
			JTextField que= new JTextField(di.ques,60);
			que.setToolTipText("Enter Question Statement here.");
			que.setFont(que.getFont().deriveFont(20f));
			que.setBounds(120,10,950,35);
			JTextField op1 = new JTextField(di.str[0],20);
			op1.setToolTipText("Enter an option");
			op1.setFont(op1.getFont().deriveFont(20f));
			op1.setBounds(120, 60, 150, 35);
			JTextField op2 = new JTextField(di.str[1],20);
			op2.setToolTipText("Enter an option");
			op2.setFont(op2.getFont().deriveFont(20f));
			op2.setBounds(120,110,150,35);
			JTextField op3 = new JTextField(di.str[2],20);
			op3.setToolTipText("Enter an option");
			op3.setFont(op3.getFont().deriveFont(20f));
			op3.setBounds(120, 160, 150, 35);
			JTextField op4 = new JTextField(di.str[3],20);
			op4.setToolTipText("Enter an option");
			op4.setFont(op4.getFont().deriveFont(20f));
			op4.setBounds(120, 210, 150, 35);
			add(ques);
			add(que);
			add(o1);
			add(op1);
			add(o2);
			add(op2);
			add(o3);
			add(op3);
			add(o4);
			add(op4);
			add(answer);
			add(ans);
			di.str[4]  = "1";
			ans.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent event) {
					if(event.getStateChange()==ItemEvent.SELECTED)
						di.str[4] = ""+ (ans.getSelectedIndex()+1);
				}
			});
			JButton add = new JButton("Finish");
			add.setToolTipText("Click here to finish editing");
			add.setFont(add.getFont().deriveFont(25f));
			add.setBounds(450, 320, 130, 60);
			add(add);
			add.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					if(que.getText().equals("")||op1.getText().equals("")||op2.getText().equals("")||op3.getText().equals("")||op4.getText().equals(""))
						JOptionPane.showMessageDialog(e, "You have not completed filling all options or question","Alert!",JOptionPane.WARNING_MESSAGE);
					else {
						di.ques = que.getText();
						di.str[0] = op1.getText();
						di.str[1] = op2.getText();
						di.str[2] = op3.getText();
						di.str[3] = op4.getText();
						if (subject.equals("C++")) {
							Main.Cpplist.add(p,di);
							}
							else if(subject.equals("Java")) {
								Main.javalist.add(p, di);
							}
							else if(subject.equals("HTML")) {
								Main.htmllist.add(p, di);
							}
							else if(subject.equals("CSS")) {
								Main.csslist.add(p, di);;
							}
							else {
								Main.python3list.add(p, di);
							}
						JOptionPane.showMessageDialog(e, "You have successfully modified the question","Success!",JOptionPane.INFORMATION_MESSAGE);
						getContentPane().removeAll();
						getContentPane().repaint();
						actionAnother("modify");
						validate();
					}
				}
			});
			JButton back = new JButton("Back");
			back.setBounds(50, 550, 150, 50);
			back.setFont(back.getFont().deriveFont(25f));
			add(back);
			back.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					getContentPane().removeAll();
					getContentPane().repaint();
					modify();
					validate();
				}
			});
			JButton home = new JButton("Home");
			add(home);
			home.setBounds(50, 480, 150,50);
			home.setFont(home.getFont().deriveFont(25f));
			home.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					getContentPane().removeAll();
					getContentPane().repaint();
					enter();
					validate();
				}
			});
		}
		else if(di.type.equals("blank")) {
			JLabel Sta = new JLabel("Question Statement: ");
			Sta.setBounds(10, 5, 250, 50);
			Sta.setFont(Sta.getFont().deriveFont(20f));
			JTextField que= new JTextField(di.ques,70);
			que.setToolTipText("Enter Question Statement here.");
			que.setFont(que.getFont().deriveFont(20f));
			que.setBounds(220,10,850,35);
			JLabel ans = new JLabel("Answer: ");
			ans.setFont(ans.getFont().deriveFont(20f));
			ans.setBounds(10, 55, 200, 50);
			JTextField answer = new JTextField(di.str[5],15);
			answer.setToolTipText("Enter the answer here.");
			answer.setFont(answer.getFont().deriveFont(20f));
			answer.setBounds(120, 60, 150, 35);
			add(Sta);
			add(que);
			add(ans);
			add(answer);
			JButton add = new JButton("Finish");
			add.setToolTipText("Click here to finish editing");
			add.setBounds(450, 120, 130, 60);
			add.setFont(add.getFont().deriveFont(25f));
			add(add);
			add.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					if(que.getText().equals("") || answer.getText().equals(""))
						JOptionPane.showMessageDialog(e, "You have not filled both question and answer completely","Alert!",JOptionPane.WARNING_MESSAGE);
					else {
						di.ques = que.getText();
						di.str[5] = answer.getText();
						if (subject.equals("C++")) {
							Main.Cpplist.add(p,di);
							}
							else if(subject.equals("Java")) {
								Main.javalist.add(p, di);
							}
							else if(subject.equals("HTML")) {
								Main.htmllist.add(p, di);
							}
							else if(subject.equals("CSS")) {
								Main.csslist.add(p, di);;
							}
							else {
								Main.python3list.add(p, di);
							}
						JOptionPane.showMessageDialog(e, "You have successfully modified the question","Success!",JOptionPane.INFORMATION_MESSAGE);
						getContentPane().removeAll();
						getContentPane().repaint();
						actionAnother("modify");
						validate();
					}
				}
			});
			JButton back = new JButton("Back");
			back.setBounds(50, 550, 150, 50);
			back.setFont(back.getFont().deriveFont(25f));
			add(back);
			back.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					getContentPane().removeAll();
					getContentPane().repaint();
					modify();
					validate();
				}
			});
			JButton home = new JButton("Home");
			add(home);
			home.setBounds(50, 480, 150,50);
			home.setFont(home.getFont().deriveFont(25f));
			home.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					getContentPane().removeAll();
					getContentPane().repaint();
					enter();
					validate();
				}
			});
		}
		else {
			di.str[6] = "True";
			JLabel sta = new JLabel("Question Statement: ");
			sta.setBounds(10, 5, 250, 50);
			sta.setFont(sta.getFont().deriveFont(20f));
			JTextField que= new JTextField(di.ques,70);
			que.setToolTipText("Enter Question Statement here.");
			que.setFont(que.getFont().deriveFont(20f));
			que.setBounds(220,10,850,35);
			JLabel ans = new JLabel("Choose if your statement is True or False: ");
			ans.setFont(ans.getFont().deriveFont(20f));
			ans.setBounds(10, 55, 500, 50);
			String[] name = {"True", "False"};
			JComboBox list = new JComboBox(name);
			list.setFont(list.getFont().deriveFont(20f));
			list.setToolTipText("Click arrow and selct");
			list.setBounds(430, 60,100,40);
			list.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent event) {
					if(event.getStateChange()==ItemEvent.SELECTED)
						if(list.getSelectedIndex()==1) {
							di.str[6] = "False";
						}
						else
							di.str[6] = "True";
				}
			});
			add(sta);
			add(que);
			add(ans);
			add(list);
			JButton add = new JButton("Finish");
			add.setBounds(450, 120, 130, 60);
			add.setToolTipText("Click here to finish editing");
			add.setFont(add.getFont().deriveFont(25f));
			add(add);
			add.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					if(que.getText().equals(""))
						JOptionPane.showMessageDialog(e, "Enter the Statement.","Alert!",JOptionPane.WARNING_MESSAGE);
					else {
						di.ques = que.getText();
						if (subject.equals("C++")) {
							Main.Cpplist.add(p,di);
							}
							else if(subject.equals("Java")) {
								Main.javalist.add(p, di);
							}
							else if(subject.equals("HTML")) {
								Main.htmllist.add(p, di);
							}
							else if(subject.equals("CSS")) {
								Main.csslist.add(p, di);;
							}
							else {
								Main.python3list.add(p, di);
							}
						JOptionPane.showMessageDialog(e, "You have successfully modified the question","Success!",JOptionPane.INFORMATION_MESSAGE);
						getContentPane().removeAll();
						getContentPane().repaint();
						actionAnother("modify");
						validate();
					}
				}
			});
			JButton back = new JButton("Back");
			back.setBounds(50, 550, 150, 50);
			back.setFont(back.getFont().deriveFont(25f));
			add(back);
			back.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					getContentPane().removeAll();
					getContentPane().repaint();
					modify();
					validate();
				}
			});
			JButton home = new JButton("Home");
			home.setBounds(50, 480, 150,50);
			home.setFont(home.getFont().deriveFont(25f));
			add(home);
			home.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					getContentPane().removeAll();
					getContentPane().repaint();
					enter();
					validate();
				}
			});
		}
	}
	void view(int p)
	{
		question di;
		if (subject.equals("C++")) {
		di = Main.Cpplist.get(p);
		}
		else if(subject.equals("Java")) {
			di = Main.javalist.get(p);
		}
		else if(subject.equals("HTML")) {
			di = Main.htmllist.get(p);
		}
		else if(subject.equals("CSS")) {
			di = Main.csslist.get(p);
		}
		else {
			di = Main.python3list.get(p);
		}
		String op="";
		if(di.str[4].equals("1"))
			op = "a";
		else if(di.str[4].equals("2"))
			op = "b";
		else if(di.str[4].equals("3"))
			op = "c";
		else
			op = "d";
		JLabel disq = new JLabel("Question: "+di.ques);
		JLabel s1 = new JLabel("a) "+di.str[0]);
		JLabel s2 = new JLabel("b) "+di.str[1]);
		JLabel s3 = new JLabel("c) "+di.str[2]);
		JLabel s4 = new JLabel("d) "+di.str[3]);
		JLabel s5 = new JLabel("Answer: Option-"+op);
		JLabel s6 = new JLabel("Answer(in blank): "+di.str[5]);
		JLabel s7 = new JLabel("Answer(True/False): "+di.str[6]);
		if(di.type.equals("mcq"))
		{
			disq.setBounds(50,50,950,50);
			disq.setFont(disq.getFont().deriveFont(20f));
			s1.setBounds(90, 100, 300, 50);
			s1.setFont(s1.getFont().deriveFont(20f));
			s2.setBounds(530, 100, 300, 50);
			s2.setFont(s2.getFont().deriveFont(20f));
			s3.setBounds(90, 155, 300, 50);
			s3.setFont(s3.getFont().deriveFont(20f));
			s4.setBounds(530, 155, 300, 50);
			s4.setFont(s4.getFont().deriveFont(20f));
			s5.setBounds(100,220,300,50);
			s5.setFont(s4.getFont().deriveFont(20f));
			add(disq);
			add(s1);
			add(s2);
			add(s3);
			add(s4);
			add(s5);
		}
		else if(di.type.equals("blank"))
		{
			disq.setBounds(50,110,950,50);
			disq.setFont(disq.getFont().deriveFont(20f));
			s6.setBounds(100,180,400,50);
			s6.setFont(s6.getFont().deriveFont(20f));
			add(disq);
			add(s6);
		}
		else {
			disq.setBounds(50,110,950,50);
			disq.setFont(disq.getFont().deriveFont(20f));
			s7.setBounds(100, 180, 400, 50);
			s7.setFont(s7.getFont().deriveFont(20f));
			add(disq);
			add(s7);
		}
		JButton del = new JButton("Delete");
		add(del);
		del.setBounds(450,270,150,50);
		del.setFont(del.getFont().deriveFont(25f));
		del.setToolTipText("Click to delete.");
		del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//JOptionPane.showMessageDialog(e, "You have successfully deleted the question.","Success!",JOptionPane.INFORMATION_MESSAGE);
				int a = JOptionPane.showConfirmDialog(e, "Are you sure you want to delete this question?", "Alert!", JOptionPane.YES_NO_OPTION);
				if(a==JOptionPane.YES_OPTION) {
					if (subject.equals("C++")) {
						Main.Cpplist.remove(di);
						Main.Cpp--;
						}
						else if(subject.equals("Java")) {
							Main.javalist.remove(di);
							Main.java--;
						}
						else if(subject.equals("HTML")) {
							Main.htmllist.remove(di);
							Main.html--;
						}
						else if(subject.equals("CSS")) {
							Main.csslist.remove(di);
							Main.css--;
						}
						else {
							Main.python3list.remove(di);
							Main.python3--;
						}
					JOptionPane.showMessageDialog(e, "You have successfully deleted the question!","Success!",JOptionPane.INFORMATION_MESSAGE);
					getContentPane().removeAll();
					getContentPane().repaint();
					actionAnother("remove");
					validate();
				}
				else {
					getContentPane().removeAll();
					getContentPane().repaint();
					view(p);
					validate();
				}
			}
		});
		
		JButton back = new JButton("Back");
		back.setBounds(50, 550, 150, 50);
		back.setFont(back.getFont().deriveFont(25f));
		add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getContentPane().removeAll();
				getContentPane().repaint();
				delete();
				validate();
			}
		});
		JButton home = new JButton("Home");
		add(home);
		home.setBounds(50, 480, 150,50);
		home.setFont(home.getFont().deriveFont(25f));
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getContentPane().removeAll();
				getContentPane().repaint();
				enter();
				validate();
			}
		});
	}	
	void display()
	{
		Print p = new Print();
		p.printTest(subject);
		//setLayout(new FlowLayout());
		JTextArea show1 = new JTextArea();
		show1.setFont(show1.getFont().deriveFont(20f));
		try {
		show1.read(p.getqReader(), null);
		//show.read(p.getaReader(), null);
		}
		catch(Exception e) {
			System.out.println("You have committed an error.");
		}
		show1.setEditable(false);
		show1.setBounds(20, 20, 500, 350);
		//add(show);
		JTextArea show2 = new JTextArea();
		show2.setFont(show2.getFont().deriveFont(20f));
		try {
		//show1.read(p.getqReader(), null);
		show2.read(p.getaReader(), null);
		}
		catch(Exception e) {
			System.out.println("You have committed an error.");
		}
		show2.setEditable(false);
		show2.setBounds(20, 390, 500, 170);
		//add(show);
		JButton print = new JButton("Print");
		print.setBounds(450, 590, 150, 50);
		print.setFont(print.getFont().deriveFont(25f));
		add(print);
		JScrollPane scroll = new JScrollPane(show1);
		scroll.setBounds(20, 20, 1050, 390);
		add(scroll);
		JScrollPane scroll2 = new JScrollPane(show2);
		scroll2.setBounds(20, 420, 1050, 150);
		add(scroll2);
		JButton back = new JButton("Back");
		back.setBounds(50, 590, 150, 50);
		back.setFont(back.getFont().deriveFont(25f));
		add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getContentPane().removeAll();
				getContentPane().repaint();
				selectNumber();
				validate();
			}
		});
		print.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				getContentPane().removeAll();
				getContentPane().repaint();
				JOptionPane.showMessageDialog(e,"Cheers! Your quiz will be in '"+Main.user+"test("+Main.t+").txt' with its answers in '"+Main.user+"AnswerKey("+Main.t+").txt'","Success",JOptionPane.INFORMATION_MESSAGE);
				Main.t++;
				enter();
				validate();
			}
		});
	}

	void signup(){
		JLabel user = new JLabel("Username");
	JLabel pass = new JLabel("Password");
	JTextField username = new JTextField(20);
	JPasswordField password = new JPasswordField(20);
	JButton login = new JButton("login");
	JButton loginpseu = new JButton("register");
				add(user);
		add(username);
		add(pass);
		add(password);
		add(login);
		setLayout(null);
		username.setFont(username.getFont().deriveFont(20f));
		username.setToolTipText("Enter Username here");
		username.setBounds(460,182,200,30);
		password.setBounds(460,232,200,30);
		password.setFont(password.getFont().deriveFont(20f));
		password.setToolTipText("Enter Password here");
		user.setBounds(350,180,200,30);
		pass.setBounds(350,230,200,30);
		user.setFont(user.getFont().deriveFont(20f));
		pass.setFont(pass.getFont().deriveFont(20f));
		login.setText("Sign up");
		login.setBounds(470, 292, 130, 40);
		login.setFont(login.getFont().deriveFont(20f));
		login.setToolTipText("Click to signup");
		/*username.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                username.setText("");
                login.setEnabled(true);
            }
        });
		password.addFocusListener(new FocusListener() {
		    public void focusGained(FocusEvent e) {
		        password.setText("");
		    }

		    public void focusLost(FocusEvent e) {
		        // nothing
		    }
		});*/
		username.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						if(username.getText().equals("") || new String(password.getPassword()).equals(""))
						{
							JOptionPane.showMessageDialog(e, "Enter Username and Password.","Alert!",JOptionPane.WARNING_MESSAGE);
						}
						else if(usercontain(username.getText()))
						{
							JOptionPane.showMessageDialog(e, "Username already exists.Try another name.","Alert!",JOptionPane.WARNING_MESSAGE);
							getContentPane().removeAll();
						getContentPane().repaint();
						signup();
						validate();
							
						}
						else if(contain(username.getText(),new String(password.getPassword()))){
							JOptionPane.showMessageDialog(e, "You have already registered.","Alert!",JOptionPane.WARNING_MESSAGE);
						
						JOptionPane.showMessageDialog(e, "You are redirected to login page.");
						getContentPane().removeAll();
						getContentPane().repaint();
						welcome();
						validate();
						}
						else{
							Creden c = new Creden();
							c.user = username.getText();
							c.pass = new String(password.getPassword());
							Main.crelist.add(c);
							Main.cre++;
							username.setText("");
							password.setText("");
						JOptionPane.showMessageDialog(e, "You are good to go now","Successfully Registered!",JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(e, "You are redirected to login page.");
						getContentPane().removeAll();
						getContentPane().repaint();
						welcome();
						validate();
						}
					}
				});
		password.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						if(username.getText().equals("") || new String(password.getPassword()).equals(""))
						{
							JOptionPane.showMessageDialog(e, "Enter Username and Password.","Alert!",JOptionPane.WARNING_MESSAGE);
						}
						else if(usercontain(username.getText()))
						{
							JOptionPane.showMessageDialog(e, "Username already exists.Try another name.","Alert!",JOptionPane.WARNING_MESSAGE);
							getContentPane().removeAll();
						getContentPane().repaint();
						signup();
						validate();
							
						}
						else if(contain(username.getText(),new String(password.getPassword()))){
							JOptionPane.showMessageDialog(e, "You have already registered.","Alert!",JOptionPane.WARNING_MESSAGE);
						
						JOptionPane.showMessageDialog(e, "You are redirected to login page.");
						getContentPane().removeAll();
						getContentPane().repaint();
						welcome();
						validate();
						}
						else{
							Creden c = new Creden();
							c.user = username.getText();
							c.pass = new String(password.getPassword());
							Main.crelist.add(c);
							Main.cre++;
							username.setText("");
							password.setText("");
						JOptionPane.showMessageDialog(e, "You are good to go now","Successfully Registered!",JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(e, "You are redirected to login page.");
						getContentPane().removeAll();
						getContentPane().repaint();
						welcome();
						validate();
						}
					}
				}
				);
		/*password.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                password.setText("");
                login.setEnabled(true);
            }
        });*/
		login.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						if(username.getText().equals("") || new String(password.getPassword()).equals(""))
						{
							JOptionPane.showMessageDialog(e, "you have not entered Username and/or Password.","Alert!",JOptionPane.WARNING_MESSAGE);
						}
						else if(usercontain(username.getText()))
						{
							JOptionPane.showMessageDialog(e, "Username already exists.Try another name.","Alert!",JOptionPane.WARNING_MESSAGE);
							getContentPane().removeAll();
						getContentPane().repaint();
						signup();
						validate();
							
						}
						else if(contain(username.getText(),new String(password.getPassword()))){
							JOptionPane.showMessageDialog(e, "You have already registered.","Alert!",JOptionPane.WARNING_MESSAGE);
						
						JOptionPane.showMessageDialog(e, "You are redirected to login page.");
						getContentPane().removeAll();
						getContentPane().repaint();
						welcome();
						validate();
						}
						
						else{
							Creden c = new Creden();
							c.user = username.getText();
							c.pass = new String(password.getPassword());
							Main.crelist.add(c);
							Main.cre++;
						JOptionPane.showMessageDialog(e, "You are good to go now","Successfully Registered!",JOptionPane.INFORMATION_MESSAGE);
						JOptionPane.showMessageDialog(e, "You are redirected to login page.");
						getContentPane().removeAll();
						getContentPane().repaint();
						welcome();
						validate();
						}
					}
				});
	}
	boolean contain(String a,String b)
	{
		for(Creden c: Main.crelist)
		{
			if(a.equals(c.user) && b.equals(c.pass)){
				try{Main.t = Integer.parseInt(c.n);
					Main.user = c.user;
					return true;
					}
				catch(Exception e){System.out.println("Your Mistake is here boss.....in bool");}
			}
		}
		return false;
	}
	boolean usercontain(String a)
	{
		for(Creden c: Main.crelist)
		{
			if(a.equals(c.user)){
				return true;
			}
		}
		return false;
	}
	void pin(){
		getContentPane().removeAll();
						getContentPane().repaint();
						welcome();
						validate();
		
	}
}

