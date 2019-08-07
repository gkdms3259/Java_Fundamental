//실행할 때 에코서버부터 먼저해야함.
//1.
package java_20190807.echo.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	private int port;
	public EchoServer(int port) {
		this.port = port;
	}
	private void run() {
        ServerSocket serverSocket = null;
		try {
			//1.ServerSocket을 생성한다.
			serverSocket = new ServerSocket(port);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
        while(true) {
        	System.out.println("클라이언트 접속을 기다리고 있습니다.");
        	try {
        		//accept() : 클라이언트 접속을 기다리고 있음
        		//클라이언트가 접속하면 클라이언트와 통신할 수 있는 Socket 객체를 생성해줌.
        		//2.ServerSocket으로 Client의 접속을 기다린다.(ServerSocket의 가장 중요한)
				Socket socket = serverSocket.accept(); 
				//5. Client와 통신할 수 있는 Socket을 생성한다.
				InetAddress i = socket.getInetAddress();
				String ip = i.getHostAddress();
				System.out.println("클라이언트가 접속했습니다. IP : " +ip);
				
				//7. Socket으로 입력스트림을 생성한 후에  Client의 메세지를 읽는다.
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in);
				BufferedReader br = new BufferedReader(isr);
				String readLine = br.readLine();
				System.out.println(readLine);
				
				//8. Socket으로 출력스트림을 생성한 후에 Client에게 메세지를 보낸다.
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out);
				BufferedWriter bw = new BufferedWriter(osw);
				bw.write(readLine);
				bw.newLine();
				bw.flush();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        }
	}
	public static void main(String[] args) {
		new EchoServer(3000).run();
	}

	}

