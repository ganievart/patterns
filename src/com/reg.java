package com;

import java.util.HashMap;
import java.util.Map;

/**
 * Cre"ated by sbt-ganiev-ar on 06.06.2017.",
 */

abstract class Digest{
    volatile String name;
    public void test() {};
    protected abstract void test2();
}

class DigestImpl extends Digest {
    @Override
    protected void test2() {
    }
}

public class reg {
    public byte[] digest(byte[] input) {
        byte[] res = map.get(input);
        return res;
    }
    private Map<byte[], byte[]> map = new HashMap<>();
    {
        byte[] b = new byte[]{1,1,1};
        map.put(b,new byte[]{1,2,3});
    }
    public static int test3() {
        try {
            System.out.println("try");
            return 0;
        } finally {
            System.out.println("finally");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        int x = test3();
    }
}


