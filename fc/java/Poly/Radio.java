package fc.java.fc.java.Poly;
// 상위가 인터페이스면 extends가 아니라 implements로
public class Radio implements RemoCon{

    @Override
    public void chup() {
        System.out.println("Radio의 채널이 올라간다.");
    }

    @Override
    public void chDown() {
        System.out.println("Radio의 채널이 내려간다.");
    }

    @Override
    public void volUp() {
        System.out.println("Radio의 볼륨이 올라간다.");
    }

    @Override
    public void volDown() {
        System.out.println("Radio의 볼륨이 내려간다.");
    }

    @Override
    public void internet() {
        System.out.println("Radio에서는 인터넷이 지원이 안됩니다.");
    }
}
