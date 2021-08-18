package com.company.design.facade;

public class SftpClient {
    private Ftp ftp;
    private Writer writer;
    private Reader reader;

    public SftpClient(Ftp ftp, Writer writer, Reader reader){
        this.ftp = ftp;
        this.writer = writer;
        this.reader = reader;
    }

    public SftpClient(String host, int port , String path, String fileName){
        this.ftp = new Ftp(host, port, path);
        this.writer = new Writer(fileName);
        this.reader =new Reader(fileName);
    }

    public void connect(){
        ftp.Connect();
        ftp.moveDirectory();
        writer.fileConnect();
        reader.fileConnect();
    }

    public void disConnect(){
        writer.fileDisconnect();
        reader.fileDisconnect();
        ftp.disConnect();
    }

    public void read(){
        reader.fileRead();
    }

    public void write(){
        writer.write();
    }
}
