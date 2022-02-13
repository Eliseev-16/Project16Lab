package lr4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Слушатель для кнопки Выход
public class Listener implements ActionListener {
	@Override
    public void actionPerformed(ActionEvent e){
        System.exit(1);//Выход из программы
    }

}
