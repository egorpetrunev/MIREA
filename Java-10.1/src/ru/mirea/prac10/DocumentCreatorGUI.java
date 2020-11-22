package ru.mirea.prac10;

import javax.swing.*;
import java.awt.*;

public class DocumentCreatorGUI extends JFrame {

    IDocument document;
    IDocumentFactory factory;

    public DocumentCreatorGUI(){

        setLayout(new BorderLayout());

        JMenuBar bar = new JMenuBar();
        bar.add(createMenu());
        setJMenuBar(bar);

        pack();
        setVisible(true);
    }

    private JMenu createMenu(){
        JMenu menu = new JMenu("File");

        JMenuItem newFile = new JMenuItem("New");
        JMenuItem openFile = new JMenuItem("Open");
        JMenuItem saveFile = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");

        newFile.addActionListener(e -> {
            factory = new TextDocumentFactory();
            document = factory.createNew("text");
        });

        openFile.addActionListener(e -> {
            factory = new TextDocumentFactory();
            document = factory.createOpen("text");
        });

        menu.add(newFile);
        menu.add(openFile);
        menu.add(saveFile);
        menu.add(exit);

        return menu;
    }
}
