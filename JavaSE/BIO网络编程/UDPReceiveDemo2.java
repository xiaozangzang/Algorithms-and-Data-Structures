package Net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiveDemo2 {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("接收端启动...");
		/*
		 * 建立UDP接收端的思路 1.建立udp socket服务 因为是要接受数据，必须要明确一个端口号 2.创建数据包
		 * 用来存储接收到的额数据，方便用数据包对象的方法解析这些数据 3.使用socket服务的receive方法将接受到的数据存储到数据包
		 * 4.通过数据包的方法解析数据包中的数据
		 */
		// 1.建立 udp socket服务

		DatagramSocket ds = new DatagramSocket(10000);
		// 创建数据包
		while (true) {
			byte[] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buf, buf.length);

			// 3.使用接收方法将数据存储到数据包中
			ds.receive(dp);// 阻塞式的；

			// 4.通过数据包对象的方法，解析其中的数据，比如地址、端口号、数据内容等
			String ip = dp.getAddress().getHostAddress();
			int port = dp.getPort();
			String text = new String(dp.getData(), 0, dp.getLength());

			System.out.println(ip + ":" + ":" + text);
		}
		// 关闭资源

	}

}
