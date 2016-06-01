package com.thoughtworks.webserver;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author wbzhao 
 * @version 1.0
 * 类说明
 */
public class HttpServer {

	/**
	 * @param args
	 */
	
	//WEB_ROOT是改服务器的根目录
	//System.getProperty("user.dir")+File.separator+"WebRoot";
	public static final String WEB_ROOT = System.getProperty("user.dir") + File.separator  + "WebRoot\\";
	
	//关闭的命令
	private static final String SHUTDOWN_COMMAND= "/SHUTDOWN";
	//接收关闭命令
	private boolean shutdown = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HttpServer server = new HttpServer();
		server.await();

	}

	public void await() {
		ServerSocket serverSocket = null;
		int port = 12121;//服务器监听端口
		try {
			serverSocket = new ServerSocket(port, 1, InetAddress.getByName("127.0.0.1"));
			while (!shutdown) {
				try {
					Socket socket = null;
					InputStream input = null;
					OutputStream output = null;
					socket = serverSocket.accept();
					input = socket.getInputStream();
					output = socket.getOutputStream();
					// 封装request请求
					Request request = new Request(input);
					request.parse();
					// 封装response对象
					Response response = new Response(output);
					response.setRequest(request);
					response.sendStaticResource();
					socket.close();
					if(request!=null && request.getUri()!=null){
						shutdown = request.getUri().equals(SHUTDOWN_COMMAND);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					continue;
				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}
