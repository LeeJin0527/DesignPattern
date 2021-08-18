package com.company.design.singleton;

public class SocketClient {
    private static SocketClient socketClient = null;  //싱글톤은 자기 자신을 객체로 가져야한다.

    private SocketClient(){  //default 생성자를 막는다

    }

    public static SocketClient getInstance(){  //static 으로 만드는 getInstance를 통해 사용
        if(socketClient == null){
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect(){
        System.out.println("connect");
    }

}
