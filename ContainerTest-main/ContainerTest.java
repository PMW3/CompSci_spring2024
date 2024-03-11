import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.awt.*;

public class ContainerTest {
    @Test
    public void containerLiquidInitializedZero() {
        Container container = new Container();
        assertEquals(0, container.contains());
    }

    @Test
    public void addedLiquidIncreaseContainerAccurately(){
        Container container = new Container();
        container.addAmount(10);
        assertEquals(10, container.contains());
        container.addAmount(10);
        assertEquals(20, container.contains());
    }

    @Test
    public void removedLiquidDecreaseContainerAccurately(){
        Container container = new Container();
        container.addAmount(10);
        container.remove(3);
        assertEquals(7,container.contains());
        container.remove(7);
        assertEquals(0, container.contains());
    }

    @Test
    public void cannotAdd100UnitsToContainer(){
        Container container = new Container();
        container.addAmount(192);
        assertEquals(0, container.contains());
    }

    @Test
    public void cannotRemoveMoreThanContainerAmount(){
        Container container = new Container();
        container.addAmount(1);
        container.remove(2);
        assertEquals(1, container.contains());
    }

    @Test
    public void cantAddNegativeAmountToContainer () {
        Container container = new Container();
        container.addAmount(-1);
        assertEquals(0, container.contains());
    }

    @Test
    public void cantRemoveNegativeAmountToContainer() {
        Container container = new Container();
        container.remove(-1);
        assertEquals(0, container.contains());
    }

    @Test
    public void movesContiainerAmountToNewContainer () {
        Container container = new Container();
        Container container2 = new Container();
        container.addAmount(10);
        container.move(10, container2);
        assertEquals(10, container2.contains());

    }
    @Test
    public void cantAddZeroToContainer(){
        Container container = new Container();
        Container container2 = new Container();
        container.move(-1, container2);
        assertEquals(0,container.contains());
    }
    @Test
    public void moveRemovesCorrectAmountFromOGContainer(){
        Container container = new Container();
        Container container2 = new Container();
        container.addAmount(10);
        container.move(4    , container2);
        assertEquals(6, container.contains());
    }

    @Test
    public void cantOverFillContainerWhenMoving () {
        Container container = new Container();
        Container container2 = new Container();
        container.addAmount(20);
        container2.addAmount(90);
        container.move(20    , container2);
        assertEquals(90, container2.contains());
    }


    @Test
    public void returnContainerAmountAsString() {
        Container container = new Container();
        container.toString();
        assertEquals("0/100", container.toString());

    }

    @Test
    public void returnCorrectContainerAmountAsString() {
        Container container = new Container();
        container.addAmount(2);
        container.toString();
        assertEquals("2/100", container.toString());

    }

}

