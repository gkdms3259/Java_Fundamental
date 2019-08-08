package java_20190808.file.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
	private int port;
	public FileServer(int port) {
		this.port = port;
		
	}
	
	private void run() {
        ServerSocket serverSocket = null;
        try {
			serverSocket = new ServerSocket();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        FileServerMethod fst =null;
        while(true) {
        	System.out.println("클라이언트 접속을 기다리고 있습니다.");
        	try {
				Socket socket = serverSocket.accept();
			    String ip =socket.getInetAddress().getHostAddress();
			    System.out.println("클라이언트 접[ip : " +ip+ "]");
			    
			    fst = new FileServerMethod(socket);
			    Thread t = new Thread(fst); //runnable만 들어갈 수 있어서 FileServerMethod에서 implements Runnable해줌.
			    t.start();
			    
			    
			    
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        }
        
        
	}
	
	
	
	public static void main(String[] args) {
		new FileServer(4000).run();
	}

}
