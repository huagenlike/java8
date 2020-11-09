package com.mzl.housekeeping;

import com.mzl.onjava.Nap;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/6 16:56
 * @version:
 * @modified By:
 */
class Book {
    boolean checkedOut = false;

    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    @Override
    protected void finalize() throws Throwable {
        if (checkedOut) {
            System.out.println("Error: checked out");
        }
        // Normally, you'll also do this:
        // super.finalize(); // Call the base-class version
    }
}
// 本例的终结条件是：所有的 Book 对象在被垃圾回收之前必须被登记。
// 但在 main() 方法中，有一本书没有登记。要是没有 finalize() 方法来验证终结条件，将会很难发现这个 bug。
public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        // Proper cleanup:正确清理
        novel.checkIn();
        // Drop the reference, forget to clean up:删除参考，忘记清理
        new Book(true);
        // 强制进行终结动作
        // 但是即使不这么做，只要重复地执行程序（假设程序将分配大量的存储空间而导致垃圾回收动作的执行），最终也能找出错误的 Book 对象。
        System.gc();
        new Nap(1); // One second delay
    }
}
