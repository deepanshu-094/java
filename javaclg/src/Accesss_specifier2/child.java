package Accesss_specifier2;

import Access_specifier.student1;

public class child extends student1 {
    public static void main(String[] args) {
        student1 obj1 = new student1();
        System.out.println("Accessing through object of student1:");
        System.out.println("Public: " + obj1.publicVar);   // ✅ allowed
        // System.out.println("Protected: " + obj1.protectedVar); // ❌ error (different package, not subclass object)
        // System.out.println("Default: " + obj1.defaultVar);     // ❌ error (different package)
        // System.out.println("Private: " + obj1.privateVar);     // ❌ error (private)

        child obj2 = new child();
        System.out.println("\nAccessing through child subclass:");
        System.out.println("Public: " + obj2.publicVar);     // ✅ allowed
        System.out.println("Protected: " + obj2.protectedVar); // ✅ allowed (through inheritance)
        // System.out.println("Default: " + obj2.defaultVar);   // ❌ error (different package)
        // System.out.println("Private: " + obj2.privateVar);   // ❌ error (private)
    }
}
