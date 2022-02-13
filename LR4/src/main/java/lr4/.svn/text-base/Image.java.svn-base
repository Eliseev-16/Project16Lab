package lr4;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

//Создание панели
public class Image extends JPanel {
    private BufferedImage image;//Создание переменной image
    private final int WIDTH = 250;//Создаем константу высоты картинки
    private final int HEIGHT = 100;//Создаем константу ширины картинки
    
    //Создаем конструктор 
    public Image(){
        try{
            image = ImageIO.read(new File("img1.jpg"));//Читаем картинку из файла и передаем значение переменной image
            setPreferredSize(new Dimension(WIDTH,HEIGHT));//Устанавливаем размер панели
        }
        catch(IOException e){
            e.printStackTrace();//Исключение
        }
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);//Использование метода super
        if(image == null) return;//Проверка на наличие картинки в переменной
        g.drawImage(image,0,0,WIDTH,HEIGHT,this);//Отрисовка картинки с заданными размерами
    }
}
