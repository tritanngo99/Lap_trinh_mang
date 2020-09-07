import java.io.*;
import java.net.*;
import java.util.Scanner;
public class server_side {
	public static void main(String[] args) throws IOException{
		int open_port = 9000;
		ServerSocket serverSocket = new ServerSocket(open_port);
		Socket serverSoc = serverSocket.accept();
		Scanner sc = new Scanner(serverSoc.getInputStream());
		int maSv;
		maSv = sc.nextInt();
		PrintStream p = new PrintStream(serverSoc.getOutputStream());
		p.println("Hello_"+maSv);
		serverSoc.close();
		serverSocket.close();
	}
}
