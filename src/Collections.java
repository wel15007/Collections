
import java.util.*;

/* Write a list collection, a queue collection, a set collection, a tree collection and a map collection.
 * Display the list, queue, set and tree collections
 */
public class Collections {
    public static void main (String[] args) {

        //List collection
        System.out.println("-------------List-------------");

        //Create a list called movie and add them to an array list
        List movie = new ArrayList();
        movie.add("The Dark Knight");
        movie.add("Intersteller");
        movie.add("Spiderman: Into the Spiderverse");
        movie.add("The Bourne Ultimatium");
        movie.add("The Man from U.N.C.L.E");
        movie.add("Skyfall");
        movie.add("Jaws");

        // Create a movies object that will display each movie that we added
        for(Object movies:movie) {
            System.out.println(movies);
        }

        //Queue collection
        System.out.println("------------Queue-------------");

        // Create a Queue
        Queue fruit = new PriorityQueue();
        fruit.add("Apple");
        fruit.add("Grapes");
        fruit.add("Watermellon");
        fruit.add("Banana");
        fruit.add("Strawberry");
        fruit.add("Cherry");
        fruit.add("Blueberry");

        // Create an iterator for the queue and have each fruit have a priority
        Iterator fruits = fruit.iterator();

        // While there is a fruit still in the iterator queue, display it according to its priority in the poll
        while(fruits.hasNext()) {
            System.out.println(fruit.poll());
        }

        //Set collection
        System.out.println("--------------Set-------------");

        // Create a set of tools and add them to a hash set
        Set tool = new HashSet();
        tool.add("Hammer");
        tool.add("Screwdriver");
        tool.add("Sander");
        tool.add("Band Saw");
        tool.add("Hand Saw");
        tool.add("Nail Gun");
        tool.add("Wrench");

        // For each tool, display them according to the hash value of each tool
        for (Object tools:tool) {
            System.out.println(tools);
        }

        //Tree collection
        System.out.println("-------------Tree-------------");

        //Create a tree set
        TreeSet game = new TreeSet();
        game.add("Bloodhaven");
        game.add("Wingspan");
        game.add("Eldrich Horror");
        game.add("Mission Red Planet");
        game.add("Clank!");
        game.add("Terriforming Mars");
        game.add("Mansions of Madness");

        //Display each game
        for (Object games:game){
            System.out.println(games);
        }

        //Map collection
        System.out.println("--------------Map-------------");

        // Create a new map and add them to a Hash Map
        Map color = new HashMap();
        color.put(1,"Blue");
        color.put(2,"Red");
        color.put(3,"Orange");
        color.put(4,"Green");
        color.put(5,"Yellow");
        color.put(6,"Teal");
        color.put(7,"Brown");

        //For each color, get the color value, display the color associated with the value, and go to the next value in the Map
        for (int i = 1; i < 8; i++){
            Object colors = color.get(i);
            System.out.println(colors);
        }
    }
}
