import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.util.Scanner;

class Fileop{
	public static void main(String[]  args) throws IOException{
		try {
			String text;
			FileOutputStream in = new FileOutputStream("Sample.txt");
			Scanner s = new Scanner(System.in);
			System.out.println("Enter text to be written on the file");
			text = s.nextLine();
			byte[] arr = text.getBytes();	
			in.write(arr);
			in.close();
			
			System.out.println("Content inside the file");
			FileInputStream out = new FileInputStream("Sample.txt");
			int i=0;
			while((i = out.read())!=-1){
				System.out.print((char)i);
			}
			out.close();			 
		}
		catch (IOException e){
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}