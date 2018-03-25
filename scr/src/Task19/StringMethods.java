package Task19;

//-	В тексте найти и напечатать n символов (и их количество), встречающихся наиболее часто.
//-	Найти, каких букв, гласных или согласных, больше в каждом предложении текста.
//-	В тексте найти и напечатать все слова максимальной и все слова минималь-ной длины.
//-	Подсчитать количество содержащихся в данном тексте знаков препинания.
//-	Подсчитать, сколько раз заданное слово входит в текст.
//-	Из текста удалить все символы, кроме пробелов, не являющиеся буквами.
//-	В каждом слове текста k-ю букву заменить заданным символом. Если k больше длины слова, корректировку не выполнять.


public class StringMethods {


   public static void findAndPrintSameCharacters (String text, int n) {
       if (n > text.length()){
           return;
       }
       text.toLowerCase();
       text.trim();
       char[] arr = text.toCharArray();
       int[] qtty = new int[arr.length];

       for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr.length; j++) {
               if (arr[i] == arr[j]) {
                   qtty[i]++;
                   if (j>0 && j!=i){
                       arr[j] = '*';
                       qtty[j] = text.length()*-1;
                   }

               }
           }
       }

       for (int i = qtty.length - 1; i > 0; i--) {
           for (int j = 0; j < i; j++) {
               if (qtty[j] < qtty[j + 1]) {
                   int tmpInt = qtty[j];
                   char tmpChar = arr[j];
                   qtty[j] = qtty[j + 1];
                   arr[j] = arr[j + 1];
                   qtty[j + 1] = tmpInt;
                   arr[j + 1] = tmpChar;
               }
           }
       }
       int j = 1;
       for (int i = 0; i < n; i++) {
           if (qtty[i]<=0){
               System.out.println("There isn`t any more symbols");
               break;
           }
           System.out.println(j++ + ") " + arr[i] + " has been used " + qtty[i] + " times");
       }
   }

   public static void vowelsConsonantsMore (String text){
       text = text.toUpperCase().trim();
       char [] arr = text.toCharArray();
       int vowels = 0;
       int consonants = 0;

       char [] vow = new char[]{'A', 'E', 'I', 'O', 'U', 'Y'};
       char [] con = new char[]{'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};

       for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < vow.length; j++) {
               if (arr[i] == vow[j]){
                   vowels++;
                   break;
               }
           }
           for (int j = 0; j < con.length; j++) {
               if (arr[i] == con[j]){
                   consonants++;
                   break;
               }
           }
       }
       System.out.println(text);
       System.out.println("There are " + vowels + " vowels");
       System.out.println("There are " + consonants + " consonants");
   }

   public static void wordsMaxAndMinLength(String text){
      text = text.toUpperCase();
       String [] arr = text.split(" ");

       for(int i = arr.length-1 ; i > 0 ; i--){
           for(int j = 0 ; j < i ; j++){
            if( arr[j].toCharArray().length > arr[j+1].toCharArray().length ){
                String tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
       System.out.println(text);
       System.out.println("The longest word is " + arr[arr.length-1]);
       System.out.println("The shortest word is " + arr[0]);

   }

   public static void numberOfPunctuationMarks (String text) {
       char [] mark = new char[]{'.', ',', '?','!','-',':','(',')','"',';','/',};
       int qtty = 0;
       char [] arr = text.toCharArray();

       for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j <mark.length; j++) {
               if (arr[i] == mark[j]){
                   qtty++;
               }
           }
       }
       System.out.println(text);
       System.out.println("There are/is "  + qtty + " pieces of punctuation marks");
   }

   public static void wordInSentenceQantity (String text, String word){
       char [] mark = new char[]{'.', ',', '?','!','-',':','(',')','"',';','/',};
       for (int i = 0; i < mark.length; i++) {
           text = text.replace(mark[i], ' ');
       }

       String [] arr = text.split(" ");
       int qtty = 0;

       for (int i = 0; i < arr.length; i++) {
           if (word.equals(arr[i])){
               qtty++;
           }
       }
       System.out.println(text);
       System.out.println(word + " repeats " + qtty + " times");

   }

   public static String deletePunctuationsMarks (String text){
      char [] mark = new char[]{'.', ',', '?','!','-',':','(',')','"',';','/',};
       for (int i = 0; i < mark.length; i++) {
           text = text.replace(mark[i], ' ');
       }

       String [] arr = text.split(" ");
       String newText = arr[0];

       for (int i = 1; i < arr.length; i++) {
           if (arr[i].equals("")) {
               continue;
           }

           newText = newText + " " + arr[i];


       }
       return newText;
   }

   public static String changeLetter (String text, int k, char ch){
       String [] arr = text.split(" ");
       for (int i = 0; i < arr.length; i++) {
           if (arr[i].length()>=k){
               char [] chars = arr[i].toCharArray();
               chars[k-1] = ch;
               arr[i] = String.copyValueOf(chars);
           }
       }
       String newText = arr[0];
       for (int i = 1; i < arr.length; i++) {
           newText = newText + " " + arr[i];
       }
       return newText;
   }

   }




