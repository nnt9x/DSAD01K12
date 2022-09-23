package day3.queue1;

public class Message{
    private long randomId;
    private String content;

    public Message() {
    }

    public Message(long randomId, String content) {
        this.randomId = randomId;
        this.content = content;
    }

    public long getRandomId() {
        return randomId;
    }

    public void setRandomId(long randomId) {
        this.randomId = randomId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "randomId=" + randomId +
                ", content='" + content + '\'' +
                '}';
    }

}
