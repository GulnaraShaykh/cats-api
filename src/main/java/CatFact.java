import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CatFact {
    private String id;
    private String text;
    private String type;
    private String user;
    private Integer upvotes; // Используйте объект Integer, чтобы upvotes мог быть null

    // Геттеры и сет
    // теры
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getUser() { return user; }
    public void setUser(String user) { this.user = user; }
    public Integer getUpvotes() { return upvotes; }
    public void setUpvotes(Integer upvotes) { this.upvotes = upvotes; }
}
