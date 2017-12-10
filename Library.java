/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;
import java.io.*;

/**
 *
 * @author Khubaib
 */
class Node{
    Node next;
    Node prev;
    File data;
    Node(File dat){
        data = dat;
    }
}
class DLL{
    Node root;
    void insert(File data){
        if(root==null){
            root = new Node(data);
        }
        else{
            Node temp = root;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
    }
    void print(){
        Node temp = root;
        while(temp!=null){
            System.out.println(temp.data.getName());
            temp = temp.next;
        }
    }
}
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DLL d = new DLL();
        File f = new File("Tracks");
        File[] arr = f.listFiles();
        for(int i = 0; i<arr.length; i++){
            d.insert(arr[i]);
        }
        d.print();
    }
    
}
