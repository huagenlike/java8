package com.mzl.housekeeping;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/7 14:38
 * @version:
 * @modified By:
 * 概括一下创建对象的过程，假设有个名为 Dog 的类：
 *
 * 即使没有显式地使用 static 关键字，构造器实际上也是静态方法。所以，当首次创建 Dog 类型的对象或是首次访问 Dog 类的静态方法或属性时，Java 解释器必须在类路径中查找，以定位 Dog.class。
 * 当加载完 Dog.class 后（后面会学到，这将创建一个 Class 对象），有关静态初始化的所有动作都会执行。因此，静态初始化只会在首次加载 Class 对象时初始化一次。
 * 当用 new Dog() 创建对象时，首先会在堆上为 Dog 对象分配足够的存储空间。
 * 分配的存储空间首先会被清零，即会将 Dog 对象中的所有基本类型数据设置为默认值（数字会被置为 0，布尔型和字符型也相同），引用被置为 null。
 * 执行所有出现在字段定义处的初始化动作。
 * 执行构造器。你将会在"复用"这一章看到，这可能会牵涉到很多动作，尤其当涉及继承的时候。
 */
class Bowl {
    Bowl(int marker) {
        System.out.println("Bowl(" + marker + ")");
    }

    void f1(int marker) {
        System.out.println("f1(" + marker + ")");
    }
}

class Table {
    static Bowl bowl1 = new Bowl(1);

    Table() {
        System.out.println("Table()");
        bowl2.f1(1);
    }

    void f2(int marker) {
        System.out.println("f2(" + marker + ")");
    }

    static Bowl bowl2 = new Bowl(2);
}

class Cupboard {
    // bowl3 每次加载 Cupboard 类，都会创建一遍，优先级低于静态方法
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);

    Cupboard() {
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }

    void f3(int marker) {
        System.out.println("f3(" + marker + ")");
    }

    static Bowl bowl5 = new Bowl(5);
}

// 执行顺序：
// 静态初始化只有在必要时刻才会进行。如果不创建 Table 对象，也不引用 Table.bowl1 或 Table.bowl2，那么静态的 Bowl 类对象 bowl1 和 bowl2 永远不会被创建。
// 只有在第一个 Table 对象被创建（或被访问）时，它们才会被初始化。此后，静态对象不会再次被初始化。
// 初始化的顺序先是静态对象（如果它们之前没有被初始化的话），然后是非静态对象，从输出中可以看出。
// 要执行 main() 方法，必须加载 StaticInitialization 类，它的静态属性 table 和 cupboard 随后被初始化，这会导致它们对应的类也被加载，而由于它们都包含静态的 Bowl 对象，所以 Bowl 类也会被加载。因此，在这个特殊的程序中，所有的类都会在 main() 方法之前被加载。
public class StaticInitialization {
    public static void main(String[] args) {
        System.out.println("main creating new Cupboard()");
        new Cupboard();
        System.out.println("main creating new Cupboard()");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);

        new Table();
    }

    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}
