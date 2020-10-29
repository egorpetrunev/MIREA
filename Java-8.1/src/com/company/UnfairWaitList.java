package com.company;

import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<E> extends WaitList<E> {
    UnfairWaitList() {
        super();
    }

    @Override
    public boolean remove(E a)
    {
        ConcurrentLinkedQueue<E> buf_vec = new ConcurrentLinkedQueue<>(queue_);
        ConcurrentLinkedQueue<E> as = new ConcurrentLinkedQueue<>();
        E temp;
        while(buf_vec.size()!=0)
        {
            temp = buf_vec.poll();
            if (temp==a)
            {
                while(buf_vec.size()!=0)
                {
                    temp = buf_vec.poll();
                    as.add(temp);
                }
            }
            else
            {
                as.add(temp);
            }
        }
        queue_ = new ConcurrentLinkedQueue<>(as);
        return false;
    }
    public void moveToBack(E a)
    {
        ConcurrentLinkedQueue<E> buf_vec = new ConcurrentLinkedQueue<>(queue_);
        ConcurrentLinkedQueue<E> as = new ConcurrentLinkedQueue<>();
        E temp, temp2 = buf_vec.peek();
        while(buf_vec.size()!=0)
        {
            temp = buf_vec.poll();
            if (temp==a)
            {
                temp2 = temp;
                while(buf_vec.size()!=0)
                {
                    temp = buf_vec.poll();
                    as.add(temp);
                }
            }
            else
            {
                as.add(temp);
            }
        }
        as.add(temp2);
        queue_ = new ConcurrentLinkedQueue<>(as);
    }

}
