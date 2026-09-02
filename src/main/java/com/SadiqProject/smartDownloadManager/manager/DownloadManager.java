package com.SadiqProject.smartDownloadManager.manager;

import com.SadiqProject.smartDownloadManager.exception.DownloadNotFoundException;
import com.SadiqProject.smartDownloadManager.exception.DownloadsNotFoundException;
import com.SadiqProject.smartDownloadManager.model.DownloadTask;

import java.util.*;

public class DownloadManager {
    private final HashMap<UUID, DownloadTask> downloads = new HashMap<>();
    // add download into hashmap
    public void addDownload(DownloadTask task){
        downloads.put(task.getId(),task);
    }

    public DownloadTask findDownload(UUID id){
        DownloadTask task = downloads.get(id);

        if(task == null){
            throw new DownloadNotFoundException("There is no download for this ID. Please try again!!!");
        }
        return task;
    }

    public void removeDownload(UUID id){
        DownloadTask task = downloads.remove(id);
        if(task == null) {
            throw new DownloadNotFoundException("There is no download for this ID. Please try again!!!");
        }
    }

    public Collection<DownloadTask> listDownloads(){
        if(downloads.isEmpty()){
            throw new DownloadsNotFoundException("There are no downloads available.");
        }
        return Collections.unmodifiableCollection(downloads.values());
    }

}
