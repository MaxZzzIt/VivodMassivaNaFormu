package by.home.maxzzzit;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VivodMassivaNaFormu extends JFrame{
	public static JLabel vivod2 = new JLabel();
	public static void main(String[]args) {
		Scanner scn = new Scanner(System.in);
		int razm;
		System.out.print("Введите размер массива: ");
		razm = scn.nextInt();
		int [] massiv = new int [razm];
		VivodMassivaNaFormu bumaga = new VivodMassivaNaFormu();
		JPanel pan = new JPanel();
		JLabel vivod1 = new JLabel();

		bumaga.setTitle("Массив");
		bumaga.setSize(300, 400);
		bumaga.add(pan);
		bumaga.setVisible(true);
		pan.add(vivod1);
		pan.add(vivod2);
		vivod1.setText("Результат : ");
//		vivod1.setVisible(true);
		bumaga.setLocationRelativeTo(null);
		zapolnenie(massiv);
		rezultat(massiv);
//		String otvet = String.valueOf(rezultat(massiv));
//		vivod2.setText(otvet);
	}
	
	private static void zapolnenie (int [] mass) {
		for (int i = 0; i < mass.length; i++) {
			mass[i] = (int)(10+Math.random()*89);
		}
	}
	
	private static void rezultat (int [] mass) {
		for (int i = 0; i < mass.length; i++) {
			vivod2.setText(mass[i]+" ");
			System.out.print(mass[i]+" ");
		}
	}
}
