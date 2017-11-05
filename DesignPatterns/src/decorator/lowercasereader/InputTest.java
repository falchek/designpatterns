package decorator.lowercasereader;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InputTest {
	
	public static void main(String args[]) throws IOException{
		Path currentRelativePath = Paths.get("");
		String s = currentRelativePath.toAbsolutePath().toString();
		System.out.println("Current relative path is: " + s);
		
		int c; 
		try {
			InputStream in = new LowerCaseInputStream(
					new BufferedInputStream(
							new FileInputStream(s + "/bin/decorator/lowercasereader/test.txt")));
			while ((c = in.read()) >= 0){
				System.out.print((char)c);
			}
			in.close();  
			System.out.println("So we just decorated the buffered input stream with our own LowerCaseInputStream class.");
			System.out.println("Which happens to decorate the FileInputStream");
		} catch (IOException e){
			System.out.println("Couldn't open this file.");
			e.printStackTrace();
		}
		
	}
}
