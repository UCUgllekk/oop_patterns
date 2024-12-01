package org.example.Task2;

class GiftLetterStrategy implements MailContentStrategy {
    @Override
    public String generateContent(Client client) {
        return "Dear " + client.getName()
                + ", enjoy our exclusive gift! (Spoiler: not a talon)";
    }
}
