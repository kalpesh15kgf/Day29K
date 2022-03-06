import java.awt.*;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.Applet;


public class sample extends Applet {
Button b , b1;
TextField t;

public void init()
{
	add(b = new Button("Click"));
	add(t = new TextField(15));
	add(b1 = new Button("clear"));
	b.addActionListener(new A());
	
	b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			t.setText("");
		}
	});
	b.addActionListener((ActionEvent e)-> {t.setText("")});
	class A implements ActionListner{
		public void actionPerformed(ActionEvent e) {
			t.setText("HELLO");
		}
	}
}
}
