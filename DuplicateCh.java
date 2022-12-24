import java.util.*;
class DuplicateCh
{
   public static void
   countDuplicateCharacters(String str)
   {
	   Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
        Object c1 = null;
		if (map.containsKey(c1)) {
        map.put((Character) c1, map.get(c1) + 1);
		}
        else
        {
            map.put((Character) c1, 1);
        }
        }
       for (Map.Entry<Character, Integer> entry :
       map.entrySet())
       {
       if (entry.getValue() > 1) 
       {
       System.out.println(entry.getKey()
                                   + " : "
    		                       + entry.getValue());
       }
       }
   }
   public static void main(String args[])
    {

	   String str = "Assignment";
       countDuplicateCharacters(str);
    }
}

