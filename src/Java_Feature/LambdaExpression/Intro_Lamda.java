package Java_Feature.LambdaExpression;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Intro_Lamda {
    public static void main(String[] args) {
        Frame frame = new Frame("Action Listener Before java 8");

        Button button = new Button("Click Here");


//this is without lambda
        button.setBounds(50, 100, 80, 50);
        /*button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello world!");
            }
        });*/

        //this is with lamda
        button.addActionListener(e ->{
            System.out.println("Hello world!");
        });

        frame.add ( button);
        frame.setSize(200, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
