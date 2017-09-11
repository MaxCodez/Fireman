package Files;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui {
	public Gui() {

		Var.jf1 = new JFrame();
		Var.jf1.setSize(Var.screenwidth, Var.screenheight);
		Var.jf1.setVisible(true);
		Var.jf1.setResizable(false);
		Var.jf1.setTitle("Animgame! -MaxCodez");
		Var.jf1.setDefaultCloseOperation(3); // Exit_On_Close !
		Var.jf1.setLayout(null);
		Var.jf1.setLocationRelativeTo(null);
		Var.jf1.addKeyListener(new KeyHandler());
		Var.jf1.addMouseListener(new MouseHandler());
		Var.jf1.requestFocus();

		Draw lbldraw = new Draw();
		lbldraw.setBounds(0, 0, Var.screenwidth, Var.screenheight);
		lbldraw.setVisible(true);
		Var.jf1.add(lbldraw);
		
		System.out.println("System: Gui Loaded successfully!");
	}

}