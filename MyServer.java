import java.io.*;
import java.net.*;
 public class MyServer
 {
	 ServerSocket ss;
	 Socket s;
	 DataInputStream dis;
	 DataOutputtStream dos;
	  
	 public MyServer()
	 { try
	 {
		 System.out.println("server started");
		 ss= new ServerSocket(10);
		 s=ss.accept();
		 System.out.println("client connected");
		 dis= new  DataInputStream(s.getInputStream());
		 dos=new  DataOutputtStream(s.getOutputStream());
		 serverchat();
		 }
	 catch (Exception e)
	 {
		 System.out.println(e);
	 }
	 public static void main (string args[])
	 {
		 new MyServer();
		  }
	 public void serverchat throws IOException
	 {
		 String str;
		 do
		 {
			 this.readUTF();
			 System.out.println("CLIENT MSG" +str);
			 dos.writeUTF("HELLO" +str);		
		dos.flush();
		 }}
	 while (!str.equals("stop"));
	 }
 }