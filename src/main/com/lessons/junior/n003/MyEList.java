package com.lessons.junior.n003;

public class MyEList<E> implements MyList<E> {

    int countElements = 0;
    ElementsList firstElement;
    ElementsList endElement;
    ElementsList currentElement;

    @Override
    public void clear() {
        countElements = 0;
        firstElement = null;
        endElement = null;
        currentElement = null;
    }

    @Override
    public int size() {
        return countElements;
    }

    @Override
    public boolean isEmpty() {
        return countElements == 0;
    }

    @Override ////////////////////
    public boolean contains(E var) {
        currentElement = firstElement;
        if (currentElement == null) return true;
        while (currentElement != null) {
            ElementsList element = currentElement;
            if (element.getValue().equals(var)) {
                return true;
            }
            currentElement = element.getNextElement();
        }
        return false;
    }

    @Override
    public boolean add(E string) {
        ElementsList<E> newElement = new ElementsList<>(string);
        if (isEmpty()) firstElement = newElement;
        if (endElement == null) {
            endElement = newElement;
        } else {
            endElement.setNextElement(newElement);
            newElement.setPreviousElement(endElement);
            endElement = newElement;
        }
        countElements++;
        return true;
    }

    @Override //////////////////////////
    public boolean remove(E var) {
        currentElement = firstElement;
        if (currentElement == null) return true;
        while (currentElement != null) {
            ElementsList element = currentElement;
            if (element.getValue().equals(var)) {
                ElementsList previousElement = element.getPreviousElement();
                ElementsList nextElement = element.getNextElement();

                if (previousElement == null && nextElement == null) {
                    countElements--;
                    firstElement = null;
                    endElement = null;
                } else if (previousElement == null) {
                    countElements--;
                    firstElement = nextElement;
                    nextElement.setPreviousElement(null);
                } else if (nextElement == null) {
                    countElements--;
                    endElement = previousElement;
                    previousElement.setNextElement(null);
                } else {
                    countElements--;
                    nextElement.setPreviousElement(previousElement);
                    previousElement.setNextElement(nextElement);
                }
            }
            currentElement = element.getNextElement();
        }

        return true;
    }

    @Override
    public MyIterator iterator() {
        return new MyEIterator(firstElement);
    }

    private class MyEIterator<E> implements MyIterator {

        private ElementsList currentElement;

        public MyEIterator(ElementsList currentElement) {
            this.currentElement = currentElement;
        }

        @Override
        public boolean hasNext() {
            if (currentElement == null)
                return false;
            return true;
        }

        @Override
        public E next() {
            if (hasNext()) {
                ElementsList returnValue = currentElement;
                currentElement = currentElement.getNextElement();
                return (E) returnValue.getValue();
            }
            return null;
        }
    }
}
