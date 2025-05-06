package Java_Post_Advanced2.CH02_Collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private Deque<String> stack = new ArrayDeque<>();
    private String currentPage = null;

    public void visitPage(String url) {
        if(currentPage != null) { // 현재 페이지가 있으면 현재 페이지를 stack에 넣고
            stack.push(currentPage);
        }
        currentPage = url; // 현재 페이지를 방문할 페이지의 url로 넣는다.
        System.out.println("방문 = " + url);
    }

    public String goBack() {
        if(!stack.isEmpty()) { // 방문 기록 stack이 비어있지 않으면 이전 페이지를 현재 페이지로 설정
            currentPage = stack.pop();
            System.out.println("뒤로 가기 : " + currentPage);
            return currentPage;
        }
        return null;
    }
}
