import java.util.Scanner;
class HW8{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        String name;
        int hp,atk,def,mp;
        
        int job,count=1;
        Warrior p1=new Warrior("a", 100, 50, 10);
        Mage p2=new Mage("b", 100, 40, 60);
        p1.display();
        p2.display();
        /* 
        System.out.println("戰士(1)or法師(2):");
        job=s.nextInt();
        if(job==1){
            System.out.println("輸入名稱:");
            name=s.next();
            System.out.println("輸入hp:");
            hp=s.nextInt();
            System.out.println("輸入攻擊力:");
            atk=s.nextInt();
            System.out.println("輸入防禦力:");
            def=s.nextInt();
            Warrior p1=new Warrior(name, hp, atk, def);
            
        }
        else if(job==2){
            System.out.println("輸入名稱:");
            name=s.next();
            System.out.println("輸入hp:");
            hp=s.nextInt();
            System.out.println("輸入攻擊力:");
            atk=s.nextInt();
            System.out.println("輸入法力:");
            mp=s.nextInt();
            Mage p1=new Mage(name, hp, mp, mp);
            
        }
        System.out.println("戰士(1)or法師(2):");
        job=s.nextInt();
        if(job==1){
            System.out.println("輸入名稱:");
            name=s.next();
            System.out.println("輸入hp:");
            hp=s.nextInt();
            System.out.println("輸入攻擊力:");
            atk=s.nextInt();
            System.out.println("輸入防禦力:");
            def=s.nextInt();
            Warrior p2=new Warrior(name, hp, atk, def);
            
        }
        else if(job==2){
            System.out.println("輸入名稱:");
            name=s.next();
            System.out.println("輸入hp:");
            hp=s.nextInt();
            System.out.println("輸入攻擊力:");
            atk=s.nextInt();
            System.out.println("輸入法力:");
            mp=s.nextInt();
            Mage p2=new Mage(name, hp, mp, mp);
        }*/

        while(p1.health>0||p2.health>0){
            int play;
            count+=1;
            //System.out.println("count:"+count/2);
            if(count%2==0){
                System.out.println("玩家1");
                System.out.println("攻擊(1)增加防禦(2)");
                play=s.nextInt();
                if(play==1){
                    p1.attack(p2);
                }
                else if(play==2) {
                    p1.shield();
                }
            }
            else if(count%2!=0){
                System.out.println("玩家2");
                System.out.println("攻擊(1)施法(2)");
                play=s.nextInt();
                if(play==1){
                    p2.attack(p1);
                }
                else if(play==2) {
                    p2.castspell(p1);;
                }
            }
            if(p1.health<=0||p2.health<=0){
                break;
            }
            
        }
        System.out.println("over");
        
        
    }
}
abstract class chara{
    String name;
    int health,attackPower;
    public abstract void display();
    chara(String n,int hp,int atk){
        name=n;
        health=hp;
        attackPower=atk;
    }
    public void attack(chara other){
        other.takeDamage(attackPower);
    }
    public void takeDamage(int damage){
        //int reduce=Math.max(damage, 0);
        health-=damage;
        System.out.println(name+"受到傷害:"+damage+"剩餘hp:"+health);
    }
}
class Warrior extends chara{
    int def;
    
    Warrior(String n, int hp, int atk,int def) {
        super(n, hp, atk);
        this.def=def;
        //TODO Auto-generated constructor stub
    }
    
    void shield(){
        def+=10;
        System.out.println("防禦力增加至:"+def);
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'display'");
        System.out.println("戰士名稱"+name+"hp:"+health+"攻擊力:"+attackPower+"防禦力:"+def);
    }
    public void takeDamage(int damage){
        
        damage-=def;
        if(damage>0){
            health=health-damage;

            System.out.println(name+"受到傷害:"+damage+"剩餘hp:"+health);
        }
        else{
            System.out.println(name+"受到傷害:"+0+"剩餘hp:"+health);
        }
        
    }
}
class Mage extends chara{
    int mp;
    Mage(String n, int hp, int atk,int mp) {
        super(n, hp, atk);
        this.mp=mp;
        //TODO Auto-generated constructor stub
    }
    
    void castspell(chara other){
        if(mp>=20){
            int spellpower=attackPower*2;
            other.takeDamage(spellpower);
            mp-=20;
            System.out.println("施法造成:"+spellpower+"傷害");
        }
        else{
            System.out.println("法力不足");
        }
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'display'");
        System.out.println("法師名稱"+name+"hp:"+health+"攻擊力:"+attackPower+"法力:"+mp);
    }
}