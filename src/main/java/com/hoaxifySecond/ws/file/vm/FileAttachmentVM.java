package com.hoaxifySecond.ws.file.vm;

import com.hoaxifySecond.ws.file.FileAttachment;
import lombok.Data;

@Data
public class FileAttachmentVM {

    private String name;

    private String fileType;

    public FileAttachmentVM(FileAttachment fileAttachment) {
        this.setName(fileAttachment.getName());
        this.fileType = fileAttachment.getFileType();
    }

}
