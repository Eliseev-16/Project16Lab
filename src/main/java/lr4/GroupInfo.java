package lr4;

import javax.swing.*; // Библиотека для GUI (построена на основе awt)
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class GroupInfo extends JFrame {
	
	public GroupInfo(String frame_name, String user1, String user2, String user3, JFrame gui, boolean check) {
		
		JFrame main_GUI = new JFrame(frame_name);	// создание графического окна
		main_GUI.setBounds(300,300,450,300); //задание параметров
		main_GUI.setResizable(false); // фиксированный размер окна
		
		JPanel main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
		main_panel.setLayout(null); //обнуление слоев
		main_GUI.add(main_panel);
		
		JLabel user116 = new JLabel(user1); // Отображение текста
		user116.setBounds(35,15,350,70); //задание параметров
		
		
		JLabel user216 = new JLabel(user2); // Отображение текста
		user216.setBounds(28,30,350,70); //задание параметров
		
		JLabel user316 = new JLabel(user3); // Отображение текста
		user316.setBounds(43,45,350,70);
		
		//файл
		if (check) {
		String text = "";
			try {
				FileReader f = new FileReader("info.txt");
				BufferedReader reader = new BufferedReader(f);
				String line = reader.readLine();
				while (line!= null) {
					if (line!="") text = text + line +"\n";
					line = reader.readLine();
				}
				JTextArea textA = new JTextArea();
				textA.append(text);
				textA.setEditable(false);
				textA.setBounds(35,90,230,110);
				textA.setBackground(main_panel.getBackground());
				textA.setForeground(main_panel.getForeground());
				main_panel.add(textA);
				} catch (FileNotFoundException e) {
					e.printStackTrace();		
				} catch (IOException e) {//Обработчик ошибки считывания
		            e.printStackTrace();
		        }
		}
		
		
		JLabel label = new JLabel("Здесь размещаются ФИО и номера зачетных книжек"); // Отображение текста
		label.setBounds(10,220,400,70); //задание параметров
		
		//Добавлене кнопки "Назад"
		JButton back_button = new JButton("Назад"); //создание объекта
		
		back_button.setBounds(300,5,100,30); //задание параметров
		back_button.addActionListener(new ActionListenerBack(gui, main_GUI)); //обработчик событий
		
		//добавление на панель
		main_panel.add(label);
		main_panel.add(user116);
		main_panel.add(user216);
		main_panel.add(user316);
		main_panel.add(back_button);
		
		main_GUI.setVisible(true);
		
		 
		
	}
	
	

}

 
 
