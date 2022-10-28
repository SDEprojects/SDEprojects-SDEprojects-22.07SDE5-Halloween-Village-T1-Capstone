package com.halloween.view;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiForUserInput {

  JPanel panelForUserInput;
  JLabel labelForUserInput;
  JTextField userTextField;
  JButton buttonForUserInput;

  public GuiForUserInput() {

    panelForUserInput = new JPanel();
    panelForUserInput.setBounds(5, 695, 970, 60);
    panelForUserInput.setLayout(null);
    panelForUserInput.setBackground(Color.lightGray);

    labelForUserInput = new JLabel();
    labelForUserInput.setText("User Input");
    labelForUserInput.setBounds(15, 0, 100, 25);

    userTextField = new JTextField();
    userTextField.setBounds(15, 25, 230, 25);
    panelForUserInput.add(userTextField);

    buttonForUserInput = new JButton();
    buttonForUserInput.setText("Go");
    buttonForUserInput.setBounds(250, 25, 55, 25);
    buttonForUserInput.setFocusable(false);
    buttonForUserInput.addActionListener(e -> System.out.println(userTextField.getText()));

    panelForUserInput.add(labelForUserInput);
    panelForUserInput.add(buttonForUserInput);
  }

  public JPanel getPanelForUserInput() {
    return panelForUserInput;
  }

}
