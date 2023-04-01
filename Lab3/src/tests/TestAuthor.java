package tests;

import entity.Author;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Bolesław", "Prus", 55);
        Author author2 = new Author("Bolesław", "Prus", 55);
        Author author3 = new Author("Eliza", "Orzeszkowa", 34);
        System.out.println(author1.toString());
        System.out.println("Author surname = " + author2.getSurname());
        author2.setSurname("Leśmian");
        System.out.println(author2.toString());
        System.out.println(author3.toString());
        System.out.println("Name: " + author3.getName() + " age: " + author3.getAge());
    }
}
