import java.util.*;
import java.util.stream.Collectors;


class NoVegetarianRestaurantsException extends RuntimeException {
  public NoVegetarianRestaurantsException(String message) {
    super(message);
  }
}

class RestaurantFinder {
  private Map<Double, Restaurant> restaurants;

  public RestaurantFinder() {
        this.restaurants = new TreeMap<Double, Restaurant>(new Comparator<Double>() {
        @Override
        public int compare(Double d1, Double d2) {
        return d1.compareTo(d2);
        }
    });
  }

  public void addRestaurant(String name, double distance, boolean isVegetarian) {
    Restaurant restaurant = new Restaurant(name, distance, isVegetarian);
    restaurants.put(distance, restaurant);
}


  public Restaurant getRestaurant(String name) {
    return restaurants.get(name);
  }

  public List<Restaurant> getNearbyRestaurants(String selection) {
    List<Restaurant> nearbyRestaurants = new ArrayList<>();
    Collection<Restaurant> allRestaurants = restaurants.values();

    if (selection.equals("Any restaurant near me")) {
        nearbyRestaurants.addAll(allRestaurants);
    } else if (selection.equals("Only veg. restaurants near me")) {
        nearbyRestaurants = allRestaurants.stream()
        .filter(Restaurant::isVegetarian)
        .collect(Collectors.toList());
    }
    if (nearbyRestaurants.isEmpty()) {
      throw new NoVegetarianRestaurantsException("There are no vegetarian restaurants nearby.");
    }
    return nearbyRestaurants;
  }

}

class Restaurant {
  private String name;
  private double distance;
  private boolean isVegetarian;

  public Restaurant(String name, double distance, boolean isVegetarian) {
    this.name = name;
    this.distance = distance;
    this.isVegetarian = isVegetarian;
  }

  public String getName() {
    return name;
  }

  public double getDistance() {
    return distance;
  }

  public boolean isVegetarian() {
    return isVegetarian;
  }
}

class Rest{
    public static void main(String args[]){
        RestaurantFinder finder = new RestaurantFinder();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nRestaurant_Finder");
            System.out.println("1. Find nearby restaurants");
            System.out.println("2. Add a restaurant");
            System.out.println("3. Exit");
            System.out.print("\nEnter your choice: ");
            int count=0,count1=0,c;
            int choice = scanner.nextInt();
            if (choice == 1){
                System.out.println("\n1. Any restaurant near me");
                System.out.println("2. Only veg restaurants near me");
                System.out.print("Enter your choice: ");

                int subChoice = scanner.nextInt();
                if (subChoice == 1){
                    List<Restaurant> nearbyRestaurants = finder.getNearbyRestaurants("Any restaurant near me");
                    System.out.println("\nNearby restaurants :");
                    
                    for (Restaurant restaurant : nearbyRestaurants){
                        System.out.println(restaurant.getName() + " is " + restaurant.getDistance() + " kilometers away and it is a  "
                        + (restaurant.isVegetarian() ? "vegetarian" : "non-vegetarian"));
                      count++;
                      if(count==2)
                         break;
                    }
                } 
                else if (subChoice == 2){
                    try {
                        List<Restaurant> nearbyRestaurants = finder.getNearbyRestaurants("Only veg. restaurants near me");
                        System.out.println("\nNearby vegetarian restaurants:");
                        for (Restaurant restaurant : nearbyRestaurants) {
                            System.out.println(restaurant.getName() + " is " + restaurant.getDistance() + " kilometers away.");
                              count1++;
                      if(count1==2)
                         break;
                        }
                    } catch (NoVegetarianRestaurantsException e) {
                        System.out.println(e.getMessage());
                    }
                }
            } 
            else if (choice == 2) {
                System.out.print("No of Restaurant to insert : ");
                c=scanner.nextInt();
              for(int i=0;i<c;i++){
                System.out.print("\nEnter restaurant name                 : ");
                String name = scanner.next();
                System.out.print("Enter distance from current location  : ");
                double distance = scanner.nextDouble();
                System.out.print("Enter true if veg  (true/false)?      : ");
                boolean isVegetarian = scanner.nextBoolean();
                finder.addRestaurant(name, distance, isVegetarian);
              }
                System.out.println("\nRestaurant added successfully!");
            } 
            else if (choice == 3) {
                break;
            }
        }
        System.out.println("\nExiting Restaurant_finder !");
    }
}

