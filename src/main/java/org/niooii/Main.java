package org.niooii;

import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.hooks.EventListener;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        EventListener[] listeners = new EventListener[] {
                new MessageListener()
        };
        System.out.println("Hello world!");
        new OpenAISession();
        new Bot("MTExMzg5ODk0MjA1MzI0MDk4Mg.GfqVmo.Hse_--xoyOYJc9ptQkI_Eu0AUGj0q5Io2OMYXE", listeners, OnlineStatus.IDLE, Activity.playing("yur motnehter"));
    }
}