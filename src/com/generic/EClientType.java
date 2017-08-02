/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sbt.ous.opticash;

/**
 * @author Savin-DS
 */


import java.security.spec.ECField;

/**
 *
 * @author Savin-DS
 */
public enum EClientType {
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

    public String getStringClientType() {
        if (ATM.getClientType() == clientType) {
            return "ÓÑ";
        }
        if (BRANCH.getClientType() == clientType) {
            return "ÂÑÏ";
        }
        return "";
    }

    public String getEngStringClientType() {
        if (ATM.getClientType() == clientType) {
            return "ATM";
        }
        if (BRANCH.getClientType() == clientType) {
            return "BRANCH";
        }
        return "";
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


class Main {
    public static void main(String[] args) {
        EClientType en = EClientType.ATM;
        System.out.println(en.name());

    }
}
