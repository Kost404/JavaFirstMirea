package ru.mirea.task15;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Countries {
    JFrame frame = new JFrame("Countries");
    String[] cs = new String[]{"Japan", "China", "England", "Russia"};
    JComboBox box = new JComboBox(cs);
    JTextArea text = new JTextArea();
    Countries() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        text.setLineWrap(true);
        c.fill = GridBagConstraints.NONE;
        c.insets = new Insets(20, 10, 0, 0);
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        c.weightx = 0.0001;
        c.weighty = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        frame.add(box, c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(0, 30, 0, 30);
        c.gridx=0;
        c.weightx = 1.0;
        c.gridy = 1;
        frame.add(text, c);
        box.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (box.getSelectedIndex()) {
                    case 0: text.setText("В 250 году яёй сменился периодом Кофун, во время которого получила распространение культура курганов, а в районе Ямато появилось одноимённое японское государство."); break;
                    case 1: text.setText("Китай – густонаселенная страна в Восточной Азии с разнообразными ландшафтами и рельефом. Здесь можно найти луга, пустыни, горы, озера, реки и побережья протяженностью более 14 тыс. км. Столица страны, Пекин, славится современной архитектурой и древними памятниками, среди которых дворцовый комплекс Запретный город и площадь Тяньаньмэнь"); break;
                    case 2: text.setText("Англия — место происхождения английского языка и Англиканской церкви, а английское законодательство формирует основу юридических систем многих стран мира; кроме того, Лондон был центром Британской империи, а страна — местом возникновения Промышленной революции.."); break;
                    case 3: text.setText("Российская Федерация (Россия) — государство, расположенное в Евразии — в восточной части Европы и северной части Азии. ... Относится к крупнейшим государствам"); break;
                }
            }
        });
        frame.setSize(new Dimension(500, 300));
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Countries();
    }
}

