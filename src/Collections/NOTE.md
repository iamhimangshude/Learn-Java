# Collections in Java

As we learned earlier, to store more than one object in a variable, arrays are used! But those have fixed size like, `new int[5]` has length of 5, and the size cannot be changed!

Of course we can assign a new `new int[10]` (unless the variable is declared as final) then the previous object is marked for garbage collection by the JVM if not used in the following code execution sequence.

But there's a catch, we need to copy all the elements of the old array to the newly created array! This is so inefficient when we work in big projects.

To address the said issue, we use **Collections Framework** in Java!

## Parts of Collections:

- Collections API: theoretical concept as of how it is used and operates.
- `Collection`: It is the `interface` in java
- `Collections`: It is the `class` in java

## Hierarchy of Collection Interface

`Collection` inteface has the following hierarchy:

- `List` (I)
    - `Arrays` (C)
    - `ArrayList` (C)
    - `LinkedList` (C)
    - `Vector` (C)
        - `Stack` (C)

- `Queue` (I)
    - `PriorityQueue` (C)
    - `Deque` (I)
        - `ArrayDeque` (C)

- `Set` (I)
    - `HashSet` (C)
    - `LinkedHashSet` (C)
    - `SortedSet` (I)
        - `TreeSet` (C)


*NOTE*: I -> Interface, C -> Class

*NOTE*: `Collection` interface also *extends* `Iterable` interface.


# `Map` in Java

A `Map` in Java, is a certain type of interface that stores **key-value** pairs, where each **key** is *unique*  and *maps* exactly to one value. 

Unlike `List` or `Set`, `Map` does not extend `Collection` interface and is designed for fast lookups based on keys rather than sequential access!

## Hierarchy of `Map`

Common implementations of `Map` interface:

- `HashMap`: Provides fast, unordered access with constant-time performance for insertions and lookups.

- `LinkedHashMap`: Maintains **insertion order** of elements, which is useful for predictable iteration.

- `TreeMap`: Stores keys in **sorted order (natural or custom comparator sort)**, making it suitable for ordered data access.

