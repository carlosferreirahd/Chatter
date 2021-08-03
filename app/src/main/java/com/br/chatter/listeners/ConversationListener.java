package com.br.chatter.listeners;

import com.br.chatter.models.User;

public interface ConversationListener {
    void onConversationClicked(User user);
}
