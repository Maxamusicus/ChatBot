package ChatBot.view;

import javax.swing.JOptionPane;

import ChatBot.controller.ChatBotAppController;

public class ChatBotView
{
	private ChatBotAppController baseController;

	public ChatBotView(ChatBotAppController baseController)
	{
		this.baseController = baseController;
	}
	
	public String showChatBot(String currentInput)
	{
		JOptionPane.showMessageDialog(null, "Hello, " + currentInput);
		String result = JOptionPane.showInputDialog(null, "are you done?");
		return result;
	}
}
