import java.util.HashMap;
import java.util.List;

public class CourseMember {
    private String name;
    List <String> courses;
    HashMap<String, Integer> avgScore;

    public CourseMember(String name, List<String> courses, HashMap<String, Integer> avgScore) {
        this.name = name;
        this.courses = courses;
        this.avgScore = avgScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public HashMap<String, Integer> getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(HashMap<String, Integer> avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return "CourseMember{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                ", avgScore=" + avgScore +
                '}';
    }
}
