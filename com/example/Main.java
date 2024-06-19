package com.example;

import com.example.external.*;
import com.example.internal.*;

public class Main {
    public static void main(String[] args) {
        internalClass internal = new internalClass();
        externalClass external = new externalClass();
        internal.displayInternal();
        external.displayExternal();
    }
}
