package com.lewis.akka.demo2;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;
import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;

/**
 * @author zmh46712
 * @version Id: HelloWorld, v 0.1 2017/5/3 9:40 zmh46712 Exp $
 */
public class HelloWorld extends UntypedActor {

    @Override
    public void preStart() throws Exception {
        //create the greeter actor
        ActorRef greeter = getContext().actorOf(Props.create(Greeter.class), "Greeter");
        System.out.println("HelloWorld preStart当前线程："+Thread.currentThread().getId());
        System.out.println("Greeter Actor Path: " + greeter.path());
        //tell it to perform the greeting
        greeter.tell(new Message(2, Lists.newArrayList("2", "dsf")), getSender());

    }

    @Override
    public void onReceive(Object message) throws Throwable {
        System.out.println("HelloWorld 收到的数据为：" + JSON.toJSONString(message));
        System.out.println("[HelloWorld onReceive当前线程]："+Thread.currentThread().getId());
    }

    @Override
    public void postStop() throws Exception {
        System.out.println("postStop");
    }
}
