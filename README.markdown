# Java7Collections

Java 7 Generics and Collections 

Objectives 
Generics 
Simple Cache Class Without Generics 
Generic Cache Class 
Generics in Action 
Generics with Type Inference Diamond 
Quiz 
Collections 
Collection Types 
Java 7 Generics and Collections 

# After completing this, you should be able to

* Create a custom generic class
* Use the type inference diamond to create an object
* Create a collection without using generics
* Create a collection by using generics
* Implement an ArrayList
* Implement a Set
* Implement a HashMap
* Implement a Stack
* Use Enumerated Types

# 1 Generics

## Why Generics?

* Provide type safety to your code
* Moved common errors from runtime to compile time
* Provide cleaner, easier to write code
* Reduce the need for casting in collections
* Are used heavily in Java collections API

-- for example --

## Example

Example: Before Generic

 public class CacheString {

    private String message;

    public void add(String message){
        this.message = message;
    }

    public String get(){
        return this.message;
    }

}

public class CacheShirt {

    private Shirt shirt;

    public void add(Shirt shirt){
        this.shirt = shirt;
    }

    public Shirt get(){
        return this.shirt;
    }

}

After Generic:

public class CacheAny<T> {

    private T t;

    public void add(T t){
        this.t =  t;
    }

    public T get(){
        return this.t;
    }

} 

 Generic in action:

 public static void main(String[] args) {

        CacheString cacheString =new CacheString(); //Type
        CacheShirt cacheShirt =new CacheShirt(); //Type
    

        //Generics
        CacheAny<String> myGenericMessage =  new CacheAny<String>();
        CacheAny<Shirt> myGenericShirt = new CacheAny<Shirt>();
    
        cacheString.add("new Message"); //Type
        myGenericMessage.add("new message"); // Generic
    
    }

Generics with type inference diamond <>
- There is no need to repeT type on the right side of the statment
- Angle brackets indicate that the type parameters are mirrored
- Simplifies generic declarations
- Saves typing

CacheAny<String> myGenericMessage =  new CacheAny<>();

# 1 Collections:

Collection is a single object designed to manage a group of objects.
- Objects in collection are called elements
- Primitives are not allowed in a  collections

Various collection types implement many common data structures
stack, queue, dynamic array, hash

The collection API relies heavily on genericcs for its implementation.

## Collection Types

