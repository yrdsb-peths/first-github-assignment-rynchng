public class Student{
  public String firstName;
  public String favAnimal;

  public Student(String name, String animal)
  {
    firstName = name;
    favAnimal = animal;
  }

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
