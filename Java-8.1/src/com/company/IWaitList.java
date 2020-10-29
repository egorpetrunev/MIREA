package com.company;

import java.util.Collection;

public interface IWaitList<E>{

    public void add(E a);
    public boolean remove(E a);
    public boolean contains(E a);
    public boolean containsAll(WaitList<E> a);
    public boolean isEmpty();
}
