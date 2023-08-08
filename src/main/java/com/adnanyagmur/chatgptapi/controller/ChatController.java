package com.adnanyagmur.chatgptapi.controller;

import com.adnanyagmur.chatgptapi.dto.ChatRequest;
import com.adnanyagmur.chatgptapi.dto.ChatResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/chatgpt")
public class ChatController {

    @Qualifier("openaiRestTemplate")
    @Autowired
    private RestTemplate restTemplate;

    @Value("${openai.model}")
    private String model;

    @Value("${openai.api.url}")
    private String apiUrl;

    @GetMapping("/chat")
    public String chatdeneme(@RequestParam("prompt") String prompt){
        ChatRequest request = new ChatRequest(model,prompt);
        request.setN(1);

        // call the API
        ChatResponse chatResponse = restTemplate.postForObject(apiUrl,request,ChatResponse.class);
        System.out.println(chatResponse.getChoices().get(0).getMessage().getContent());

        return chatResponse.getChoices().get(0).getMessage().getContent();
    }
}
