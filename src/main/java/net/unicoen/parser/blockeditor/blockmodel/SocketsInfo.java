package net.unicoen.parser.blockeditor.blockmodel;

import java.util.ArrayList;
import java.util.List;

public class SocketsInfo {

	private List<SocketInfo> sockets = new ArrayList<>();

	public void addSocketInfo(SocketInfo socket){
		sockets.add(socket);
	}

	public List<SocketInfo> getSockets(){
		return this.sockets;
	}


}
