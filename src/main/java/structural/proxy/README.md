# Proxy Design Pattern


The **Proxy Pattern** is a structural design pattern that provides a surrogate or placeholder for another object to control 
access to it. It is used when you want to add an extra layer of control over how and when an object is accessed or 
manipulated. The proxy acts as an intermediary between the client and the real object, allowing the proxy to perform 
additional tasks before or after the request reaches the real object.

## Lecture & Important links

- **Lecture Link** - [L07 - Proxy Design Pattern](https://youtu.be/t-WDABdUjy8)
- **Complete Playlist** - [Design Patterns](https://www.youtube.com/playlist?list=PL5DyztRVgtRUqnoWYVAFC1honDiDpdKOX)
- **Other Courses** - [CodeNCode @ YT](https://www.youtube.com/@codencode)



## About the implementation
Proxy Design Pattern is implemented using three different types.
1. **protection_proxy**: Controls access to the real object based on access rights or permissions.
2. **smart_proxy**: Adds additional behavior when the real object is accessed, such as logging, caching, or reference counting.
3. **virtual_proxy**: Delays the creation and initialization of expensive objects until they are actually needed (lazy initialization).
