package com.company.design.facade;

public class Writer {
    private String fileName;

    public Writer(String fileName){
        this.fileName = fileName;
    }

    public void fileConnect(){

        String msg = String.format("Writer %s 로 연결", fileName);
        System.out.println(msg);
    }

    public void write(){

        String msg = String.format("Writer %s 로 파일쓰기", fileName);
        System.out.println(msg);
    }

    public void fileDisconnect(){
        String msg = String.format("Writer %s 로 연결종", fileName);
        System.out.println(msg);
    }
}
