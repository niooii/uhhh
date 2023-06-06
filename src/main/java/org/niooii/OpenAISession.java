package org.niooii;

import com.plexpt.chatgpt.ChatGPT;
import com.plexpt.chatgpt.util.Proxys;

import java.net.Proxy;

import static com.plexpt.chatgpt.ConsoleChatGPT.proxy;

public class OpenAISession {
    ChatGPT chatGPT;

    public OpenAISession(){
        chatGPT = ChatGPT.builder()
                .apiKey("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")
                .build()
                .init();

        String res = chatGPT.chat("hi！");
        System.out.println(res);
    }

    public ChatGPT getChatGPT() {
        return chatGPT;
    }
}
