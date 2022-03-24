/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu_2;

/**
 *
 * @author FASIH
 */
class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){     
        return age;
    }
    
}

public class managingpeople {
    public static void main(String[] args) {
        Person p1 = new Person("Arial",37);
        Person p2 = new Person("Joseph",15);
        
        if (p1.getAge()==p2.getAge()) {
            System.out.println(p1.getName()+" is the same age as "+p2.getName());
        }else{
            System.out.println(p1.getName()+ " ia  NOT the same  age as "+p2.getName());                  
        }
        
    }
}
