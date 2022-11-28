import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.HashMap;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class ListWork extends JFrame{
    JPanel panel1=new JPanel();
    private static HashMap<String, String> myHash = new HashMap<String, String>();
    public static void main(String[] args) {
        ListWork window= new ListWork("������ �� �������");
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setVisible(true);
        window.pack();
        window.setMinimumSize(window.getSize());
    }
    public ListWork(String s){
        super(s);
        myHash.put("������� �������","18 ������� �����");
        myHash.put("��������� �����","17 �����");
        myHash.put("������� ������","18 �����");
        myHash.put("������� �����","18 �����");
        myHash.put("����� �����","18 �����");
        myHash.put("�������� �����","18 ���������");
        DefaultListModel myListModel = new DefaultListModel();
        for (String key: myHash.keySet()) {
            myListModel.addElement(key);
        }
        final JList myList=new JList();
        JScrollPane myScroll = new JScrollPane(myList);
        myList.setModel(myListModel);
        Box myBox1=new Box(BoxLayout.Y_AXIS);
        final JTextField myText=new JTextField();
        myBox1.add(myText);
        Box box1=new Box(BoxLayout.X_AXIS);
        JButton button1=new JButton("�������� � ������");
        box1.add(button1);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = myText.getText();
                String[] words = data.split(";");
                myHash.put(words[0],words[1]);
                System.out.println(myHash);
                myListModel.addElement(words[0]);
            }
        });
        JButton button2=new JButton("������ �� ������");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                while (myListModel.contains(myText.getText())){
                    myListModel.removeElement(myText.getText());
                    }
                }
            });
        box1.add(button2);
        JButton buttonClear=new JButton("�������� ������");
        buttonClear.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                myListModel.clear();
                }
            });
        box1.add(buttonClear);
        myBox1.add(box1);
        add(myScroll,BorderLayout.CENTER);
        add(myBox1,BorderLayout.NORTH);

        Box myBox2=new Box(BoxLayout.X_AXIS);
        JButton button3=new JButton("���������...");
        myBox2.add(button3);
        final FileDialog fdlg=new FileDialog(this, "");
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fdlg.setMode(FileDialog.SAVE);
                fdlg.setTitle("��������� ����");
                fdlg.setVisible(true);
                FileWriter myWriter = null;
                try {
                    myWriter=new FileWriter(fdlg.getDirectory()+fdlg.getFile());
                    BufferedWriter myBWriter=new BufferedWriter(myWriter);
                    for(int i=0;i<myListModel.getSize();i++){
                        myBWriter.write(""+myListModel.getElementAt(i)+"; "+myHash.get(myListModel.getElementAt(i)));
                        myBWriter.newLine();
                    }
                    myBWriter.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }});

        myBox2.add(Box.createHorizontalGlue());
        JButton button4=new JButton("���������...");
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    fdlg.setMode(FileDialog.LOAD);
                    myListModel.clear();
                    fdlg.setTitle("��������� ����");
                    fdlg.setVisible(true);
                    FileReader myReader = null;
                    try{
                        File file=new File(fdlg.getDirectory()+fdlg.getFile());
                        FileReader fr=new FileReader(file);
                        BufferedReader reader=new BufferedReader(fr);
                        String line= reader.readLine();
                        while(line!=null){
                            String[] temp=line.split(";");
                            myHash.put(temp[0],temp[1]);
                            line=reader.readLine();
                        }
                    }
                    catch (FileNotFoundException es) {
                        es.printStackTrace();
                    }
                    catch (IOException ez) {
                        ez.printStackTrace();
                    }
                    for (String key: myHash.keySet()) {
                        myListModel.addElement(key);
                    }
                }
            });
            myBox2.add(button4);
            add(myBox2,BorderLayout.SOUTH);
        JLabel label2 = new JLabel("����������:");
        label2.setPreferredSize(new Dimension(250,10));
        Box centerBox=new Box(BoxLayout.X_AXIS);
        centerBox.add(myScroll);
        centerBox.add(label2);
        add(centerBox,BorderLayout.CENTER);
        myList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged (ListSelectionEvent e){
                JList tempList = (JList) e.getSource();
                label2.setText(myHash.get(myList.getSelectedValue().toString()));
                System.out.println();
            }
        });
        }
    public void ShowData( ){
    }
}