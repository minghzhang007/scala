package com.lewis.scala.learn.actordemo.demo1;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;

/**
 * @author zmh46712
 * @version Id: HelloWorld, v 0.1 2017/5/3 9:40 zmh46712 Exp $
 */
public class HelloWorld extends UntypedActor {

    @Override
    public void preStart() throws Exception {
        //create the greeter actor
        ActorRef greeter = getContext().actorOf(Props.create(Greeter.class), "Greeter");
        //tell it to perform the greeting
        greeter.tell(Greeter.Msg.GREET, getSender());
    }

    @Override
    public void onReceive(Object message) throws Throwable {
        if (message == Greeter.Msg.DONE) {
            //when the greeter is done,stop the actor and with it the application
            getContext().stop(getSelf());
        } else {
            unhandled(message);
        }
    }
}
