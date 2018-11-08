package org.edataserver.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUitl {

	public static void upload(byte[] bytes,String realName,String fileName) throws IOException {
		File file = new File(realName);
		if(!file.exists()) {
			file.mkdirs();
		}
		FileOutputStream out=new FileOutputStream(new File(realName,fileName));
		out.write(bytes);
	};
}
