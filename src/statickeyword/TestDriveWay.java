package statickeyword;

public class TestDriveWay {

    public static void main(String[] args) {
        DriveWay tashfiaDriveway = new DriveWay();
        tashfiaDriveway.setDriveWaySize(10);
        System.out.println("Tashfia's driveway size : " +tashfiaDriveway.getDriveWaySize());

        DriveWay dioneDriveway = new DriveWay();
        dioneDriveway.setDriveWaySize(12);
        System.out.println("Dione's driveway size : " +dioneDriveway.getDriveWaySize());

        System.out.println("Tashfia's driveway size : " +tashfiaDriveway.getDriveWaySize());

        DriveWay.shapeOfDriveWay();
    }


}
