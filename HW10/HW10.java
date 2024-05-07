import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
class HW10{
    public static void main(String[] args) throws IOException {
        //String filename="HW10.csv";
        //FileOutputStream f1=new FileOutputStream(filename);
        File filename=new File("HW10.csv");
        
        Map<String,Integer> school=new HashMap<>();
        String student="0",line;
        int a=0;
        Scanner s=new Scanner(System.in);
        int menu=0;
        FileReader fileReader=new FileReader(filename);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        if(filename.exists()) {
            try{
            
                while((line=bufferedReader.readLine())!=null){
                    String[] words=new String[2];
                    // words=line.split(",");
                    // if (words.length >= 2) { // 检查数组长度是否足够
                    //     String name = words[0];
                    //     int grade = Integer.parseInt(words[1]);
                    //     school.put(name, grade);
                    // } else {
                    //     // 如果数据格式不符合预期，可以选择跳过或者记录错误
                    //     System.out.println("Invalid data format: " + line);
                    // }
                   String name=words[0];
                   int grade=Integer.parseInt(words[1]);
                    school.put(name, grade);
                }
    }

    catch(IOException e){
        e.printStackTrace();;
    }
        }
        else{
            try {filename.createNewFile();}
            catch(IOException e){
                e.printStackTrace();
        }
        }

        
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
    //
     FileWriter fileWriter=new FileWriter(filename);
        
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
    try{
       
         for (Map.Entry<String, Integer> entry : school.entrySet()) {
               String contain=(entry.getKey() + ", " + entry.getValue());
               bufferedWriter.newLine();
              bufferedWriter.write(contain);
    }}
    catch(IOException e){
        e.printStackTrace();
    }
    bufferedWriter.close();
     
    }

    private static Integer valueOf(String string) {
        return null;
    }
}