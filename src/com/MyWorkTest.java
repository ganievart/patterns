package com;

import java.security.spec.ECField;

enum EClientType {
    /**
     *
     */
    BRANCH(1), ATM(2);

    private Short clientType;

    private EClientType(int status) {
        clientType = (short) status;
    }

    public Short getClientType() {
        return clientType;
    }

    public static String getTranscript(EClientType type) {
        switch (type) {
            case ATM:
                return "??";
            case BRANCH:
                return "???";
            default:
                return "Bad client type";
        }
    }

    public static EClientType getClientType(int code) {
        for (EClientType item : EClientType.values()) {
            if (item.getClientType().intValue() == code) {
                return item;
            }
        }
        throw new IllegalArgumentException("Unknown EClientType enum for:[" + code + ']');
    }

    @Override
    public String toString() {
        return String.valueOf(clientType);
    }
}

class MyWork {
    int clientType;

    public EClientType getClientType() {
        return EClientType.getClientType(this.clientType);
    }

    public void setClientType(EClientType clientType) {
        this.clientType = clientType.getClientType();
    }

}

public class MyWorkTest {


    public static void main(String[] args) {
        MyWork myWork = new MyWork();
        myWork.setClientType(EClientType.ATM);

        System.out.println(myWork.getClientType());
    }




}


