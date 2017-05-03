package com.lewis.akka.demo3;

import akka.actor.ActorRef;
import akka.pattern.Patterns;
import akka.util.Timeout;
import com.google.common.collect.Lists;
import com.lewis.akka.demo2.Message;
import scala.concurrent.Await;
import scala.concurrent.Future;
import scala.concurrent.duration.Duration;

import java.util.concurrent.TimeUnit;


/**
 * @author zmh46712
 * @version Id: Main, v 0.1 2017/5/3 15:08 zmh46712 Exp $
 */
public class Main {

    public static void main(String[] args) {
        Timeout timeout = new Timeout(Duration.create(3,TimeUnit.SECONDS));
        ActorRef actor = ActorManager.createActor("HelloWorld", HelloWorld.class);

        Future<Object> future = Patterns.ask(actor, new Message(100, Lists.newArrayList("100", "liis")), timeout);
        try {
            Object result = Await.result(future,timeout.duration());
            System.out.println("result: "+result);
        } catch (Exception e) {
            System.out.println("got error !");
            e.printStackTrace();
        }
    }
}
