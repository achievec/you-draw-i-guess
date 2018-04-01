package org.aloha.youdrawiguess.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class ClientMessage {

    private String name;

    private String message;

}
