package com.crazyhonest.common.client.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileUtils {

	public static void buff2Image(byte[] b, String filePath) throws Exception {
		FileOutputStream fout = new FileOutputStream(filePath);
		// 将字节写入文件
		fout.write(b);
		fout.close();
	}

	public static byte[] image2Bytes(String filePath) throws Exception {
		FileInputStream fin = new FileInputStream(new File(filePath));
		// 可能溢出,简单起见就不考虑太多,如果太大就要另外想办法，比如一次传入固定长度byte[]
		byte[] bytes = new byte[fin.available()];
		// 将文件内容写入字节数组，提供测试的case
		fin.read(bytes);

		fin.close();
		return bytes;
	}

	public static Boolean deleteFIle(String filePath) {
		File file = new File(filePath);
		if (file.exists() && file.isFile()) {
			if (file.delete()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		try {
			byte[] b1 = image2Bytes("/home/leedian/JNIDemo/401.jpeg");
			System.out.println(b1);
			// 存为文件
			// buff2Image(b1,"d:\\test.jpg");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
