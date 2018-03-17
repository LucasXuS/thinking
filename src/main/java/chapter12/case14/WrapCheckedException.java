package chapter12.case14;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by xusong on 2018/3/18.
 */
public class WrapCheckedException {
    void throwRuntimeException(int type){
        try {
            switch (type){
                case 0:
                    throw new FileNotFoundException();
                case 1:
                    throw new IOException();
                case 2:
                    throw new RuntimeException();
            }
        } catch (Exception e) {
            // 隐藏检查
            throw new RuntimeException();
        }
    }
}
