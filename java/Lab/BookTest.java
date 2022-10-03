import java.util.Scanner;
public class BookTest { public static void main(String[] args) {
Book b[]=new Book[30];
Scanner sc=new Scanner(System.in); int n,i,isbn;
String author,publisher,name;
System.out.println("Enter the number of books:");
n=sc.nextInt(); for(i=0;i<n;i++) {
b[i]=new Book();
System.out.println("Book Details-"+(i+1));
if(i==0)
sc.nextLine();
System.out.println("Enter the name of book:");
name=sc.nextLine(); b[i].setBname(name);
System.out.println("Enter the ISBN of book:");
isbn=sc.nextInt(); b[i].setISBN_num(isbn); sc.nextLine();
System.out.println("Enter the name of author:");
author=sc.nextLine(); b[i].setAuthor_name(author); System.out.println("Enter the publisher:");
publisher=sc.nextLine(); b[i].setPublisher(publisher);
}
for(i=0;i<n;i++) {
System.out.println("Book-"+(i+1)); b[i].description();
}
sc.close();
}
}