package chatApp;
import java.net.*;
import java.io.*;
import java.util.*;


public class Server {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("waiting for client");
		ServerSocket ss = new ServerSocket(3002);
		Socket s = ss.accept();
        User user = new User();
        
        String userName = user.getuserName();
        
		System.out.println("Client connected");
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in); 

		String str = bf.readLine();
		System.out.println( userName +": " + str); 
	}

}
