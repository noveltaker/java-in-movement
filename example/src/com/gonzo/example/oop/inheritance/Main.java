package com.gonzo.example.oop.inheritance;

import com.gonzo.example.oop.inheritance.student.Boy;
import com.gonzo.example.oop.inheritance.student.Girl;

public class Main {

    public static void main(String[] args) {
        Boy boy = new Boy("철수");
        Girl girl = new Girl("영희");

        boy.work();
        boy.eat();

        girl.work();
        girl.eat();
    }
}
