package com.company;

import java.util.concurrent.ConcurrentLinkedQueue;

public class BoundedWaitList<E> extends WaitList<E>{
    private int capacity;
    public BoundedWaitList(int capacity)
    {
        this.capacity = capacity;
        queue_ = new ConcurrentLinkedQueue<E>();
    }
    public int getCapacity()
    {
        return capacity;
    }
    @Override
    public void add(E a)
    {
        if (queue_.size()!=capacity)
            queue_.add(a);
    }
    @Override
    public String toString()
    {
        String a = "";
        E buf;
        ConcurrentLinkedQueue<E> buf_vec = new ConcurrentLinkedQueue<>(queue_);
        while (true)
        {
            buf = buf_vec.poll();
            if (buf==null) break;
            a+="\t"+buf;
        }
        return "Текущий состав очереди:\n" + a+"\nCapacity = "+capacity;
    }
}
