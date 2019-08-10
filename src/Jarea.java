 import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Label;
import java.awt.TextArea;
import javax.swing.JTextField;

public class Jarea {
	 ais Ais;
//	 HelloWorld hello=new HelloWorld(); Javascript map call

	  sssss ss =new sssss();
	
	private JFrame frame;
	JList<String> jtext;
	JTextPane binaryD;
	DefaultListModel<String> list=new DefaultListModel<>();
	private JTextField d7;
	private JTextField d8;
	private JTextField d9;
	private JTextField d11;
	private JTextField d12;
	private JTextField d13;
	private JTextField d14;
	private JTextField d15;
	private JTextField d16;
	private JTextField d17;
	private JTextField d6;
	private JTextField d4;
	private JTextField d3;
	private JTextField d2;
	private JTextField d1;
	private JTextField d5;
	private JTextField d10;
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	private JLabel l4;
	private JLabel l5;
	private JLabel l6;
	private JLabel l7;
	private JLabel l8;
	private JLabel l9;
	private JLabel l10;
	private JLabel l11;
	private JLabel l12;
	private JLabel l13;
	private JLabel l14;
	private JLabel l15;
	private JLabel l16;
	private JLabel l17;
	
	JScrollPane jsp;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jarea window = new Jarea();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Jarea() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnReadFile = new JButton("Read File");
		btnReadFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser=new JFileChooser();
				chooser.showOpenDialog(null);
				File f=chooser.getSelectedFile();
				String filename=f.getAbsolutePath();
				String j;
				int val;
				try {
					FileReader reader =new FileReader(filename);
					BufferedReader br=new BufferedReader(reader);
					list.removeAllElements();
					 j=br.readLine();
// model 1
//					 val=Integer.parseInt(j);
////					jtext.read(br, null);
//					for(int i=0; i<val; i++) 
//					{
//					String ss=br.readLine();
//					list.addElement(ss);
//					}
//					jtext.setModel(list);
//					br.close();
//					jtext.requestFocus();
					 while((j=br.readLine())!=null) {
						 list.addElement(j);
					 }
					 jtext.setModel(list);
				}
				catch(Exception e) 
				{
					JOptionPane.showMessageDialog(null,e);
				}
			jtext.addMouseListener( new MouseAdapter() {
				 public void mouseClicked(MouseEvent evt) {
					 	binaryD.setText(null);
					 	d1.setText(null);
					 	d2.setText(null);
					 	d3.setText(null);
					 	d4.setText(null);
					 	d5.setText(null);
					 	d6.setText(null);
					 	d7.setText(null);
					 	d8.setText(null);
					 	d9.setText(null);
					 	d10.setText(null);
					 	d11.setText(null);
					 	d12.setText(null);
					 	d13.setText(null);
					 	d14.setText(null);
					 	d15.setText(null);
					 	d16.setText(null);
					 	d17.setText(null);		
					 	l1.setText(null);
					 	l2.setText(null);
					 	l3.setText(null);
					 	l4.setText(null);
					 	l5.setText(null);
					 	l6.setText(null);
					 	l7.setText(null);
					 	l8.setText(null);
					 	l9.setText(null);
					 	l10.setText(null);
					 	l11.setText(null);
					 	l12.setText(null);
					 	l13.setText(null);
					 	l14.setText(null);
					 	l15.setText(null);
					 	l16.setText(null);
					 	l17.setText(null);
					 	
					 	
					 	
				        JList list = (JList)evt.getSource();		        
				        Ais =new ais();
				        Ais.aiSimple((String)list.getSelectedValue());
				        System.out.println(ais.userId);
				        System.out.println(Ais.DisplayBinary());
				        System.out.println((String)list.getSelectedValue());
				        binaryD.setText(Ais.DisplayBinary());
				   float Type=Float.parseFloat(Ais.messageType);
				      if(Type==1||Type==2|| Type==3) {

				    	  l1.setText("Message Type:");
				    	  l2.setText("Repeat Idicator:");
				    	  l3.setText("MMSI:");
				    	  l4.setText("Navigation Status:");
				    	  l5.setText("Rate of turn:");
				    	  l6.setText("Speed over ground:");
				    	  l7.setText("Position Occuracy:");
				    	  l8.setText("Longtitude:");
				    	  l9.setText("Latitude:");
				    	  l10.setText("Course over ground:");
				    	  l11.setText("True heading:");
				    	  l12.setText("Time stamp:");
				    	  l13.setText("Maneuver indicator:");
				    	  l14.setText("Spare:");
				    	  l15.setText("Raim flag:");
				    	  l16.setText("Radio status:");
				    	  l17.setText("Empty");


				    	  d1.setText(""+Ais.call(Ais.binary,0,6));
				    	  d2.setText(Ais.messageIndicator);								 	
				    	  d3.setText(Ais.userId);
				    	  d4.setText(Ais.navigationStatus);								 	
				    	  d5.setText(Ais.ROT);								 	
				    	  d6.setText(Ais.SOG);								 	
				    	  d10.setText(Ais.COG);								 	
				    	  d11.setText(Ais.HDG);								 	
				    	  d7.setText(Ais.positionAcuracy);								 	
				    	  d9.setText(Ais.lat);								 	
				    	  d8.setText(Ais.lon);								 	
				    	  d12.setText(Ais.timeStamp);
				    	  d13.setText(Ais.maneuverIndicator);
				    	  d14.setText(Ais.spare);
				    	  d15.setText(Ais.raimFlag);
				    	  d16.setText(Ais.radioStatus);
				    	  d17.setText("Empty");
				    	  ss.Main(""+Ais.lat,""+Ais.lon);
				    
				        	
								 	}
				      if(Type==4) {
				    	  l1.setText("Message Type:");
				    	  l2.setText("Repeat Idicator:");
				    	  l3.setText("MMSI:");
				    	  l4.setText("Year (UTC):");
				    	  l5.setText("Month (UTC):");
				    	  l6.setText("Day (UTC):");
				    	  l7.setText("Hour (UTC):");
				    	  l8.setText("Minute (UTC):");
				    	  l9.setText("Second (UTC):");
				    	  l10.setText("Fix quality:");
				    	  l11.setText("Longitude::");
				    	  l12.setText("Latitude:");
				    	  l13.setText("Type of EPFD:");
				    	  l14.setText("Spare:");
				    	  l15.setText("Raim flag:");
				    	  l16.setText("SOTDMA state:");
				    	  l17.setText("Empty");
				    	  d1.setText(""+Ais.call(Ais.binary,0,6));
				    	  d2.setText(""+Ais.call(Ais.binary,6,2));
				    	  d3.setText(""+Ais.call(Ais.binary,8,30));
				    	  d4.setText(""+Ais.call(Ais.binary,38,14));
				    	  d5.setText(""+Ais.call(Ais.binary,52,4));
				    	  d6.setText(""+Ais.call(Ais.binary,56,5));
				    	  d7.setText(""+Ais.call(Ais.binary,61,5));
				    	  d8.setText(""+Ais.call(Ais.binary,66,6));
				    	  d9.setText(""+Ais.call(Ais.binary,72,6));
				    	  d10.setText(""+Ais.call(Ais.binary,78,1));
				    	  d11.setText(""+Ais.convertStringToDecimal(Ais.binary,79,28)/600000);
				    	  d12.setText(""+Ais.convertStringToDecimal(Ais.binary,107,27)/600000);
				    	  d13.setText(""+Ais.call(Ais.binary,134,4));
				    	  d14.setText(""+Ais.call(Ais.binary,138,10));
				    	  d15.setText(""+Ais.call(Ais.binary,148,1));
				    	  d16.setText(""+Ais.call(Ais.binary,149,19));
				    	  d17.setText("Empty");
				    	  String llon=""+(Ais.convertStringToDecimal(Ais.binary,79,28)/600000);
				    	  String llat=""+(Ais.convertStringToDecimal(Ais.binary,107,27)/600000);
				    	  System.out.println(llat+" \n"+llon);
				    	  ss.Main(""+llat,""+llon);}  	  
			    	  if (Type==5) {
			    		  l1.setText("Message Type:");
				    	  l2.setText("Repeat Idicator:");
				    	  l3.setText("MMSI:");
				    	  l4.setText("AIS Version:");
				    	  l5.setText("IMO Number:");
				    	  l6.setText("Call Sign:");
				    	  l7.setText("Vessel Name:");
				    	  l8.setText("Ship Type:");
				    	  l9.setText("Dimention to Bow:");
				    	  l10.setText("Dimention to Stern:");
				    	  l11.setText("Dimention to Port:");
				    	  l12.setText("Dimention to Starboard:");
				    	  l13.setText("Position Fix Type:");
				    	  l14.setText("Draught:");
				    	  l15.setText("Destionation:");
				    	  l16.setText("DTE:");
				    	  l17.setText("Spare");
				    	  d1.setText(""+Ais.call(Ais.binary,0,6));
				    	  d2.setText(""+Ais.call(Ais.binary,6,2));
				    	  d3.setText(""+Ais.call(Ais.binary,8,30));
				    	  d4.setText(""+Ais.call(Ais.binary,38,2));
				    	  d5.setText(""+Ais.call(Ais.binary,40,30));
				    	  d6.setText(""+Ais.call(Ais.binary,70,42));
				    	  d7.setText(""+Ais.call(Ais.binary,112,120));
				    	  d8.setText(""+Ais.call(Ais.binary,232,8));
				    	  d9.setText(""+Ais.call(Ais.binary,240,9));
				    	  d10.setText(""+Ais.call(Ais.binary,249,9));
				    	  d11.setText(""+Ais.call(Ais.binary,258,6));
				    	  d12.setText(""+Ais.call(Ais.binary,264,6));
				    	  d13.setText(""+Ais.call(Ais.binary,270,4));
				    	  d14.setText(""+Ais.call(Ais.binary,294,301));
				    	  d15.setText(""+Ais.call(Ais.binary,302,421));
				    	  d16.setText(""+Ais.call(Ais.binary,422,1));
				    	  d17.setText(""+Ais.call(Ais.binary,423,1));    	
			    	  }
			    	  if (Type==6) {
			    		  l1.setText("Message Type:");
				    	  l2.setText("Repeat Idicator:");
				    	  l3.setText("MMSI:");
				    	  l4.setText("Sequence Number:");
				    	  l5.setText("Destination MMSI:");
				    	  l6.setText("Retransmit flag:");
				    	  l7.setText("Spare:");
				    	  l8.setText("Designated Area Code:");
				    	  l9.setText("Functional ID:");
				    	  l10.setText("Data:");
				    	  l11.setText("Empty");
				    	  l12.setText("Empty");
				    	  l13.setText("Empty");
				    	  l14.setText("Empty");
				    	  l15.setText("Empty");
				    	  l16.setText("Empty");
				    	  l17.setText("Empty");
				    	  d1.setText(""+Ais.call(Ais.binary,0,6));
				    	  d2.setText(""+Ais.call(Ais.binary,6,2));
				    	  d3.setText(""+Ais.call(Ais.binary,8,30));
				    	  d4.setText(""+Ais.call(Ais.binary,38,2));
				    	  d5.setText(""+Ais.call(Ais.binary,40,30));
				    	  d6.setText(""+Ais.call(Ais.binary,70,1));
				    	  d7.setText(""+Ais.call(Ais.binary,71,1));
				    	  d8.setText(""+Ais.call(Ais.binary,72,10));
				    	  d9.setText(""+Ais.call(Ais.binary,82,6));
				    	  d10.setText(""+Ais.call(Ais.binary,88,920));
				    	  d11.setText("Empty");
				    	  d12.setText("Empty");
				    	  d13.setText("Empty");
				    	  d14.setText("Empty");
				    	  d15.setText("Empty");
				    	  d16.setText("Empty");
				    	  d17.setText("Empty");   
				    	  String llat=""+(Ais.convertStringToDecimal(Ais.binary,0,27)/600000);
				    	  String llon=""+(Ais.convertStringToDecimal(Ais.binary,27,28)/600000);
				    	  ss.Main(""+llat,""+llon);
			    	  }

			    	  if (Type==7) {
			    		  l1.setText("Message Type:");
				    	  l2.setText("Repeat Idicator:");
				    	  l3.setText("MMSI:");
				    	  l4.setText("Spare:");
				    	  l5.setText("MMSI number 1:");
				    	  l6.setText("Sequence for MMSI 1:");
				    	  l7.setText("MMSI number 2:");
				    	  l8.setText("Sequence for MMSI 2:");
				    	  l9.setText("MMSI number 3:");
				    	  l10.setText("Sequence for MMSI 3:");
				    	  l11.setText("MMSI number 4");
				    	  l12.setText("Sequence for MMSI 4");
				    	  l13.setText("Empty");
				    	  l14.setText("Empty");
				    	  l15.setText("Empty");
				    	  l16.setText("Empty");
				    	  l17.setText("Empty");
				    	  d1.setText(""+Ais.call(Ais.binary,0,6));
				    	  d2.setText(""+Ais.call(Ais.binary,6,2));
				    	  d3.setText(""+Ais.call(Ais.binary,8,30));
				    	  d4.setText(""+Ais.call(Ais.binary,38,2));
				    	  d5.setText(""+Ais.call(Ais.binary,40,30));
				    	  d6.setText(""+Ais.call(Ais.binary,70,2));
				    	  d7.setText(""+Ais.call(Ais.binary,72,30));
				    	  d8.setText(""+Ais.call(Ais.binary,102,1));
				    	  d9.setText(""+Ais.call(Ais.binary,104,30));
				    	  d10.setText(""+Ais.call(Ais.binary,134,2));
				    	  d11.setText(""+Ais.call(Ais.binary,136,30));
				    	  d12.setText(""+Ais.call(Ais.binary,166,2));
				    	  d13.setText("Empty");
				    	  d14.setText("Empty");
				    	  d15.setText("Empty");
				    	  d16.setText("Empty");
				    	  d17.setText("Empty");    	
				    	 
			    	  }
			       	  if (Type==8) {
			    		  l1.setText("Message Type:");
				    	  l2.setText("Repeat Idicator:");
				    	  l3.setText("MMSI:");
				    	  l4.setText("Spare:");
				    	  l5.setText("Desighed Area Code:");
				    	  l6.setText("Functional ID:");
				    	  l7.setText("Data");
				    	  l8.setText("Empty");
				    	  l9.setText("Empty");
				    	  l10.setText("Empty");
				    	  l11.setText("Empty");
				    	  l12.setText("Empty");
				    	  l13.setText("Empty");
				    	  l14.setText("Empty");
				    	  l15.setText("Empty");
				    	  l16.setText("Empty");
				    	  l17.setText("Empty");
				    	  d1.setText(""+Ais.call(Ais.binary,0,6));
				    	  d2.setText(""+Ais.call(Ais.binary,6,2));
				    	  d3.setText(""+Ais.call(Ais.binary,8,30));
				    	  d4.setText(""+Ais.call(Ais.binary,38,2));
				    	  d5.setText(""+Ais.call(Ais.binary,40,10));
				    	  d6.setText(""+Ais.call(Ais.binary,50,6));
				    	  d7.setText(""+Ais.call(Ais.binary,56,952));
				    	  d8.setText("Empty");
				    	  d9.setText("Empty");
				    	  d10.setText("Empty");
				    	  d11.setText("Empty");
				    	  d12.setText("Empty");
				    	  d13.setText("Empty");
				    	  d14.setText("Empty");
				    	  d15.setText("Empty");
				    	  d16.setText("Empty");
				    	  d17.setText("Empty");    	
				    	  String llat=""+(Ais.convertStringToDecimal(Ais.binary,56,24)/600000);
				    	  String llon=""+(Ais.convertStringToDecimal(Ais.binary,80,25)/600000);
				    	  ss.Main(""+llat,""+llon);
			    	  }
			       	  if (Type==9) {
			    		  l1.setText("Message Type:");
				    	  l2.setText("Repeat Idicator:");
				    	  l3.setText("MMSI:");
				    	  l4.setText("Altitude:");
				    	  l5.setText("SOG:");
				    	  l6.setText("Position Accuracy:");
				    	  l7.setText("Longtitude:");
				    	  l8.setText("Latitude:");
				    	  l9.setText("Course over Ground:");
				    	  l10.setText("Time Stamp:");
				    	  l11.setText("Regional reserved:");
				    	  l12.setText("DTE:");
				    	  l13.setText("Spare:");
				    	  l14.setText("Assigned:");
				    	  l15.setText("Raif Flag:");
				    	  l16.setText("Radio status:");
				    	  l17.setText("Empty");
				    	  String llat=""+(Ais.convertStringToDecimal(Ais.binary,61,28)/600000);
				    	  String llon=""+(Ais.convertStringToDecimal(Ais.binary,89,27)/600000);
				    	  d1.setText(""+Ais.call(Ais.binary,0,6));
				    	  d2.setText(""+Ais.call(Ais.binary,6,2));
				    	  d3.setText(""+Ais.call(Ais.binary,8,30));
				    	  d4.setText(""+Ais.call(Ais.binary,38,12));
				    	  d5.setText(""+Ais.call(Ais.binary,50,10));
				    	  d6.setText(""+Ais.call(Ais.binary,60,1));
				    	  d7.setText(""+llat);
				    	  d8.setText(""+llon);
				    	  d9.setText(""+Ais.call(Ais.binary,116,12));
				    	  d10.setText(""+Ais.call(Ais.binary,128,6));
				    	  d11.setText(""+Ais.call(Ais.binary,134,8));
				    	  d12.setText(""+Ais.call(Ais.binary,142,1));
				    	  d13.setText(""+Ais.call(Ais.binary,143,3));
				    	  d14.setText(""+Ais.call(Ais.binary,146,1));
				    	  d15.setText(""+Ais.call(Ais.binary,147,1));
				    	  d16.setText(""+Ais.call(Ais.binary,148,20));
				    	  d17.setText("Empty");
				    	  
				    	  ss.Main(""+llat,""+llon);
			    	  }

			       	  if (Type==9) {
			    		  l1.setText("Message Type:");
				    	  l2.setText("Repeat Idicator:");
				    	  l3.setText("MMSI:");
				    	  l4.setText("Altitude:");
				    	  l5.setText("SOG:");
				    	  l6.setText("Position Accuracy:");
				    	  l7.setText("Longtitude:");
				    	  l8.setText("Latitude:");
				    	  l9.setText("Course over Ground:");
				    	  l10.setText("Time Stamp:");
				    	  l11.setText("Regional reserved:");
				    	  l12.setText("DTE:");
				    	  l13.setText("Spare:");
				    	  l14.setText("Assigned:");
				    	  l15.setText("Raif Flag:");
				    	  l16.setText("Radio status:");
				    	  l17.setText("Empty");
				    	  String llat=""+(Ais.convertStringToDecimal(Ais.binary,61,28)/600000);
				    	  String llon=""+(Ais.convertStringToDecimal(Ais.binary,89,27)/600000);
				    	  d1.setText(""+Ais.call(Ais.binary,0,6));
				    	  d2.setText(""+Ais.call(Ais.binary,6,2));
				    	  d3.setText(""+Ais.call(Ais.binary,8,30));
				    	  d4.setText(""+Ais.call(Ais.binary,38,12));
				    	  d5.setText(""+Ais.call(Ais.binary,50,10));
				    	  d6.setText(""+Ais.call(Ais.binary,60,1));
				    	  d7.setText(""+llat);
				    	  d8.setText(""+llon);
				    	  d9.setText(""+Ais.call(Ais.binary,116,12));
				    	  d10.setText(""+Ais.call(Ais.binary,128,6));
				    	  d11.setText(""+Ais.call(Ais.binary,134,8));
				    	  d12.setText(""+Ais.call(Ais.binary,142,1));
				    	  d13.setText(""+Ais.call(Ais.binary,143,3));
				    	  d14.setText(""+Ais.call(Ais.binary,146,1));
				    	  d15.setText(""+Ais.call(Ais.binary,147,1));
				    	  d16.setText(""+Ais.call(Ais.binary,148,20));
				    	  d17.setText("Empty");
				    	  
				    	  ss.Main(""+llat,""+llon);
			    	  }
			     	  if (Type==10) {
			    		  l1.setText("Message Type:");
				    	  l2.setText("Repeat Idicator:");
				    	  l3.setText("MMSI:");
				    	  l4.setText("Spare:");
				    	  l5.setText("Destination MMSI:");
				    	  l6.setText("Spare:");
				    	  l7.setText("Empty:");
				    	  l8.setText("Empty:"); 
				    	  l9.setText("Empty:");
				    	  l10.setText("Empty:");
				    	  l11.setText("Empty:");
				    	  l12.setText("Empty:");
				    	  l13.setText("Empty:");
				    	  l14.setText("Empty:");
				    	  l15.setText("Empty:");
				    	  l16.setText("Empty:");
				    	  l17.setText("Empty:");
				    	  d1.setText(""+Ais.call(Ais.binary,0,6));
				    	  d2.setText(""+Ais.call(Ais.binary,6,2));
				    	  d3.setText(""+Ais.call(Ais.binary,8,30));
				    	  d4.setText(""+Ais.call(Ais.binary,38,2));
				    	  d5.setText(""+Ais.call(Ais.binary,40,30));
				    	  d6.setText(""+Ais.call(Ais.binary,70,2));
				    	  d7.setText("Empty");
				    	  d8.setText("Empty");
				    	  d9.setText("Empty");
				    	  d10.setText("Empty");
				    	  d11.setText("Empty");
				    	  d12.setText("Empty");
				    	  d13.setText("Empty");
				    	  d14.setText("Empty");
				    	  d15.setText("Empty");
				    	  d16.setText("Empty");
				    	  d17.setText("Empty");
				    	  
			    	  }
			     	  if(Type==11) {
					    	  l1.setText("Message Type:");
					    	  l2.setText("Repeat Idicator:");
					    	  l3.setText("MMSI:");
					    	  l4.setText("Year (UTC):");
					    	  l5.setText("Month (UTC):");
					    	  l6.setText("Day (UTC):");
					    	  l7.setText("Hour (UTC):");
					    	  l8.setText("Minute (UTC):");
					    	  l9.setText("Second (UTC):");
					    	  l10.setText("Fix quality:");
					    	  l11.setText("Longitude::");
					    	  l12.setText("Latitude:");
					    	  l13.setText("Type of EPFD:");
					    	  l14.setText("Spare:");
					    	  l15.setText("Raim flag:");
					    	  l16.setText("SOTDMA state:");
					    	  l17.setText("Empty");
					    	  d1.setText(""+Ais.call(Ais.binary,0,6));
					    	  d2.setText(""+Ais.call(Ais.binary,6,2));
					    	  d3.setText(""+Ais.call(Ais.binary,8,30));
					    	  d4.setText(""+Ais.call(Ais.binary,38,14));
					    	  d5.setText(""+Ais.call(Ais.binary,52,4));
					    	  d6.setText(""+Ais.call(Ais.binary,56,5));
					    	  d7.setText(""+Ais.call(Ais.binary,61,5));
					    	  d8.setText(""+Ais.call(Ais.binary,66,6));
					    	  d9.setText(""+Ais.call(Ais.binary,72,6));
					    	  d10.setText(""+Ais.call(Ais.binary,78,1));
					    	  d11.setText(""+Ais.convertStringToDecimal(Ais.binary,79,28)/600000);
					    	  d12.setText(""+Ais.convertStringToDecimal(Ais.binary,107,27)/600000);
					    	  d13.setText(""+Ais.call(Ais.binary,134,4));
					    	  d14.setText(""+Ais.call(Ais.binary,138,10));
					    	  d15.setText(""+Ais.call(Ais.binary,148,1));
					    	  d16.setText(""+Ais.call(Ais.binary,149,19));
					    	  d17.setText("Empty");
					    	  String llon=""+(Ais.convertStringToDecimal(Ais.binary,79,28)/600000);
					    	  String llat=""+(Ais.convertStringToDecimal(Ais.binary,107,27)/600000);
					    	  System.out.println(llat+" \n"+llon);
					    	  ss.Main(""+llat,""+llon);}  	
			     	  if(Type==12) {
			     		 l1.setText("Message Type:");
				    	  l2.setText("Repeat Idicator:");
				    	  l3.setText("MMSI:");
				    	  l4.setText("Sequence number:");
				    	  l5.setText("Destination MMSI:");
				    	  l6.setText("Retransmit flag:");
				    	  l7.setText("Spear:");
				    	  l8.setText("Text:"); 
				    	  l9.setText("Empty:");
				    	  l10.setText("Empty:");
				    	  l11.setText("Empty:");
				    	  l12.setText("Empty:");
				    	  l13.setText("Empty:");
				    	  l14.setText("Empty:");
				    	  l15.setText("Empty:");
				    	  l16.setText("Empty:");
				    	  l17.setText("Empty:");
				    	  d1.setText(""+Ais.call(Ais.binary,0,6));
				    	  d2.setText(""+Ais.call(Ais.binary,6,2));
				    	  d3.setText(""+Ais.call(Ais.binary,8,30));
				    	  d4.setText(""+Ais.call(Ais.binary,38,2));
				    	  d5.setText(""+Ais.call(Ais.binary,40,30));
				    	  d6.setText(""+Ais.call(Ais.binary,70,1));
				    	  d7.setText(""+Ais.call(Ais.binary,71,1));
				    	  d8.setText(""+Ais.call(Ais.binary,72,936));
				    	  d9.setText("Empty");
				    	  d10.setText("Empty");
				    	  d11.setText("Empty");
				    	  d12.setText("Empty");
				    	  d13.setText("Empty");
				    	  d14.setText("Empty");
				    	  d15.setText("Empty");
				    	  d16.setText("Empty");
				    	  d17.setText("Empty");
			     	  }
			     	  if(Type==13)
			     	 {
			    		  l1.setText("Message Type:");
				    	  l2.setText("Repeat Idicator:");
				    	  l3.setText("MMSI:");
				    	  l4.setText("Spare:");
				    	  l5.setText("MMSI number 1:");
				    	  l6.setText("Sequence for MMSI 1:");
				    	  l7.setText("MMSI number 2:");
				    	  l8.setText("Sequence for MMSI 2:");
				    	  l9.setText("MMSI number 3:");
				    	  l10.setText("Sequence for MMSI 3:");
				    	  l11.setText("MMSI number 4");
				    	  l12.setText("Sequence for MMSI 4");
				    	  l13.setText("Empty");
				    	  l14.setText("Empty");
				    	  l15.setText("Empty");
				    	  l16.setText("Empty");
				    	  l17.setText("Empty");
				    	  d1.setText(""+Ais.call(Ais.binary,0,6));
				    	  d2.setText(""+Ais.call(Ais.binary,6,2));
				    	  d3.setText(""+Ais.call(Ais.binary,8,30));
				    	  d4.setText(""+Ais.call(Ais.binary,38,2));
				    	  d5.setText(""+Ais.call(Ais.binary,40,30));
				    	  d6.setText(""+Ais.call(Ais.binary,70,2));
				    	  d7.setText(""+Ais.call(Ais.binary,72,30));
				    	  d8.setText(""+Ais.call(Ais.binary,102,1));
				    	  d9.setText(""+Ais.call(Ais.binary,104,30));
				    	  d10.setText(""+Ais.call(Ais.binary,134,2));
				    	  d11.setText(""+Ais.call(Ais.binary,136,30));
				    	  d12.setText(""+Ais.call(Ais.binary,166,2));
				    	  d13.setText("Empty");
				    	  d14.setText("Empty");
				    	  d15.setText("Empty");
				    	  d16.setText("Empty");
				    	  d17.setText("Empty");    	
				    	 
			    	  }
			     	
			     	  

				      
				      
		      	
				      
				     
				 
				 
				 }
				});
			}
		});
		btnReadFile.setBounds(10, 11, 380, 33);
		frame.getContentPane().add(btnReadFile);
		
		jtext = new JList<String>();
		jtext.setBounds(10, 55, 380, 595);
//		frame.getContentPane().add(jtext);
		jsp=new JScrollPane(jtext,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jsp.setBounds(10, 55, 380, 595);
		frame.getContentPane().add(jsp);
		
		binaryD = new JTextPane();
		binaryD.setEditable(false);
		binaryD.setBounds(400, 470, 263, 180);
		frame.getContentPane().add(binaryD);
		
		l2 = new JLabel(" ");
		l2.setBounds(400, 56, 88, 14);
		frame.getContentPane().add(l2);
		
		l3 = new JLabel(" ");
		l3.setBounds(400, 81, 125, 14);
		frame.getContentPane().add(l3);
		
		l4 = new JLabel(" ");
		l4.setBounds(400, 106, 88, 14);
		frame.getContentPane().add(l4);
		
		l5 = new JLabel(" ");
		l5.setBounds(400, 131, 104, 14);
		frame.getContentPane().add(l5);
		
		l6 = new JLabel(" ");
		l6.setBounds(400, 156, 104, 14);
		frame.getContentPane().add(l6);
		
		l7 = new JLabel(" ");
		l7.setBounds(400, 181, 137, 14);
		frame.getContentPane().add(l7);
		
		l8 = new JLabel(" ");
		l8.setBounds(400, 206, 130, 14);
		frame.getContentPane().add(l8);
		
		l9 = new JLabel(" ");
		l9.setBounds(400, 231, 130, 14);
		frame.getContentPane().add(l9);
		
		l10 = new JLabel(" ");
		l10.setBounds(400, 256, 104, 14);
		frame.getContentPane().add(l10);
		
		l11 = new JLabel(" ");
		l11.setBounds(400, 281, 88, 14);
		frame.getContentPane().add(l11);
		
		l12 = new JLabel(" ");
		l12.setBounds(400, 306, 88, 14);
		frame.getContentPane().add(l12);
		
		l13 = new JLabel(" ");
		l13.setBounds(400, 331, 88, 14);
		frame.getContentPane().add(l13);
		
		l14 = new JLabel(" ");
		l14.setBounds(400, 356, 125, 14);
		frame.getContentPane().add(l14);
		
		l15 = new JLabel(" ");
		l15.setBounds(400, 381, 88, 14);
		frame.getContentPane().add(l15);
		
		l16 = new JLabel(" ");
		l16.setBounds(400, 406, 88, 14);
		frame.getContentPane().add(l16);
		
		l17 = new JLabel(" ");
		l17.setBounds(400, 431, 88, 14);
		frame.getContentPane().add(l17);
		
		l1 = new JLabel(" ");
		l1.setBounds(400, 35, 88, 14);
		frame.getContentPane().add(l1);

		d7 = new JTextField();
		d7.setColumns(27);
		d7.setBounds(535, 178, 123, 20);
		frame.getContentPane().add(d7);
		
		d8 = new JTextField();
		d8.setColumns(27);
		d8.setBounds(535, 206, 123, 20);
		frame.getContentPane().add(d8);
		
		d9 = new JTextField();
		d9.setColumns(27);
		d9.setBounds(535, 228, 123, 20);
		frame.getContentPane().add(d9);
		
		d10 = new JTextField();
		d10.setColumns(27);
		d10.setBounds(535, 253, 123, 20);
		frame.getContentPane().add(d10);
		
		d11 = new JTextField();
		d11.setColumns(27);
		d11.setBounds(535, 278, 123, 20);
		frame.getContentPane().add(d11);
		
		d12 = new JTextField();
		d12.setColumns(27);
		d12.setBounds(535, 303, 123, 20);
		frame.getContentPane().add(d12);
		


		d13 = new JTextField();
		d13.setColumns(27);
		d13.setBounds(535, 328, 123, 20);
		frame.getContentPane().add(d13);
		
		d14 = new JTextField();
		d14.setColumns(27);
		d14.setBounds(535, 353, 123, 20);
		frame.getContentPane().add(d14);
		
		d15 = new JTextField();
		d15.setColumns(27);
		d15.setBounds(535, 378, 123, 20);
		frame.getContentPane().add(d15);
		
		d16 = new JTextField();
		d16.setColumns(27);
		d16.setBounds(535, 403, 123, 20);
		frame.getContentPane().add(d16);
		
		d17 = new JTextField();
		d17.setColumns(27);
		d17.setBounds(535, 428, 123, 20);
		frame.getContentPane().add(d17);
		
		d6 = new JTextField();
		d6.setColumns(27);
		d6.setBounds(535, 153, 123, 20);
		frame.getContentPane().add(d6);
		
	    d5 = new JTextField();
		d5.setColumns(27);
		d5.setBounds(535, 128, 123, 20);
		frame.getContentPane().add(d5);
		
		d4 = new JTextField();
		d4.setColumns(27);
		d4.setBounds(535, 103, 123, 20);
		frame.getContentPane().add(d4);
		
		d3 = new JTextField();
		d3.setColumns(27);
		d3.setBounds(535, 78, 123, 20);
		frame.getContentPane().add(d3);
		
		d2 = new JTextField();
		d2.setColumns(27);
		d2.setBounds(535, 53, 123, 20);
		frame.getContentPane().add(d2);
		
		d1 = new JTextField();
		d1.setColumns(27);
		d1.setBounds(535, 32, 123, 20);
		frame.getContentPane().add(d1);
		
		
	}
}
