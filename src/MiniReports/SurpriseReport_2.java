package MiniReports;

import java.util.ArrayList;
import java.util.Scanner;

/*
류지헌
깜짝과제 2번 : 가장 가까운 좌표 값을 출력하는 프로그램 작성
 */

class Coord
{
    int x;
    int y;
    Coord(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj)
    {
        Coord c = (Coord) obj;
        return this.x == c.x && this.y == c.y;
    }
}

public class SurpriseReport_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나의 좌표 x값 : ");
        int my_x = Integer.parseInt(sc.next());
        System.out.print("나의 좌표 y값 : ");
        int my_y = Integer.parseInt(sc.next());
        Coord myCoord = new Coord(my_x, my_y);

        ArrayList<Coord> CoordList = new ArrayList<>();
        while(CoordList.size() < 10)
        {
            System.out.println(CoordList.size()+1 + "/10 번째 입력");
            System.out.print("임의의 좌표 x값 : ");
            int x = Integer.parseInt(sc.next());
            System.out.print("임의의 좌표 y값 : ");
            int y = Integer.parseInt(sc.next());

            if(!CoordList.contains(new Coord(x, y))) {
                CoordList.add(new Coord(x, y));
            }
            else {
                System.out.println("동일한 좌표값이 이미 존재합니다. 다시 입력해 주세요.");
            }
        }

        Coord minCoord = new Coord(0,0);
        long minDist = Long.MAX_VALUE;
        for(int i = 0; i < CoordList.size(); i++)
        {
            Coord c = CoordList.get(i);
            long dist = (long)Math.pow(c.x - myCoord.x, 2) + (long)Math.pow(c.y - myCoord.y, 2);
            System.out.println("(" + c.x + ", " + c.y + ")");
            if(minDist > dist)
            {
                minDist = dist;
                minCoord = c;
            }
        }

        System.out.println("나와 가장 가까운 좌표 값은 " +
                "(" + minCoord.x + ", " + minCoord.y + ") 입니다.");
    }
}
