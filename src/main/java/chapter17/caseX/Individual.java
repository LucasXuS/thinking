package chapter17.caseX;

/**
 * Created by lenovo on 2018/3/12.
 */
public class Individual implements Comparable<Individual> {

    private static long counter = 0;
    private final long id = counter++;

    private String name;

    public Individual(String name) {
        this.name = name;
    }

    public Individual() {
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + (name == null ? "" : " " + name);
    }

    public long id() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Individual && id == ((Individual) o).id;
    }

    @Override
    public int hashCode() {
        int result = 17;
        if (name != null)
            result = 37 * result + (int) id;
        return result;
    }


    @Override
    public int compareTo(Individual o) {

        // 先判断类型是否一样
        String first = getClass().getSimpleName();
        String argFirst = o.getClass().getSimpleName();
        int firstCompare = first.compareTo(argFirst);

        if (firstCompare != 0) {
            return firstCompare;
        }
        // 判断名称是否一样
        if (name != null && o.name != null) {
            int secondCompare = name.compareTo(o.name);
            if (secondCompare != 0)
                return secondCompare;
        }

        // 判断散列码是否一样（散列码在hashCode里面不同的本质来自于id的不同）
        return (o.id < id ? -1 : (o.id == id ? 0 : 1));
    }
}
