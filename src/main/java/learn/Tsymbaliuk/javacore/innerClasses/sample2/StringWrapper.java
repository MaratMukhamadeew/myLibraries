package learn.Tsymbaliuk.javacore.innerClasses.sample2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StringWrapper implements Iterable<Character> {
    private String text;

    public StringWrapper(String text) {
        super();
        this.text = text;
    }

    @Override
    public Iterator<Character> iterator() {
        return new StringIterator();
    }

    private class StringIterator implements Iterator<Character> {
        private int start = 0;

        @Override
        public boolean hasNext() {
            return start < text.length();
        }

        @Override
        public Character next() {
            if (hasNext()) {
                return text.charAt(start++);
            }
            throw new NoSuchElementException();
        }
    }
}
