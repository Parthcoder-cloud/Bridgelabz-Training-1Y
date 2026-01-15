public class student {
    public static void main(String[] args){
        int p = 14;

        int pensPerStudent = p / 3;
        int remainingPens = p % 3;

        System.out.println("The pens per student are: " + pensPerStudent);
        System.out.println("The remaining pens not distributed are: " + remainingPens);
    }
}
