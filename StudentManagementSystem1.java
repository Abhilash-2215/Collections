import java.util.*;

public class StudentManagementSystem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> studentid=new ArrayList<>(), studentMarks=new ArrayList<>();
        ArrayList<String> studentnames=new ArrayList<>();
        LinkedList<String> attendanceList = new LinkedList<>();
        int choice = 0;

        while(choice!=11) {
            System.out.println("\nStudent Management System\n======================\n1.add student\n2.Display all\n3.search student\n4.update Student MArks\n5.Remove Student\n6.Add stu Attendence\n7.Display attendence\n8.remove attendence\n9.stu stats\n10.sort stu name\n11.exit\n enter ypur choice:");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    System.out.println("enter stu ID:"); int id =sc.nextInt(); sc.nextLine();
                    System.out.println("enter stu name:"); String name=sc.nextLine();
                    System.out.println("enter stu marks:"); int marks=sc.nextInt();
                    if(marks<0 || marks>100) System.out.println("marks shld be bet 0 and 100");
                    else {
                        studentid.add(id); studentnames.add(name); studentMarks.add(marks);
                        System.out.println("student added ");
                    }
                    break;
                case 2:
                    if(studentnames.isEmpty()) System.out.println("no studet found");
                    else {
                        System.out.println("student records");
                        for(int i=0;i<studentnames.size();i++) System.out.println(studentid.get(i)+" "+studentnames.get(i)+" "+studentMarks.get(i));
                        System.out.println("total students:"+studentnames.size());
                    }
                    break;
                case 3:
                    System.out.println("enter stu name to search:"); String sname=sc.nextLine();
                    if(studentnames.contains(sname)) {
                        int idx=studentnames.indexOf(sname);
                        System.out.println("student found\nid:"+studentid.get(idx)+" name:"+studentnames.get(idx)+" marks:"+studentMarks.get(idx));
                    } else System.out.println("student not founf");
                    break;
                case 4:
                    System.out.println("enter stu name to update:"); String uname=sc.nextLine();
                    if(studentnames.contains(uname)) {
                        int idx=studentnames.indexOf(uname);
                        System.out.println("enter new marks:"); int nmarks=sc.nextInt();
                        if(nmarks<0 || nmarks>100) System.out.println("marks shld be bet 0 and 100");
                        else {
                            studentMarks.set(idx,nmarks);
                            System.out.println("marks updated:"+studentnames.get(idx)+" "+studentMarks.get(idx));
                        }
                    } else System.out.println("student not founf");
                    break;
                case 5:
                    System.out.println("enter stu name to remove:"); String rname=sc.nextLine();
                    if(studentnames.contains(rname)) {
                        int idx=studentnames.indexOf(rname);
                        studentid.remove(idx); studentnames.remove(idx); studentMarks.remove(idx);
                        System.out.println("student removed");
                    } else System.out.println("student not founf");
                    break;
                case 6:
                    System.out.println("enter stu name for attendence:"); String aname=sc.nextLine();
                    System.out.println("1.add first 2.add last"); int pos=sc.nextInt();
                    if(pos==1) attendanceList.addFirst(aname); else attendanceList.addLast(aname);
                    System.out.println("attendence added");
                    break;
                case 7:
                    if(attendanceList.isEmpty()) System.out.println("attendence list empty");
                    else {
                        System.out.println("present students:"+attendanceList+"\ntotal present:"+attendanceList.size()+"\nenter name to search in attendence:");
                        String searchatt=sc.nextLine();
                        System.out.println(attendanceList.contains(searchatt) ? searchatt+" is present" : searchatt+" not in attendence");
                    }
                    break;
                case 8:
                    if(attendanceList.isEmpty()) System.out.println("attendence list empty");
                    else {
                        System.out.println("1.remove one stu 2.clear all"); int rchoice=sc.nextInt(); sc.nextLine();
                        if(rchoice==1) {
                            System.out.println("enter stu name to remove:"); String ratt=sc.nextLine();
                            if(attendanceList.contains(ratt)) { attendanceList.remove(ratt); System.out.println("removed from attendence"); }
                            else System.out.println("student not founf");
                        } else { attendanceList.clear(); System.out.println("all attendence cleared"); }
                    }
                    break;
                case 9:
                    if(studentMarks.isEmpty()) System.out.println("no studet found");
                    else {
                        int high=Collections.max(studentMarks), low=Collections.min(studentMarks), sum=0, count75=0;
                        for(int m : studentMarks) { sum+=m; if(m>75) count75++; }
                        System.out.println("total students:"+studentnames.size()+"\nhighest marks:"+high+"\nlowest marks:"+low+"\navg marks:"+((double)sum/studentMarks.size())+"\nabove 75:"+count75);
                    }
                    break;
                case 10:
                    if(studentnames.isEmpty()) System.out.println("no studet found");
                    else {
                        ArrayList<String> sortlist=new ArrayList<>(studentnames);
                        Collections.sort(sortlist); System.out.println("sorted names:"+sortlist);
                        Collections.reverse(sortlist); System.out.println("reverse names:"+sortlist);
                    }
                    break;
                case 11: System.out.println("exiting..."); break;
                default: System.out.println("invalid choice");
            }
        }
    }
}