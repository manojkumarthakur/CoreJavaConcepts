package java17;

/* 1. Sealed Classes (JEP 409):
This feature allows you to restrict which classes or interfaces can extend or implement a sealed class or interface.
 This provides more control over class hierarchies and helps in enforcing design patterns.
 If class/interface is sealed implementation class must be either sealed, non-sealed or final
 */

public sealed  interface SealedInterfaceExample permits ABCClass, XZYInterface  {
}

non-sealed class ABCClass implements SealedInterfaceExample{

}

sealed interface XZYInterface extends SealedInterfaceExample permits Manoj{

}

final class Manoj implements XZYInterface {
}
