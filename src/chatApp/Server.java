package chatApp;
import java.net.*;
import java.io.*;
import java.util.*;


public class Server {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		ServerSocket ss = new ServerSocket(3002);
		System.out.println("waiting for client");
		Socket s = ss.accept();
    
        
		System.out.println("Client connected");
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in); 
		
		String str = bf.readLine();
		String inputValue[] = str.split("~");
		String userName = inputValue[0];
		String msg = inputValue[1];
		System.out.println( userName +": " + msg); 
		
		System.out.println(userName);
	}

}
