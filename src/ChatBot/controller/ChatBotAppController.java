package ChatBot.controller;

import javax.swing.JOptionPane;
import ChatBot.model.*;
import ChatBot.view.*;

public class ChatBotAppController
{
	private ChatBotView appView;

	public ChatBotAppController()
	{
		appView = new ChatBotView(this);
	}

	public void init()
	{
		String result = appView.showChatBot("Max");
		if(result.equalsIgnoreCase("yes"))
		{
			Quit();
		}
	}

	private void Quit()
	{
		JOptionPane.showMessageDialog(null, "Ending");
		System.exit(0);
	}

}
