package com.lewis.akka.demo5;

import akka.actor.ActorRef;
import com.lewis.akka.demo3.ActorManager;

/**
 * @author zmh46712
 * @version Id: Main, v 0.1 2017/5/4 16:36 zmh46712 Exp $
 */
public class Main {

    public static void main(String[] args) {
        ActorRef teacherActor = ActorManager.createActor("TeacherActor", TeacherActor.class);
        teacherActor.tell("布置作业了",null);

    }
}
