package lr4;

import javax.swing.JOptionPane;

public class CalculateTr {
	CalculateTr(){}

    public int perimeter(int a,int b,int c,int d){
        int res;//Переменная результата
        res= a+b+c+d;//рассчет периметра
        if (a<= 0 || b<=0 || c <= 0 || d<=0)  {JOptionPane.showMessageDialog(null,"Введены некорректные числа");res = 0;}// исключение
        return res;//вывод результата
    }
}
