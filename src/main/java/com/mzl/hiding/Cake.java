/**
 * @description: Accesses a class in a separate compilation unit
 * @author: lhg
 * @date: Created in 2020/7/8 11:12
 * @version:
 * @modified By:
 * 最初看上去这两个文件毫不相关，但在 Cake 中可以创建一个 Pie 对象并调用它的 f() 方法。
 * （注意，你的 CLASSPATH 中一定得有 .，这样文件才能编译）通常会认为 Pie 和 f() 具有包访问权限，因此不能被 Cake 访问。
 * 它们的确具有包访问权限，这是部分正确。Cake.java 可以访问它们是因为它们在相同的目录中且没有给自己设定明确的包名。
 * Java 把这样的文件看作是隶属于该目录的默认包中，因此它们为该目录中所有的其他文件都提供了包访问权限。
 */
class Cake {
    public static void main(String[] args) {
        Pie x = new Pie();
        x.f();
    }
}
