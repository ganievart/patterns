package com.generic;

/**
 * Created by sbt-ganiev-ar on 29.05.2017.
 */
interface Payable {
}
class Employee implements Payable{}
class Hourly extends Employee implements Payable {};
