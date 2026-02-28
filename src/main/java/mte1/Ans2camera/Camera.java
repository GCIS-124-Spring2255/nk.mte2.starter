package mte1.Ans2camera;

/* 
Q2 [40 points]. All cameras (say, an abstract class, Camera.java) have common characteristics including a manufacturer, model, and lens type. 
Cameras provide their users a way to take and store pictures (say, an abstract method as takePicture ( ) boolean method). 
Because picture storage is limited, a user cannot take pictures if they are out of storage. 
Two common types of cameras are Analog, say AnalogCamera.java, which store pictures on film, and Digital, say, DigitalCamera.java, which store pictures on memory cards.  
Film is limited by the number of pictures that can fit on a film roll and memory cards are limited by the storage size in megabytes (MB). 
All of your Java classes must be inside the camera package. 
Part A: Lens Type has a finite number of legal values: Fisheye, Wide Angle, Standard, Telephoto, Macro. 
Implement a Java Type enum for a Lens Type, say LensType.java. 
Part B: Implement each of the camera types in an appropriate Java class hierarchy using appropriate encapsulation, attribute/method modifier, annotations, abstraction, and inheritance techniques.

*Camera Type: All
*Attributes: Manufacturer (String) | Model (String) | Lens Type (LensType)
*Behavior: Take Picture – all cameras take pictures, but each camera stores the pictures in a different way.

*Camera Type: Analog
*Attributes: Pictures Remaining (int)– the number of remaining pictures that can be taken with the current loaded film roll.
*Behavior: Load Film Roll – load camera with a film roll of a given size, which determines how many pictures can be taken.  The number of pictures that can be taken is reset to the roll size when it is loaded.
Take Picture – if the number of pictures taken thus far is less than the current roll size, the picture can be taken and the method returns true.
If the number of pictures taken is equal to the current roll size, the picture cannot be taken and the method returns false.  To continue taking pictures the camera must be loaded with a new roll.

*Camera Type: Digital
*Attributes: Picture size in MB (int) – the size in MB for each picture taken.
MB Remaining on Card (int) – the amount of storage in MB remaining on the current memory card.
*Attributes: Insert Memory Card – inserts a blank memory card of a given size in MB.  The MB remaining on the card is reset to the memory card size.
Take Picture – if the camera’s picture size in MB is less than or equal to the remaining MB on the memory card, the picture can be taken and the method returns true.
If the camera’s picture size in MB is greater than the remaining MB on the memory card, the picture cannot be taken and the method returns false.   To continue taking pictures, a new memory card must be inserted.

Q3 [30 points]. Develop the UML diagram (with relationship, visibility modifiers, and appropriate notation, if possible) for all Java classes (from Q2). 
You may also draw the UML diagram on paper (if you do not want to use an online graphics/drawing program like draw.io). 
Please ensure that hand drawings and images are legible. 
Upload your solution image file or the diagram file (say, ans3-UMLdiagram-Kshetri.png) to your repository (inside diagram package) if you did it from draw.io.

*/
public class Camera {
    
}
