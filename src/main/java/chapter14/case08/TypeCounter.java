package chapter14.case08;

import chapter14.case06.Pet;

import java.util.LinkedHashMap;
import java.util.Map;

public class TypeCounter extends LinkedHashMap<Class<?>, Integer> {
    Class<?> baseType;

    TypeCounter(Class<?> baseType) {
        this.baseType = baseType;
    }

    public void count(Object object) {
        Class<?> type = object.getClass();
        if (!baseType.isAssignableFrom(type)) {
            throw new RuntimeException(object + " should be type or subtype of " + baseType);
        }
        countClass(type);
    }

    private void countClass(Class<?> type) {
        // 计数
        Integer quantity = get(type);
        put(type, quantity == null ? 1 : quantity + 1);

        // 获取用例的父类
        Class<?> superClass = type.getSuperclass();

        // 查看用例的父类是否存在，另外，查看这个是否仍然属于基础类或其子类。
        if (superClass != null && baseType.isAssignableFrom(superClass)){
            countClass(superClass);
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for(Map.Entry<Class<?>, Integer> pair : entrySet()){
            sb.append(pair.getKey());
            sb.append(":");
            sb.append(pair.getValue());
            sb.append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("}");
        return sb.toString();
    }


}
