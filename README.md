# Java 9
## Installation of Java 9
### Mac

resource: http://davidcai.github.io/blog/posts/install-multiple-jdk-on-mac/

## Java 9 factory methods for collections

```Java
    public static void main(String[] args){
        List<String> fruits = List.of("apple", "orange", "banana");
        for (String fruit: fruits)
            System.out.println(fruit);
        try
        {
            fruits.add("pear");
        }
        catch (UnsupportedOperationException uoe)
        {
            System.err.println("unable to modify fruits list");
        }

        Set<String> marbles = Set.of("aggie", "alley", "steely");
        for (String marble: marbles)
            System.out.println(marble);
        try
        {
            marbles.add("swirly");
        }
        catch (UnsupportedOperationException uoe)
        {
            System.err.println("unable to modify marbles set");
        }
    }
```
