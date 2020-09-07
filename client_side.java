import java.io.*;
import java.net.*;
import java.util.Scanner;
public class client_side {
	public static void main(String[] args) throws UnknownHostException, IOException{
		int open_port = 9000;
		Scanner sc = new Scanner(System.in);
		System.out.println("This is client side. Code by Ha Xuan Tien!");
		Socket clientSocket = new Socket("localhost", open_port);
		try {
			Scanner socket_input = new Scanner(clientSocket.getInputStream());
			System.out.println("Client is connected to socket server!");
			System.out.println("Please enter a number");
			int my_MSV;
			my_MSV = sc.nextInt();
			PrintStream printStr = new PrintStream(clientSocket.getOutputStream());
			printStr.println(my_MSV);
			String temp;
			temp = socket_input.nextLine();
			System.out.println("Output data from Socket Server  "+temp);
		}	catch (IOException ie ) {
			System.out.println("Can't connect to server");
		}
		
		
	}
}
