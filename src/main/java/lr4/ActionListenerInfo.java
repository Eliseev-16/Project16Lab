package lr4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

import lr4.GroupInfo; 

public class ActionListenerInfo implements ActionListener {
	
	private JFrame panel;

	
	ActionListenerInfo(JFrame panel, boolean check) {
		
		this.panel=panel;
	}
	
	
	@Override // ключевое слово, которое позволяет в дочернем классе заново создать реализацию метода родительского класса
	public void actionPerformed(ActionEvent arg0) {
			
		//скрытие основной формы
		panel.setVisible(false);
		
		
		
		
		
		//создание объекта - окна
		GroupInfo group_info = new GroupInfo("Information", "Елисеев Александр - 20131014, дата: 19.03.22", "Цкриалашвили Диана - 20130483", 
				"Саитов Эрик - 20130500", panel, Main.getSubversion().getInfoButton().getCheck());
		


		
	}

}
