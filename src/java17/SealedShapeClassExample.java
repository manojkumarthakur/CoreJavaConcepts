package java17;

/* 1. Sealed Classes (JEP 409):
This feature allows you to restrict which classes or interfaces can extend or implement a sealed class or interface.
 This provides more control over class hierarchies and helps in enforcing design patterns.
  If class/interface is sealed implementation class must be either sealed, non-sealed or final
 */
public sealed class SealedShapeClassExample permits Circle, Rectangle, Triangle {
    // ... class definition
}

final class Circle extends SealedShapeClassExample {
    // ...
}

non-sealed class Rectangle extends SealedShapeClassExample {
    // ...
}

sealed class Triangle extends SealedShapeClassExample permits EquilateralTriangle {
    // ...
}
final class EquilateralTriangle extends Triangle {

}

//class Square extends Shape{ // Not allowed, in the sealed hierarchy, need to Add Sqaure class in permits
class Square extends Rectangle{ // Allowed as Rectangle is non sealed class
//class Square extends EquilateralTriangle{ // Not Allowed as EquilateralTriangle is final class

}
