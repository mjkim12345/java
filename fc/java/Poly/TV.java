package fc.java.fc.java.Poly;

public class TV implements RemoCon {
    @Override
    public void chup() {
        System.out.println("TV의 채널이 올라간다.");
    }

    @Override
    public void chDown() {
        System.out.println("TV의 채널이 내려간다.");
    }

    @Override
    public void volUp() {
        System.out.println("TV의 볼륨이 올라간다.");
    }

    @Override
    public void volDown() {
        System.out.println("TV의 볼륨이 내려간다.");
    }

    @Override
    public void internet() {
        System.out.println("TV에서 인터넷이 실행된다.");
    }
}
