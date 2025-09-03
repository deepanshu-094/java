package Access_specifier;

public class student1 {
    // fields with different access specifiers
    public String publicVar = "I am PUBLIC";
    protected String protectedVar = "I am PROTECTED";
    String defaultVar = "I am DEFAULT (package-private)";
    private String privateVar = "I am PRIVATE";

    // public method
    public void display() {
        System.out.println("Inside student1 class:");
        System.out.println("Public Var: " + publicVar);
        System.out.println("Protected Var: " + protectedVar);
        System.out.println("Default Var: " + defaultVar);
        System.out.println("Private Var: " + privateVar);
    }
}
