import com.mzl.hiding.dessert.Cookie;

/**
 * @description:
 * @author: lhg
 * @date: Created in 2020/7/8 11:09
 * @version:
 * @modified By:
 */
public class Dinner {
    public static void main(String[] args) {
        Cookie x = new Cookie();
        // bite() 方法只提供了包访问权限，因而在 dessert 包之外无法访问，编译器禁止你使用它。
        // -x.bite(); // Can't access
    }
}
