package kr.or.ddit.basic;

/**
 Singleton패턴 -> 객체가 1개만 만들어지게하는 방법
 (외부에서 new 명령을 사용하지 못하게 한다)

 -singleton 클래스 만드는 방법(필수구성요소)
 1. 자신 class의 참조값이 저장될 변수를 private static으로 선언

 2. 모든 생성자의 접근 제한자를 private으로 한다.

 3. 자신 class 인스턴스를 생성하고 반환하는 메소드를 public static으로 작성한다
 (이 메소드의 이름은 보통 getInstance로 한다)


 */
public class MySingleton {
    //1번
    /*
    static 변수는 클래스 로딩 시 생성되며 모든 인스턴스가 공유합니다.
    따라서 singleton 인스턴스를 전역적으로 사용할 수 있게 해줍니다.
    static 메서드는 클래스 인스턴스가 없어도 호출할 수 있으므로,
    클래스의 유일한 인스턴스에 접근하기 위한 통로를 제공합니다.
     */
    private static MySingleton single;
    //2번 -> 생성자가 필요없을때에는 기본생성자를 만들어야한다
    private MySingleton() {
        System.out.println("생성자 메소드입니다..");

    }

    //3번
    public static MySingleton getInstance() {
        //1번의 변수값이 널이면 현재 class의 인스턴스를 생성하여 저장
        //1번의 변수값을 반환
        if (single == null) {
            single = new MySingleton();
        }
        return single;
    }

    //기타 이 클래스가 처리할 내용들을 작성하면 됨
    public void displayTest() {
        System.out.println("singleton 클래스의 메소드 처리내용입니다");
    }
}
