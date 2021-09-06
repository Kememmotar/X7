package com.lessons.junior.n003;

public class ElementsList<E> {

    private E value;

    private ElementsList previousElement;

    private ElementsList nextElement;
    public ElementsList getPreviousElement() {
        return previousElement;
    }

    public ElementsList getNextElement() {
        return nextElement;
    }

    public void setPreviousElement(ElementsList previousElement) {
        this.previousElement = previousElement;
    }

    public void setNextElement(ElementsList nextElement) {
        this.nextElement = nextElement;
    }

    public ElementsList(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }
}
