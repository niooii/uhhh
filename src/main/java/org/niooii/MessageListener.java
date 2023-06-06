package org.niooii;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.entities.channel.unions.MessageChannelUnion;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MessageListener extends ListenerAdapter {

    JDA bot = Bot.jda;;

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if(bot == null)
            bot = Bot.jda; //reinitialize bot idk why

        //initialization stuff
        Guild guild = event.getGuild();
        MessageChannelUnion channel = event.getChannel();
        String channelId = event.getChannel().getId();
        String authorId = event.getAuthor().getId();
        String text = event.getMessage().getContentRaw();

        if(isBot(authorId)) //check if bot sent message, if so ignore event
            return;

        event.getChannel().sendTyping().queue();
        handleAIResponse(event, "hi gpt!");


    }

    void handleAIResponse(MessageReceivedEvent event, String prompt){

    }

    TextChannel getGuildTextChannelByID(Guild guild, String id){
        return guild.getTextChannelById(id);
    }

    boolean isBot(String id){ //specific bot id
        return id.equals("1113898942053240982");
    }

    void sendMessage(MessageChannelUnion channel, String message){
        channel.sendMessage(message).queue();
    }

    void sendMessage(String chnlID, String message){

    }
}
