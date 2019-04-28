package linkedLists;

public class Main {

    public static void main(String[] args) {
        Employee joanJett = new Employee("Joan", "Jett", 673909);
        Employee artemisEntreri = new Employee("Artemis", "Entreri", 489007);
        Employee caitSith = new Employee("Cait", "Sith", 290276);
        Employee gandolf = new Employee("Gandolf", "the Gray", 324501);
        Employee cliffBurton = new Employee("Cliff", "Burton", 780299);
        Employee JimboBear = new Employee("Jimbo", "Bear", 837726);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(joanJett);
        list.addToFront(artemisEntreri);
        list.addToFront(caitSith);
        list.addToFront(gandolf);

        list.printList();
        System.out.print("\n\n");

        list.addBefore(cliffBurton, artemisEntreri);
        list.printList();
        System.out.print("\n\n");

        list.addBefore(JimboBear, gandolf);
        list.printList();
        System.out.print("\n\n");
    }
}
