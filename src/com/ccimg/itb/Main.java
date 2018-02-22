package com.ccimg.itb;
import com.ccimg.itb.Image_Processor;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try{
			Image_Processor reader = new Image_Processor();
			reader.getImageAtr();
		} catch (IOException e){
			System.out.print("error:" +e);
		}
	}

}
