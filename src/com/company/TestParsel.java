package com.company;

import java.sql.Connection;

/**
 * Created by sbt-ganiev-ar on 16.05.2017.
 */


interface Content {

}
class Parcel4 {

    private class PContents implements Content {

    }

    public Content contents() {
        return new PContents();
    }

    private void test() {
//        Parcel4.PContents;
    }
}

public class TestParsel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Content c = p.contents();


    }
}
