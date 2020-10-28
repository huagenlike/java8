package com.mzl.lambda.interfaces;

public interface Defaulable {
    default String notRequired() {
        // Interfaces now allow default methods, the implementer may or may not implement (override) them.
        return "Default implement";
    }
}
