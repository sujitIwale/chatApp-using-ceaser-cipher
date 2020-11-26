package chatApp;
import java.net.*;
import java.io.*;
import java.util.*;


public class Server {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		ServerSocket ss = new ServerSocket(3002);
		Socket s = ss.accept();
        User user = new User();
		System.out.println("Client connected");
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in); 

		String str = bf.readLine();
		System.out.println( user.userName +": " + str); 
	}

}
