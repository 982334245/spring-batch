package com.batch.design.patterns.iterator;

/**
 * @ClassName Iterator
 * @Description TODO
 * @Author long bao
 * @Date 10:13 18/7/6
 * @Version 1.0
 */
public interface Iterator {
    /**
     * TODO  
     * @Author lb
     * @Date 10:13 18/7/6
     * @Param []
     * @return boolean
     **/
    boolean hasNext();
    /**
     * TODO  
     * @Author lb
     * @Date 10:15 18/7/6
     * @Param []
     * @return java.lang.Object
     **/
    Object next();
}
