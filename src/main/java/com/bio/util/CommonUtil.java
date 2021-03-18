package com.bio.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.bio.services.CommonController;

@Component
public class CommonUtil {
	public static Logger _LOGGER = LoggerFactory.getLogger(CommonUtil.class);
	
	
	public static void writeToFile(File file,Object content) {
		
		try(FileWriter writer=new FileWriter(file)) {
			writer.write(content.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			_LOGGER.info("Error While writing the response  into file ",e.getMessage());
		}
	}

}
