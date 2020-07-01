import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JPanel;


public class MainFormAppearance {

   public JPanel createContentPane() throws IOException  {
		//Создаем панель для размещения компонентов
		
		JPanel totalGUI = new JPanel();
		totalGUI.setLayout(null);
		
		//Создадим ярлык
		
		JLabel blueLabel = new JLabel("Какая то надпись =)");
		blueLabel.setLocation(10,10); //Надпись синего цвета
		blueLabel.setSize(300,100); // Размер области надписи
		blueLabel.setHorizontalAlignment(0);
		
		//Создаем кнопку
		JButton redButton = new JButton("Название кнопки 1 :))");
		redButton.setLocation(120,200);
		redButton.setSize(200,50);
		
		//Создаем обработчик события.
	    ActionListener BtnAct = new ActListin();
	    //Назначаем обработчик кнопке.
	    redButton.addActionListener(BtnAct);
	    totalGUI.add(redButton);

	        
	       BufferedImage image = ImageIO.read(new File("src/descim.jpg"));
	       Graphics g2 = image.getGraphics();
	       g2.drawImage(image, 0, 0, null);
	       g2.drawLine(50, 50, 100, 100);

	    
	    return totalGUI;
	    

		
		
		
	}


   public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	}

}