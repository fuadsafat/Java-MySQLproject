
package ShopeManagment;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class Minimize {
    public void mini() throws Exception {
        final JFrame frame = new JFrame();
        //frame.setUndecorated(true);
        //JButton button = new JButton("Minimize");
       // button.addActionListener((ActionEvent e) -> {
         //   frame.setState(Frame.ICONIFIED);
     //  });
        //frame.add(button);
        //frame.pack();
       // frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}
