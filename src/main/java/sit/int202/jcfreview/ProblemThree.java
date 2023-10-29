package sit.int202.jcfreview;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProblemThree {
    //check ว่ามีไฟล์ไหมนะ
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.txt");
        if (!file.exists()) {
            System.out.println("file not exist!");
            return;
        }
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
    }
}
