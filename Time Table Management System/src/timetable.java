import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class timetable{
	public static void main(String a[]) {
		JFrame frame;
		frame=new JFrame("My Frist GUI");
		frame.setSize(280, 300);
		JButton teacher,student;
		teacher = new JButton("Teacher");
		student = new JButton("Student");
		JPanel panel;
		panel = new JPanel(new GridBagLayout());
		panel.add(teacher);
		panel.add(student);panel.setBackground(Color.white); 
		frame.add(panel);
		frame.setLayout(new GridLayout(1,1));
		frame.setVisible(true);
		
	}
}