import java.util.Random;

public class BricksContainer {
    public static void main(String[] args) {
        int amountOfBricks=new Random().nextInt(51)+50;
        int containerCapacity=new Random().nextInt(6)+4;
        int fullContainers=amountOfBricks/containerCapacity;
        int remainingBlocks = amountOfBricks % containerCapacity;
        int totalContainers=fullContainers+(remainingBlocks > 0 ? 1 : 0);

        System.out.println("Total" + amountOfBricks+" lego bricks");
        System.out.println("Total capacity " + containerCapacity);
        System.out.println("Total full containers: " + fullContainers);
        System.out.println("All Containers " + totalContainers);
        System.out.println("Blocks in unfull containers " + remainingBlocks);
    }
}
