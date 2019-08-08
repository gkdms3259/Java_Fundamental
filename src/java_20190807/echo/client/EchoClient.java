//2.
package java_20190807.echo.client;

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
	public void run() {
		Socket socket = null;
		OutputStream out = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		InputStream in = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			//ip와 port로 서버와 접속을 시도한다.
			//3. Socket을 생성한다.
			//4. Server와 연결한다. (TCP Connection에 해당)
			socket = new Socket(ip,port);

			//6. Socket을 출력스트림을 생성한 후에  Server에게 메세지를 보낸다.
		    out = socket.getOutputStream();
			osw = new OutputStreamWriter(out);
			bw = new BufferedWriter(osw);
			bw.write("성하~~성영한 하이라는 뜻~~"); //osw.write("안녕"); 이렇게 이것으로만 보내도 괜춘.
			bw.newLine();
			bw.flush();
			
			//9. Socket으로 입력스트림을 생성한 후에  Server에서 보낸 메세지를 읽는다.
			in = socket.getInputStream();
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			String readLine = br.readLine();
			System.out.println(readLine);
			
		
		} catch (UnknownHostException e) {
			System.out.println("서버주소가 잘못되었습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("서버가 켜져있지 않습니다..");
		}finally {
			try {
				if(out != null) out.close();
				if(osw != null) osw.close();
				if(bw != null) bw.close();
				if(in != null) in.close();
				if(isr != null) isr.close();
				if(br != null) br.close();
				if(socket != null) socket.close();
			}catch(IOException e) {
		}
	}
	}
	public static void main(String[] args) {
		new EchoClient("192.168.0.52",3000).run();
	}

}
