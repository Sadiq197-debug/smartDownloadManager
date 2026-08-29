package com.SadiqProject.smartDownloadManager.model;

public class DownloadTask {
    private int id;
    private String url;
    private String destination;
    private String fileName;
    private DownloadStatus status = DownloadStatus.QUEUED;
    private long totalBytes;
    private long downloadedBytes;

    public DownloadTask(String url, String destination, String fileName) {
        this.url = url;
        this.destination = destination;
        this.fileName = fileName;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setTotalBytes(long totalBytes) {
        this.totalBytes = totalBytes;
    }

    public String getFileName() {
        return fileName;
    }

    public String getUrl() {
        return url;
    }
    public DownloadStatus getStatus(){
        return status;
    }
    public int getId(){
        return id;
    }
    public long getDownloadedBytes(){
        return downloadedBytes;
    }
    public long getTotalBytes(){
        return totalBytes;
    }
}
