package com.lewis.akka.demo1;

import akka.actor.UntypedActor;

/**
 * @author zmh46712
 * @version Id: Greeter, v 0.1 2017/5/3 9:37 zmh46712 Exp $
 */
public class Greeter extends UntypedActor {

    public static enum Msg {
                            GREET, DONE
    }

    @Override
    public void onReceive(Object message) throws Throwable {
        if (message == Msg.GREET) {
            System.out.println("Hello World !");
            Thread.sleep(1000);
            getSelf().tell(Msg.DONE,getSender());
        }else{
            unhandled(message);
        }
    }
}
