package com.mycompany.mavenproject2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Ankita Sinha
 */
public class reservation extends JFrame implements ActionListener {
     private static final long serialVersionUID = 1L;

    JLabel nameLabel, trainLabel, classLabel, dateLabel, fromLabel, toLabel;
    JTextField nameField, dateField, fromField, toField;
    JComboBox<String> trainCombo, classCombo;
    JButton insertButton;
    public reservation() {
        setTitle("Reservation Form");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 30, 100, 30);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(150, 30, 200, 30);
        add(nameField);

        trainLabel = new JLabel("Train:");
        trainLabel.setBounds(50, 70, 100, 30);
        add(trainLabel);

        String[] trains = { "Train 1", "Train 2", "Train 3" };
        trainCombo = new JComboBox<>(trains);
        trainCombo.setBounds(150, 70, 200, 30);
        add(trainCombo);

        classLabel = new JLabel("Class:");
        classLabel.setBounds(50, 110, 100, 30);
        add(classLabel);

        String[] classes = { "Economy", "Business" };
        classCombo = new JComboBox<>(classes);
        classCombo.setBounds(150, 110, 200, 30);
        add(classCombo);

        dateLabel = new JLabel("Date:");
        dateLabel.setBounds(50, 150, 100, 30);
        add(dateLabel);

        dateField = new JTextField();
        dateField.setBounds(150, 150, 200, 30);
        add(dateField);

        fromLabel = new JLabel("From:");
        fromLabel.setBounds(50, 190, 100, 30);
        add(fromLabel);

        fromField = new JTextField();
        fromField.setBounds(150, 190, 200, 30);
        add(fromField);

        toLabel = new JLabel("To:");
        toLabel.setBounds(50, 230, 100, 30);
        add(toLabel);
toField = new JTextField();
        toField.setBounds(150, 230, 200, 30);
        add(toField);

        insertButton = new JButton("Insert");
        insertButton.setBounds(150, 270, 100, 30);
        insertButton.addActionListener(this);
        add(insertButton);
    }

    public static void main(String[] args) {
        reservation reservationForm = new reservation();
        reservationForm.setVisible(true);
    }
public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String train = (String) trainCombo.getSelectedItem();
        String clazz = (String) classCombo.getSelectedItem();
        String date = dateField.getText();
        String from = fromField.getText();
        String to = toField.getText();
        System.out.println("Name: " + name);
        System.out.println("Train: " + train);
        System.out.println("Class: " + clazz);
        System.out.println("Date: " + date);
        System.out.println("From: " + from);
        System.out.println("To: " + to);
    }
}

