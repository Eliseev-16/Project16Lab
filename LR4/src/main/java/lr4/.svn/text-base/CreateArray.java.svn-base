package lr4;

import javax.swing.JOptionPane;

public class CreateArray {
	private int [] arr = new int[9];
	
	public CreateArray() {
		for(int i = 0; i<9;i++) {
			arr[i] = RandomForArray.generateRandom();
		}
	}
	
	public int [] getArray() {
		return arr;
	}
	
	public void outMessage() {
		String str = "";
		for(int i = 1;i<9;i++) {
			str = str + arr[i]+ "; ";
		}
		JOptionPane.showMessageDialog(null, "Значения массива: " + str);
	}
		}


