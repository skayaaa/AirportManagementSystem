public class Announcement {
    public String message;
    public String type;
    public Announcement(String message, String type) {
        this.message = message;
        this.type = type;
    }
public String getMessage() {
        return message;
}
public String getType() {
        return type;
}
public void setMessage(String message) {
        this.message = message;
}
public void setType(String type) {
        this.type = type;
}
    @Override
    public String toString() {
        return "Announcement{" +
                "message='" + message + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
