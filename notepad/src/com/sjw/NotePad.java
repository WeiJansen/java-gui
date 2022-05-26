package com.sjw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NotePad implements ActionListener {


    JFrame mainFrame;
    JTextArea textArea;
    JLabel statusBar;
    private String fileName = "未命名";
    String applicationName = "java记事本";


    public NotePad() {
        mainFrame = new JFrame(fileName + applicationName);
        textArea = new JTextArea(30,60);
        //提示条，右右
        statusBar = new JLabel("||       Ln 1, Col 1  ",JLabel.RIGHT);
        // 中间输入的区域， 带滚动条
        mainFrame.add(new JScrollPane(textArea), BorderLayout.CENTER);
        // 下方提示条
        mainFrame.add(statusBar, BorderLayout.SOUTH);

        mainFrame.add(new Label("  "), BorderLayout.EAST);
        mainFrame.add(new Label("  "), BorderLayout.WEST);
        mainFrame.pack();
        mainFrame.setLocation(150,50);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        init(mainFrame);
    }
    //初始化
    private void init(JFrame frame) {
        // 1.添加菜单
        createMenuBar(frame);

    }
    // 添加菜单
    private void createMenuBar(JFrame frame) {

    }





    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
