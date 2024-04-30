import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//import java.util.Arrays.sort();
class HW9_3{
    public static void main(String[] args) {
        Map<String,Integer> school=new HashMap<>();
        String student="0";
        int a=0;
        Scanner s=new Scanner(System.in);
        int menu=0;
        while(menu!=6){
            System.out.println("輸入功能[1]新增成績,[2]查詢成績,[3]修改學生成績,[4]刪除學生成績,[5]列出所有學生成績[6]退出:");
            menu=s.nextInt();
            if(menu==1){
                System.out.print("輸入姓名:");
                student=s.next();
                school.put(student, a);
                System.out.print("輸入成績:");
                a=s.nextInt();
                school.put(student, a);
            }
            if(menu==2){
                System.out.print("輸入姓名:");
                student=s.next();
                if (school.containsKey(student)) {
                    System.out.println(student + "的成績是: " + school.get(student));
                    } 
                else {
                    System.out.println("沒有找到" + student + "的成績。");
                    }
            }
            if(menu==3){
                System.out.print("輸入要修改的學生姓名:");
                student=s.next();
                if (school.containsKey(student)) {
                    System.out.print("輸入成績:");
                    a=s.nextInt();
                    school.put(student,a);
                    System.out.println(student + "的成績是: " + school.get(student));
                    } 
                else {
                    System.out.println("沒有找到" + student + "的成績。");
                    }
            }
            if(menu==4){
                System.out.print("輸入要刪除的學生姓名:");
                student=s.next();
                if (school.containsKey(student)) {
                    school.remove(student);
                    } 
                else {
                    System.out.println("沒有找到" + student + "的成績。");
                    }
            }
            if(menu==5){
                System.out.println("學生成績列表:");
                for (Map.Entry<String, Integer> entry : school.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
            if(menu==6){
                System.out.println("掰咪");
                break;
            }
        
    }
    }
}