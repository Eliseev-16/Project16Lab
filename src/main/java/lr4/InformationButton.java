package lr4;

import java.awt.*;
import javax.swing.*;

public class InformationButton extends JComponent {
	private boolean check=false;
	
	//создание конструктора
	public InformationButton(JPanel panel, String button_name, JFrame gui) {
		
		JButton info_button = new JButton(button_name); //создание объекта
		
		info_button.setSize(new Dimension(130,50)); //задание размеров
		info_button.addActionListener(new ActionListenerInfo(gui, check)); //обработчик событий
		panel.add(info_button); //добавление кнопки на основную панель
		
	}
	
	public void setCheck(boolean check) {
		this.check=check;
	}
	
	public boolean getCheck () {
		return check;
	}

}
