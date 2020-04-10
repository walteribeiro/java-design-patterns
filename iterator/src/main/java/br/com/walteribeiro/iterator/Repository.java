package br.com.walteribeiro.iterator;

/**
 * @author Walter Ribeiro
 * @since 10/04/2020
 */
public class Repository implements Container {

    private final String[] nomes = {"Walter Ribeiro", "Dan Abramov", "Ryan Florence"};

    @Override
    public CustomIterator getIterator() {
        return new NameCustomIterator();
    }

    private class NameCustomIterator implements CustomIterator {

        int index;

        @Override
        public boolean hasNext() {
            return index < nomes.length;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                final String result = nomes[index];
                index++;
                return result;
            }
            return null;
        }
    }
}
