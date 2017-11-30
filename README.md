# Java 9
## Installation of Java 9
### Mac

resource: http://davidcai.github.io/blog/posts/install-multiple-jdk-on-mac/

## Java 9 factory methods for collections
### What does this new feature do?
Makes it easier to create instances of collections and maps with small numbers of elements. New static factory methods on the List, Set, and Map interfaces make it simpler to create immutable instances of those collections.

### What are the benefits/disadvantages?
- Improved readability
- Less object initialization
- Less boiler plate code

### Do you like the feature?
Yes, see above

### Will you use it on your project?
Absolutely

### What are the reasons you won’t be using it?
The resulting collections will be immutable.
If you want to do mutations to collections, you won't be able to use this feature

### Example

```Java
    public static void main(String[] args){
        List<String> fruits = List.of("apple", "orange", "banana");
        for (String fruit: fruits) {
            System.out.println(fruit);
        }
        try {
            fruits.add("pear");
        } catch (UnsupportedOperationException uoe) {
            System.err.println("unable to modify fruits list");
        }

        Set<String> marbles = Set.of("aggie", "alley", "steely");
        for (String marble: marbles) {
            System.out.println(marble);
        }
            
        try {
            marbles.add("swirly");
        } catch (UnsupportedOperationException uoe) {
            System.err.println("unable to modify marbles set");
        }
    }
```
