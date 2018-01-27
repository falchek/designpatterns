package virtualproxy.imageproxy;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImageProxy implements Icon {

	ImageIcon imageIcon;
	URL imageUrl;
	Thread retrievalThread;
	boolean retrieving = false;
	
	public ImageProxy(URL url) {
		imageUrl = url;
	}
	
	
	
	@Override
	public int getIconHeight() {
		if (imageIcon != null) {
			return imageIcon.getIconWidth();  
		}
		else
			return 800;
	}

	@Override
	public int getIconWidth() {
		if (imageIcon != null) {
			return imageIcon.getIconHeight();  
		}
		else
			return 600;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		if (imageIcon != null) {
			imageIcon.paintIcon(c, g, x, y);
		} else {
			g.drawString("Loading CD Cover, please wait...", x+300, y+190);
			if (!retrieving){
				retrieving = true;
				retrievalThread = new Thread(new Runnable() {
					public void run() {
						try {
							imageIcon = new ImageIcon(imageUrl, "CD Cover");
							c.repaint(); 
						}catch(Exception e){
							e.printStackTrace();
						}
					}
				});
				retrievalThread.start(); 
			}
		}

	}

}
