package lr4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerComboBox implements ActionListener {

	private String content[];//Элементы комбобокса
    private JPanel panel;//Панель на которой будет расположена картинка
    private JComboBox comboBox;//Сам объект комбобокс (для получения текущего значения)

    ListenerComboBox(String content[], JPanel panel, JComboBox comboBox){
        this.content = content;//Задаем входные параметры описанные выше
        this.panel = panel;
        this.comboBox = comboBox;
    }

    @Override
    public void actionPerformed(ActionEvent e) {//Переопределим метод слушателя
        if(comboBox.getSelectedItem().equals(content[0])) {//Если в комбобокс задано значение (сокращенно) - сверху-справа
            panel.setLayout(new FlowLayout(FlowLayout.RIGHT));//Задать расположение объектов панели по правой верхней стороне
        }
        if(comboBox.getSelectedItem().equals(content[1])) {//Если в комбобокс задано значение (сокращенно) - по центру
            panel.setLayout(new GridBagLayout());//Задать расположение объектов панели по центру (или же как таблица с одним элементом)
        }
        if (comboBox.getSelectedItem().equals(content[2])) {//Если в комбобокс задано значение (сокращенно) - сверху-слева
            panel.setLayout(new FlowLayout(FlowLayout.LEFT));//Задать расположение объектов панели по левой верхней стороне
        }
        if (comboBox.getSelectedItem().equals(content[3])) {//Если в комбобокс задано значение (сокращенно) - сверху-слева
            SortArr.sort(Main.getSubversion().getArr().getArray());//Задать расположение объектов панели по левой верхней стороне
        }
        panel.revalidate();//Переопределить расположение элементов панели
        panel.repaint();//Перерисовать панель
    }
	
}
