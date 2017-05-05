package com.lewis.akka.demo5;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;
import com.alibaba.fastjson.JSON;

/**
 * @author zmh46712
 * @version Id: TeacherActor, v 0.1 2017/5/4 16:35 zmh46712 Exp $
 */
public class TeacherActor extends UntypedActor {
    private ActorRef studentActor = null;

    @Override
    public void preStart() throws Exception {
        studentActor = getContext().actorOf(Props.create(StudentActor.class));

    }

    @Override
    public void onReceive(Object message) throws Throwable {
        if ("作业做好了".equals(message)) {
            System.out.println("学生："+JSON.toJSONString(message));
            System.out.println("老师：非常好！");
        }else{
            System.out.println("老师：" + JSON.toJSONString(message));
            studentActor.tell("学生：做作业了",getSelf());
        }
    }
}
