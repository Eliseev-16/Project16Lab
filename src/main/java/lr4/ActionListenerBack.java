package lr4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ActionListenerBack implements ActionListener {
	
	private JFrame panel;
	private JFrame info_panel;
	
	ActionListenerBack(JFrame panel, JFrame info_panel) {
		
		this.panel=panel;
		this.info_panel=info_panel;
	}
	
	@Override 
	public void actionPerformed(ActionEvent arg0) {
			
		//возврат на главную форму
		panel.setVisible(true);
		
		//удаление формы информации
		info_panel.dispose();
		
		
	}

}
