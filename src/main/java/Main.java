import com.epiphyllum.util.Enumerate;
import com.epiphyllum.util.ObjectUtil;

/**
 * Created by hary on 15/12/10.
 */
public class Main {
    public static void main(String[] args) {
        // 测试1
        TInterface tInterface = ObjectUtil.getObject(TInterface.class, "TInterfaceImpl", new Object[]{1, 2.2});
        tInterface.sayHello("zhouchao");

        // 测试2  : 将1转化为Season类型
        Season season = Enumerate.parse(Season.class, 1);
        System.out.println(season.getValue());
    }
}

enum Season implements Enumerate<Integer> {

    SPRING(1),
    SUMMER(2),
    AUTUMN(3),
    WINTER(4);

    private Integer value;
    Season(Integer value) {
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}

