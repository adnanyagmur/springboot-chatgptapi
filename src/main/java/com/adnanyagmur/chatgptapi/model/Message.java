package com.adnanyagmur.chatgptapi.model;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    private String role;
    private String content;

    // constructor, getters and setters
}