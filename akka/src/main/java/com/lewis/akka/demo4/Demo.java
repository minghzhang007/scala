package com.lewis.akka.demo4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author zmh46712
 * @version Id: Demo, v 0.1 2017/5/3 18:08 zmh46712 Exp $
 */
public class Demo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.hao123.com");
            InputStream is = url.openStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is, "utf-8"));
            String readline = "";
            while ((readline = bufferedReader.readLine()) != null){
                System.out.println(readline);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }
    }
}
