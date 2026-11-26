import java.util.TreeSet;

public class OnlineCourseSkills {
    public static void main(String[] args) {

        TreeSet<String> skills = new TreeSet<>();

        skills.add("Java");
        skills.add("Python");
        skills.add("React");
        skills.add("SQL");
        skills.add("MongoDB");

        System.out.println("Available Skills:");
        System.out.println(skills);

        skills.add("SpringBoot");
        skills.add("NodeJS");

        skills.add("Java");

        System.out.println("\nAfter Adding New Skills:");
        System.out.println(skills);

        skills.remove("React");

        System.out.println("\nAfter Removing React:");
        System.out.println(skills);

        String searchSkill = "Python";

        if (skills.contains(searchSkill)) {
            System.out.println("\n" + searchSkill + " is available.");
        } else {
            System.out.println("\n" + searchSkill + " is not available.");
        }

        System.out.println("\nFirst Skill: " + skills.first());
        System.out.println("Last Skill: " + skills.last());

        System.out.println("\nSkills in Descending Order:");
        System.out.println(skills.descendingSet());
    }
}