package com.lewis.akka.demo3;

import akka.actor.UntypedActor;
import com.alibaba.fastjson.JSON;

/**
 * @author zmh46712
 * @version Id: HelloWorld, v 0.1 2017/5/3 15:01 zmh46712 Exp $
 */
public class HelloWorld extends UntypedActor{

    public void onReceive(Object message) throws Throwable {
        System.out.println("HelloWorld :"+ JSON.toJSONString(message));
        Thread.sleep(1000);
        System.out.println("HelloWorld onReceive over");
        getSender().tell("OK",getSelf());
        getContext().stop(getSelf());
    }
}
