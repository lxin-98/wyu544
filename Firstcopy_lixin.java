package lixin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Firstcopy_lixin {
	public static void copytest(String src, String dest) throws IOException {
		FileInputStream enter = new FileInputStream(src);
		File file = new File(dest);
		if (!file.exists())
			file.createNewFile();
		FileOutputStream out = new FileOutputStream(file);
		int c;
		byte buf[] = new byte[512];
		while ((c = enter.read(buf)) != -1) {
			for (int i = 0; i < c; i++)
				out.write(buf[i]);
		}
		enter.close();
		out.close();
	}

	public static void main(String[] args) throws IOException {
		String src = "D:\\Testlixin\\myfile.txt";
		String des = "D:\\Testlixin\\myfile_1.txt";
		copytest(src, des);
		System.out.println("文件复制成功");
	}
}
