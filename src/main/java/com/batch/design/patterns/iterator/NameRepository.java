package com.batch.design.patterns.iterator;

/**
 * @ClassName NameRepository
 * @Description TODO
 * @Author long bao
 * @Date 10:15 18/7/6
 * @Version 1.0
 */
public class NameRepository implements Container{
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}