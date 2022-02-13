package lr4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ActionListenerCalculate implements ActionListener{
	
	private AddTextFields super_Text_Fields;
	
	public ActionListenerCalculate(AddTextFields super_Text_Fields) {
		this.super_Text_Fields = super_Text_Fields;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
		super_Text_Fields.setResult(new CalculateTr().perimeter(
				super_Text_Fields.getField1(), 
				super_Text_Fields.getField2(),
				super_Text_Fields.getField3(), 
				super_Text_Fields.getField4()));}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null,"¬ведены некорректные числа");
		}
		
	}

}
