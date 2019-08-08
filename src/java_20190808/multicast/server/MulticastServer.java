package java_20190808.multicast.server;    // Uni와 다른것 표시 => //*

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MulticastServer {
	private int port;
	private ArrayList<MulticastServerThread> list;     //*

	public MulticastServer(int port) {
		this.port = port;
		list = new ArrayList<MulticastServerThread>(); //*
	}

	private void run() {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			e.printStackTrace();

		}
		MulticastServerThread ust = null;
		while (true) {
			System.out.println("클라이언트 접속 대기중...");
			try {
				Socket socket = serverSocket.accept();
				String ip = socket.getInetAddress().getHostAddress();
				System.out.println("클라이언트[ip : " + ip + "]");
				ust = new MulticastServerThread(socket,list);
				
				list.add(ust);
				
				Thread t = new Thread(ust);
				t.start();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new MulticastServer(000).run();

	}

}
