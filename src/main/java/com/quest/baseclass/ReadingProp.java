package com.quest.baseclass;

import java.io.FileReader;
import java.util.Properties;
import java.io.IOException;

public class ReadingProp {
	
	public static void main(String[] args) throws IOException {
	
	
	FileReader filereader = new FileReader(System.getProperty("user.dir")+"\\src\\main\\resources\\configfiles\\config.properties");
	Properties prop = new Properties();
	prop.load(filereader);
	prop.getProperty("browser");
	prop.getProperty("testURL");

}
}
