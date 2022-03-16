package lr4;

import javax.swing.*;
import java.awt.*;

public class SuperComboBox extends JComboBox {

	private String[] content = {//Создадим надписи по заданию
			"Переместить логотип УГАТУ в верхний правый угол",
			"Переместить логотип УГАТУ в середину",
			"Переместить логотип УГАТУ в левый верхний угол",
			"Отсортировать данные в проекте16"
	};

	public SuperComboBox(JPanel place,JPanel workPanel){

		addItem(content[0]);//Добавим надписи
		addItem(content[1]);
		addItem(content[2]);
		addItem(content[3]);

		workPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));// Зададим начальное положение
		place.add(this,BorderLayout.WEST);//Добавим комбобокс на нижнюю панель
		addActionListener(new ListenerComboBox(content,workPanel,this));//Добавим слушатели
	}
}
