package chapter09.case11;

/**
 * Created by lenovo on 2018/3/13.
 */
public interface MyComparator {
    int compare(int o1, int o2);

    default MyComparator reverse(){
        return new MyComparator() {
            @Override
            public int compare(int o1, int o2) {
                return o2 - o1;
            }
        };
    }
}
