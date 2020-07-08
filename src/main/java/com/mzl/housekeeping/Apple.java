package com.mzl.housekeeping;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/6 16:28
 * @version:
 * @modified By:
 */
public class Apple {
    Apple getPeeled() {
        return Peeler.peel(this);
    }
}
