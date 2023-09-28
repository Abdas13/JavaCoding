package practice;

@FunctionalInterface
public interface Deneme {
  void come();

  default void comeback(){
      String str = " ";
  }

}
