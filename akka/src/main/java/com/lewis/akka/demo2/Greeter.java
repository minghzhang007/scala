package com.lewis.akka.demo2;

import com.alibaba.fastjson.JSON;

import akka.actor.UntypedActor;

/**
 * @author zmh46712
 * @version Id: Greeter, v 0.1 2017/5/3 9:37 zmh46712 Exp $
 */
public class Greeter extends UntypedActor {

    @Override
    public void onReceive(Object message) throws Throwable {
        System.out.println("Greeter收到的数据是：" + JSON.toJSONString(message));
        System.out.println("【Greeter onReceive当前线程】 "+Thread.currentThread().getName());
        getContext().parent().tell("Greeter工作完成", getSelf());
    }
}
