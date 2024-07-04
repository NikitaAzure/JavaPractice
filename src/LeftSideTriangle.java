public class LeftSideTriangle {
    public static void main(String[] args) {
        int n=5;

        System.out.println("Upright triangle:");
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------------------------");

        System.out.println("Inverted triangle:");
        for(int i =n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
