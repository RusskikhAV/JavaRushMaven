package JavaCore.Level5;

import java.util.LinkedList;
import java.util.List;

/*
ООП - книги
*/

public class Level5lc2task4 {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + author;

            String output = "output";

            if (getBook().author == "Mark Twain") {
                return markTwainOutput;
            }
            if (getBook().author == "Agatha Christie") {
                return agathaChristieOutput;
            }

            return output;


        }

        public String toString() {
            return getOutputByBookType();
        }
    }

    public static class MarkTwainBook extends Book {
        private String author = "Mark Twain";
        private String title;

        public MarkTwainBook() {
            super("Mark Twain");
        }

        public MarkTwainBook(String title) {
            super("Mark Twain");
            this.title = title;
        }


        @Override
        public MarkTwainBook getBook() {
            return this;

        }

        @Override
        public String getTitle() {
            return title;
        }
    }

    public static class AgathaChristieBook extends Book {
        private String author = "Agatha Christie";
        private String title;

        public AgathaChristieBook() {
            super("Agatha Christie");
        }

        public AgathaChristieBook(String title) {
            super("Agatha Christie");
            this.title = title;
        }

        @Override
        public AgathaChristieBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }
}