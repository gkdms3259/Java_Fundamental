package java_20190808.multicast.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;

public class MulticastServerThread implements Runnable {
	private Socket socket;
	private ArrayList<MulticastServerThread> list; //*
    private BufferedWriter bw;
  	public MulticastServerThread(Socket socket,ArrayList<MulticastServerThread> list) { //*
		// TODO Auto-generated constructor stub
		this.socket = socket;
		this.list = list;       //*
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			boolean isStop = false;
			while (!isStop) {
				// 정상메시지 => id : message
				// 종료메시지 => shutdown
				String readLine = br.readLine();
				System.out.println(readLine);
				if (readLine.equals("shutdown")) {
					bw.write("shutdown\n");
					bw.flush();
					isStop = true; // =break하겠다는 뜻
				} else {
					broadCast(readLine+"\n");   //*
				}
			}
			list.remove(this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("비정상적으로 종료하셨습니다.");
			list.remove(this);
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (br != null)
					br.close();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
			}
		}

	}//end run
	
	public void broadCast(String msg) throws IOException {              //*
		for(MulticastServerThread mst : list) {      //*
			mst.sendMessage(msg);                    //*
			
		}
	}
	private void sendMessage(String msg) throws IOException { //*
		bw.write(msg);            //*
		bw.flush();               //*
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
