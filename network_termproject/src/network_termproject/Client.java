package network_termproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Client {


    static BufferedReader in;
    static PrintWriter out;

    private void run() throws IOException {

        // Make connection and initialize streams
        String serverAddress = ""; //server�ּҳִºκ�
        Socket socket = new Socket(serverAddress, 9001);//���ϻ���
        int check=0;
        in = new BufferedReader(new InputStreamReader(
            socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);

        while (true) {
        	if(check==0)
        	{
        		//login â  ����
        		check=1;
        	}
        	else 
        	{
               String line = in.readLine();//�����κ��� �Է¹���
               if (line.startsWith("msgloginok")) {//statsWith=���ڿ� ���� ��ġ�ϸ� true �ƴϸ� false
            	   
            	   
               }             

 
        	}
        }
    }

    public static void main(String[] args) throws Exception {
        Client client = new Client();
        client.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//frame�� ������ ���α׷��� ����ǰ� ����
        client.frame.setVisible(true);//���̰Լ���
        client.run();
    }
}