package com.batch.design.patterns.iterator;

/**
 * @ClassName IteratorPatternDemo
 * @Description TODO
 * @Author long bao
 * @Date 10:15 18/7/6
 * @Version 1.0
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
