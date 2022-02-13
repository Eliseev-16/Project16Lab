package lr4;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

//�������� ������
public class Image extends JPanel {
    private BufferedImage image;//�������� ���������� image
    private final int WIDTH = 250;//������� ��������� ������ ��������
    private final int HEIGHT = 100;//������� ��������� ������ ��������
    
    //������� ����������� 
    public Image(){
        try{
            image = ImageIO.read(new File("img1.jpg"));//������ �������� �� ����� � �������� �������� ���������� image
            setPreferredSize(new Dimension(WIDTH,HEIGHT));//������������� ������ ������
        }
        catch(IOException e){
            e.printStackTrace();//����������
        }
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);//������������� ������ super
        if(image == null) return;//�������� �� ������� �������� � ����������
        g.drawImage(image,0,0,WIDTH,HEIGHT,this);//��������� �������� � ��������� ���������
    }
}
