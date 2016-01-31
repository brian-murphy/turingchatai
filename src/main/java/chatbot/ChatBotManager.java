package chatbot;

import java.io.BufferedWriter;
import java.net.ServerSocket;
import java.util.Hashtable;
import java.util.Random;

public class ChatBotManager 
{
	
	private static final int startPort=28250;
	
	public static void main(String[] args)
	{
		new ChatBotManager(1);
	}
	
	public ChatBotManager(int numberBots)
	{
		for(int created=0; created<numberBots; created++)
		{
			ChatBot newChatBot=new ChatBot(startPort+created);
			new Thread(newChatBot).run();
		}
	}
	
}