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

        System.out.println("------------------------------------------------------------------------------------------");

        System.out.println("Number Upright triangle:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------------------------");

        System.out.println("Number inverted Triangle");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------------------------");

        int number=10;

        System.out.println("Increamental number upright triangle:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------------------------");

        System.out.println("Increamental numbers inverted triangle:");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------------------------");

        System.out.println("Binary number upright triangle:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j%2==0){
                    System.out.print(0);
                }else{
                    System.out.print(1);
                }
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------------------------");

        System.out.println("Binary numbers inverted triangle");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(j%2==0){
                    System.out.print(0);
                }else{
                    System.out.print(1);
                }
            }
            System.out.println();
        }

    }
}
