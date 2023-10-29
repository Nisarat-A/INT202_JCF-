package sit.int202.jcfreview;

import lombok.*;

import java.util.Comparator;

@Getter
@Setter
@ToString
@NoArgsConstructor // ถ้าไม่ใส่จะไม่มี default constructor ให้ใช้
@AllArgsConstructor // ถ้าไม่ใส่จะไม่มี constructor ที่รับ parameter ให้ใช้
@EqualsAndHashCode(exclude = {"gpax"}) // ถ้าไม่ใส่จะไม่มี equals และ hashCode ให้ใช้
public class student implements Comparable<student> {
    private int id;
    private String name;
    private double gpax;
    public static final Comparator<student> sort_by_gpax_desc = new Comparator<student>() {
        @Override
        public int compare(student o1, student o2) {
            if (o1.getGpax()<o2.getGpax()){return  1;} else if (o1.getGpax()>o2.getGpax()) {return -1;}
            else {return o1.getName().compareTo(o2.getName());}
        }
    };

    @Override
    public int compareTo(student o) {
      return  this.getId() - o.getId()  ;
    }
}
