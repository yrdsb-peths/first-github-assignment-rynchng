public class Student{
  public String firstName;
  public String favAnimal;

// Constructor for the Student class
  public Student(String name, String animal)
  {
    firstName = name;
    favAnimal = animal;
  }

// Gets the first name of the student
  public String getName()
  {
    return firstName;
  }

  public String getFavouriteAnimal()
  {
    return favAnimal;
  }

  public String toString()
  {
    return firstName + "'s favourite animal is " + favAnimal;
  }
}
