package org.niooii;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.hooks.EventListener;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Bot {
    static JDA jda;
    public Bot(String token, EventListener[] listeners, OnlineStatus status, Activity activity) throws InterruptedException {
        // Note: It is important to register your ReadyListener before building
        jda = JDABuilder.createDefault(token)
                .addEventListeners((Object[]) listeners)
                .setActivity(activity)
                .setStatus(status)
                .enableIntents(GatewayIntent.GUILD_MEMBERS,
                        GatewayIntent.MESSAGE_CONTENT)
                .build();

        // optionally block until JDA is ready
        jda.awaitReady();
        System.out.println(jda);
    }
}
