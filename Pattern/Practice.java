// Pattern1
// *
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *

// public class Pattern1 {

// public static void main(String[] args) {

// int n = 5;
// for (int row = 1;row<=2*n-1;row++){
// int totalColumns = row>n? 2*n-row:row;
// for(int col=1;col<=totalColumns;col++){
// System.out.print("* ");
// }

// System.out.println();
// }
// }
// }

// Pattern2

// public class Pattern2{

// public static void main(String[] args) {

// int n = 5;
// for (int row = 1;row<=2*n-1;row++){

// int totalSpaces = row>n? row-n:n-row;
// for(int col=1;col<=totalSpaces;col++){
// System.out.print(" ");
// }
// int totalColumns = row>n? 2*n-row:row;
// for(int col=1;col<=totalColumns;col++){
// System.out.print("* ");
// }

// System.out.println();
// }
// }
// }

// Pattern3

// public class Pattern3 {

// public static void main(String[] args) {

// int n = 5;
// for (int row = 1;row<=n;row++){

// for(int col=1;col<=n-row;col++){
// System.out.print(" ");
// }

// for(int col=row;col>=1;col--){
// System.out.print(col+" ");
// }

// for(int col=2;col<=row;col++){
// System.out.print(col+" ");
// }

// System.out.println();

// }
// }
// }

// Pattern4
// public class Pattern3 {

// public static void main(String[] args) {

// int n = 5;
// for (int row = 1;row<=2*n-1;row++){

// int totalSpaces = row>n? row-n:n-row;
// for(int col=1;col<=totalSpaces;col++){
// System.out.print(" ");
// }
// int totalColumns = row>n? 2*n-row:row;
// for(int col=totalColumns;col>=1;col--){
// System.out.print(col+" ");
// }

// for(int col=2;col<=totalColumns;col++){
// System.out.print(col+" ");
// }

// System.out.println();

// }
// }
// }

// Pattern5

// 0 0 0 0 0 0 0 0 0 0 0
// 0 1 1 1 1 1 1 1 1 1 0
// 0 1 2 2 2 2 2 2 2 1 0
// 0 1 2 3 3 3 3 3 2 1 0
// 0 1 2 3 4 4 4 3 2 1 0
// 0 1 2 3 4 5 4 3 2 1 0
// 0 1 2 3 4 4 4 3 2 1 0
// 0 1 2 3 3 3 3 3 2 1 0
// 0 1 2 2 2 2 2 2 2 1 0
// 0 1 1 1 1 1 1 1 1 1 0
// 0 0 0 0 0 0 0 0 0 0 0

// public class Pattern5 {

// public static void main(String[] args) {
// int N= 5;
// int n = 2*N;
// for (int row = 0;row<=n;row++){

// for(int col=0;col<=n;col++){
// int left = col;
// int up = row;
// int right = n-col;
// int down= n-row;

// int temp1 = Math.min(left, right);
// int temp2 = Math.min(up, down);
// int Notobeprinted = Math.min(temp1, temp2);
// System.out.print(Notobeprinted + " ");

// }

// System.out.println();

// }
// }
// }

// Pattern6
// 4 4 4 4 4 4 4 4 4
// 4 3 3 3 3 3 3 3 4
// 4 3 2 2 2 2 2 3 4
// 4 3 2 1 1 1 2 3 4
// 4 3 2 1 0 1 2 3 4
// 4 3 2 1 1 1 2 3 4
// 4 3 2 2 2 2 2 3 4
// 4 3 3 3 3 3 3 3 4
// 4 4 4 4 4 4 4 4 4
// public class Practice1 {

// public static void main(String[] args) {
// int N= 4 ;
// int n = 2*N;
// for (int row = 0;row<=n;row++){

// for(int col=0;col<=n;col++){
// int left = col;
// int up = row;
// int right = n-col;
// int down= n-row;

// int temp1 = Math.min(left, right);
// int temp2 = Math.min(up, down);
// int Notobeprinted = Math.min(temp1, temp2);
// System.out.print(N-Notobeprinted + " ");

// }

// System.out.println();

// }
// }
// }
