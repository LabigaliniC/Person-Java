public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("Alexandre", "Rua 12, 1");
        System.out.println(p);
        p.setAddress("Rua 57, 312");
        System.out.println(p);


        Staff s = new Staff("Carlos", "Rua Wolf, 30", "Catolica", 800);
        System.out.println(s);
        System.out.println("Nome: " + s.getName());
        s.setAddress("Rua Alves, 41");
        System.out.println(s);


    }

}