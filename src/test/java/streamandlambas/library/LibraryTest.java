package streamandlambas.library;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {

    @Test
    public void methodTestSumOfAgesForFemale() {
        List<Book> books = getBooks();
        Integer expectedAge = 42;

        Integer actualAge = books.stream()
                .map(Book::getAuthor)
                .filter(a -> a.getGender().equals(Gender.FEMALE))
                .map(Author::getAge)
                .filter(age -> age <= 25)
                .reduce(0, Integer::sum);

        Assert.assertEquals(expectedAge, actualAge);
    }

    private List<Book> getBooks() {
        List<Book> books = new ArrayList<>();

        Author authorOne = new Author("AuthorOne", 56, Gender.MALE);
        Author authorTwo = new Author("AuthorTwo", 62, Gender.FEMALE);
        Author authorThree = new Author("AuthorThree", 45, Gender.MALE);
        Author authorFourth = new Author("AuthorFourth", 20, Gender.FEMALE);
        Author authorFive = new Author("AuthorFive", 22, Gender.FEMALE);
        Author authorSix = new Author("AuthorSix", 35, Gender.MALE);

        books.add(new Book("Title 1", 10.10F, authorOne));
        books.add(new Book("Title 2", 20.10F, authorTwo));
        books.add(new Book("Title 3", 12.78F, authorThree));
        books.add(new Book("Title 4", 25.61F, authorFourth));
        books.add(new Book("Title 5", 65.15F, authorFive));
        books.add(new Book("Title 6", 21.41F, authorSix));

        return books;
    }

}
