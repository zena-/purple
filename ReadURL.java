import java.net.*;
import java.io.*;

public class ReadURL {
	public static void main(String[] args) throws Exception {
		URL osu = new URL ("http://instagram.com/e.nek");
		BufferedReader in = new BufferedReader (
			new InputStreamReader(osu.openStream()));
		String inputLine;
		while ((inputLine = in.readLine()) != null)
			System.out.println(inputLine);
		in.close();	
	}
} 

/* openStream() : returns a java.io.InputStream object, from which you can read easily as reading from an input stream. it may throw an IOException  

giving me a html code of my instagram


openConnection() : returns a URLConnection object that represents a connection to the remote object referred to by the URL. it may throws an IOException 
*/