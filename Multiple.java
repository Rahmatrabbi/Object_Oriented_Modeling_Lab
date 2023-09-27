
interface Parent1 {
    void father();
}


interface Parent2 {
    void mother();
}

class Child implements Parent1, Parent2 {
    @Override
    public void father() {
        System.out.println("Father Name: X");
    }

    @Override
    public void mother() {
        System.out.println("Mother Name: Y");
    }
}

public class Multiple {
    public static void main(String[] args) {
        Child child = new Child();
        child.father();
        child.mother();
    }
}
