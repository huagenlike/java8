package com.mzl.collections;

import com.mzl.typeinfo.pets.*;
import java.util.*;

/**
 * @ClassName： CollectionSequence
 * @Description： 集合与迭代器
 * @author：lhg
 * @data：2020/12/16 11:04
 * @Version：1.0
 **/
public class CollectionSequence extends AbstractCollection<Pet> {
    private Pet[] pets = Pets.array(8);
    @Override
    public int size() { return pets.length; }
    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() { // [1]
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < pets.length;
            }
            @Override
            public Pet next() { return pets[index++]; }
            @Override
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }
    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();
        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
    }
}
