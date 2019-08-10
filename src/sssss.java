import java.awt.EventQueue;
import java.io.IOException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class sssss {

	private JFrame frame;
	static String Llat=null;
	static String Llon=null;

	/**
	 * Launch the application.
	 */
	public static void Main(String lat, String lon) {
Llat=null;
Llon=null;
Llat=lat;
Llon=lon;
System.out.println(Llat);
System.out.println(Llon);


		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sssss window = new sssss();
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
	public sssss() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(800, 100, 1200, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel map = new JLabel("New label");
		GridBagConstraints gbc_map = new GridBagConstraints();
		gbc_map.gridheight = 9;
		gbc_map.gridwidth = 7;
		gbc_map.gridx = 0;
		gbc_map.gridy = 7;
		frame.getContentPane().add(map, gbc_map);


String destinationFile = "image.jpg";
try {
    String imageUrl = "http://maps.googleapis.com/maps/api/staticmap?zoom=18&size=800x800&markers="+Llat+","+Llon+"&sensor=true";
    URL url = new URL(imageUrl);
    frame.add( new JLabel( new ImageIcon( new ImageIcon(url).getImage().getScaledInstance( 630, 630, java.awt.Image.SCALE_SMOOTH ) ) ) );

    /* Second set to test if same map can display multiple markers */   

    frame.setVisible(true);
    frame.pack();
    } catch (IOException e) {
        e.printStackTrace();
    System.exit(1);
    }
	}

}
