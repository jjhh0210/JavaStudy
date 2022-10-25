import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEx8 {


    public static void main(String[] args) {
        Button b = new Button("Start!");
        b.addActionListener(new ActionListener() {      //익명클래스!
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent Occurred!");
            }
        });
    }
}
