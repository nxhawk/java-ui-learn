package socketClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public void connect() {
		System.out.println("[CLIENT] Running...");
		try {
			Socket socket = new Socket("localhost", 1985);
			
			//sending message to server
			PrintStream ps = new PrintStream(socket.getOutputStream());
			ps.println("Study and share");
			
			//receive message from server
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String reponse = br.readLine();
			
			if (reponse != null) {
				System.out.println("[CLIENT] recieve: "+reponse);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client c = new Client();
		c.connect();
	}	

}
