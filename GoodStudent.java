import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;


class JPanel011 extends JPanel{        // 1��° �г�
	JLabel lbl;
    
    public JPanel011() {        // 1��° �г� ������
        
        setLayout(null);
        
        JLabel lbl = new JLabel(new ImageIcon("./src/img/back.PNG"));
        lbl.setBounds(0,0,1530,700);
        add(lbl);
        
    }
}


class JPanel022 extends JPanel{        // 2��° �г�
	

	 
	 JComboBox Seat;       
	 String []n = {"�¼���","A","B","C","D","E","F","G","H","I","J","K","L","M","N"}; 
	 JComboBox Seat1;       
	 String []list = {"�����Ͻÿ�","1","2","3","4","5","6","7"}; 

    // Ŭ���� ��� �ʵ� ����

        JLabel labelName;
        
        JLabel labelemail;

        JLabel labelNumber;

        JLabel labelHobby;

        JLabel labelDate;

        JLabel labelticket;

            

        JTextField tfName;
        
        JTextField email;
        
        JTextField number;
          

        JRadioButton  [] RadioButton= new JRadioButton[5];

        JRadioButton checkA;

        JRadioButton checkB;

        JRadioButton checkC;
        
        JRadioButton checkD;
        
        JRadioButton checkE;

        String [] check = {"","","","",""};

            

        JComboBox comboxDate;       

        String []Datelist = {"6��23��","6��30��","7��7��"}; 

        

        JTextArea taticket;

        JButton buttonSave;
        
        JLabel lbl;
        


    public JPanel022() {         // 2��° �г� ������

    	setLayout(null);
        
        
        // �� ����

        labelName = new JLabel("��    ��:");

        labelName.setBounds(20,60,100,20);
        
        labelemail = new JLabel("�̸���:");

        labelemail.setBounds(20,110,100,20);

        labelNumber = new JLabel("��ȭ��ȣ:");

        labelNumber.setBounds(20,160,100,20);

        labelHobby = new JLabel("��    ��:");

        labelHobby.setBounds(20,210,100,20);

        labelDate = new JLabel("��    ¥:");

        labelDate.setBounds(20,260,100,20);

        labelticket = new JLabel("<Ƽ  ��>");

        labelticket.setBounds(1200,20,100,20);

            

        // �ؽ�Ʈ �ʵ�

        tfName = new JTextField();              // �̸� �Է� �κ�

        tfName.setBounds(100,60,200,20);   

        email = new JTextField();             //�̸��� �Է�

        email.setBounds(100,110,200,20);  	
        
        number = new JTextField();             //��ȭ��ȣ �Է�

        number.setBounds(100,160,200,20);
              

        // üũ�ڽ�

        ButtonGroup A = new ButtonGroup();

        RadioButton[0] = new JRadioButton("û�ҳ�(15%)");

        RadioButton[0] .setBounds(100,210,100,20);
        
        RadioButton[1] = new JRadioButton("����������(30%)");

        RadioButton[1] .setBounds(200,210,120,20);

        RadioButton[2]= new JRadioButton("�����(20%)"); 
        
        RadioButton[2].setBounds(100,230,100,20);

        RadioButton[3] = new JRadioButton("�����ֹ�(10%)");

        RadioButton[3].setBounds(200,230,120,20);
        
        RadioButton[4] = new JRadioButton("�ش� ���� ����");

        RadioButton[4].setBounds(100,190,120,20);


        A.add(RadioButton[0]);

        A.add(RadioButton[1]);

        A.add(RadioButton[2]);
        
        A.add(RadioButton[3]);
        
        A.add(RadioButton[4]);
        


            

        // �޺��ڽ�

        comboxDate = new JComboBox(Datelist);

        comboxDate.setBounds(100,260,80,20);
        
        Seat = new JComboBox(n);
        
        Seat.setBounds(600,350,80,20);
    
        Seat1 = new JComboBox(list);
        
        Seat1.setBounds(710,350,90,20);

        
        JLabel l = new JLabel("<����� �¼� ����>");
        
        l.setBounds(650,20,150,20);

        

        // �ؽ�Ʈ ����� , ��� ��ºκ�

        taticket = new JTextArea();

        taticket.setEditable(false);

        // JTextArea�� JScrollPane�� ��� ��ũ�ѹٰ� �����.

        JScrollPane scrollPane = new JScrollPane(taticket);

        scrollPane.setBounds(1050,50,350,500);

        

        // ��ư        

        buttonSave = new JButton("Ƽ�� ���");

        buttonSave.setBounds(650,500,100,40);

        buttonSave.addActionListener(new EventHandlerSave());   // ��ư ������ ���

        // �������� �����̳��� ���� ������Ʈ���� ���

        add(labelName);
        
        add(labelemail);

        add(labelNumber);

        add(labelHobby);

        add(labelDate);

        add(labelticket);

        add(tfName);
        
        add(email);
        
        add(number);

              

        add(RadioButton[0]);

        add(RadioButton[1]);

        add(RadioButton[2]);
        
        add(RadioButton[3]);
        
        add(RadioButton[4]);


        

        add(comboxDate);

        add(Seat);
        
        add(Seat1);
        
        add(l);
        
        

        add(scrollPane);

        add(buttonSave);
        
        //�̹�ġ �߰�
        JLabel lbl = new JLabel(new ImageIcon("./src/img/ground.PNG"));
        lbl.setBounds(450,0,500,400);
        add(lbl);
        
        
    }

    

    class EventHandlerSave implements ActionListener{     //��� ��ư�� ������ �ؽ�Ʈ �ʵ忡 ���
    	
    	
        public void actionPerformed(ActionEvent e){    

            

            // �ؽ�Ʈ �ʵ尪 ��������

            String a = tfName.getText();                 
            

            // üũ�ڽ� �� ��������

            if(RadioButton[0].isSelected())

                check[0] = "û�ҳ�(15% ����): 8,500��";

           else check[0] = "";

            if(RadioButton[1].isSelected())

                 check[1] = "����������(30% ����): 7,000��";

            else check[1] = "";

            if(RadioButton[2].isSelected())

                 check[2] = "�����(20% ����): 8,000��";
            
            else check[2] = "";

            if(RadioButton[3].isSelected())

                 check[3] = "�����ֹ�(10% ����): 9,000��";

            else check[3] = "";
            
            if(RadioButton[4].isSelected())

                check[4] = "10,000��";

           else check[4] = "";
            
             
            // �޺��ڽ� �� ��������

            String d = (String) comboxDate.getSelectedItem();
            String x = (String) Seat.getSelectedItem();
            String y = (String) Seat1.getSelectedItem();

            // TextArea �ʵ忡 ��� ���̱�
            taticket.append("\n");
            taticket.append("             * * * * * * * * * * * * * * * * * * * * * * * * * * *"+"\n");
            taticket.append("             _________________________________"+"\n");
            taticket.append("\n");
            taticket.append("\n");
            taticket.append("\n");
            taticket.append("                �̸� = " + a + "                       "+"\n");
            taticket.append("\n");
            taticket.append("\n");
            taticket.append("\n");
            taticket.append("\n");
            taticket.append("                ����� = " + check[0] + check[1]+check[2]+check[3]+check[4]+"    "+"\n");
            taticket.append("\n");
            taticket.append("\n");
            taticket.append("\n");
            taticket.append("\n");
            taticket.append("                ��¥ = " +d+"\n");
            taticket.append("\n");
            taticket.append("\n");
            taticket.append("\n");
            taticket.append("\n");
            taticket.append("                �¼� = " +x+y+"\n");  
            taticket.append("\n");
            taticket.append("\n");
            taticket.append("            * * * * * * * * * * * * * * * * * * * * * * * * * * *"+"\n");
            taticket.append("             _________________________________"+"\n");
            
            

        }    

    }     


}

 

 

public class GoodStudent extends JFrame{

   
	public JPanel011 jpanel01 = null;
    public JPanel022 jpanel02 = null;

    

    public static void main(String[] args) {

    	GoodStudent win = new GoodStudent();

        win.setTitle("��ź�����γ������� | ��Ƽ 18�й� ��ο�,�����,����ȯ,������");

       
        win.jpanel01 = new JPanel011();
        win.jpanel02 = new JPanel022();

        JTabbedPane jtab = new JTabbedPane();   //  JTabbedPane  ��ü ����

        jtab.addTab("���� ȭ��", win.jpanel01 );
        jtab.addTab("Ƽ�� ���", win.jpanel02 );

        win.add(jtab);

        

        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        win.setSize(1530,700);

        win.setVisible(true);    


    }

}