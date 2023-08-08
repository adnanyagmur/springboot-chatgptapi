package com.adnanyagmur.chatgptapi.dto;

import com.adnanyagmur.chatgptapi.model.Message;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ChatResponse {
    private List<Choice> choices;

    // constructors, getters and setters

    @Data
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Choice {

        private int index;
        private Message message;

        // constructors, getters and setters
    }
}
