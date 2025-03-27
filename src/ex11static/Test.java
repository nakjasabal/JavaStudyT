package ex11static;


class MyClass {
    static int staticVar;

    // static 블록
    static {
        staticVar = 10;
        System.out.println("Static block executed.");
    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println("Static Variable: " + MyClass.staticVar);
    }
}


class Singleton {
    // 정적 변수로 클래스의 유일한 인스턴스를 저장합니다.
    private static final Singleton instance = new Singleton();

    // private 생성자로 외부에서의 인스턴스 생성을 방지합니다.
    private Singleton() {}

    // 정적 메서드를 통해 인스턴스에 접근합니다.
    public static Singleton getInstance() {
        return instance;
    }
}



