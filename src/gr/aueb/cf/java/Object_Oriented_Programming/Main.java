package gr.aueb.cf.cf9.exercises.Object_Oriented_Programming;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Nikos", "Karberis");
        Book book1 = new Book("Epistrofi", "Nikos", 35);
        Isbn isbn = new Isbn("978-618");

        System.out.println("Student class");
        System.out.print(student1.getId() + " ");
        System.out.print(student1.getFirstName() + " ");
        System.out.print(student1.getLastName() + " ");
        System.out.println(Student.getStudentsCount() + " ");

        System.out.println();

        System.out.println("Book class");
        System.out.print(book1.getTitle() + " ");
        System.out.print(book1.getAuthor() + " ");
        book1.setPages(-10);
        System.out.print(book1.getPages() + " ");
        System.out.println(Book.getTotalBooks());

        System.out.println();

        System.out.println("Immutable ISBN");
        System.out.println(isbn.getIsbn());
    }
}
