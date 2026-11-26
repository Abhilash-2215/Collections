import java.util.ArrayList;
class AeeayList
{
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Abhi");
        students.add("maa");
        students.add("dinesh");
        students.add("kishore");
        students.add("sanju");
        students.add("goeri");
        students.add("Bharath");
        students.add("vishnu");
        students.add("arjun");
        students.add("riyai");

        System.out.println("studetns list:");
        for(String student:students)
        {
            System.out.println(student);
        }
        students.add(2,"dinesh");

        students.remove("Ravi");

        System.out.println("after removing");
        System.out.println(students);

        String searchName = "goeri";
        if(students.contains(searchName))
        {
            System.out.println("existst int list");
        }
        else{
            System.out.println("not exist in list");
        }

        System.out.println("total size:"+students.size());


    }
}