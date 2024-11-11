package MiniReports;

/*
류지헌
깜짝과제 3번 : 페이징 처리하는 코드 작성
 */

class Pager
{
    long totalCnt;
    long pageCnt;
    long naviBlock;
    Pager(long totalCnt)
    {
        this.totalCnt = totalCnt;
        pageCnt = 10;
        naviBlock = 10;
    }
    public String html(long pageIdx)
    {
        long totalPageCnt = totalCnt % pageCnt > 0 ? totalCnt / pageCnt + 1 : totalCnt / pageCnt;
        if(pageIdx > totalPageCnt || pageIdx < 1) return "";

        String Html = "" +
                "<a href='#'>[처음]</a>\n" +
                "<a href='#'>[이전]</a>\n" +
                "\n";

        long startPage = pageIdx - (pageIdx-1) % naviBlock;
        long endPage = Math.min(startPage + naviBlock - 1, totalPageCnt);
        for(long i = startPage; i < pageIdx; i++) {
            Html += "<a href='#'>"+ i + "</a>\n";
        }

        Html += "<a href='#' class='on'>" + pageIdx + "</a>\n";

        for(long i = pageIdx+1; i <= endPage ; i++) {
            Html += "<a href='#'>"+ i + "</a>\n";
        }

        Html += "\n" +
                "<a href='#'>[다음]</a>\n" +
                "<a href='#'>[마지막]</a>";

        return Html;
    }
}

public class SurpriseReport_3 {
    public static void main(String[] args) {
        long totalCnt = 127;
        long pageIdx = 1;

        Pager pager = new Pager(totalCnt);
        System.out.println(pager.html(pageIdx));
    }
}
