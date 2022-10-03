import java.util.Scanner; class Book{
private String bname; 
private long ISBN_num; 
private String author_name; 
private String publisher;
String getbname() {
return bname;
}
void setBname(String bname) {
this.bname = bname;
}
long getISBN_num() {
return ISBN_num;
}
void setISBN_num(long ISBN_num) { this.ISBN_num = ISBN_num;
}
String getAuthor_name() {
return author_name;
}
void setAuthor_name(String author_name) { this.author_name = author_name;
}
String getPublisher() {
return publisher;
}
void setPublisher(String publisher) { this.publisher = publisher;
}
void description() {
System.out.println("The description:\n"+"BookName:"+getbname()+"\nISBN number:"+getISBN_num()+"\nAuthor name:"+getAuthor_name()+"\n"
+ "Publisher:"+getPublisher());
}
}



