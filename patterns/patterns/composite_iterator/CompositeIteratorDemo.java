package patterns.composite_iterator;

import java.util.Iterator;

public class CompositeIteratorDemo {
    public static void main(){
        PlayerComponent baseballPositions = new PlayerComposite("Baseball","America's Pastime");
        PlayerComponent footballPositions = new PlayerComposite("Football","American Rules");
        PlayerComponent footballOffPos = new PlayerComposite("Offense","Offensive squad");
        PlayerComponent footballDefPos = new PlayerComposite("Defense", "Defensive squad");

        PlayerComponent allPositions = new PlayerComposite("All positions", "in all sports concerned");

        allPositions.add(baseballPositions);
        allPositions.add(footballPositions);
        footballPositions.add(footballOffPos);
        footballPositions.add(footballDefPos);

        baseballPositions.add(new PlayerLeaf("P","pitches"));
        baseballPositions.add(new PlayerLeaf("C", "catches"));
        baseballPositions.add(new PlayerLeaf("IF","picks up ground balls"));
        baseballPositions.add(new PlayerLeaf("OF","catches fly balls"));

        footballOffPos.add(new PlayerLeaf("OL","protects the QB"));
        footballOffPos.add(new PlayerLeaf("QB","passes or hands off"));
        footballOffPos.add(new PlayerLeaf("RB","rushes"));
        footballOffPos.add(new PlayerLeaf("WR/TE","receives"));
        footballDefPos.add(new PlayerLeaf("DL", "charges"));
        footballDefPos.add(new PlayerLeaf("LB","stops rushes"));
        footballDefPos.add(new PlayerLeaf("CB/S","stops receivers"));

        AthleticDept coach = new AthleticDept(allPositions);
        coach.printPositions();

        System.out.println("\n\n\n");

        Iterator positions = allPositions.createIterator();
        while(positions.hasNext()){
            PlayerComponent playerComponent = (PlayerComponent) positions.next();
            System.out.print("\n" + playerComponent.getName() + ", ");
        }

        System.out.println("\n\n\n");

        try {
            positions.remove();
        } catch (UnsupportedOperationException e) {
            //System.out.println("np");
        }



    }
}
