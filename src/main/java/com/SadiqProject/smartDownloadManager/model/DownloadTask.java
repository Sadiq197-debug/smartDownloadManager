package com.SadiqProject.smartDownloadManager.model;
import java.util.UUID;

public class DownloadTask {
    private final UUID id;
    private String url;
    private String destination;
    private String fileName;
    private DownloadStatus status = DownloadStatus.QUEUED;
    private long totalBytes;
    private long downloadedBytes;

    public DownloadTask(String url, String destination, String fileName) {
        this.id = UUID.randomUUID();
        this.url = url;
        this.destination = destination;
        this.fileName = fileName;
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
    public UUID getId(){
        return id;
    }
    public long getDownloadedBytes(){
        return downloadedBytes;
    }
    public long getTotalBytes(){
        return totalBytes;
    }
}
