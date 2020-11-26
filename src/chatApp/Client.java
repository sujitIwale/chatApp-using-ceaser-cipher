package chatApp;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

class User {
	 String userName  ="";
}

public class Client {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		Socket s = new Socket("localhost", 3000);
        User user = new User();
		PrintWriter pr = new PrintWriter(s.getOutputStream());
		System.out.print("please enter a user name :");
		user.userName = scan.nextLine();
//		 String getuserName() {
//        	return user.userName;
//        }
		System.out.print("enter message: ");
		String input = scan.nextLine();
		pr.print(input);
		pr.flush();


	}

}
