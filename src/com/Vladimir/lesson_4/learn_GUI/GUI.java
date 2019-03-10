package com.Vladimir.lesson_4.learn_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private JLabel loginLabel = new JLabel("Введите логин:");
    private JTextField loginField = new JTextField("", 5);
    private JLabel passwordLabel = new JLabel("Введите пароль:");
    private JTextField passwordField = new JTextField("");
    private JButton logInButton = new JButton("Log in");

    public GUI(){
        super("Log in form");
        this.setBounds(960, 540, 250, 140);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(loginLabel);
        container.add(loginField);
        container.add(passwordLabel);
        container.add(passwordField);
        logInButton.addActionListener(new LoginMessage());
        container.add(logInButton);
    }
    class LoginMessage implements ActionListener {
        public void actionPerformed(ActionEvent x) {
            String message;
            if (loginField.getText().equals("admin") && passwordField.getText().equals("admin")){
                message = "Вы успешно залогинились!";
            }else{
                message = "Логин и пароль не подходят!";
            }
            JOptionPane.showMessageDialog(null, message, "Notification", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
