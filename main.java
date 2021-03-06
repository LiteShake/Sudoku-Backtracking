/*  
 * BACKTRACKING SUDOKU SOLVER
 * CREATED BY TEAM 6 
 * YEAR 1 ; SEMESTER 2 ; 
 * COURSE - DATA STRUCTURES AND ALGORITHMS
 * DEPT - CSE - AIE  
 */

 // IMPORTING REQUIRED MODULES
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class main {
    
    public static void main(String[] args) {
        
        // CREATING NEW UI OBJECT
        new UI() ;        
    }
}

// CUSTOM GAMEBUTTON WITH EXTRA PROPERTY buttonID 
// buttonID IS A UNIQUE ID FOR ALL THE BUTTONS IN THIS PROJECT SO THAT
// WE CAN FIND AN MANAGE BUTTONS USING THIS BUTTONS IN THE CODE
class GameButton extends JButton {

    String buttonID ;
    int value ;
}

// NEW UI CLASS FOR GUI WHICH INHERITS THE javax.swing.JFrame CLASS 
// AND IMPLEMENTS ACTIONLISTENER CLASS TO RECORD BUTTONCLICKS 
class UI extends JFrame implements ActionListener {

    // region INTIALIZING CONSTANTS

    int sudo_array[][] = new int[9][9] ;

    GameButton currentSelectedButton ;
   
    GameButton buttons[] ;
    GameButton button11 ,button12 ,button13 ,button14 ,button15 ,button16 ,button17 ,button18 ,button19 ;
    GameButton button21 ,button22 ,button23 ,button24 ,button25 ,button26 ,button27 ,button28 ,button29 ;
    GameButton button31 ,button32 ,button33 ,button34 ,button35 ,button36 ,button37 ,button38 ,button39 ;
    GameButton button41 ,button42 ,button43 ,button44 ,button45 ,button46 ,button47 ,button48 ,button49 ;
    GameButton button51 ,button52 ,button53 ,button54 ,button55 ,button56 ,button57 ,button58 ,button59 ;
    GameButton button61 ,button62 ,button63 ,button64 ,button65 ,button66 ,button67 ,button68 ,button69 ;
    GameButton button71 ,button72 ,button73 ,button74 ,button75 ,button76 ,button77 ,button78 ,button79 ;
    GameButton button81 ,button82 ,button83 ,button84 ,button85 ,button86 ,button87 ,button88 ,button89 ;
    GameButton button91 ,button92 ,button93 ,button94 ,button95 ,button96 ,button97 ,button98 ,button99 ;

    JTextField gameLog, textField ;

    GameButton buttonIN, buttonSL, buttonGN, buttonRS, buttonEX ;

    JComboBox comboBox ;

    JLabel c00 ;
    JLabel c01 ;
    JLabel c10 ;
    JLabel c11 ;
    JLabel theme ;
    JLabel out_label ;

    String themes[] = { "Cutie", "Charcoal", "Nuke", "Ocean", "Vector", "Lemon" } ;

    // endregion

    // UI CLASS CONSTRUCTOR
    UI() {
        
        c00 = new JLabel("(0,0)");
        c00.setBounds(20,20, 30, 30);
        c01 = new JLabel("(8,0)");
        c01.setBounds(500,20, 30, 30);
        c10 = new JLabel("(0,8)");
        c10.setBounds(20,500, 30, 30);
        c11 = new JLabel("(8,8)");
        c11.setBounds(500,500, 30, 30);

        theme = new JLabel("Theme :");
        theme.setBounds(10,0, 50, 30);

        comboBox = new JComboBox<>( themes ) ;
        comboBox.setBounds(70,5 , 100, 20);
        comboBox.addActionListener(this);

        // region INIT BUTTONS

        // INITIALIZING ALL THE BUTTONS  
        // AUTO GENERATED CODE
        // refer "Assets/codeGenerator.ipynb" for code
        button11 = new GameButton() ; button11.setBounds(50, 50, 50, 50 ); button11.setBackground(new Color( 0xffffff )); button11.addActionListener( this ); button11.buttonID = "11" ;
        button12 = new GameButton() ; button12.setBounds(50, 100, 50, 50); button12.setBackground(new Color( 0xffffff )); button12.addActionListener( this ); button12.buttonID = "12" ;
        button13 = new GameButton() ; button13.setBounds(50, 150, 50, 50); button13.setBackground(new Color( 0xffffff )); button13.addActionListener( this ); button13.buttonID = "13" ;
        button14 = new GameButton() ; button14.setBounds(50, 200, 50, 50); button14.setBackground(new Color( 0xeeeeee )); button14.addActionListener( this ); button14.buttonID = "14" ;
        button15 = new GameButton() ; button15.setBounds(50, 250, 50, 50); button15.setBackground(new Color( 0xeeeeee )); button15.addActionListener( this ); button15.buttonID = "15" ;
        button16 = new GameButton() ; button16.setBounds(50, 300, 50, 50); button16.setBackground(new Color( 0xeeeeee )); button16.addActionListener( this ); button16.buttonID = "16" ;
        button17 = new GameButton() ; button17.setBounds(50, 350, 50, 50); button17.setBackground(new Color( 0xffffff )); button17.addActionListener( this ); button17.buttonID = "17" ;
        button18 = new GameButton() ; button18.setBounds(50, 400, 50, 50); button18.setBackground(new Color( 0xffffff )); button18.addActionListener( this ); button18.buttonID = "18" ;
        button19 = new GameButton() ; button19.setBounds(50, 450, 50, 50); button19.setBackground(new Color( 0xffffff )); button19.addActionListener( this ); button19.buttonID = "19" ;
     
        button21 = new GameButton() ; button21.setBounds(100, 50, 50, 50) ; button21.setBackground(new Color( 0xffffff )); button21.addActionListener( this ); button21.buttonID = "21" ;
        button22 = new GameButton() ; button22.setBounds(100, 100, 50, 50); button22.setBackground(new Color( 0xffffff )); button22.addActionListener( this ); button22.buttonID = "22" ;
        button23 = new GameButton() ; button23.setBounds(100, 150, 50, 50); button23.setBackground(new Color( 0xffffff )); button23.addActionListener( this ); button23.buttonID = "23" ;
        button24 = new GameButton() ; button24.setBounds(100, 200, 50, 50); button24.setBackground(new Color( 0xeeeeee )); button24.addActionListener( this ); button24.buttonID = "24" ;
        button25 = new GameButton() ; button25.setBounds(100, 250, 50, 50); button25.setBackground(new Color( 0xeeeeee )); button25.addActionListener( this ); button25.buttonID = "25" ;
        button26 = new GameButton() ; button26.setBounds(100, 300, 50, 50); button26.setBackground(new Color( 0xeeeeee )); button26.addActionListener( this ); button26.buttonID = "26" ;
        button27 = new GameButton() ; button27.setBounds(100, 350, 50, 50); button27.setBackground(new Color( 0xffffff )); button27.addActionListener( this ); button27.buttonID = "27" ;
        button28 = new GameButton() ; button28.setBounds(100, 400, 50, 50); button28.setBackground(new Color( 0xffffff )); button28.addActionListener( this ); button28.buttonID = "28" ;
        button29 = new GameButton() ; button29.setBounds(100, 450, 50, 50); button29.setBackground(new Color( 0xffffff )); button29.addActionListener( this ); button29.buttonID = "29" ;
     
        button31 = new GameButton() ; button31.setBounds(150, 50, 50, 50) ; button31.setBackground(new Color( 0xffffff )); button31.addActionListener( this ); button31.buttonID = "31" ;
        button32 = new GameButton() ; button32.setBounds(150, 100, 50, 50); button32.setBackground(new Color( 0xffffff )); button32.addActionListener( this ); button32.buttonID = "32" ;
        button33 = new GameButton() ; button33.setBounds(150, 150, 50, 50); button33.setBackground(new Color( 0xffffff )); button33.addActionListener( this ); button33.buttonID = "33" ;
        button34 = new GameButton() ; button34.setBounds(150, 200, 50, 50); button34.setBackground(new Color( 0xeeeeee )); button34.addActionListener( this ); button34.buttonID = "34" ;
        button35 = new GameButton() ; button35.setBounds(150, 250, 50, 50); button35.setBackground(new Color( 0xeeeeee )); button35.addActionListener( this ); button35.buttonID = "35" ;
        button36 = new GameButton() ; button36.setBounds(150, 300, 50, 50); button36.setBackground(new Color( 0xeeeeee )); button36.addActionListener( this ); button36.buttonID = "36" ;
        button37 = new GameButton() ; button37.setBounds(150, 350, 50, 50); button37.setBackground(new Color( 0xffffff )); button37.addActionListener( this ); button37.buttonID = "37" ;
        button38 = new GameButton() ; button38.setBounds(150, 400, 50, 50); button38.setBackground(new Color( 0xffffff )); button38.addActionListener( this ); button38.buttonID = "38" ;
        button39 = new GameButton() ; button39.setBounds(150, 450, 50, 50); button39.setBackground(new Color( 0xffffff )); button39.addActionListener( this ); button39.buttonID = "39" ;
     
        button41 = new GameButton() ; button41.setBounds(200, 50, 50, 50) ; button41.setBackground(new Color( 0xeeeeee )); button41.addActionListener( this ); button41.buttonID = "41" ;
        button42 = new GameButton() ; button42.setBounds(200, 100, 50, 50); button42.setBackground(new Color( 0xeeeeee )); button42.addActionListener( this ); button42.buttonID = "42" ;
        button43 = new GameButton() ; button43.setBounds(200, 150, 50, 50); button43.setBackground(new Color( 0xeeeeee )); button43.addActionListener( this ); button43.buttonID = "43" ;
        button44 = new GameButton() ; button44.setBounds(200, 200, 50, 50); button44.setBackground(new Color( 0xffffff )); button44.addActionListener( this ); button44.buttonID = "44" ;
        button45 = new GameButton() ; button45.setBounds(200, 250, 50, 50); button45.setBackground(new Color( 0xffffff )); button45.addActionListener( this ); button45.buttonID = "45" ;
        button46 = new GameButton() ; button46.setBounds(200, 300, 50, 50); button46.setBackground(new Color( 0xffffff )); button46.addActionListener( this ); button46.buttonID = "46" ;
        button47 = new GameButton() ; button47.setBounds(200, 350, 50, 50); button47.setBackground(new Color( 0xeeeeee )); button47.addActionListener( this ); button47.buttonID = "47" ;
        button48 = new GameButton() ; button48.setBounds(200, 400, 50, 50); button48.setBackground(new Color( 0xeeeeee )); button48.addActionListener( this ); button48.buttonID = "48" ;
        button49 = new GameButton() ; button49.setBounds(200, 450, 50, 50); button49.setBackground(new Color( 0xeeeeee )); button49.addActionListener( this ); button49.buttonID = "49" ;
     
        button51 = new GameButton() ; button51.setBounds(250, 50, 50, 50) ; button51.setBackground(new Color( 0xeeeeee )); button51.addActionListener( this ); button51.buttonID = "51" ;
        button52 = new GameButton() ; button52.setBounds(250, 100, 50, 50); button52.setBackground(new Color( 0xeeeeee )); button52.addActionListener( this ); button52.buttonID = "52" ;
        button53 = new GameButton() ; button53.setBounds(250, 150, 50, 50); button53.setBackground(new Color( 0xeeeeee )); button53.addActionListener( this ); button53.buttonID = "53" ;
        button54 = new GameButton() ; button54.setBounds(250, 200, 50, 50); button54.setBackground(new Color( 0xffffff )); button54.addActionListener( this ); button54.buttonID = "54" ;
        button55 = new GameButton() ; button55.setBounds(250, 250, 50, 50); button55.setBackground(new Color( 0xffffff )); button55.addActionListener( this ); button55.buttonID = "55" ;
        button56 = new GameButton() ; button56.setBounds(250, 300, 50, 50); button56.setBackground(new Color( 0xffffff )); button56.addActionListener( this ); button56.buttonID = "56" ;
        button57 = new GameButton() ; button57.setBounds(250, 350, 50, 50); button57.setBackground(new Color( 0xeeeeee )); button57.addActionListener( this ); button57.buttonID = "57" ;
        button58 = new GameButton() ; button58.setBounds(250, 400, 50, 50); button58.setBackground(new Color( 0xeeeeee )); button58.addActionListener( this ); button58.buttonID = "58" ;
        button59 = new GameButton() ; button59.setBounds(250, 450, 50, 50); button59.setBackground(new Color( 0xeeeeee )); button59.addActionListener( this ); button59.buttonID = "59" ;
     
        button61 = new GameButton() ; button61.setBounds(300, 50, 50, 50) ; button61.setBackground(new Color( 0xeeeeee )); button61.addActionListener( this ); button61.buttonID = "61" ;
        button62 = new GameButton() ; button62.setBounds(300, 100, 50, 50); button62.setBackground(new Color( 0xeeeeee )); button62.addActionListener( this ); button62.buttonID = "62" ;
        button63 = new GameButton() ; button63.setBounds(300, 150, 50, 50); button63.setBackground(new Color( 0xeeeeee )); button63.addActionListener( this ); button63.buttonID = "63" ;
        button64 = new GameButton() ; button64.setBounds(300, 200, 50, 50); button64.setBackground(new Color( 0xffffff )); button64.addActionListener( this ); button64.buttonID = "64" ;
        button65 = new GameButton() ; button65.setBounds(300, 250, 50, 50); button65.setBackground(new Color( 0xffffff )); button65.addActionListener( this ); button65.buttonID = "65" ;
        button66 = new GameButton() ; button66.setBounds(300, 300, 50, 50); button66.setBackground(new Color( 0xffffff )); button66.addActionListener( this ); button66.buttonID = "66" ;
        button67 = new GameButton() ; button67.setBounds(300, 350, 50, 50); button67.setBackground(new Color( 0xeeeeee )); button67.addActionListener( this ); button67.buttonID = "67" ;
        button68 = new GameButton() ; button68.setBounds(300, 400, 50, 50); button68.setBackground(new Color( 0xeeeeee )); button68.addActionListener( this ); button68.buttonID = "68" ;
        button69 = new GameButton() ; button69.setBounds(300, 450, 50, 50); button69.setBackground(new Color( 0xeeeeee )); button69.addActionListener( this ); button69.buttonID = "69" ;
     
        button71 = new GameButton() ; button71.setBounds(350, 50, 50, 50) ; button71.setBackground(new Color( 0xffffff )); button71.addActionListener( this ); button71.buttonID = "71" ;
        button72 = new GameButton() ; button72.setBounds(350, 100, 50, 50); button72.setBackground(new Color( 0xffffff )); button72.addActionListener( this ); button72.buttonID = "72" ;
        button73 = new GameButton() ; button73.setBounds(350, 150, 50, 50); button73.setBackground(new Color( 0xffffff )); button73.addActionListener( this ); button73.buttonID = "73" ;
        button74 = new GameButton() ; button74.setBounds(350, 200, 50, 50); button74.setBackground(new Color( 0xeeeeee )); button74.addActionListener( this ); button74.buttonID = "74" ;
        button75 = new GameButton() ; button75.setBounds(350, 250, 50, 50); button75.setBackground(new Color( 0xeeeeee )); button75.addActionListener( this ); button75.buttonID = "75" ;
        button76 = new GameButton() ; button76.setBounds(350, 300, 50, 50); button76.setBackground(new Color( 0xeeeeee )); button76.addActionListener( this ); button76.buttonID = "76" ;
        button77 = new GameButton() ; button77.setBounds(350, 350, 50, 50); button77.setBackground(new Color( 0xffffff )); button77.addActionListener( this ); button77.buttonID = "77" ;
        button78 = new GameButton() ; button78.setBounds(350, 400, 50, 50); button78.setBackground(new Color( 0xffffff )); button78.addActionListener( this ); button78.buttonID = "78" ;
        button79 = new GameButton() ; button79.setBounds(350, 450, 50, 50); button79.setBackground(new Color( 0xffffff )); button79.addActionListener( this ); button79.buttonID = "79" ;
     
        button81 = new GameButton() ; button81.setBounds(400, 50, 50, 50) ; button81.setBackground(new Color( 0xffffff )); button81.addActionListener( this ); button81.buttonID = "81" ;
        button82 = new GameButton() ; button82.setBounds(400, 100, 50, 50); button82.setBackground(new Color( 0xffffff )); button82.addActionListener( this ); button82.buttonID = "82" ;
        button83 = new GameButton() ; button83.setBounds(400, 150, 50, 50); button83.setBackground(new Color( 0xffffff )); button83.addActionListener( this ); button83.buttonID = "83" ;
        button84 = new GameButton() ; button84.setBounds(400, 200, 50, 50); button84.setBackground(new Color( 0xeeeeee )); button84.addActionListener( this ); button84.buttonID = "84" ;
        button85 = new GameButton() ; button85.setBounds(400, 250, 50, 50); button85.setBackground(new Color( 0xeeeeee )); button85.addActionListener( this ); button85.buttonID = "85" ;
        button86 = new GameButton() ; button86.setBounds(400, 300, 50, 50); button86.setBackground(new Color( 0xeeeeee )); button86.addActionListener( this ); button86.buttonID = "86" ;
        button87 = new GameButton() ; button87.setBounds(400, 350, 50, 50); button87.setBackground(new Color( 0xffffff )); button87.addActionListener( this ); button87.buttonID = "87" ;
        button88 = new GameButton() ; button88.setBounds(400, 400, 50, 50); button88.setBackground(new Color( 0xffffff )); button88.addActionListener( this ); button88.buttonID = "88" ;
        button89 = new GameButton() ; button89.setBounds(400, 450, 50, 50); button89.setBackground(new Color( 0xffffff )); button89.addActionListener( this ); button89.buttonID = "89" ;
     
        button91 = new GameButton() ; button91.setBounds(450, 50, 50, 50); button91.setBackground(new Color( 0xffffff )); button91.addActionListener( this ); button91.buttonID = "91" ;
        button92 = new GameButton() ; button92.setBounds(450, 100, 50, 50); button92.setBackground(new Color( 0xffffff )); button92.addActionListener( this ); button92.buttonID = "92" ;
        button93 = new GameButton() ; button93.setBounds(450, 150, 50, 50); button93.setBackground(new Color( 0xffffff )); button93.addActionListener( this ); button93.buttonID = "93" ;
        button94 = new GameButton() ; button94.setBounds(450, 200, 50, 50); button94.setBackground(new Color( 0xeeeeee )); button94.addActionListener( this ); button94.buttonID = "94" ;
        button95 = new GameButton() ; button95.setBounds(450, 250, 50, 50); button95.setBackground(new Color( 0xeeeeee )); button95.addActionListener( this ); button95.buttonID = "95" ;
        button96 = new GameButton() ; button96.setBounds(450, 300, 50, 50); button96.setBackground(new Color( 0xeeeeee )); button96.addActionListener( this ); button96.buttonID = "96" ;
        button97 = new GameButton() ; button97.setBounds(450, 350, 50, 50); button97.setBackground(new Color( 0xffffff )); button97.addActionListener( this ); button97.buttonID = "97" ;
        button98 = new GameButton() ; button98.setBounds(450, 400, 50, 50); button98.setBackground(new Color( 0xffffff )); button98.addActionListener( this ); button98.buttonID = "98" ;
        button99 = new GameButton() ; button99.setBounds(450, 450, 50, 50); button99.setBackground(new Color( 0xffffff )); button99.addActionListener( this ); button99.buttonID = "99" ;
     
        buttons = new GameButton[] {
            button11 ,button12 ,button13 ,button14 ,button15 ,button16 ,button17 ,button18 ,button19 ,
            button21 ,button22 ,button23 ,button24 ,button25 ,button26 ,button27 ,button28 ,button29 ,
            button31 ,button32 ,button33 ,button34 ,button35 ,button36 ,button37 ,button38 ,button39 ,
            button41 ,button42 ,button43 ,button44 ,button45 ,button46 ,button47 ,button48 ,button49 ,
            button51 ,button52 ,button53 ,button54 ,button55 ,button56 ,button57 ,button58 ,button59 ,
            button61 ,button62 ,button63 ,button64 ,button65 ,button66 ,button67 ,button68 ,button69 ,
            button71 ,button72 ,button73 ,button74 ,button75 ,button76 ,button77 ,button78 ,button79 ,
            button81 ,button82 ,button83 ,button84 ,button85 ,button86 ,button87 ,button88 ,button89 ,
            button91 ,button92 ,button93 ,button94 ,button95 ,button96 ,button97 ,button98 ,button99 } ;

        // endregion
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        
        textField = new JTextField() ;        
        textField.setBounds(240,550, 160,30);  
        
        gameLog = new JTextField() ;        
        gameLog.setBounds(110,720, 292,40);  

        SetCurrentLog( " " );
        currentSelectedButton = null ;

        out_label = new JLabel("Game Log");
        out_label.setBounds(220,690, 280,40);

        buttonIN = new GameButton() ; buttonIN.setBounds(110, 550, 80, 30); buttonIN.setBackground(Color.WHITE); buttonIN.addActionListener( this ); buttonIN.buttonID = "IN" ;
        buttonSL = new GameButton() ; buttonSL.setBounds(110, 600, 80, 30); buttonSL.setBackground(Color.WHITE); buttonSL.addActionListener( this ); buttonSL.buttonID = "SLV" ;
        buttonGN = new GameButton() ; buttonGN.setBounds(240, 600, 160, 30); buttonGN.setBackground(Color.WHITE); buttonGN.addActionListener( this ); buttonGN.buttonID = "GEN" ;
        
        buttonRS = new GameButton() ; buttonRS.setBounds(110, 650, 80, 30); buttonRS.setBackground(Color.WHITE); buttonRS.addActionListener( this ); buttonRS.buttonID = "RES" ;
        buttonEX = new GameButton() ; buttonEX.setBounds(240, 650, 160, 30); buttonEX.setBackground(Color.WHITE); buttonEX.addActionListener( this ); buttonEX.buttonID = "EXIT" ;

        this.setTitle("Sudoku Sudoku Sudoku Sudoku !");
        this.setSize(570,850);
        this.setVisible(true);
        
        buttonIN.setText("Input");
        buttonSL.setText("Solve");
        buttonGN.setText("Generate");
        buttonRS.setText("Reset");
        buttonEX.setText("Give up");

        try {
            
            ImageIcon ico = new ImageIcon( "./Assets/icons8-pastime-64.png" ) ;
            this.setIconImage( ico.getImage() );
        }

        catch( Exception err ) { SetCurrentLog( "Icon not found : (" ); }
            
        // region ADD ELEMENTS

        // ADDING ALL THE BUTTONS TO THE GUI 
        // refer "Assets/codeGenerator.ipynb" for code
        this.add(c00) ;this.add(c01) ;this.add(c10) ;this.add(c11) ;this.add( theme ) ;
        
        this.add( buttonIN ) ;this.add( buttonGN ) ;this.add( buttonSL ) ;this.add( buttonRS ) ;this.add( buttonEX ) ;
        this.add( button11 ) ;this.add( button12 ) ;this.add( button13 ) ;this.add( button14 ) ;this.add( button15 ) ;this.add( button16 ) ;this.add( button17 ) ;this.add( button18 ) ;this.add( button19 ) ;
        this.add( button21 ) ;this.add( button22 ) ;this.add( button23 ) ;this.add( button24 ) ;this.add( button25 ) ;this.add( button26 ) ;this.add( button27 ) ;this.add( button28 ) ;this.add( button29 ) ;
        this.add( button31 ) ;this.add( button32 ) ;this.add( button33 ) ;this.add( button34 ) ;this.add( button35 ) ;this.add( button36 ) ;this.add( button37 ) ;this.add( button38 ) ;this.add( button39 ) ;
        this.add( button41 ) ;this.add( button42 ) ;this.add( button43 ) ;this.add( button44 ) ;this.add( button45 ) ;this.add( button46 ) ;this.add( button47 ) ;this.add( button48 ) ;this.add( button49 ) ;
        this.add( button51 ) ;this.add( button52 ) ;this.add( button53 ) ;this.add( button54 ) ;this.add( button55 ) ;this.add( button56 ) ;this.add( button57 ) ;this.add( button58 ) ;this.add( button59 ) ;
        this.add( button61 ) ;this.add( button62 ) ;this.add( button63 ) ;this.add( button64 ) ;this.add( button65 ) ;this.add( button66 ) ;this.add( button67 ) ;this.add( button68 ) ;this.add( button69 ) ;
        this.add( button71 ) ;this.add( button72 ) ;this.add( button73 ) ;this.add( button74 ) ;this.add( button75 ) ;this.add( button76 ) ;this.add( button77 ) ;this.add( button78 ) ;this.add( button79 ) ;
        this.add( button81 ) ;this.add( button82 ) ;this.add( button83 ) ;this.add( button84 ) ;this.add( button85 ) ;this.add( button86 ) ;this.add( button87 ) ;this.add( button88 ) ;this.add( button89 ) ;
        this.add( button91 ) ;this.add( button92 ) ;this.add( button93 ) ;this.add( button94 ) ;this.add( button95 ) ;this.add( button96 ) ;this.add( button97 ) ;this.add( button98 ) ;this.add( button99 ) ;
        
        SetTheme( themes[comboBox.getSelectedIndex()] );

        this.add( comboBox ) ;
        this.add( out_label ) ;
        this.add( textField ) ;
        this.add( gameLog ) ;

        // endregion
    }

    // IF ANY GUI INTERATION = THIS FUNCTION FIRES
    public void actionPerformed( ActionEvent event ) {

        if( event.getSource() == comboBox ) {   
            //System.out.println("event fired");
            SetTheme( themes[comboBox.getSelectedIndex()] );
            SetCurrentLog( "change theme to \"" + themes[comboBox.getSelectedIndex()] + "\"" );
            
            return ;
        } 

        GameButton event_source ;
        try { event_source = (GameButton) event.getSource() ; }
        catch( Exception err ) { return ; }

        if ( event_source.buttonID == "IN" ) {

            String input = textField.getText() ;
            int number ;

            try {

                number =  Integer.parseInt( input.strip() ) ;

                if( number == 0 ) { SetButtonValue(currentSelectedButton.buttonID , number ); }
                
                // LIMITING INPUT NUMBERS ONLY BETWEEN 1 AND 9
                if( number > 9 || number < 1 ) {

                    SetCurrentLog( "Only numbers from 1 to 9 is allowed in sudoku" );
                    return ;
                }

                SetButtonValue(currentSelectedButton.buttonID , number );

                return ;
            }

            catch( Exception err ) {

                SetCurrentLog( "Parsing error" );
                System.out.println( Arrays.toString( err.getStackTrace() ) ) ;
                
            }
        }

        if( event_source.buttonID == "RES" ) { 
            
            for (int i = 0; i < sudo_array.length; i++) {
            
                for (int j = 0; j < sudo_array.length; j++) {
                    
                    sudo_array[i][j] = 0 ;
                }
            }
            DisplayBoard();
            Sync();
            SetCurrentLog( "Reset" );

            return ;
        }

        if ( event_source.buttonID == "GEN" ) {

            sudo_array = new int[][] {
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
            };
            //DisplayBoard();
            Sync();

            SetCurrentLog("Generate testing board");
            
            return ;
        }

        if( event_source.buttonID == "EXIT" ) { System.exit( 0 ); }
        
        if ( event_source.buttonID == "SLV" ) {
            
            DisplayBoard();
            SetCurrentLog( "Solve board" );

            int N = sudo_array.length;
 
            if (SolveSudoku(sudo_array, N))
            {

                Sync() ;
                // print solution
                DisplayBoard();
                return ;
            }
            else {
                
                System.out.println("No solution");
                SetCurrentLog("No Solution, Recheck board ?");
                return ;
            }
        }

        // System.out.println( event_source.buttonID );

        try {

            if ( currentSelectedButton != event_source ) {

                int coord ;

                coord = Integer.parseInt( event_source.buttonID ) ; 
                
                currentSelectedButton = event_source ;
                SetCurrentLog( "select " + currentSelectedButton.buttonID );
            }

            else if ( GetCurrentLog().split(" ")[0] == "select" ) {
            
                if( currentSelectedButton.buttonID == GetCurrentLog().split(" ")[1] 
                && event_source.buttonID == currentSelectedButton.buttonID ) {
    
                    currentSelectedButton = null ;
                    SetCurrentLog( "deselect " + event_source.buttonID ) ;
                }
            }
        }

        catch( Exception err ) { 
            
            SetCurrentLog( "Error" ); 
            System.out.println( Arrays.toString( err.getStackTrace() ) ) ;
        } 
        
    }

    // UPDATE GUI FONT COLORS TO THEME RELATED COLORS ACCORDING TO THE THEME SELECTED
    // fgColor, FOREGROUND COLOR IS FOR THE BUTTONS 
    // bgColor, BACKGROUND COLOR IS FOR THE TEXT THAT IS ON THE JLabels OUTSIDE THE BUTTONS
    void UpdateGUI( Color fgColor , Color bgColor) {

        for (GameButton gameButton : buttons) {
            
            gameButton.setForeground( fgColor );
        }
       
        buttonIN.setForeground( fgColor ) ;
        buttonSL.setForeground( fgColor ) ;
        buttonGN.setForeground( fgColor ) ;
        buttonRS.setForeground( fgColor ) ;
        buttonEX.setForeground( fgColor ) ;

        gameLog.setForeground( fgColor );
        comboBox.setForeground( fgColor );
        textField.setForeground( fgColor );

        c00.setForeground(bgColor);
        c01.setForeground(bgColor);
        c10.setForeground(bgColor);
        c11.setForeground(bgColor);
        theme.setForeground(bgColor);
        out_label.setForeground(bgColor);
    }

    // SET THEME METHOD SETS THEME TO A SPECIFIC THEME FROM A CONSTANT ARRAY "themes" 
    // WHICH IS BASICALLY SWITCHING BACKGROUND COLORS 
    void SetTheme( String theme ) {

        // SWITCH CASE FOR THEME CHANGING
        // WHERE "0xRRGGBB" IS RGB HEX CODE FOR COLORS
        switch (theme) {
            case "Charcoal" : // DARK THEME
                
                this.getContentPane().setBackground( new Color( 0x424242 ) );
                UpdateGUI(  new Color( 0x424242 ) , new Color( 0xffffff ) ) ;
                break;
            
            case "Nuke" :   // LIGHT THEME
                
                this.getContentPane().setBackground( new Color( 0xffffff ) );
                UpdateGUI(  new Color( 0x111111 ), new Color( 0x111111 )  );
                break;
            
            case "Ocean" :  // BLUE THEME
                
                this.getContentPane().setBackground( new Color( 0x21cbff ) );
                UpdateGUI(  new Color( 0x21cbff ) , new Color( 0xffffff ) );
                break;

            case "Cutie" :  // PINK THEME
    
                this.getContentPane().setBackground( new Color( 0xff6bbf ) );
                UpdateGUI(  new Color( 0xff6bbf ) , new Color( 0xffffff ) );
                break;

            case "Vector" : // ORANGE THEME
                
                this.getContentPane().setBackground( new Color( 0xff7452 ) );
                UpdateGUI(  new Color( 0xff7452 ) , new Color( 0xffffff ) );
                break;

            case "Lemon" :  // YELLOW THEME
                
                this.getContentPane().setBackground( new Color( 0xd7ff52 ) );
                UpdateGUI(  new Color( 0x111111 ) , new Color( 0x111111 ) );
                break;

            default:
                break;
        }
    }

    // SYNC FUNCTION SYNCS BUTTONS WITH ARRAY
    // SYNC METHOD SYNCS BETWEEN GUI AND MAIN ARRAY sudo_array 
    void Sync() {

        for (int i = 11; i <= 99; i++) {
            
            int y = Integer.parseInt( Character.toString(Integer.toString(i).toCharArray() [0]) ) ;
            int x = Integer.parseInt( Character.toString(Integer.toString(i).toCharArray() [1]) ) ;

            System.out.print( x - 1 );System.out.print( "  " );System.out.print( y - 1  );

            if( i % 10 == 0 ) { continue ; }
            // System.out.print( x ); System.out.print("   ");System.out.print( y );
            
            int val = sudo_array[ x - 1 ][ y - 1 ]  ;

            if( val == 0 ) { 
                
                GetGameButtonWithTag( Integer.toString( (int) i ) ).setText( null ) ;
                continue ; 
            }

            GetGameButtonWithTag( Integer.toString( (int) i ) ).setText( Integer.toString( val ) ) ;
        }
    }

    // GET CURRENT LOG GETS THE CURRENT GAME LOG THAT IS BEING DISPLAYED IN THE LOG FIELD
    String GetCurrentLog( ) { 

        return gameLog.getText() ;
    }

    // SETLOG METHOD SETS GAME LOG TO A STRING SO THAT THE THING IS DISPALYED IN THE LOG FIELD 
    void SetCurrentLog( String log ) { 
        
        gameLog.setText( null );
        gameLog.setText( log ); 
    }

    // GET BUTTON WITH TAG RETURNS THE BUTTON WITH ITS UNIQUE ID
    GameButton GetGameButtonWithTag ( String tag  ) {
           
        int id = Integer.parseInt(tag) ;
        
        for (GameButton gameButton : buttons) {
            
            if (  Integer.parseInt(gameButton.buttonID) == id ) {

                return gameButton ;
            }
        }
        return null ;
    }

    // GET BUTTON VALUE RETURNS THE VALUE OF A BUTTON WITH A SPECIFIC UNIQUE ID 
    int GetButtonValue( String tag ) {

        return GetGameButtonWithTag( tag ).value ;
    }

    // DISPLAY 2D INT BOARD ARRAY sudo_board IN CONSOLE
    void DisplayBoard( ) {

        for (int[] row : sudo_array) {
            
            System.out.println( Arrays.toString( row ) );
        }
    }

    // SET BUTTON VALUE FINDS A BUTTON WITH ITS UNIQUE TAG 
    // AND SETS THE BUTTON VALUE AND SPRITE TO THE INPUT VALUE FROM THE INPUT FIELD
    void SetButtonValue( String tag, int value ) {

        try {

            String valStr ;

            if( value != 0 ) { valStr = Integer.toString( value ) ; } 
            else { valStr = null ; }

            GetGameButtonWithTag( tag ).setText( valStr );
            GetGameButtonWithTag( tag ).value = value ;

            int x , y ;

            // DERIVE X AND Y COORDINATES OF A VALUE IN THE ARRAY FROM THE BUTTON UID
            
            y = Integer.parseInt( Character.toString( tag.toCharArray() [0]) ) ;
            x = Integer.parseInt( Character.toString( tag.toCharArray() [1]) ) ;

            sudo_array[x - 1][y - 1] = value ;

            SetCurrentLog( "Edited button " + tag + " " + valStr );

            DisplayBoard();
        }

        catch( Exception err ) {

            SetCurrentLog( "Error" );
        }
    }

    // IS SAFE CHECKS IF A NUMBER IS IN A 3X3 BOX, ROW OR COLUMN AND RETURNS TRUE IF SAFE AND FALSE IF NOT SAFE
    public static boolean isSafe(int[][] board, int row, int col, int num ) {
        
        // Row has the unique (row-clash)
        for (int d = 0; d < board.length; d++)
        {
             
            // CHECK ROW FOR THE SAME NUMBER
            if (board[row][d] == num) {
                return false;
            }
        }
 
        // CHECKING COLUMN FOR THE SAME NUMBER 
        for (int r = 0; r < board.length; r++)
        {
             
            if (board[r][col] == num)
            {
                return false;
            }
        }
        
        // CHECK 3x3 BOX FOR THE SAME NUMBER 
        int sq_root = (int)Math.sqrt(board.length);
        int boxRowStart = row - row % sq_root;
        int boxColStart = col - col % sq_root;
 
        for (int r = boxRowStart;
             r < boxRowStart + sq_root; r++)
        {
            for (int d = boxColStart;
                 d < boxColStart + sq_root; d++)
            {
                if (board[r][d] == num)
                {
                    return false;
                }
            }
        }
 
        
        return true;
    }
    
    // SOLVESUDOKU SOLVES SUDOKU USING RECURSIVE BACKTRACKING ALGORITHM
    // IT ESSENTIALLY PLACES A NUMBER AND CHECKS IF ITS SAFE AND THEN PLACES ANOTHER AND AGAIN AND AGAIN
    // IF UNSAFE IT GOES TO NEXT INDEX
    // IF THERES NO NEXT INDEX IT BACKTRACKS TO PREVIOUS LEVEL AND MOVES THAT TO NEXT INDEX AND SO ON
    public boolean SolveSudoku( int[][] board, int n )
    {
        int row = -1;
        int col = -1;
        boolean isEmpty = true;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (board[i][j] == 0)
                {
                    row = i;
                    col = j;

                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty) {
                break;
            }
        }
 
        if (isEmpty)
        {
            return true;
        }

        for (int num = 1; num <= n; num++)
        {
            if (isSafe(board, row, col, num))
            {
                board[row][col] = num;
                if (SolveSudoku(board, n))
                {
                    
                    return true;
                }
                else
                {
                    
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }
}