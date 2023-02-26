import java.util.*;

public class TestA {
/*String question="
    Below are the given coordinates of points on graph
    {1,0},{2,0},{3,0},{-1,0},{0,2},{-2,0}

    Find all the points that are at second farthest distance from center i.e. {0,0} ?
    //2nd longest distince
    Step: 1 //initialization
    Step: 2 //store in list of each //sort on distance basis
    step  3 //Map<> key(distance), List<Vertex>
    step: 4 //sortMap on backward
    step :5 //iterate map and then get 2nd last distance
    Answer for above input {0,2},{2,0},{-2,0}
    Formula to get distance from center is d2=x2+y2*/

    public static void main(String[] args) {
        List<Vertex> vertexList = buildVertex();
        //System.out.println(vertexList);
        Map<Double, List<Vertex>> treeMap = new TreeMap<>(Comparator.reverseOrder());
        for (Vertex v : vertexList) {
            //check and store on each distance basis
            if (treeMap.containsKey(v.getDistanceFromOrigin())) {
                List<Vertex> vertexs = treeMap.get(v.getDistanceFromOrigin());
                vertexs.add(v);
                treeMap.put(v.getDistanceFromOrigin(), vertexs);
                //inlcude more and more list
            } else {
                List<Vertex> newVertex = new ArrayList<>();
                newVertex.add(v);
                treeMap.put(v.getDistanceFromOrigin(), newVertex);
            }

        }
        System.out.println(treeMap);
        treeMap.entrySet().stream().skip(1).findFirst().get().getValue().stream().forEach(System.out::println);

    }

    private static List<Vertex> buildVertex() {
        List<Vertex> vertexList = new ArrayList<>();
        Vertex v1 = new Vertex(0, 2);
        distanceFromOrigionCalculate(v1);
        vertexList.add(v1);
        Vertex v2 = new Vertex(2, 0);
        distanceFromOrigionCalculate(v2);
        vertexList.add(v2);

        Vertex v3 = new Vertex(-2, 0);
        distanceFromOrigionCalculate(v3);
        vertexList.add(v3);

        Vertex v4 = new Vertex(-3, 0);
        distanceFromOrigionCalculate(v4);
        vertexList.add(v4);

       /* Vertex v5 = new Vertex(-3, 3);
        distanceFromOrigionCalculate(v5);
        vertexList.add(v5);*/

        return vertexList;
    }

    private static void distanceFromOrigionCalculate(Vertex v1) {
        v1.distanceFromOrigin = Math.sqrt(v1.x * v1.x + v1.y * v1.y);
    }

}

class Vertex {
    int x;
    int y;
    double distanceFromOrigin;    //

    public Vertex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistanceFromOrigin() {
        return distanceFromOrigin;
    }

    public void setDistanceFromOrigin(double distanceFromOrigin) {
        this.distanceFromOrigin = distanceFromOrigin;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "x=" + x +
                ", y=" + y +
                ", distanceFromOrigin=" + distanceFromOrigin +
                '}';
    }
}


   /* We are given a subscription table which consists of subscription start and end date for each user. We need to write a query that returns true/false for each user based on the overlapping of dates with other users. For instance, If user1's subscription period overlaps with any other user the query must return True for user1.

        User,   start date,     end date

        U1,     2022-01-01,     2022-01-31

        U2,     2022-01-16,     2022-01-26

        U3,     2022-01-26,     2022-02-06

        U4,     2022-02-07,     2022-02-14

        Answer :

        U1,true
        U2,true
        U3,true
        U4,false

        select * from subscribtion s1, subscrition s2 where s1.startdate < s2.startdate && s1.enddate < s2.enddate
        and s1.user<>s2.user

        select s1.user,case when (exit(select 1 from  subscribtion s2 where s1.startdate < s2.startdate && s1.enddate < s2.enddate
        and s1.user<>s2.user )  ) then true else false as overlapping
         from subscription s1 ;


    */
