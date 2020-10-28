package com.mzl.lambda.interfaces.impl;

import com.mzl.lambda.interfaces.Defaulable;

public class OverridableImpl implements Defaulable {

    @Override
    public String notRequired() {
        return "Overridden implementation";
    }
}
