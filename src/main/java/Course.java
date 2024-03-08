import java.util.List;

public class Course {
    private int number;
    private String title;
    private List<String> category;
    private float credits;

    public Course(String title, int number, List<String> category, float credits){
        this.title = title;
        this.number = number;
        this.category = category;
        this.credits = credits;
    }

    public int getNumber() { return number; }
    public String getTitle() { return  title; }
    public List<String> getCategory() { return category; }
    public float getCredits() { return credits; }

}
