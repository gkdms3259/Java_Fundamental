package java_practice_java20190807.echo.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
	private String ip;
	private int port;
	public EchoClient(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}
	private void run() {
		Socket socket = null;
		try {
			socket = new Socket(ip,port);
			
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("하이이이이이이~~");
			bw.newLine();
			bw.flush();
			
			InputStream in = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			String readLine = br.readLine();
			System.out.println(readLine);
			
		} catch (UnknownHostException e) {
			System.out.println("서버주소가 잘못되었습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("서버가 죽었...");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new EchoClient("192.168.0.84",3000).run();
	}

}
