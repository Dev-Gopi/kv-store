package org.example;

import net.spy.memcached.MemcachedClient;

import java.net.InetSocketAddress;

/**
 * Hello world!
 */
public class App {
    public static void main(final String[] args) throws Exception {
        // Connecting to Memcached server on localhost
        MemcachedClient memcachedClient = new MemcachedClient(new InetSocketAddress("127.0.0.1", 11211));
        System.out.println("Connection to server successful");
        System.out.println("set status:" + memcachedClient.set("town", 900, "bangalore").isDone());

        // Get value from cache
        System.out.println("Get from Cache:" + memcachedClient.get("town"));

        // now append some data into existing key
        System.out.println("Prepend to cache:" + memcachedClient.prepend("town", "delhi").isDone());

        // get the updated key
        System.out.println("Get from Cache:" + memcachedClient.get("town"));

        // Get value from cache
        System.out.println("Get from Cache:" + memcachedClient.get("city"));

        // delete value from cache
        System.out.println("Delete from Cache:" + memcachedClient.delete("city").isDone());

        // check whether value exists or not
        System.out.println("Get from Cache:"+memcachedClient.get("city"));
    }
}
