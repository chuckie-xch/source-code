package com.bestcode.study.sourcecode.jdk.collection;

/**
 * 集合顶级接口
 *
 * @author <a href="mailto:1205241831@qq.com">Xch</a>
 * @version 1.00
 * @see
 * @since 2018.02.03
 */
public interface Collection<E> extends Iterator{

    // 12

    boolean add(E e);

    Object[] toArray();

    int size();

    void clear();

    boolean isEmpty();

}
