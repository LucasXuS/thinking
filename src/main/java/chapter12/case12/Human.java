package chapter12.case12;

/**
 * 异常匹配遵循短路原则，会找到最近的匹配处进行匹配
 */
public class Human {

    public static void main(String[] args) {
        try {
            throw new Sneeze();
        } catch (Sneeze sneeze) {
            System.out.println("Caught sneeze");
        } catch (Annoyance annoyance) {
            System.out.println("Caught annoyance");
        }

        // sneeze 是 annoyance的派生类，所以也应该会抓住这个异常，但是根据短路原则，只就近抓一次。
    }


}
