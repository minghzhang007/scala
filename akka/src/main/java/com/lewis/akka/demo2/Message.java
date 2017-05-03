package com.lewis.akka.demo2;

import java.util.Collections;
import java.util.List;

/**
 * @author zmh46712
 * @version Id: Message, v 0.1 2017/5/3 10:10 zmh46712 Exp $
 */
public final class Message {

    private final int          age;
    private final List<String> list;

    public Message(int age, List<String> list) {
        this.age = age;
        this.list = Collections.unmodifiableList(list);
    }

    public int getAge() {
        return age;
    }

    public List<String> getList() {
        return list;
    }
}
