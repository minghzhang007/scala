package com.lewis.akka.demo5;

import com.alibaba.fastjson.JSON;

import akka.actor.UntypedActor;

/**
 * @author zmh46712
 * @version Id: StudentActor, v 0.1 2017/5/4 16:36 zmh46712 Exp $
 */
public class StudentActor extends UntypedActor {

    @Override
    public void onReceive(Object message) throws Throwable {
        System.out.println("student receive: " + JSON.toJSONString(message));
        System.out.println("做作业中.......");
        getSender().tell("作业做好了", getSelf());
    }
}
