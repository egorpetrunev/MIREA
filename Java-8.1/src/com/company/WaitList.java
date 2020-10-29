package com.company;

import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E>{
    protected ConcurrentLinkedQueue<E> queue_;

    public WaitList()
    {
        queue_ = new ConcurrentLinkedQueue<E>();
    }
    public WaitList(WaitList<E> a)
    {
        queue_ = new ConcurrentLinkedQueue<E>(a.queue_);
    }
    @Override
    public void add(E a) {
        queue_.add(a);
    }

    @Override
    public boolean remove(E a) {
        return queue_.remove(a);
    }

    @Override
    public boolean contains(E a) {
        return queue_.contains(a);
    }

    @Override
    public boolean containsAll(WaitList<E> a) {
        return queue_.containsAll(a.queue_);
    }

    @Override
    public boolean isEmpty() {
        return queue_.isEmpty();
    }

    public String toString()
    {
        ConcurrentLinkedQueue<E> buf_vec = new ConcurrentLinkedQueue<>(queue_);
        String a = "";
        E buf;
        while (true)
        {
            buf = buf_vec.poll();
            if (buf==null) break;
            a+="\t"+buf;
        }
        return "Текущий состав очереди:\n" + a;
    }
}
