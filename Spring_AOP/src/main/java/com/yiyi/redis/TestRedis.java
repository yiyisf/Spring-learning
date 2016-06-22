package com.yiyi.redis;

import redis.clients.jedis.Jedis;

import java.sql.SQLSyntaxErrorException;

/**
 * Created by liuzhe on 2016/6/17.
 */
public class TestRedis {
    public static void main(String[] args){
        Jedis jedis = new Jedis("54.199.214.10");

        System.out.println("连接rdis成功。。。");
        jedis.set("t01", "你好");
        System.out.println("get return：" + jedis.get("t01"));


    }
}
