package com.company;

class Library{
    public String [] books;    // Declaring a String array which will store our books
    public int noOfBooks;

    public Library(){
        books = new String[10000];       // Setting the size of the string array (size of the library) while creating the object
        noOfBooks = 0;
    }

    public void addBook(String nameBook) {
        books[noOfBooks] = nameBook;
        noOfBooks++;                   // Updating the value of noOfBooks for next addition in case
    }

    public void availableBook(){
        System.out.println("\nHere are the available books: ");
        for (int i = 0;i<noOfBooks;i++){
            if (books[i] == null) {
                continue;             // continue neeche ka sab kuch skip krdega jo ki for loop scope ke andar hai aur agli iteration pr jump kr jayega
            }
            System.out.println("-> " + books[i]);
        } // here the scope of for loop ends. iske baad ke code pr 'continue' ka koi asar nhi hoga
    }

    public void issueBook(String nameBook){
        for (int i = 0;i<noOfBooks;i++){
            if (books[i] == nameBook){
                System.out.print("\n" + books[i] + " book has been issued to you!\n");
                books[i] = null;
                return;  // return ka sense ye hai ki program yahi se return ho jaaye aur aage ka kuch execute ho hi nhi. Ye isliye krrhe rhe hai taaki for loop ke bhaar
            }            // "This book does not exist!!!" statement tk pauchna hi na pade
        }
        System.out.println("This book does not exist!!!\n");
    }

    public void returnBook(String nameBook){
        addBook(nameBook);
    }
}

public class Online_Library {
    public static void main(String[] args) {
        System.out.println("***********  Welcome to Online Library  ***********\n");

        Library st = new Library();

        st.addBook("Let us C");
        st.addBook("Python");
        st.addBook("Java");
        st.addBook("Data Structures");
        st.addBook("Algorithms");
        st.addBook("Operating System");
        st.addBook("DBMS");

        st.availableBook();
        st.issueBook("Algorithms");
        st.issueBook("Java");
        st.availableBook();

        st.returnBook("Algorithms");
        st.returnBook("Java");

        st.addBook("Android");
        st.availableBook();

//        System.out.println(st.books[7]);
//        System.out.println(st.books[4]);

// returned Books nayi location pr store ho rhi hai, unki purani location pr abhi bhi null hi stored hai aur wha pr
// aur koi dusri books store nhi krskte. Iska mtlb library me uss purani location ka wastage ho rha hai hai

    }
}
