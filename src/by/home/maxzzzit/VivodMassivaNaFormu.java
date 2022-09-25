package by.home.maxzzzit;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VivodMassivaNaFormu extends JFrame{
	public static void main(String[]args) {
		Scanner scn = new Scanner(System.in);
		int razmer;
		System.out.print("Введите размер массива: ");
		razmer = scn.nextInt();
		int [] massiv = new int [razmer];

		VivodMassivaNaFormu bumaga = new VivodMassivaNaFormu();
		JPanel panel = new JPanel();
		JLabel vivod = new JLabel();
		JLabel[] labels = new JLabel[razmer];

		bumaga.setTitle("Массив");
		bumaga.setSize(130, 400);
		bumaga.setDefaultCloseOperation(VivodMassivaNaFormu.EXIT_ON_CLOSE);
		bumaga.setLocationRelativeTo(null);
		vivod.setText("Результат : ");

		bumaga.add(panel);
		panel.add(vivod);

		zapolnenie(massiv,labels,panel);
		rezultat(massiv,labels);
		bumaga.setVisible(true);
	}

	private static void zapolnenie (int [] mass, JLabel [] lab, JPanel panel) {
		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int)(10+Math.random()*89);

			lab[i] = new JLabel();
			lab[i].setText((i+1)+") - " + mass[i]+", ");
			panel.add(lab[i]);
		}
	}

	private static void rezultat (int [] mass, JLabel [] lab) {
		for (int i = 0; i < mass.length; i++) {
			System.out.println(lab[i].getText());
		}
	}
}