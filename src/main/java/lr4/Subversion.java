package lr4; //пакет Java классов


import javax.swing.*; // Библиотека для GUI (построена на основе awt)
import java.awt.*;


public class Subversion {
	
	private InformationButton info_but;
	private CreateArray arr = new CreateArray();

	public Subversion() {
		//Создание основных элементов интерфейса
		JFrame main_GUI = new JFrame("Group PI-225, project 16");//Создание фрейма
		JPanel main_Panel = new JPanel();//Основная панель
		JPanel footerPanel = new JPanel();//Нижняя панель (под кнопку и комбобокс)
		JPanel centerPanel = new JPanel();//Центральная панель (для картинки)
		JButton exitButton = new JButton("Выход");
		JPanel middlePanel = new JPanel();
		Box content = Box.createVerticalBox();
		JButton calculate = new JButton("Расчёт");
		
		
		//Настройка элементов интерфейса
		main_GUI.setPreferredSize(new Dimension(750,500));//Установка размеров кона
		main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Остановка процесса Java по закрытии JFrame
		main_Panel.setLayout(new BorderLayout());//Зададим методы расположения
		footerPanel.setLayout(new FlowLayout());
		middlePanel.setLayout(new FlowLayout());
		main_Panel.add(centerPanel,BorderLayout.CENTER);
		content.add(middlePanel);
		content.add(footerPanel);
		main_Panel.add(content,BorderLayout.SOUTH);
		main_GUI.add(main_Panel);//Поместим основную панель в окно (фрейм)
		
		
		AddTextFields super_Text_Fields = new AddTextFields(middlePanel);
		calculate.addActionListener(new ActionListenerCalculate(super_Text_Fields));
		footerPanel.add(calculate);

		//Создание объекта класса для кнопки "Информация"
		info_but = new InformationButton(footerPanel, "Информация", main_GUI);

		ButtonMenu buttonMenu = new ButtonMenu(centerPanel,"Меню");//Создание объекта кнопки
		main_GUI.add(buttonMenu,BorderLayout.NORTH);//Добавление кнопки на форму
		
		//Создание и размещение объекта класса superComboBox с функционалом по заданию
		SuperComboBox comboBox = new SuperComboBox(footerPanel,centerPanel);
		footerPanel.add(exitButton);//Добавление кнопки "Выход"
		exitButton.addActionListener(new Listener());//Назначение слушателя кнопке
		
		//Компоновка и отображение
		main_GUI.pack();//Скомпонуем
		main_GUI.setVisible(true);//Сделаем окно(фрейм) видимым
		
		
	}
	
	public InformationButton getInfoButton() {
		return info_but;
	}
	public CreateArray getArr() {
		return arr;
	}

	
	
	


}
