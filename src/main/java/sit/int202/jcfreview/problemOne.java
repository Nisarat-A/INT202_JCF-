package sit.int202.jcfreview;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class problemOne {
    public static void main(String[] args) {
        Set<student> studentSet = new HashSet<>(200,0.5f); // 200 คือ initial capacity, 0.5f คือ load factor
    studentSet.add(new student(10001,"Somsri",3.25));
    studentSet.add(new student(10002,"Somsak",3.00));
    studentSet.add(new student(10009,"Somchai",3.26));
    studentSet.add(new student(10007,"Somsri",3.25));
    studentSet.add(new student(10037,"Sirisopaphan",3.25));
        for (student s : studentSet) {
            System.out.println(s + "-> " + s.hashCode());
        }
        Set<student> studentSet2 = new TreeSet<>();
        studentSet2.add(new student(10001,"Somsri",3.25));
        studentSet2.add(new student(10002,"Somsak",3.00));
        studentSet2.add(new student(10009,"Somchai",3.26));
        studentSet2.add(new student(10007,"Somsri",3.25));
        studentSet2.add(new student(10037,"Sirisopaphan",3.25));
        System.out.println("-----------------------------------");
        for (student s2:studentSet2) {
            System.out.println(s2 + "-> " + s2.hashCode());
        }
        List<student> tmpList = studentSet.stream().sorted(student.sort_by_gpax_desc).toList();
        System.out.println("---------------------------");
        for (student s :
            studentSet ) {
            System.out.println(s+" -> "+s.hashCode());
        }}

}
