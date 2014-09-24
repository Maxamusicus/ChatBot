package ChatBot.model;

public class ChatBot
{
	private String name;
	private int chatCount;

	public ChatBot(String name)
	{
		this.name = name;
		chatCount = 0;
	}
	
	private void updateChatCount()
	{
		chatCount++;
	}
	
	public int getChatCount()
	{
		return chatCount;
	}

	public String getName()
	{
		return name;
	}

}
