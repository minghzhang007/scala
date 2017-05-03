package com.lewis.scala.learn.actordemo.demo1;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

/**
 * @author zmh46712
 * @version Id: Main, v 0.1 2017/5/3 9:45 zmh46712 Exp $
 */
public class Main {
    public static void main(String[] args) {
        ActorSystem helloWorldActorSystem = ActorSystem.create("HelloWorld");
        ActorRef helloWorld = helloWorldActorSystem.actorOf(Props.create(HelloWorld.class), "HelloWorld");
        System.out.println(helloWorld.path());
    }
}
