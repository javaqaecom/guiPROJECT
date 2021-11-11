import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class guiMain {
//    static class ButtonListener implements ActionListener{
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            JOptionPane.showMessageDialog(
//                    null,textField1);
//        }
//    }

    public static void main(String[] args) {
         //אתחול החלון
        {
        JFrame frame = new JFrame("hodi's first GUI");
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);

        //הגדרת טקסט לתוך הלחון
        JTextField textField1 = new JTextField("do you even  CODE bruh !!!!");
        textField1.setSize(200, 50);
        textField1.setLocation(350, 500);
        frame.add(textField1);

        //הגדרת כפתו
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setSelectedTextColor(Color.cyan);
            }
        };//listener1
        JButton button1 = new JButton("Click me!!!");
        button1.setSize(100, 30);
        button1.setLocation(50, 500);
        button1.addActionListener(listener);
        frame.add(button1);

        //btn 2
        JButton button2 = new JButton(">>>>");
        button2.setSize(100, 30);
        //listener2
        button2.setLocation(160, 500);

        frame.add(button2);



        //הגדרת לוח צייר והוספתו לפראם
        myCanvas myCanvas1 = new myCanvas();
        myCanvas1.setSize(800, 500);
        myCanvas1.setLocation(0, 0);
        frame.add(myCanvas1);


        ActionListener listerForBTN2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myCanvas1.moveX();
            }
        };
        button2.addActionListener(listerForBTN2);
        frame.setVisible(true);


        }
    }
}
