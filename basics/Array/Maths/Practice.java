// Q : Check Prime or not :
// This takes "n" times for each number.  

// public class PrimeNo {
//   static void checkPrime(int num){
//         boolean isPrime = false;
//         if(num <= 1){
//          System.out.println("Not prime no");
//          return;
//         }
//         for(int i = 2 ;i<num;i++){
//             if(num%i == 0){
//                 System.out.println("Not Prime No");
//                 break;
//             }else{
//                 isPrime = true;
//             }
//         }
        
//         if(isPrime){
//             System.out.println("Prime No");
//         }
//     }
        
//      public static void main(String[] args) {
//         int num = 37;
//         checkPrime(num);
        
//      }
// }




// Another way to do this which has O(root n) time complexity . 

// public class PrimeNO {

//     static String checkPrime(int num){
//         if(num <= 1){
//           return "Not prime ";
//         }
//         for(int i = 2 ;i*i<=num;i++){
//             if(num%i == 0){
//                 return "Not prime";
//             }
//         }
//         return "prime no";

        
//     }

    

//      public static void main(String[] args) {
//         int num = 3;
//         System.out.println(checkPrime(num));

//      }
// }






// Q : Find the Prime no in the range of 1 to N.   
// This Algorithm has O(n^2) time complexity.
// public class PrimeNoInRange {

//     public static void main(String[] args) {
//         int num = 32;
//         for (int j = 1; j <= num; j++) {
//             
//             if (j == 2) {
//                 System.out.print(j + " ");
//                  break;
//             } else if (j > 2) {
//                 boolean isPrime = false;
//                 for (int i = 2; i < j; i++) {
//                     if (j % i == 0) {
//                         isPrime = false;
//                         break;
//                     } else {
//                         isPrime = true;
//                     }
//                 }

//                 if(isPrime){
//                     System.out.print(j+" ");
//                 }

//             }

//         }

//     }
// }



// Another way to do this which has O(N*(log(log N))) time complexity 


// The "Sieve of Eratosthenes" is named after the ancient Greek mathematician Eratosthenes, who is credited with developing this method for finding prime numbers by systematically eliminating multiples of each prime number, essentially "sifting out" the non-primes, similar to how a sieve filters out particles based on size; hence the name "sieve" in reference to his method.

// public class PrimeNoRange {

//     static void sieveOfEratosthenes(int n){
//         if(n <= 1){
//             System.out.println("No prime No ");
//             return;
//         }
//         boolean[] isNotPrime = new boolean[n+1];
//         // this will execute for N(log(log(N)))
//         for(int i = 2 ; i*i<=n ;i++){
//             if(!isNotPrime[i]){
//                 for(int j = 2*i ; j<n;j+= i){
//                     isNotPrime[j] = true;
//                 }
//             }
//         }

//         for(int num = 2 ; num<=n;num++){
//             if(!isNotPrime[num]){
//                 System.out.print(num + " ");
//             }
//         }
        
//     }

//      public static void main(String[] args) {
        
//         int n = 37;
//         sieveOfEratosthenes(n);

//      }
// }




//Que : Find n prime no  
// This algorithm has O(n^2) time complexity.
//public class Practice1 {

//     public static void main(String[] args) {
//         int count = 1;
//         int total = 10;
//         int num = 2;
//         while(count<=total){
//             boolean isPrime = false;
//             for(int i= 2;i<num;i++){
//                 if(num%i==0){
//                     isPrime = false;
//                     break;
//                 }else{
//                     isPrime = true;

//                 }

//             }
//             if(isPrime){
//                 System.out.print(num+" ");
//             }else{
//                 total++;
//             }
//             count++;
//             num+=1;
//         }
//       
  
//     }
// }



// Another way to do this which has total O(n(root n)) time complexity . 

// public class Practice1 {



//     public static void TotalPrimeNO(int total){
//         int count = 1;
//         int num = 2;
//         while(count<=total){
//             boolean isPrime = true;
//             for(int i= 2;i*i<=num;i++){
          
//                 if(num%i==0){
//                         isPrime = false;
//                         break;
//                     }else{
//                         isPrime = true;

//                     }

//                 }
//                 if(isPrime){
//                     System.out.print(num+" ");
//                 }else{
//                     total++;
//                 }
//                 count++;
//                 num+=1;
//             }
           
      
//     }

//         public static void main(String[] args) {
//             TotalPrimeNO(5);
//         }
//     }






// Que : Find the square root of number. 

// public class Practice1 {
   
//     // we are checking in sorted numbers so we use Binary Search 
//     public static double BinarySearchsqrt(int n,int p){
//         double root = 0.0 ;
//         int start = 0;
//         int end = n ;
//         while(start<= end){
//             int mid = start + (end-start)/2;

//             if(mid*mid == n){
//                return mid ;
//             }

//             if(mid*mid > n){
//                 end = mid -1; 
//             }else {
//                 start = mid +1 ;
//             }
//         }

//         double incre= 0.1;
//         for(int i = 0 ;i<p;i++){
//             while(root * root <= n){
//                 root += incre;
//             }

//             root -=incre;
//             incre /= 10;  // to increase the decimal point 
            
//         }

//         return root;
       
       
//     }
//     public static void main(String[] args) {
//         System.out.println(BinarySearchsqrt(30,4));
//     }
// }







// Que : Newton Raphson method to calculate sqrt of a no . 

// public class Practice1 {

//     public static double sqrt(int n){
//         double x = n ;
//         double root ;
        
//         while(true){
    
//             root = 0.5 *(x+n/x);
//             if(Math.abs(root - x) < 1){
//                 break;
//             }

//             x = root;
//         }
        
//         return root;
//     }

//     public static void main(String[] args) {
//         System.out.println(sqrt(256));
//     }
// }




// Que : Find the factor of a number 

// import java.util.ArrayList;

// public class Practice1 {

    
//     public static void factor(int n){

//         // creating arraylist to print the factors in sorted order
//         ArrayList<Integer> list = new ArrayList<>();
//         for(int i = 1; i*i<=n ;i++){
//             if(n%i==0){
//                 if(n/i == i){
//                     System.out.print(i+" ");
//                 }else{
//                     System.out.print(i+" " );
//                     list.add(n/i); // this will add the factor in descending order
//                 }
                
//             }
//         }

//         for(int j = list.size()-1; j>=0; j--){
//             System.out.print(list.get(j)+" ");
//         }
//     }

//     public static void main(String[] args) {
//         factor(36);
//     }
// }


// Find the GCD/HCF of two number . 
// Euclidians Algorithms
// public class Practice1 {

//     public int gcd(int a,int b){
//         if(a == 0){
//             return b;
//         }
//         return gcd(b%a, a);
            
    
          
//     }
    
//     public static void main(String[] args) {
//         Practice1 p  = new Practice1();
//         System.out.println(p.gcd(105, 224));
//     }
// }




// find the LCM of two number
// public class Practice1 {

//     public int lcm(int a, int b){
//         return a*b/(gcd(a, b));
//     }

//     public int gcd(int a,int b){
//         if(a == 0){
//             return b;
//         }
//         return gcd(b%a, a);
        
//     }

//     public static void main(String[] args) {
//         Practice1 p  = new Practice1();
//         System.out.println(p.lcm(4, 2));
//     }
// }