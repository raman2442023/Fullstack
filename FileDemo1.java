package com.org;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileDemo1 fd = new FileDemo1();
		
		fd.learn_file();
	}

	private void learn_file() throws IOException {
		// TODO Auto-generated method stub
		
		File ff = new File("//home//raman//Desktop//Raman.txt");
		
		
			FileWriter writter = new FileWriter(ff);
			
			BufferedWriter buffer = new BufferedWriter(writter);
			buffer.append("Raman");
			buffer.newLine();
			buffer.append("Hema");
			buffer.flush();
			buffer.close();
			
			
//			writter.append('R');
//			writter.append("\nHema\n");
//			writter.close();
	
		
		
		try {
			ff.createNewFile();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
