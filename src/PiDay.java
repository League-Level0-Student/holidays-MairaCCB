import java.net.URI;

import javax.swing.JOptionPane;

public class PiDay {
	public static void main(String[] args) {
		String Pi = "3.1415926535";
		// for (int d = 0; d < 4; d++) {
		// System.out.print(Pi.charAt(d));
		// }
		for (int m = 0; m < Pi.length(); m++) {
			String p = JOptionPane.showInputDialog("What is the next digit of pi?");
			String v = Character.toString(Pi.charAt(m));
			if (p.equals(v)) {
				JOptionPane.showMessageDialog(null, "Great job! Now try and guess the next number.");
			} else {
				JOptionPane.showMessageDialog(null, "NO PIE FOR YOU!!!");
				System.exit(0);
			}
		}
		playVideo("https://www.youtube.com/watch?v=6TPjRoWm8Ck");
	}
	
	static void playVideo(String videoURL) {
	     try {
	          URI uri = new URI(videoURL);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
