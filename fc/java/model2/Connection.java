package fc.java.fc.java.model2;
// 자바에서 제공을 해주는 인터페이스(interface).
public interface Connection {
    //데이터베이스 연결동작
    public void getConnection(String url, String username, String password);
}