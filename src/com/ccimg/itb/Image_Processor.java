package com.ccimg.itb;

import javax.imageio.ImageIO;
//import java.io.BufferedReader;
import java.awt.image.BufferedImage;
import java.io.IOException;
//import java.io.File;

public class Image_Processor {
	//init
		int h1;
		int w1;

		int pixels[][];


		//reading image
		public Image_Processor() throws IOException{
			//File image_file = new File("/images/image3.jpg");
			String URI = "/images/image3.jpg";
			BufferedImage image = ImageIO.read(getClass().getResource(URI));
			//image attributes
			h1 = image.getHeight();
			w1 = image.getWidth();
			pixels = new int[h1][w1];
		}
		

		public void getImageAtr(){
			System.out.println("tinggi:"+h1);
			System.out.print("lebar:" +w1);
		}
}
