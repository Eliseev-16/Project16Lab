package lr4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ListenerForArray implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Main.getSubversion().getArr().outMessage();
		
	}
}
