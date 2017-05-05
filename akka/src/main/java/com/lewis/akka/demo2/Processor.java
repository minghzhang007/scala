package com.lewis.akka.demo2;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zmh46712
 * @version Id: Processor, v 0.1 2017/5/4 10:17 zmh46712 Exp $
 */
public class Processor {

    private static ExecutorService executorService;
    private static int             nCPU = Runtime.getRuntime().availableProcessors();

    public static void init(){
        executorService = new ThreadPoolExecutor(nCPU/2,nCPU,60, TimeUnit.SECONDS,new ArrayBlockingQueue<>(200),new NamedThreadFactory("lewis"));
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                executorService.shutdown();
                try {
                    executorService.awaitTermination(5,TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println("Processor 停止了。。。");
                }
            }
        });
    }

    static class NamedThreadFactory implements ThreadFactory {
        private AtomicInteger index = new AtomicInteger(1);
        private final String prefix;

        public NamedThreadFactory(String prefiex) {
            this.prefix = prefiex;
        }

        public Thread newThread(Runnable r) {
            Thread t = new Thread(r, prefix + "_" + index.getAndIncrement());
            return t;
        }
    }

    public static void sumbit(Runnable r){
        executorService.submit(r);
    }

}
