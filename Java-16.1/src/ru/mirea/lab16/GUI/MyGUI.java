package ru.mirea.lab16.GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MyGUI extends JDialog {
    private JPanel rootPanel;
    private JTable table1;
    private JList list1;
    private JList list2;
    private JButton addButton;
    private JButton deleteButton;
    private JButton buttonOK;
    private JButton buttonCancel;
    private Object[] columnsHeader = new String[] {"Напиток", "Алкогольный?"};
    private DefaultTableModel tableModel;
    private final String[] dataList = { "Бакалея", "Напитки", "Хлеб"};
    private final String[] alcoholList = {"BEER", "WINE", "VODKA", "BRANDY", "CHAMPAGNE", "WHISKEY", "TEQUILA", "RUM", "VERMUTH", "LIQUOR", "JAGERMEISTER"};
    private final String[] noalcoholList = { "JUICE", "COFFEE", "GREEN_TEE", "BLACK_TEE", "MILK", "WATER", "SODA"};

    public MyGUI() {
        setContentPane(rootPanel);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        setVisible(true);

        buttonCancel = new JButton("Cancel");
        buttonCancel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                dispose();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        rootPanel.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        MyGUI dialog = new MyGUI();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    private void createUIComponents() {
        //настройка полей таблицы
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(columnsHeader);
        table1 = new JTable(tableModel);

        //все что связано со списками
        list1 = new JList<String>(dataList);
        list2 = new JList<String>();
        list1.addListSelectionListener(new listSelectionListener());
        list1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                // Получение элемента
                int selected = list1.locationToIndex(e.getPoint());
                if (selected == 0)
                    list2.setListData(alcoholList);
                if (selected == 1)
                    list2.setListData(noalcoholList);
            }
        });
        //--------------------------------------------------------------//
        //кнопка добавления
        addButton = new JButton("Add");
        addButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                // Получение элемента
                int sel1 = list1.getSelectedIndex();
                int sel2 = list2.getSelectedIndex();
                DefaultTableModel model = (DefaultTableModel) table1.getModel();
                if (sel1 == 0)
                {
                    Vector row = new Vector();
                    row.add(alcoholList[sel2]);
                    row.add("Yes");
                    model.addRow(row);
                    table1.setModel(model);
                }
                else
                {
                    Vector row = new Vector();
                    row.add(noalcoholList[sel2]);
                    row.add("No");
                    model.addRow(row);
                    table1.setModel(model);
                }
                table1.setModel(model);
            }
        });
        //--------------------------------------------------//
        //кнопка удаления
        deleteButton = new JButton("Delete");
        deleteButton.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                DefaultTableModel model = (DefaultTableModel) table1.getModel();
                model.removeRow(table1.getSelectedRow());
            }
        });
    }

    class listSelectionListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e) {
            // Выделенная строка
            int selected = ((JList<?>)e.getSource()).
                    getSelectedIndex();
        }
    }
}
