package Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Filehandling {
	
 String filename="D:\\text.txt";
 public void WriteHelloWorld()
 {
	FileWriter f=null; 
	try {
		f= new FileWriter(filename);
		BufferedWriter o=new BufferedWriter(f);
		o.write("Hello world");
		o.newLine();
		o=null;
		System.out.println("File Creation completed.");
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		if(f!=null)
		{
			try {
				f.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			f=null;
		}
	}
 }
 public void FileReader() {
	 java.io.FileReader r=null;
	 try {
		r=new java.io.FileReader(filename);
		BufferedReader b=new BufferedReader(r);
		String buff=b.readLine();
		b.close();
		System.out.println(buff);
	} catch (Exception e) {
		e.printStackTrace();
	}
	 finally {
		if(r!=null)
		{
			try {
				r.close();
				r=null;
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	 
		
 }
 
}
