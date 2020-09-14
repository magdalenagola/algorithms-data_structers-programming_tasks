package programming_tasks;

/*
Split the below string into other strings of size #3

'supercalifragilisticexpialidocious'

Will return a new string
'sup erc ali fra gil ist ice xpi ali doc iou s'
 */

public class InParts {
    public static String splitInParts(String s, int partLength) {
        if (partLength <= 0 || s == null){
            throw new IllegalArgumentException();
        }
        StringBuilder stringBuilder = new StringBuilder(s);
        for(int i = partLength; i < stringBuilder.length(); i += partLength+1){
            stringBuilder.insert(i, ' ');
        }
        return stringBuilder.toString();
    }
}
