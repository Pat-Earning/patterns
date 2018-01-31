package patterns.composite_iterator;

public class AthleticDept {
    PlayerComponent allPositions;

    public AthleticDept(PlayerComponent allPositions){
        this.allPositions = allPositions;
    }

    public void printPositions(){
        allPositions.print();
    }


}
