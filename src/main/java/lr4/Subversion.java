package lr4; //����� Java �������


import javax.swing.*; // ���������� ��� GUI (��������� �� ������ awt)
import java.awt.*;


public class Subversion {
	
	private InformationButton info_but;
	private CreateArray arr = new CreateArray();

	public Subversion() {
		//�������� �������� ��������� ����������
		JFrame main_GUI = new JFrame("Group PI-225, project 16");//�������� ������
		JPanel main_Panel = new JPanel();//�������� ������
		JPanel footerPanel = new JPanel();//������ ������ (��� ������ � ���������)
		JPanel centerPanel = new JPanel();//����������� ������ (��� ��������)
		JButton exitButton = new JButton("�����");
		JPanel middlePanel = new JPanel();
		Box content = Box.createVerticalBox();
		JButton calculate = new JButton("������");
		
		
		//��������� ��������� ����������
		main_GUI.setPreferredSize(new Dimension(750,500));//��������� �������� ����
		main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //��������� �������� Java �� �������� JFrame
		main_Panel.setLayout(new BorderLayout());//������� ������ ������������
		footerPanel.setLayout(new FlowLayout());
		middlePanel.setLayout(new FlowLayout());
		main_Panel.add(centerPanel,BorderLayout.CENTER);
		content.add(middlePanel);
		content.add(footerPanel);
		main_Panel.add(content,BorderLayout.SOUTH);
		main_GUI.add(main_Panel);//�������� �������� ������ � ���� (�����)
		
		
		AddTextFields super_Text_Fields = new AddTextFields(middlePanel);
		calculate.addActionListener(new ActionListenerCalculate(super_Text_Fields));
		footerPanel.add(calculate);

		//�������� ������� ������ ��� ������ "����������"
		info_but = new InformationButton(footerPanel, "����������", main_GUI);

		ButtonMenu buttonMenu = new ButtonMenu(centerPanel,"����");//�������� ������� ������
		main_GUI.add(buttonMenu,BorderLayout.NORTH);//���������� ������ �� �����
		
		//�������� � ���������� ������� ������ superComboBox � ������������ �� �������
		SuperComboBox comboBox = new SuperComboBox(footerPanel,centerPanel);
		footerPanel.add(exitButton);//���������� ������ "�����"
		exitButton.addActionListener(new Listener());//���������� ��������� ������
		
		//���������� � �����������
		main_GUI.pack();//����������
		main_GUI.setVisible(true);//������� ����(�����) �������
		
		
	}
	
	public InformationButton getInfoButton() {
		return info_but;
	}
	public CreateArray getArr() {
		return arr;
	}

	
	
	


}
