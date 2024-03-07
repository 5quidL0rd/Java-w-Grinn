public class rCount {
public static void main(String[] args) {

String word = "mirror";
int rCount = 0;

for (int i = 0; i < word.length(); i++)

if(word.charAt(i) == 'r')
rCount++;

System.out.println("Your word had has " + rCount + " letters in it.");

}
}