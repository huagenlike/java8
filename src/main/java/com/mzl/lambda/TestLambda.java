package com.mzl.lambda;

import java.awt.event.ActionListener;
import java.util.*;
import java.util.function.*;
import java.util.stream.IntStream;

/**
 * @ClassName： LambdaTest
 * @Description： lambda表达式学习(ArrayList 和 HashMap)
 * @author：lhg
 * @data：2021/1/28 11:47
 * @Version：1.0
 * 简写的依据：能够使用Lambda的依据是必须有相应的函数接口（函数接口，是指内部只有一个抽象方法的接口）
 * Lambda表达式另一个依据是类型推断机制，在上下文信息足够的情况下，编译器可以推断出参数表的类型，而不需要显式指名。
 **/
public class TestLambda {
    public static void main(String[] args) {
        computeIfPresentDemo();
    }

    // 无参函数的简写
    public static void unParamDemo() {
        // JDK7 匿名内部类写法
        new Thread(new Runnable(){// 接口名
            @Override
            public void run(){// 方法名
                System.out.println("Thread run()");
            }
        }).start();

        // JDK8 Lambda表达式写法
        new Thread(
                () -> System.out.println("Thread run()")// 省略接口名和方法名
        ).start();

        // JDK8 Lambda表达式代码块写法
        new Thread(
                () -> {
                    System.out.print("Hello");
                    System.out.println(" Hoolee");
                }
        ).start();
    }

    // 带参函数的简写
    public static void paramDemo() {
        // JDK7 匿名内部类写法
        List<String> list = Arrays.asList("I", "love", "you", "too");
        Collections.sort(list, new Comparator<String>(){// 接口名
            @Override
            public int compare(String s1, String s2){// 方法名
                if(s1 == null)
                    return -1;
                if(s2 == null)
                    return 1;
                return s1.length()-s2.length();
            }
        });

        // JDK8 Lambda表达式写法
        List<String> list1 = Arrays.asList("I", "love", "you", "too");
        Collections.sort(list1, (s1, s2) ->{// 省略参数表的类型
            if(s1 == null)
                return -1;
            if(s2 == null)
                return 1;
            return s1.length()-s2.length();
        });
    }

    // 简写的依据
    public static void basisShorthandDemo() {
        // Lambda表达式的书写形式
        Runnable run = () -> System.out.println("Hello World");// 1 展示了无参函数的简写
        ActionListener listener = event -> System.out.println("button clicked");// 2 处展示了有参函数的简写，以及类型推断机制
        Runnable multiLine = () -> {// 3 是代码块的写法
            System.out.print("Hello");
            System.out.println(" Hoolee");
        };
        BinaryOperator<Long> add = (Long x, Long y) -> x + y;// 4 再次展示了类型推断机制
        BinaryOperator<Long> addImplicit = (x, y) -> x + y;// 5 再次展示了类型推断机制
    }

    // Collection中的新方法 forEach()
    public static void forEachDemo() {
        // 使用曾强for循环迭代
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        for(String str : list){
            if(str.length() > 3)
                System.out.println(str);
        }

        // 使用forEach()结合匿名内部类迭代
        // 调用forEach()方法，并使用匿名内部类实现Comsumer接口
        list.forEach(new Consumer<String>(){
            @Override
            public void accept(String str){
                if(str.length() > 3)
                    System.out.println(str);
            }
        });

        // 使用forEach()结合Lambda表达式迭代
        // 方法传入一个Lambda表达式，我们不需要知道accept()方法，也不需要知道Consumer接口，类型推导帮我们做了一切。
        list.forEach(str -> {
            if(str.length()>3)
                System.out.println(str);
        });
    }

    // Collection中的新方法 removeIf()
    // 该方法签名为boolean removeIf(Predicate<? super E> filter)，作用是删除容器中所有满足filter指定条件的元素，其中Predicate是一个函数接口，里面只有一个待实现方法boolean test(T t)，同样的这个方法的名字根本不重要，因为用的时候不需要书写这个名字。
    // 需求：假设有一个字符串列表，需要删除其中所有长度大于3的字符串。
    public static void removeIfDemo() {
        // 使用迭代器删除列表元素
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            if(it.next().length()>3) // 删除长度大于3的元素
                it.remove();
        }

        // 使用removeIf()结合匿名名内部类实现
        list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        list.removeIf(new Predicate<String>(){ // 删除长度大于3的元素
            @Override
            public boolean test(String str){
                return str.length()>3;
            }
        });

        // 使用removeIf()结合Lambda表达式实现
        list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        list.removeIf(str -> str.length()>3);
    }

    // Collection中的新方法 replaceAll()
    // 该方法签名为void replaceAll(UnaryOperator<E> operator)，作用是对每个元素执行operator指定的操作，并用操作结果来替换原来的元素。其中UnaryOperator是一个函数接口，里面只有一个待实现函数T apply(T t)。
    // 需求：假设有一个字符串列表，将其中所有长度大于3的元素转换成大写，其余元素不变。
    public static void replaceAllDemo() {
        // 使用下标实现元素替换
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        for(int i=0; i<list.size(); i++){
            String str = list.get(i);
            if(str.length()>3) {
                list.set(i, str.toUpperCase());
            }
        }

        // 使用匿名内部类实现
        list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        list.replaceAll(new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                if (s.length() > 3) {
                    return s.toUpperCase();
                }
                return s;
            }
        });

        // 使用Lambda表达式实现
        list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        list.replaceAll(s-> {
            if (s.length() > 3) {
                return s.toUpperCase();
            }
            return s;
        });
    }

    // Collection中的新方法 sort()
    // 该方法定义在List接口中，方法签名为void sort(Comparator<? super E> c)，该方法根据c指定的比较规则对容器元素进行排序。Comparator接口我们并不陌生，其中有一个方法int compare(T o1, T o2)需要实现，显然该接口是个函数接口。
    // 需求：假设有一个字符串列表，按照字符串长度增序对元素排序。
    public static void sortDemo() {
        // Collections.sort()方法
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        Collections.sort(list, new Comparator<String>(){
            @Override
            public int compare(String str1, String str2){
                return str1.length()-str2.length();
            }
        });

        // List.sort()方法结合Lambda表达式
        list.sort((str1, str2) -> str1.length()-str2.length());
    }

    /**
     * Collection中的新方法 spliterator()
     * 方法签名为Spliterator<E> spliterator()，该方法返回容器的可拆分迭代器。从名字来看该方法跟iterator()方法有点像，我们知道Iterator是用来迭代容器的，Spliterator也有类似作用，但二者有如下不同：
     * Spliterator既可以像Iterator那样逐个迭代，也可以批量迭代。批量迭代可以降低迭代的开销。
     *
     * 为什么有了Iterator还需要spliterator呢
     * 从最早Java提供顺序遍历迭代器Iterator时，那个时候还是单核时代，但现在多核时代下，顺序遍历已经不能满足需求了，如何把多个任务分配到不同核上并行执行，才是能最大发挥多核的能力，所以Spliterator应运而生啦
     */
    // Spliterator是可拆分的，一个Spliterator可以通过调用Spliterator<T> trySplit()方法来尝试分成两个。一个是this，另一个是新返回的那个，这两个迭代器代表的元素没有重叠。
    // 可通过（多次）调用Spliterator.trySplit()方法来分解负载，以便多线程处理。
    public static void spliteratorTrySplitDemo() {
        int[] array = new int[10];
        Arrays.parallelSetAll(array, i -> i);

        // 这个方法也可以构建一个Stream，然后再构建Spliterator
        Spliterator.OfInt test = IntStream.range(0, 10).spliterator();
        test.forEachRemaining((int value) -> {
            System.out.println(Thread.currentThread().getName() + "--" + value);
        });
        System.out.println("+++++++++++");

        Spliterator.OfInt sp = Arrays.spliterator(array);
        // 分割完后sp还剩5个元素（后面的5个，即5、6、7、8、9），sp1也是5个元素（前面5个，即0、1、2、3、4）
        Spliterator.OfInt sp1 = sp.trySplit();
        // 分割完后sp1为3个，sp2为2个
        Spliterator.OfInt sp2 = sp1.trySplit();

        // 2、3、4
        sp1.forEachRemaining((int value) -> {
            System.out.println(Thread.currentThread().getName() + "--" + value);
        });

        System.out.println("------------");

        // 0、1
        sp2.forEachRemaining((int value) -> {
            System.out.println(Thread.currentThread().getName() + "--" + value);
        });

        System.out.println("------------");

        sp.forEachRemaining((int value) -> {
            System.out.println(Thread.currentThread().getName() + "--" + value);
        });
    }

    // Collection中的新方法 spliterator()
    // Spliterator既可以像Iterator那样逐个迭代，也可以批量迭代。批量迭代可以降低迭代的开销。
    public static void spliteratorIteratorDemo() {
        long time = new Date().getTime();
        // 1
        /*List<String> list = new LinkedList<>();
        for (int i = 0; i < 20000; i++) {
            list.add("" + i);
        }
        for(String string:list){
            System.out.println(string);
        }
        System.err.println("end");*/

        // 2
        // 这是单线程说的时候的结果.但是如果我们用spliterator遍历的时候,main函数会在遍历结束前停止,如下:
        List<String> list = new LinkedList<>();
        for (int i = 0; i < 500000; i++) {
            list.add("" + i);
        }
        list.spliterator().forEachRemaining(e -> System.out.println(e));
        //等同于下面的遍历方式
//        list.spliterator().forEachRemaining(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        // 3
        // 当然了,如果你这个list数组不够大的话,执行的可能很快,可能end就会输出在最后面了.
        // 从截图可以看到,遍历的时候,主进程并没有结束,而是继续执行下去了.
        // 所以,为了能够在遍历完成之后再执行主进程,我需要进行线程之间的通信,也就是说,让主线程能够知道,我遍历的这个线程执行结束了.
        /*List<String> list = new ArrayList<>(1000);
        for (int i = 0; i < 200000; i++) {
            list.add("bery" + i);
        }
        //0~20000
        Spliterator<String> spliterator1 = list.spliterator();
        //spliterator1:0~10000 spliterator2:10001~20000
        Spliterator<String> spliterator2 = spliterator1.trySplit();
        //spliterator1:0~5000 spliterator2:10001~20000 spliterator3:5001~10000
        Spliterator<String> spliterator3 = spliterator1.trySplit();
        //spliterator1:0~5000 spliterator2:10001~15000 spliterator3:5001~10000 spliterator4:15001~20000
        Spliterator<String> spliterator4 = spliterator2.trySplit();

        MyThredIteratorThread<String> thread1 = new MyThredIteratorThread<>(spliterator1);
        MyThredIteratorThread<String> thread2 = new MyThredIteratorThread<>(spliterator2);
        MyThredIteratorThread<String> thread3 = new MyThredIteratorThread<>(spliterator3);
        MyThredIteratorThread<String> thread4 = new MyThredIteratorThread<>(spliterator4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        while(true){
            if (thread1.isAlive() || thread2.isAlive() || thread3.isAlive() || thread4.isAlive()){
                try {
                    //如果线程没有结束,主线程就睡眠300ms,当所有线程都执行完成才会结束主程序
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                break;
            }
        }*/
        System.out.println(new Date().getTime() - time);
        System.err.println("test END");
    }

    // stream()和parallelStream()
    // stream()和parallelStream()分别返回该容器的Stream视图表示，不同之处在于parallelStream()返回并行的Stream。Stream是Java函数式编程的核心类
    public static void streamDemo() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("I", "love", "you", "too"));
        boolean present = list.stream().filter(str -> str.length() > 3).findAny().isPresent();
        System.out.println(present);

        boolean ove = list.parallelStream().filter(str -> str.contains("over")).findAny().isPresent();
        System.out.println(ove);
    }

    // Map中的新方法
    // forEach()
    public static void mapForEachDemo() {
        // Java7以及之前迭代Map
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        // 使用forEach()结合匿名内部类迭代Map
        // BiConsumer<T, U>() 表示一个接受两个输入参数且不返回结果的操作。 这是Consumer的两个领域的专业化。 与大多数其他功能接口不同， BiConsumer有望通过副作用进行操作。
        // <T> –操作的第一个参数的类型，<U> –操作的第二个参数的类型
        // 这是一个功能接口，其功能方法为accept(Object, Object) 。
        map.forEach(new BiConsumer<Integer, String>(){
            @Override
            public void accept(Integer k, String v){
                System.out.println(k + "=" + v);
            }
        });

        // 使用forEach()结合Lambda表达式迭代Map
        map.forEach((k, v) -> System.out.println(k + "=" + v));
    }

    // getOrDefault()
    // 该方法跟Lambda表达式没关系，但是很有用。
    // 方法签名为V getOrDefault(Object key, V defaultValue)，作用是按照给定的key查询Map中对应的value，如果没有找到则返回defaultValue。
    // 使用该方法程序员可以省去查询指定键值是否存在的麻烦．
    // 需求；假设有一个数字到对应英文单词的Map，输出4对应的英文单词，如果不存在则输出NoValue
    public static void mapGetOrDefaultDemo() {
        // 查询Map中指定的值，不存在时使用默认值
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        // Java7以及之前做法
        if(map.containsKey(4)){ // 1
            System.out.println(map.get(4));
        }else{
            System.out.println("NoValue");
        }

        // Java8使用Map.getOrDefault()
        System.out.println(map.getOrDefault(4, "NoValue")); // 2
    }

    // putIfAbsent()
    // 该方法跟Lambda表达式没关系，但是很有用。
    // 方法签名为V putIfAbsent(K key, V value)，作用是只有在不存在key值的映射或映射值为null时，才将value指定的值放入到Map中，否则不对Map做更改．
    // 该方法将条件判断和赋值合二为一，使用起来更加方便．
    public static void putIfAbsentDemo() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        map.putIfAbsent(3, "hahaha");
        map.putIfAbsent(4, "four");
        map.forEach((key, value) -> System.out.println(key + "->" + value));
    }

    // remove()
    // 我们都知道Map中有一个remove(Object key)方法，来根据指定key值删除Map中的映射关系；
    // Java8新增了remove(Object key, Object value)方法，只有在当前Map中key正好映射到value时才删除该映射，否则什么也不做．
    public static void removeDemo() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.remove(2, "two");
        map.remove(3, "aaa");
        map.remove(4);
        map.forEach((key, value) -> System.out.println(key + "->" + value));
    }

    // replace()
    // 在Java7及以前，要想替换Map中的映射关系可通过put(K key, V value)方法实现，该方法总是会用新值替换原来的值．为了更精确的控制替换行为，Java8在Map中加入了两个replace()方法，分别如下：
    //replace(K key, V value)，只有在当前Map中key的映射存在时才用value去替换原来的值，否则什么也不做．
    //replace(K key, V oldValue, V newValue)，只有在当前Map中key的映射存在且等于oldValue时才用newValue去替换原来的值，否则什么也不做．
    public static void replaceDemo() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.replace(3, "你就是个3");
        map.replace(6, "你就是个3");
        map.replace(1, "four", "你就是个1");
        map.replace(4, "four", "你就是个4");

        map.forEach((key, value) -> System.out.println(key + "->" + value));
    }

    // replaceAll()
    // 该方法签名为replaceAll(BiFunction<? super K,? super V,? extends V> function)，作用是对Map中的每个映射执行function指定的操作，并用function的执行结果替换原来的value，其中BiFunction是一个函数接口，里面有一个待实现方法R apply(T t, U u)．不要被如此多的函数接口吓到，因为使用的时候根本不需要知道他们的名字．
    // 需求：假设有一个数字到对应英文单词的Map，请将原来映射关系中的单词都转换成大写．
    public static void mapReplaceAllDemo() {
        // Java7以及之前替换所有Map中所有映射关系
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            entry.setValue(entry.getValue().toUpperCase());
        }

        map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        // new BiFunction<T, U, R>() <T> –函数的第一个参数的类型，<U> –函数第二个参数的类型，<R> –函数结果的类型
        map.replaceAll(new BiFunction<Integer, String, String>() {
            @Override
            public String apply(Integer k, String v) {
                return v.toUpperCase();
            }
        });

        // 使用replaceAll()结合Lambda表达式实现
        map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.replaceAll((k, v) -> v.toUpperCase());

        // 使用replaceAll()结合Lambda表达式实现
        map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.replaceAll((k, v) -> {
            if (k == 2) {
                return v.toUpperCase();
            }
            return v;
        });

        map.forEach((key, value) -> System.out.println(key + "->" + value));
    }

    // merge()
    // 该方法签名为merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)，作用是：
    // 如果Map中key对应的映射不存在或者为null，则将value（不能是null）关联到key上；
    // 否则执行remappingFunction，如果执行结果非null则用该结果跟key关联，否则在Map中删除key的映射．
    // 参数中BiFunction函数接口前面已经介绍过，里面有一个待实现方法R apply(T t, U u)．
    // merge()方法虽然语义有些复杂，但该方法的用方式很明确，一个比较常见的场景是将新的错误信息拼接到原来的信息上，比如：
    public static void mergeDemo() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(null, "null字符串");

        map.merge(4, "four", (v1, v2) -> v1+v2);
        map.merge(null, "，null的拼接上来了", (v1, v2) -> v1+v2);

        map.merge(3, "，我拼接上来了", (v1, v2) -> v1+v2);
        map.merge(1, "，null的拼接上来了", (v1, v2) -> null);

        map.forEach((key, value) -> System.out.println(key + "->" + value));
    }

    // compute()
    // 该方法签名为compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)，作用是把remappingFunction的计算结果关联到key上，如果计算结果为null，则在Map中删除key的映射．
    // 要实现上述merge()方法中错误信息拼接的例子，使用compute()代码如下：
    // map.compute(key, (k,v) -> v==null ? newMsg : v.concat(newMsg));
    public static void computeDemo() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(null, "null字符串");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        map.forEach((key, value) -> System.out.println(key + "->" + value));

        map.compute(1, (k, v) -> v == "one" ? "one" : v.concat("，我拼接上来了"));
        map.compute(2, (k, v) -> v = null);
        map.compute(3, (k, v) -> v == "two" ? "two" : v.concat("，我拼接上来了"));

        map.forEach((key, value) -> System.err.println(key + "->" + value));
    }

    // computeIfAbsent()
    // 该方法签名为V computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)，作用是：只有在当前Map中不存在key值的映射或映射值为null时，才调用mappingFunction，并在mappingFunction执行结果非null时，将结果跟key关联．
    // Function是一个函数接口，里面有一个待实现方法R apply(T t)．
    // computeIfAbsent()常用来对Map的某个key值建立初始化映射．比如我们要实现一个多值映射，Map的定义可能是Map<K,Set<V>>，要向Map中放入新值，可通过如下代码实现：
    // 使用computeIfAbsent()将条件判断和添加操作合二为一，使代码更加简洁
    public static void computeIfAbsentDemo() {
        Map<Integer, Set<String>> map = new HashMap<>();
        // Java7及以前的实现方式
        if(map.containsKey(1)){
            map.get(1).add("one");
        }else{
            Set<String> valueSet = new HashSet<String>();
            valueSet.add("one");
            map.put(1, valueSet);
        }
        // Java8的实现方式
        map.computeIfAbsent(1, v -> new HashSet<String>()).add("yi");
        map.computeIfAbsent(1, v -> new HashSet<String>()).add("er");
        map.computeIfAbsent(1, v -> new HashSet<String>()).add("san");
        map.computeIfAbsent(2, v -> new HashSet<String>()).add("san");
        map.computeIfAbsent(2, v -> new HashSet<String>()).add("er");
        map.computeIfAbsent(2, v -> new HashSet<String>()).add("san");

        map.forEach((key, value) -> System.err.println(key + "->" + value));

        // 例2
        Map<String, Object> map1 = new HashMap<>();
        // java8之前。从map中根据key获取value操作可能会有下面的操作
        Object key = map1.get("key");
        if (key == null) {
            key = new Object();
            map1.put("key", key);
        }
        // java8之后。上面的操作可以简化为一行，若key对应的value为空，会将第二个参数的返回值存入并返回
        Object key2 = map1.computeIfAbsent("key", k -> new Object());
    }

    // computeIfPresent()
    // 该方法签名为V computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)，作用跟computeIfAbsent()相反，
    // 即，只有在当前Map中存在key值的映射且非null时，才调用remappingFunction，如果remappingFunction执行结果为null，则删除key的映射，否则使用该结果替换key原来的映射．
    // 这个函数的功能跟如下代码是等效的：
    public static void computeIfPresentDemo() {
        // 原对象
        Map<String, Object> oldUser = new HashMap<String, Object>(){{
            put("id", 1001);
            put("name", "张三");
            put("age", 22);
            put("hobby", "篮球");
        }};

        // 新对象
        Map<String, Object> newUser = new HashMap<String, Object>(){{
            put("id", 1001);
            put("age", 23);
            put("hobby", "足球");
        }};
        System.out.println("oldUser -> " + oldUser);

        // 新对象的k-v集合
        Set<Map.Entry<String, Object>> entries = newUser.entrySet();
        // 循环新对象的Map集合，将其与老的对象的集合进行对比。
        // 如果新修改的键值，在老对象的中存在，将使用新集合的值替换老集合的值
        // 否则保持原有的老值不变。
        for (Map.Entry<String, Object> entry : entries) {
            oldUser.computeIfPresent(entry.getKey(), (k, v) -> {
                if (oldUser.containsKey(k)) {
                    // 进行新值替换老值操作
                    return entry.getValue();
                }
                // 保存原值，如果这里固定返回null,则表示在删除对象的key-value.
                return v;
            });
        }
        System.out.println("--------------------经过替换过--------------------------");
        System.out.println("oldUser - > " + oldUser);

        // 值得我们注意的是，在computeIfPresent中，如果我们返回null,则表示在map中移除对应的key-value键值对
        // 原对象
        Map<String, Object> map = new HashMap<String, Object>(){{
            put("id", 1001);
            put("name", "张三");
            put("age", 22);
            put("hobby", "篮球");
        }};

        System.out.println("map -> " + map);
        System.out.println("-------------运算后-------------------");
        map.computeIfPresent("name", (k, v) -> {
            return null;
        });
        System.out.println("map -> " + map);
    }

    private static class MyThredIteratorThread <T> extends Thread{

        private final Spliterator<T> list;

        private MyThredIteratorThread(Spliterator<T> list) {
            this.list = list;
        }

        @Override
        public void run() {
            list.forEachRemaining(e -> System.out.println(e));
        }
    }
}
