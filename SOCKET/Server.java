package socketServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public void serve() {
		System.out.println("[SERVER] Running...");
		try {
			ServerSocket server = new ServerSocket(6543);
			Socket socket = server.accept();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String request = br.readLine();
								
			if (request!=null) {
				System.out.println("[SERVER] recieve: "+request);
				//sending message
				PrintStream ps = new PrintStream(socket.getOutputStream());
				ps.println(request.toUpperCase());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Server s = new Server();
		s.serve();
	}

}
