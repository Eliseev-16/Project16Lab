package lr4;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddTextFields{
	private JLabel side = new JLabel("Стороны:");
	private JLabel label_1 = new JLabel("a:");
	private JLabel label_2 = new JLabel("b:");
	private JLabel label_3 = new JLabel("c:");
	private JLabel label_4 = new JLabel("d:");
	private JLabel result = new JLabel("Результат:");
	private JLabel out_Result = new JLabel();
	private JTextField textbox_1 = new JTextField(5);
	private JTextField textbox_2 = new JTextField(5);
	private JTextField textbox_3 = new JTextField(5);
	private JTextField textbox_4 = new JTextField(5);
	
	public AddTextFields(JPanel middlePanel) {
		middlePanel.add(side);
		middlePanel.add(label_1);
		middlePanel.add(textbox_1);
		middlePanel.add(label_2);
		middlePanel.add(textbox_2);
		middlePanel.add(label_3);
		middlePanel.add(textbox_3);
		middlePanel.add(label_4);
		middlePanel.add(textbox_4);
		middlePanel.add(result);
		middlePanel.add(out_Result);
	}
	
	public void setResult(int res){
		out_Result.setText(Integer.toString(res));
	}
	public int getField1() {
		
		return Integer.parseInt(textbox_1.getText());
	}
    public int getField2() {
		
		return Integer.parseInt(textbox_2.getText());
	}
    public int getField3() {
		
		return Integer.parseInt(textbox_3.getText());
	}
    public int getField4() {
		
		return Integer.parseInt(textbox_4.getText());
	}
}
