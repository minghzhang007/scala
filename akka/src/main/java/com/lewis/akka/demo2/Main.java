package com.lewis.akka.demo2;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

/**
 * @author zmh46712
 * @version Id: Main, v 0.1 2017/5/3 9:45 zmh46712 Exp $
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Processor.init();
        Config config = ConfigFactory.load("akka.config");
        ActorSystem system = ActorSystem.create("HelloWorldSystem", config);
        ActorRef helloWorld = system.actorOf(Props.create(HelloWorld.class), "HelloWorldActor");
        System.out.println("Hello World Actor Path:" + helloWorld.path());
    }
}
