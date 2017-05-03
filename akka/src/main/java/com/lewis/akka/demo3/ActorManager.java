package com.lewis.akka.demo3;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import com.typesafe.config.ConfigFactory;

/**
 * @author zmh46712
 * @version Id: ActorManager, v 0.1 2017/5/3 15:03 zmh46712 Exp $
 */
public class ActorManager {

    private static ActorSystem actorSystem = null;

    static {
        actorSystem = ActorSystem.create("actorSystem", ConfigFactory.load("akka.config"));
    }

    public static ActorRef createActor(String name, Class<?> type) {
        ActorRef actorRef = actorSystem.actorOf(Props.create(type), name);
        return actorRef;
    }
}
