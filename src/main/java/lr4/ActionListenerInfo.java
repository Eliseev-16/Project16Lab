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
	
	
	@Override // �������� �����, ������� ��������� � �������� ������ ������ ������� ���������� ������ ������������� ������
	public void actionPerformed(ActionEvent arg0) {
			
		//������� �������� �����
		panel.setVisible(false);
		
		
		
		
		
		//�������� ������� - ����
		GroupInfo group_info = new GroupInfo("Information", "������� ��������� - 20131014, ����: 19.03.22", "������������ ����� - 20130483", 
				"������ ���� - 20130500", panel, Main.getSubversion().getInfoButton().getCheck());
		


		
	}

}
