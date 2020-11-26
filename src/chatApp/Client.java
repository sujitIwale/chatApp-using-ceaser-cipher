package chatApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class Client {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		Socket s = new Socket("localhost", 3002);
  
       
		PrintWriter pr = new PrintWriter(s.getOutputStream());
		System.out.print("please enter a user name :");
		String name = scan.nextLine();
		
		
		System.out.print("enter message: ");
		String input = scan.nextLine();
		String value = name + "~" + input;
		pr.println(value);
		pr.flush();
        

	}

}
