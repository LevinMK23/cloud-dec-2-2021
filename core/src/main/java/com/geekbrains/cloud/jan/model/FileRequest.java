package com.geekbrains.cloud.jan.model;

import lombok.Data;

@Data
public class FileRequest implements AbstractMessage {

    private final String fileName;

    @Override
    public MessageType getMessageType() {
        return MessageType.FILE_REQUEST;
    }
}
