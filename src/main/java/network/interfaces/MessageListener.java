package network.interfaces;

/**
 * Created by brian on 1/24/16.
 */
public interface MessageListener {
    void onMessageReceived(String message, ConversationManager conversation);
}
