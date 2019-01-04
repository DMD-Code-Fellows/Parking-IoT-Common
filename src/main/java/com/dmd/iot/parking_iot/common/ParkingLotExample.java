package com.dmd.iot.parking_iot.common;

/**
 * This is an example parking lot supported by the Parking-IoT application.
 * It serves demonstration, and development purposes.
 * By default, the Parking-IoT application deploys with this parking lot.
 * The keys in this example are used by clients, to interact with the
 * application, for things like discovery of parking lot details, and updating
 * the status of a parking space.
 */
public final class ParkingLotExample {

    //Parking Lot One
    public static final String PARKING_LOT_ONE_NAME = "Parking Lot One";
    public static final int    PARKING_LOT_ONE_NUM_ROWS = 2;
    public static final int    PARKING_LOT_ONE_R1_NUM_SPACES = 6;
    public static final int    PARKING_LOT_ONE_R2_NUM_SPACES = 6;
    public static final String PARKING_LOT_ONE_R1_NAME = "Row One";
    public static final String PARKING_LOT_ONE_R2_NAME = "Row Two";
    public static final String PARKING_LOT_ONE_R1_S1_NAME = "R1-1";
    public static final String PARKING_LOT_ONE_R1_S2_NAME = "R1-2";
    public static final String PARKING_LOT_ONE_R1_S3_NAME = "R1-3";
    public static final String PARKING_LOT_ONE_R1_S4_NAME = "R1-4";
    public static final String PARKING_LOT_ONE_R1_S5_NAME = "R1-5";
    public static final String PARKING_LOT_ONE_R1_S6_NAME = "R1-6";
    public static final String PARKING_LOT_ONE_R2_S1_NAME = "R2-1";
    public static final String PARKING_LOT_ONE_R2_S2_NAME = "R2-2";
    public static final String PARKING_LOT_ONE_R2_S3_NAME = "R2-3";
    public static final String PARKING_LOT_ONE_R2_S4_NAME = "R2-4";
    public static final String PARKING_LOT_ONE_R2_S5_NAME = "R2-5";
    public static final String PARKING_LOT_ONE_R2_S6_NAME = "R2-6";

    public static final String[] rows = {
            PARKING_LOT_ONE_R1_NAME,
            PARKING_LOT_ONE_R2_NAME};
    public static final String[] rowOneSpaces = {
            PARKING_LOT_ONE_R1_S1_NAME,
            PARKING_LOT_ONE_R1_S2_NAME,
            PARKING_LOT_ONE_R1_S3_NAME,
            PARKING_LOT_ONE_R1_S4_NAME,
            PARKING_LOT_ONE_R1_S5_NAME,
            PARKING_LOT_ONE_R1_S6_NAME};
    public static final String[] rowTwoSpaces = {
            PARKING_LOT_ONE_R2_S1_NAME,
            PARKING_LOT_ONE_R2_S2_NAME,
            PARKING_LOT_ONE_R2_S3_NAME,
            PARKING_LOT_ONE_R2_S4_NAME,
            PARKING_LOT_ONE_R2_S5_NAME,
            PARKING_LOT_ONE_R2_S6_NAME};
}
