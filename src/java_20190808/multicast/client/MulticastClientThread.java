package java_20190808.multicast.client;

import java.io.BufferedReader;
import java.io.IOException;

import javax.swing.JTextArea;


public class MulticastClientThread implements Runnable{
    private BufferedReader br;
    private JTextArea jta;
	public MulticastClientThread(BufferedReader br, JTextArea jta) {
		// TODO Auto-generated constructor stub
		this.br =br;
		this.jta=jta;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean isStop=false;
		while(!isStop) {
			try {
				String readLine = br.readLine();
				if(readLine.equals("shutdown")) {
					System.exit(0);
				}else {
					jta.append(readLine+"\n");
					jta.setCaretPosition(jta.getDocument().getLength());
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
