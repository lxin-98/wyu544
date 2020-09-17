package lixin;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Secondcopy_lixin {
	public static void main(String[] args) throws IOException {

		FileInputStream first = new FileInputStream("D:\\Testlixin\\myfile.txt");
		BufferedInputStream bi = new BufferedInputStream(first);
		FileOutputStream second = new FileOutputStream("D:\\Testlixin1\\myfile_2.txt");
		BufferedOutputStream bo = new BufferedOutputStream(second);

		int length = -1;

		while ((length = bi.read()) != -1) {
			bo.write(length);
		}
		System.out.println("复制已完成");
		bi.close();
		bo.close();

	}
}
