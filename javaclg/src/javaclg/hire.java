package javaclg;

class Parent {
    String eyecolor = "blue";
    String haircolor = "black";

    void property() {
        System.out.println("Parent property");
    }

    void business() {
        System.out.println("Parent's furniture business");
    }
}

class Child1 extends Parent {
    void Btech() {
        System.out.println("Done B.Tech");
    }

    void engineer() {
        System.out.println("Child is an Engineer");
    }
}

class Child2 extends Parent {
    void MBBS() {
        System.out.println("Done MBBS");
    }

    void doctor() {
        System.out.println("Child is a Doctor");
    }
}

public class hire {
    public static void main(String[] args) {

       
        Child1 c1 = new Child1();
        System.out.println("Child1 Details:");
        System.out.println("Eye Color: " + c1.eyecolor);
        System.out.println("Hair Color: " + c1.haircolor);
        c1.property();   
        c1.business();   
        c1.Btech();      
        c1.engineer();   
        System.out.println();

        
        Child2 c2 = new Child2();
        System.out.println("Child2 Details:");
        System.out.println("Eye Color: " + c2.eyecolor);
        System.out.println("Hair Color: " + c2.haircolor);
        c2.property();   
        c2.business();  
        c2.MBBS();       
        c2.doctor();     
    }
}
