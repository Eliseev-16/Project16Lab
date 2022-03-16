package lr4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ListenerForLoadFile implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Main.getSubversion().getInfoButton().setCheck(true);
		JOptionPane.showMessageDialog(null,"Загрузка файла завершена");
	}

}
