package com.mzl.functional;

/**
 * @ClassName： Strategize
 * @Description： 新旧对比
 * @author：lhg
 * @data：2020/12/16 14:26
 * @Version：1.0
 **/
interface Strategy {
    // 提供了单一的 approach() 方法来承载函数式功能。
    // 通过创建不同的 Strategy 对象，我们可以创建不同的行为。
    String approach(String msg);
}

class Soft implements Strategy {
    public String approach(String msg) {
        return msg.toLowerCase() + "?";
    }
}

class Unrelated {
    static String twice(String msg) {
        return msg + " " + msg;
    }
}

public class Strategize {
    Strategy strategy;
    String msg;
    Strategize(String msg) {
        // [1] 在 Strategize 中，Soft 作为默认策略，在构造函数中赋值。
        strategy = new Soft(); // [1]
        this.msg = msg;
    }

    void communicate() {
        System.out.println(strategy.approach(msg));
    }

    void changeStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public static void main(String[] args) {
        Strategy[] strategies = {
                // [2] 一种略显简短且更自发的方法是创建一个匿名内部类。即使这样，仍有相当数量的冗余代码。你总是要仔细观察：“哦，原来这样，这里使用了匿名内部类。”
                new Strategy() { // [2]
                    public String approach(String msg) {
                        return msg.toUpperCase() + "!";
                    }
                },
                // [3] Java 8 的 Lambda 表达式。由箭头 -> 分隔开参数和函数体，箭头左边是参数，箭头右侧是从 Lambda 返回的表达式，即函数体。这实现了与定义类、匿名内部类相同的效果，但代码少得多。
                msg -> msg.substring(0, 5), // [3]
                // [4] Java 8 的方法引用，由 :: 区分。在 :: 的左边是类或对象的名称，在 :: 的右边是方法的名称，但没有参数列表。
                Unrelated::twice // [4]
        };
        Strategize s = new Strategize("Hello there");
        s.communicate();
        for(Strategy newStrategy : strategies) {
            // [5] 在使用默认的 Soft strategy 之后，我们逐步遍历数组中的所有 Strategy，并使用 changeStrategy() 方法将每个 Strategy 放入 变量 s 中。
            s.changeStrategy(newStrategy); // [5]
            // [6] 现在，每次调用 communicate() 都会产生不同的行为，具体取决于此刻正在使用的策略代码对象。我们传递的是行为，而非仅数据。
            s.communicate(); // [6]
        }
    }
}
