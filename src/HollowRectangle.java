public class HollowRectangle {
    public static void main(String[] args) {
        int lenght = 4;
        int height = 5;
        int i,j;
        for(i=1;i<=lenght;i++){
            for(j=1;j<=height;j++){
                if(i==1||i==lenght||j==1||j==height){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
