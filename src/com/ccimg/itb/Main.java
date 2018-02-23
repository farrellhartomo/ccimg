package com.ccimg.itb;
import com.ccimg.itb.Image_Processor;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		Image_Processor reader = new Image_Processor();
		reader.setImageTest();
		reader.getImageAtr();
	}

}
