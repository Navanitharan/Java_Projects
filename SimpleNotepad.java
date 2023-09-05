import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleNotepad extends JFrame implements ActionListener {

  private JTextArea textArea;
  private JMenuBar menuBar;
  private JMenu fileMenu, editMenu;
  private JMenuItem newMenuItem, openMenuItem, saveMenuItem, exitMenuItem;
  private JMenuItem cutMenuItem, copyMenuItem, pasteMenuItem, deleteMenuItem;

  public SimpleNotepad() {
    setTitle("Simple Notepad");
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    textArea = new JTextArea();
    textArea.setEditable(true);
    getContentPane().add(textArea, BorderLayout.CENTER);

    menuBar = new JMenuBar();
    fileMenu = new JMenu("File");
    newMenuItem = new JMenuItem("New");
    newMenuItem.addActionListener(this);
    fileMenu.add(newMenuItem);
    openMenuItem = new JMenuItem("Open");
    openMenuItem.addActionListener(this);
    fileMenu.add(openMenuItem);
    saveMenuItem = new JMenuItem("Save");
    saveMenuItem.addActionListener(this);
    fileMenu.add(saveMenuItem);
    exitMenuItem = new JMenuItem("Exit");
    exitMenuItem.addActionListener(this);
    fileMenu.add(exitMenuItem);
    editMenu = new JMenu("Edit");
    cutMenuItem = new JMenuItem("Cut");
    cutMenuItem.addActionListener(this);
    editMenu.add(cutMenuItem);
    copyMenuItem = new JMenuItem("Copy");
    copyMenuItem.addActionListener(this);
    editMenu.add(copyMenuItem);
    pasteMenuItem = new JMenuItem("Paste");
    pasteMenuItem.addActionListener(this);
    editMenu.add(pasteMenuItem);
    deleteMenuItem = new JMenuItem("Delete");
    deleteMenuItem.addActionListener(this);
    editMenu.add(deleteMenuItem);
    menuBar.add(fileMenu);
    menuBar.add(editMenu);
    setJMenuBar(menuBar);

    setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object source = e.getSource();
    if (source == newMenuItem) {
      textArea.setText("");
    } else if (source == openMenuItem) {
      // TODO: Implement open file functionality
    } else if (source == saveMenuItem) {
      // TODO: Implement save file functionality
    } else if (source == exitMenuItem) {
      System.exit(0);
    } else if (source == cutMenuItem) {
      textArea.cut();
    } else if (source == copyMenuItem) {
      textArea.copy();
    } else if (source == pasteMenuItem) {
      textArea.paste();
    } else if (source == deleteMenuItem) {
      textArea.replaceSelection("");
    }
  }

  public static void main(String[] args) {
    new SimpleNotepad();
  }
}