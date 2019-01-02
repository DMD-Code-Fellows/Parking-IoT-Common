# Parking-IoT-Common
This library contains base classes shared by multiple Parking IoT applications.

It provides a common language between the central application, Parking-IoT-Server,
and clients applications that wish to interact with it.

For example, the enum, ParkingSpaceEvents, defines the parking space events that
are supported by the server. One case, is the OCCUPY event, which is defined as
making a parking space with state VACANT, change to state OCCUPIED.

## Usage
Instructions for using this common library in a client project:
1. Download the jar file contained in the project root:
    ```parking-iot-common-1.0.0.jar```
2. If your project does not already have a libs folder, create it.
3. Copy the jar file you downloaded into your libs folder.
4. Add this dependency to your build.gradle file:
    ```compile files('libs/parking-iot-common-1.0.0.jar')```
5. You can now use its classes in your project.

## Documentation
See this library's documentation for further details:

https://dmd-code-fellows.github.io/Parking-IoT-Common/
