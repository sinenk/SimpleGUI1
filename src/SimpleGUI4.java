import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class SimpleGUI4 extends JFrame {
	SimpleGUI4() {
		setSize(400, 400); // la taille de la fen�tre en pixels
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JButton but1 = new JButton("Bouton");
		// Obtenir le contr�le du paneau pour ajouter le bouton
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout(FlowLayout.CENTER));
		// Ajouter le contr�le d'�v�nement au boutton
		but1.addActionListener((ActionListener) new MyActionListener());
		// Ajouter le bouton au paneau
		cp.add(but1);
		setVisible(true);
	}

	public static void main(String[] args) {
		SimpleGUI4 gui = new SimpleGUI4();
	}

	// D�finir une classe interne pour saisir les �v�nements
	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			JOptionPane.showMessageDialog(null, "Cliqu�!!!");
		}
	}
}