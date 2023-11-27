import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

class Filewr{
	public static void main(String[]  args) throws IOException{
		try {
			File f =new File("Sample.txt");	
		 	if(f.createNewFile()){
				System.out.println("File named "+f.getName()+" is created");
			}else{
				System.out.println("File already exist");
			}

			String text;
			FileWriter in = new FileWriter("Sample.txt");
			Scanner s = new Scanner(System.in);
			System.out.println("Enter text to be written on "+f.getName()+" file");
			text = s.nextLine();
			in.write(text);
			in.close();
			
			System.out.println("Content inside the file");
			FileReader out = new FileReader("Sample.txt");
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