package lr4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonMenu extends JMenuBar {
	private Image image = new Image();
    public ButtonMenu(JPanel panel, String name1){

        JMenu menu = new JMenu(name1);//Создание меню
        JMenuItem item1 = new JMenuItem("Отобразить логотип УГАТУ");//Создание первого элемента меню
        JMenuItem item2 = new JMenuItem("Загрузить файл в проект 16");//Создание второго элемента меню
        JMenuItem item3 = new JMenuItem("Отобразить одномерный массив");//Создание третьего элемента меню
        JMenuItem item4 = new JMenuItem("Выход");//Создание четвертого элемента меню
        menu.add(item1);//Добавление первого элемента в меню
        menu.add(item2);//Добавление второго элемента в меню
        menu.add(item3);//Добавление третьего элемента в меню
        menu.add(item4);//Добавление четвертого элемента в меню
        this.add(menu);//Добавление меню в кнопку меню
        item1.addActionListener(new SecondListener(panel));//Добавление слушателя для первого подменю
        item2.addActionListener(new ListenerForLoadFile());//Добавление слушателя для второго подменю
        item3.addActionListener(new ListenerForArray());//Добавление слушателя для третьего подменю
        item4.addActionListener(new Listener());//Добавление слушателя для четвертого подменю
        panel.setLayout(new FlowLayout(FlowLayout.RIGHT));//Задание метода расположения
    }
    //Слушатель для кнопки Отобразить логотип УГАТУ
    public class SecondListener implements ActionListener{
    	 private JPanel panel; //Создание панели 
    	 //Создание конструктора
         public SecondListener(JPanel panel){
             this.panel = panel;//Присваиваем локальной панели значение переданной панели 
         }

        @Override
        public void actionPerformed(ActionEvent e) {

        	panel.add(image);//Добавление объекта image к панели
            image.revalidate();//Переопределение элементов в объекте
    }
}
}
