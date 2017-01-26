package com.stone.guava.basicutils;

import com.google.common.base.Optional;


/**
 * desc   :
 * author : stone
 * email  : aa86799@163.com
 * time   : 25/01/2017 17 45
 */
public class OptionalTest {

    public static <T> void of(T t) {
        Optional<T> v = Optional.of(t);
        System.out.println("of创建指定引用的Optional实例，若引用为null则快速失败:" + v);
    }

    public static void absent() {
        Optional v = Optional.absent();
        System.out.println("absent创建引用缺失的Optional实例" + v);
        System.out.println("absent如果Optional包含非null的引用（引用存在），返回true：" + v.isPresent());
    }

    public static <T> void fromNullable(T t) {
        Optional<T> v = Optional.fromNullable(t);
        System.out.println("fromNullable创建指定引用的Optional实例，若引用为null则表示缺失:" + v);
    }

    public static <T> void get(T t) {
        Optional<T> v = Optional.of(t);
        System.out.println("get返回Optional所包含的引用，若引用缺失，则抛出java.lang.IllegalStateException:" + v.get());
    }

    public static <T> void or(T t) {
//        Optional<T> v = Optional.fromNullable(t);
        Optional<T> v = (Optional<T>) Optional.fromNullable(t);
        System.out.println("or返回Optional所包含的引用，或是or之前或之后非null的引用，若都为null则快速失败:" + v.or(t));
    }

    public static <T> void orNull(T t) {
        Optional<T> v = Optional.fromNullable(t);
//        Optional<T> v = (Optional<T>) Optional.fromNullable(null);
        System.out.println("orNull返回Optional所包含的引用，若引用缺失，返回null: " + v.orNull());
    }

    public static <T> void asSet(T t) {
        Optional<T> v = Optional.of(t);
//        Optional<T> v = (Optional<T>) Optional.fromNullable(null);
        System.out.println("asSet返回Optional所包含引用的单例不可变集，如果引用存在，" +
                "返回一个只有单一元素的集合，如果引用缺失，返回一个空集合: " + v.asSet());
    }
}
