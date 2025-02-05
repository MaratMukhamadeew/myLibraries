package practice.javaRush.tasks.tasks15__.task1504;

import java.util.LinkedList;
import java.util.List;

public class Solution {
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
            String agathaCristieOutput = author + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + author;
            if (this instanceof MarkTwainBook) {
                return markTwainOutput;
            }
            if (this instanceof AgathaChristieBook) {
                return agathaCristieOutput;
            }
            String output = "output";

            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }
    public static class MarkTwainBook extends Book {
        private String title;
        public MarkTwainBook(String title) {
            super("Mark Twain");
            this.title = title;
        }

        public MarkTwainBook getBook() {
            return this;
        }
        public String getTitle(){
            return title;
        }
    }
    public static class AgathaChristieBook extends Book {
        private String title;
        public AgathaChristieBook(String title) {
            super("Agatha Christie");
            this.title = title;
        }

        public AgathaChristieBook getBook() {
            return this;
        }
        public String getTitle(){
            return title;
        }
    }
}
