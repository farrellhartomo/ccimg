package com.ccimg.itb;

import javax.imageio.ImageIO;
//import java.io.BufferedReader;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.File;

public class Image_Processor {
	//init
		BufferedImage image;
		File file;
		
		int h1;
		int w1;

		int pixels[][];
		String URI;
		
		
		public Image_Processor() {
			//empty constructor
		}
		
		//reading image
		public Image_Processor(String uri) {
			this.URI = uri;
			try {
				this.image = ImageIO.read(getClass().getResource(URI));
			} catch (IOException e) { System.out.print(e);}
		}
		
		public void setImageTest() throws IOException{
			URI = "/images/image3.jpg";
			this.image = ImageIO.read(getClass().getResource(URI));
			h1 = image.getHeight();
			w1 = image.getWidth();
			pixels = new int[h1][w1];
		}
		
		public BufferedImage getImage(BufferedImage image) {
			if (image != null) {
				this.image = image;
			}
			return this.image;
		}
		
		public void setImage(BufferedImage image) {
			this.image = image;
		}
		
		public void getImageAtr(){
			System.out.println("tinggi:"+h1);
			System.out.print("lebar:" +w1);
		}
		
		public void setThreshold() {
			//set threshold for image before chain-coded
		}
		
		public void setBorder(int width, int height) {
			//receive pixels for border detection
		}
}
