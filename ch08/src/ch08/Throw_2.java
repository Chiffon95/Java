package ch08;

import java.io.File;

public class Throw_2 {
	public static void main(String[] args) {
		try {
			File f = createFile("test2.txt");
			System.out.println("New File Created-> "+ f.getName());
		}catch (Exception e) {
			System.out.println("Error -> " + e.getMessage());
			System.out.println("Enter again!!!");
		}
	}

	static File createFile(String fileName) throws Exception {
		if (fileName == null || fileName.equals(""))
			throw new Exception("Wrong File Name!!!");
		File f = new File(fileName);
		f.createNewFile();
		return f;
	}
}
