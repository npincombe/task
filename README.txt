Compile:
    Go to the location of the java files.
    javac *.java

Run:
    You can run the demo program by using "java Test"

Design Notes:
    The framework uses a Geometry interface with a draw method. Every object that implements Geometry must be
    able to be drawn and is responsible for defining how itself is drawn.
    A 'Point' is the most basic Geometry object and I simply let it be drawn
    as a line to itself but another example of how to implement it would be to draw a circle with 1 pixel in radius.
    Other supported objects can easily be added by
    implementing the Geometry interface or extending another object in the framework such as
    'Point'. For example, 'Rectangle' can de defined by a 'Point' and a height and width
    and a rectangle is responsible for defining how it is drawn.

    Collections are done using the GeometryCollection class. It is essentially a java List but
    is abstract because I might need to add additional behaviour. New collections can be added 
    easily by extending  'GeometryCollection' and require no additional implementation at the moment
    but is open to change.

    Devices are done using a 'Device' abstract class that requires all implementing classes to implement
    a drawGeometry method. I have included a fully implemented MonitorDevice as an example but new Devices
    are easily added my extending the 'Device' class and are responsible for implementing how they are drawn
    on that device.

    The 'Test' demo just sets a few collections of Geometry objects and draws them on the MonitorDevice.