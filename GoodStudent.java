import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;


class JPanel011 extends JPanel{        // 1번째 패널
	JLabel lbl;
    
    public JPanel011() {        // 1번째 패널 생성자
        
        setLayout(null);
        
        JLabel lbl = new JLabel(new ImageIcon("./src/img/back.PNG"));
        lbl.setBounds(0,0,1530,700);
        add(lbl);
        
    }
}


class JPanel022 extends JPanel{        // 2번째 패널
	

	 
	 JComboBox Seat;       
	 String []n = {"좌석을","A","B","C","D","E","F","G","H","I","J","K","L","M","N"}; 
	 JComboBox Seat1;       
	 String []list = {"선택하시오","1","2","3","4","5","6","7"}; 

    // 클래스 멤버 필드 설정

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

        String []Datelist = {"6월23일","6월30일","7월7일"}; 

        

        JTextArea taticket;

        JButton buttonSave;
        
        JLabel lbl;
        


    public JPanel022() {         // 2번째 패널 생성자

    	setLayout(null);
        
        
        // 라벨 설정

        labelName = new JLabel("이    름:");

        labelName.setBounds(20,60,100,20);
        
        labelemail = new JLabel("이메일:");

        labelemail.setBounds(20,110,100,20);

        labelNumber = new JLabel("전화번호:");

        labelNumber.setBounds(20,160,100,20);

        labelHobby = new JLabel("혜    택:");

        labelHobby.setBounds(20,210,100,20);

        labelDate = new JLabel("날    짜:");

        labelDate.setBounds(20,260,100,20);

        labelticket = new JLabel("<티  켓>");

        labelticket.setBounds(1200,20,100,20);

            

        // 텍스트 필드

        tfName = new JTextField();              // 이름 입력 부분

        tfName.setBounds(100,60,200,20);   

        email = new JTextField();             //이메일 입력

        email.setBounds(100,110,200,20);  	
        
        number = new JTextField();             //전화번호 입력

        number.setBounds(100,160,200,20);
              

        // 체크박스

        ButtonGroup A = new ButtonGroup();

        RadioButton[0] = new JRadioButton("청소년(15%)");

        RadioButton[0] .setBounds(100,210,100,20);
        
        RadioButton[1] = new JRadioButton("국가유공자(30%)");

        RadioButton[1] .setBounds(200,210,120,20);

        RadioButton[2]= new JRadioButton("시즌권(20%)"); 
        
        RadioButton[2].setBounds(100,230,100,20);

        RadioButton[3] = new JRadioButton("지역주민(10%)");

        RadioButton[3].setBounds(200,230,120,20);
        
        RadioButton[4] = new JRadioButton("해당 사항 없음");

        RadioButton[4].setBounds(100,190,120,20);


        A.add(RadioButton[0]);

        A.add(RadioButton[1]);

        A.add(RadioButton[2]);
        
        A.add(RadioButton[3]);
        
        A.add(RadioButton[4]);
        


            

        // 콤보박스

        comboxDate = new JComboBox(Datelist);

        comboxDate.setBounds(100,260,80,20);
        
        Seat = new JComboBox(n);
        
        Seat.setBounds(600,350,80,20);
    
        Seat1 = new JComboBox(list);
        
        Seat1.setBounds(710,350,90,20);

        
        JLabel l = new JLabel("<경기장 좌석 선택>");
        
        l.setBounds(650,20,150,20);

        

        // 텍스트 에어리어 , 결과 출력부분

        taticket = new JTextArea();

        taticket.setEditable(false);

        // JTextArea는 JScrollPane를 써야 스크롤바가 생긴다.

        JScrollPane scrollPane = new JScrollPane(taticket);

        scrollPane.setBounds(1050,50,350,500);

        

        // 버튼        

        buttonSave = new JButton("티켓 출력");

        buttonSave.setBounds(650,500,100,40);

        buttonSave.addActionListener(new EventHandlerSave());   // 버튼 리스너 등록

        // 프레임의 컨테이너의 각종 컴포넌트들을 등록

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
        
        //이미치 추가
        JLabel lbl = new JLabel(new ImageIcon("./src/img/ground.PNG"));
        lbl.setBounds(450,0,500,400);
        add(lbl);
        
        
    }

    

    class EventHandlerSave implements ActionListener{     //출력 버튼을 누르면 텍스트 필드에 출력
    	
    	
        public void actionPerformed(ActionEvent e){    

            

            // 텍스트 필드값 가져오기

            String a = tfName.getText();                 
            

            // 체크박스 값 가져오기

            if(RadioButton[0].isSelected())

                check[0] = "청소년(15% 할인): 8,500원";

           else check[0] = "";

            if(RadioButton[1].isSelected())

                 check[1] = "국가유공자(30% 할인): 7,000원";

            else check[1] = "";

            if(RadioButton[2].isSelected())

                 check[2] = "시즌권(20% 할인): 8,000원";
            
            else check[2] = "";

            if(RadioButton[3].isSelected())

                 check[3] = "지역주민(10% 할인): 9,000원";

            else check[3] = "";
            
            if(RadioButton[4].isSelected())

                check[4] = "10,000원";

           else check[4] = "";
            
             
            // 콤보박스 값 가져오기

            String d = (String) comboxDate.getSelectedItem();
            String x = (String) Seat.getSelectedItem();
            String y = (String) Seat1.getSelectedItem();

            // TextArea 필드에 출력 보이기
            taticket.append("\n");
            taticket.append("             * * * * * * * * * * * * * * * * * * * * * * * * * * *"+"\n");
            taticket.append("             _________________________________"+"\n");
            taticket.append("\n");
            taticket.append("\n");
            taticket.append("\n");
            taticket.append("                이름 = " + a + "                       "+"\n");
            taticket.append("\n");
            taticket.append("\n");
            taticket.append("\n");
            taticket.append("\n");
            taticket.append("                입장료 = " + check[0] + check[1]+check[2]+check[3]+check[4]+"    "+"\n");
            taticket.append("\n");
            taticket.append("\n");
            taticket.append("\n");
            taticket.append("\n");
            taticket.append("                날짜 = " +d+"\n");
            taticket.append("\n");
            taticket.append("\n");
            taticket.append("\n");
            taticket.append("\n");
            taticket.append("                좌석 = " +x+y+"\n");  
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

        win.setTitle("감탄이절로나오는조 | 멀티 18학번 김두원,김수민,정종환,조성훈");

       
        win.jpanel01 = new JPanel011();
        win.jpanel02 = new JPanel022();

        JTabbedPane jtab = new JTabbedPane();   //  JTabbedPane  객체 생성

        jtab.addTab("메인 화면", win.jpanel01 );
        jtab.addTab("티켓 출력", win.jpanel02 );

        win.add(jtab);

        

        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        win.setSize(1530,700);

        win.setVisible(true);    


    }

}