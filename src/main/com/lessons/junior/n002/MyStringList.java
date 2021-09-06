package com.lessons.junior.n002;

public class MyStringList implements MyList {
    private String[] strings = new String[0];
    @Override
    public void clear() {
        strings = new String[0];
    }

    @Override
    public int size() {
        return strings.length;
    }

    @Override
    public boolean isEmpty() {
        return (strings.length == 0);
    }

    @Override
    public boolean contains(String var) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(var)) return true;
        }
        return false;
    }

    @Override
    public boolean add(String string) {
        String[] tmpStrings = new String[strings.length + 1];
        fillArray(strings, tmpStrings);
        tmpStrings[strings.length] = string;
        strings = new String[tmpStrings.length];
        fillArray(tmpStrings, strings);
        return true;
    }

    @Override
    public boolean remove(String var) {
        String[] tmpStrings = new String[strings.length];
        int j = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(var)) continue;
            tmpStrings[j] = strings[i];
            j++;
        }
        strings = new String[j];
        fillArray(tmpStrings, strings);
        return true;
    }

    private void fillArray(String[] fromStrings, String[] toStrings) {
        int length = 0;
        if (fromStrings.length < toStrings.length)
            length = fromStrings.length;
        else
            length = toStrings.length;
        for (int i = 0; i < length; i++) {
            toStrings[i] = fromStrings[i];
        }
    }

    @Override
    public MyIterator iterator() {
        return new MyStringIterator(strings);
}

}
