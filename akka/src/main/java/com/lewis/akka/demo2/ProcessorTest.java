package com.lewis.akka.demo2;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.IntStream;

/**
 * @author zmh46712
 * @version Id: ProcessorTest, v 0.1 2017/5/5 16:11 zmh46712 Exp $
 */
public class ProcessorTest {
    public static void main(String[] args) {
        Processor.init();
        List<Runnable>  list = Lists.newArrayList();
        IntStream.rangeClosed(0,250).forEach(x -> list.add(()-> {
            System.out.println("this is "+x);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));
        list.stream().forEach(x -> Processor.sumbit(x));
    }
}
