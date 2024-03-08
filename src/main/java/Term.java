import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Term {
    private String season;
    private int year;
    private ArrayList<Course> courses;

    public Term(){
        this("",0000);
    }

    public Term(String season, int year){
        this.season = season;
        this.year = year;
        this. courses = new ArrayList<>();
    }

    public void addCourse(Course course){ courses.add(course); }
    public void deleteCourse(String courseName){
        for (int i =0; i<courses.size();i++){
            if(courseName.equalsIgnoreCase(courses.get(i).getTitle())) {
                courses.remove(i);
                System.out.println("Course removed!");
                return;
            }
        }
        System.out.println("Course Not Found");
    }

    public String getSeason(){ return season; }
    public int getYear() { return year; }
    public ArrayList<Course> getCourses() { return courses; }

    @Override
    public String toString() {
        return season + " " + year + " " + courses;
    }

}
