import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.HashMap;

public class TestIOU {
    @Test
    public void iouMapIsEmptyWhenInitialized () {
        IOU iou = new IOU ();
        assertEquals(iou.iouMap.size(), 0);
    }

    @Test
    public void savesAmountOwedToIou() {
        IOU iou = new IOU ();
        iou.setSum("name", 3.00);
        assertEquals(3.00, iou.iouMap.get("name") , 0.001);
    }

    @Test
    public void returnsAmountOwedToPerson () {
        IOU iou = new IOU ();
        iou.setSum("name", 4.21);
        assertEquals(4.21, iou.howMuchDoIOweTo("name"), 0.001);
    }

    @Test
    public void ifPersonNotFoundInIouReturnZero () {
        IOU iou = new IOU ();
        assertEquals(0.00,iou.howMuchDoIOweTo("Will"), 0.001);
    }

    @Test
    public void returnsPersonAmountAfterPersonIsAddedToIouAfterNotPreviouslyFound () {
        IOU iou = new IOU ();
        assertEquals(0.00,iou.howMuchDoIOweTo("Will"), 0.001);
        iou.setSum("Will", 22.12);
        assertEquals(22.12, iou.howMuchDoIOweTo("Will"), 0.001);
    }


    @Test
    public void returnsTotalAmountOwed() {
        IOU iou = new IOU ();
        iou.setSum("Guy", 12.01);
        iou.setSum("Will", 10.00);
        assertEquals(22.01, iou.totalOwed(), 0.001);
    }

    @Test
    public void returnsTotalOfZeroOnEmptyIou() {
        IOU iou = new IOU ();
        assertEquals(0.00, iou.totalOwed(), 0.001);
    }

}
