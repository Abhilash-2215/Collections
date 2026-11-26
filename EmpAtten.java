import java.util.ArrayList;
public class EmpAtten {
    public static void main(String[] args) {
    ArrayList<String> names= new ArrayList<>();
    System.out.println("employees proeset:");
    names.add("Abhi");
    names.add("gowri");
    names.add("tharun");
    names.add("Saran");

    System.out.println("newly present employees:");
    names.add("mehek");
    names.add("bishnoi");

    System.out.println("removing absesnites:");
    names.remove("gowri");
    names.remove("Saran");

    System.out.println("attendence list:");
    for(String emp : names)
    {
        System.out.println(emp);
    }
    String search="Abhi";
    if(names.contains(search))
    {
        System.out.println("present");
    }
    else{
        System.out.println("absent");
    }

    System.out.println("total:"+names.size());

    System.out.println("reverse order");
    for(int i = names.size()-1;i>=0;i--)
    {
        System.out.println(names.get(i));
    }





    }
    
}
