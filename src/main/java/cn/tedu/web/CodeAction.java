package cn.tedu.web;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Controller;
@Controller
public class CodeAction {
	public InputStream png;
	public String execute(){
		BufferedImage img=new BufferedImage(
				100,38,BufferedImage.TYPE_3BYTE_BGR);
		System.out.println(1);
		for (int x = 0; x < img.getWidth(); x++) {
			for (int y = 0; y < img.getHeight(); y++) {
				int color=(int)(Math.random()*0xffffff);
				img.setRGB(x, y, color);		
			}
	    }
		System.out.println(2);
		Graphics2D g=img.createGraphics();
		int color=(int)(Math.random()*0xffffff);
		g.setColor(new Color(color));
		Font font=new Font(Font.SANS_SERIF,Font.BOLD,30);
		g.setFont(font);
		g.drawString("3415", 10, 30);
		System.out.println(3);
		for (int i = 0; i < 5; i++) {
			int c=(int)(Math.random()*0xffffff);
			g.setColor(new Color(c));
			int x1=(int)(Math.random()*100);
			int x2=(int)(Math.random()*100);
			int y1=(int)(Math.random()*30);
			int y2=(int)(Math.random()*30);
			g.drawLine(x1, y1, x2, y2);
		}
		System.out.println(4);
		ByteArrayOutputStream out= new ByteArrayOutputStream();
		try {
			ImageIO.write(img, "png", out);
			out.close();
			byte[]data=out.toByteArray();
			png=new ByteArrayInputStream(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(5);
		return "success";
   }
}