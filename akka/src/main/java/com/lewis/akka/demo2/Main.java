package com.lewis.akka.demo2;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import com.google.common.collect.Lists;
import com.typesafe.config.ConfigFactory;

/**
 * @author zmh46712
 * @version Id: Main, v 0.1 2017/5/3 9:45 zmh46712 Exp $
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ActorSystem system = ActorSystem.create("HelloWorldSystem", ConfigFactory.load("akka.config"));
        ActorRef helloWorld = system.actorOf(Props.create(HelloWorld.class), "HelloWorldActor");
        System.out.println("Hello World Actor Path:"+helloWorld.path());
       // helloWorld.tell(new Message(3, Lists.newArrayList("nihao","wohao","dajiahao")));
        Thread.sleep(1000);
        system.shutdown();
    }
}
