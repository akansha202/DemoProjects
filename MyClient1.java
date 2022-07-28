import java.io.*;
import java.net.*;
 public class MyClient1
 {
	 ServerSocket ss;
	 Socket s;
	 DataInputStream dis;
	 DataOutputtStream dos;
	  
	 public MyClient1()
	 { try
	 {
		s= new Socket("192.168.1.7", 8);
		s= new Socket("LOCAL HOST", 8);
		 System.out.println("client connected");
		 System.out.println(s);
		 dis= new  DataInputStream(s.getInputStream());
		 dos=new  DataOutputtStream(s.getOutputStream());
		 clientchat();
		 }
	 catch (Exception e)
	 {
		 System.out.println(e);
	 }
	 public static void main (string args[])
	 {
		 new MyServer();
		  }
	 public void clientchat throws IOException
	 {
		 BufferReader br=new BufferedReader(new InputStreamReader(Sytem.in));
		 String s1;
	 }
	 do
	 {
		 s1=br.readLine();
		 dout.writeUTF(s1);
		 dout.flush();
		 System.out.println("Server msg:" +din.readUTF());
	 }
	 while while (!str.equals("stop"));
	 }
	 public static void main(string args[])
	 {
		 new MyClient1
	 }
 }
	 }

		 
	 