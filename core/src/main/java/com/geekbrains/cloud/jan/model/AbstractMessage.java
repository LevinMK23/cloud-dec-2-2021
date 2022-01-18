package com.geekbrains.cloud.jan.model;

import java.io.Serializable;

public interface AbstractMessage extends Serializable {

    MessageType getMessageType();

}
