public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]) ;
        boolean[] arr = new boolean[n + 1] ;
        for (int i = 2; i <= n ; i++) {
            arr[i] = true ;
        }
        for (int i = 2 ; i*i <= n ; i++) {
            if (arr[i]){
                for (int j = i*i ; j <= n ; j = j + i) {
                    arr[j] = false ;
                    
                }

            }
            
        }
        System.out.println("Prime numbers up to " + n + ":") ;
        int counter = 0 ;
        for (int i = 2; i <= n ; i++) {
            if (arr[i]){
                System.out.print(i + " ") ;
                counter++ ;
            }
        }
        System.out.println("There are " + counter + " primes between 2 and " + n + " (" + (counter*100)/n +"% are primes)" );
    }
}