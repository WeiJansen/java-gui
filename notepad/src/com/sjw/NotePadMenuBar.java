package com.sjw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class NotePadMenuBar extends JMenuBar {


    public NotePadMenuBar() {
        addMenuItem(this);
    }

    // 添加菜单项
    private void addMenuItem(JMenuBar jMenuBar) {
        // 文件菜单
        JMenu fileMenu = createMeanu(MenuConstants.fileText, KeyEvent.VK_F, jMenuBar);
        // 文件编辑
        JMenu editMenu = createMeanu(MenuConstants.editText, KeyEvent.VK_E, jMenuBar);
        // 格式菜单
        JMenu formatMenu = createMeanu(MenuConstants.formatText, KeyEvent.VK_O, jMenuBar);



    }



    private JMenu createMeanu(String name, int key, JMenuBar toMenuBar) {
        JMenu jMenu = new JMenu(name);
        jMenu.setMnemonic(key);


        return jMenu;
    }


    // 创建并返回一个JMenuItem, 并放入指定的menu
    private JMenuItem createMenuItem(String name, int key, JMenu toMenu, ActionListener actionListener) {
        JMenuItem jMenuItem = new JMenuItem(name, key);
        jMenuItem.addActionListener(actionListener);
        toMenu.add(jMenuItem);
        return jMenuItem;
    }
    // 创建并返回一个JMenuItem, 并放入指定的menu
    private JMenuItem createMenuItem(String name, int key, JMenu toMenu, int aclkey, ActionListener actionListener) {
        JMenuItem jMenuItem = new JMenuItem(name, key);
        jMenuItem.addActionListener(actionListener);
        jMenuItem.setAccelerator(KeyStroke.getKeyStroke(aclkey, ActionEvent.CTRL_MASK));
        toMenu.add(jMenuItem);
        return jMenuItem;
    }





}
