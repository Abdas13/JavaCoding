package arrays;

import java.util.Scanner;

public class Parctice01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the article.");
        String article= input.nextLine();

        System.out.println("article: "+ article);

        String[] sentences= article.split("\\.");
        String[] words=article.split(" ");
        String [] chars=article.split("");

        System.out.println("the number of sentences: "+sentences.length);
        System.out.println("the numbers of words: "+words.length);
        System.out.println("the number of chars: "+chars.length);
        System.out.println(sentences[0]);
        System.out.println(sentences[1]);
        System.out.println(sentences[2]);
       // System.out.println(sentences[3]);




    }
}
  /*
  Positive thinking is a process of choosing positive emotions from stimuli in the environment and applying them to perceptions and beliefs.
  Life satisfaction is defined as “a global evaluation by the person of his or her life” (Pavot, Diener, Colvin&Sandvik, 1991, p. 150).
  It is generally the cognitive part of mental well-being. In this context, it is different from joy and happiness.
  A high life satisfaction is important for individuals because it leads to positive mental health and healthy interpersonal relationships.

   */