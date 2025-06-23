package Two_Pointer_Technique.Basic;

public class Intro {

    /*
    Two pointer :
        In this approch two pointers traverse the data structure(Like an array)
       in a strategic way to solve problems efficiently.

    Types of problem solve by this approch:
        1.Opposite Direction:
         One pointer start from the beginning and the other from the end.(e.g pair sum)
        2.Same Direction:
         Both pointers move in the same direction.(e.g remove duplicate)
        3.Fast & slow pointers:
         One move faster than the other.
         (detecting cycle in a linked list)

     */
    public static void main(String[] args){
        int array[]={0,1,2,3,4,5,6,7,8,9};
        int start=0;
        int end=array.length;
        while (start<end){
            System.out.print(array[start]+" ");
            start++;
        }


    }
}
