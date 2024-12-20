package Java_Post_Advanced1.CH07_NestedInnerClass.nested.ex2;

// Network 안에서 NetworkMessage를 정적 중첩 클래스로 사용하기
public class Network {
    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    // Network 객체 안에서만 사용하기 위해 중첩해서 만듦
    private static class NetworkMessage {
        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }
}
