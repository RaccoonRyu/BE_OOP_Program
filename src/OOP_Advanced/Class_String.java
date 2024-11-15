package OOP_Advanced;

public class Class_String {
    public static void main(String[] args) {

        String url = "https://FastCampus.co.kr/";

        final String FS = "https://fastcampus.co.kr/";

        // 문자열의 길이 : length();
        int length = url.length();
        System.out.println("문자열 길이 : " + length);

        // 문자열의 특정 인덱스에 해당하는 문자를 하나씩 뗌 : charAt(index)
        // for문을 사용하여 문자열의 전체 문자를 하나(char)씩 뗄 수 있다.
        System.out.println("=============================");
        for (int i = 0; i < url.length(); i++) {
            System.out.print(url.charAt(i) + " ");
        }
        System.out.println();

        // 문자열을 문자의 배열로 변경 : toCharArray()
        System.out.println("=============================");
        for (char c1 : url.toCharArray()) {
            System.out.print(c1 + " ");
        }
        System.out.println();

        // 문자열에 특정 문자(열)이 포함되었는지 확인 : contains()
        System.out.println(url.contains("http")); // 대소문자 구분

        // 문자열에 특정 문자(열)이 시작하는 인덱스를 앞에서부터 확인 : indexOf()
        // 문자열에 특정 문자(열)이 시작하는 인덱스를 뒤에서부터 확인 : lastIndexOf()
        // 이 둘은 contains() 처럼 활용할 수 있다.
        System.out.println(url.indexOf("http"));
        System.out.println(url.lastIndexOf("http"));

        // 문자열의 대소문자를 변경함 : toLowerCase(), toUpperCase()
        System.out.println(url.toLowerCase());
        System.out.println(url.toUpperCase());

        // 문자열의 앞/뒤 공백을 제거 : trim()
        String url2 = "https://FastCampus.co.kr/                 "; // 공백 존재
        System.out.println("[" + url2.trim() + "]"); // 공백 삭제

        // 대소문자를 구분하며 문자열의 동등 비교 : equals()
        // 대소문자를 구분하지 않고 문자열의 동등 비교 : equalsIgnoreCase()
        System.out.println(url.equals(FS)); // false
        System.out.println(url.equalsIgnoreCase(FS)); // true

        // 구분자를 이용하여 문자열을 자른 다음 문자열 배열에 넣음 : split(구분자)
        // news, tv, sbs를 얻고싶다! (분류/매체/방송국)
        String news = "https://www.naver.com/news/tv/sbs";
        String[] newsToList = news.split("/");
        for (String str : newsToList) {
            System.out.println(str);
        } // 불필요한 https:, 빈 문자열 하나, 도메인 출력됨

        // 교체될 문자열을 지정하여 새 문자열로 교체함 : replace(교체될 문자열, 교체할 문자열)
        System.out.println(news.replace("https://www.naver.com/", "")); // news/tv/sbs만 남음
        // 이후 split을 수행하면 불필요한 부분이 없어진다.
        newsToList = news.replace("https://www.naver.com/", "").split("/");
        System.out.println("분류 : " + newsToList[0] + ", 매체 : " + newsToList[1] + ", 방송국 : " + newsToList[2]);

        // 문자열을 더해줌 : concat(붙일 문자열) -> 더하기 연산자와 동일하므로 잘 안씀 ..
        // MariaDB, MySql에서 문자열 조합일 때 많이 사용함
        // Oracle -> ||
        // MSSQL -> +
        System.out.println(news.concat("/index.html"));

        // 시작 인덱스부터 끝까지 문자열을 자름 : substring(시작 인덱스)
        // 시작 인덱스부터 특정 인덱스까지 문자열을 자름 : substring(시작 인덱스, 특정 인덱스 + 1) -> + 1 해주는 이유는 0부터 시작하기 때문
        System.out.println(url); // https://FastCampus.co.kr/
        System.out.println(url.substring(8)); // FastCampus.co.kr/
        System.out.println(url.substring(8, 18)); // FastCampus

        // 다른 타입의 파라미터에 해당하는 값을 문자열 타입으로 변경 : valueOf(파라미터) (ex 88 -> "88")
        String v1 = String.valueOf(12); // 12라는 정수를 "12" 문자열로 변경
        // 부가 - 정수처럼 생긴 문자열을 정수로 변경 : Integer의 valueOf(문자열)
        Integer n1 = Integer.valueOf(v1);

        // 사전을 기준으로 어떤 문자열이 앞에 있는지 비교 : 문자열1.compareTo(문자열2)
        // 문자열1이 앞에 있으면 음수, 뒤에 있으면 양수, 같은 위치면 0 반환
        // 보통 정렬할 때 사용
        String str1 = "홍길동";
        String str2 = "이순신";

        System.out.println(str1.compareTo(str2)); // 양수
        System.out.println(str2.compareTo(str1)); // 음수
        System.out.println(str1.compareTo(str1)); // 0

        // 특정 자료형에 해당하는 포맷으로 문자열을 가공 : String.format()
        String name = "홍길동";
        int age = 24;
        double weight = 80.1;

        // 아래와 같이 특정 자료형에 해당하는 포맷을 설정하고 포맷에 들어갈 변수들을 순서대로 작성
        // %s : 문자열, %d : 정수, %.2f : 실수 (소수 둘째자리까지)
        // printf()와 동일한 기능
        String dp = String.format("이름 : %s, 나이 : %d, 몸무게 : %.2f", name, age, weight);

        System.out.println(dp);
    }
}
