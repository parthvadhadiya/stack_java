/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prectice1;

import java.util.Scanner;

/**
 *
 * @author parth
 */
class Class1 {
    int[] Stack = new int[20];
    Scanner s = new Scanner(System.in);
    int top = 0;
    void opt(){
        Boolean ch = true;
        while(ch){
                System.out.println("enter you choice");
                System.out.println("1) insert element into stack");
                System.out.println("2) remove element from stack");
                System.out.println("3) disply first element of the stack ");
                System.out.println("4) search element into stack");
                System.out.println("5) display all element of the stack");
                System.out.println("6) exit"); 

                int choice = s.nextInt();
                switch(choice){
                    case 1:
                            push();
                            break;
                    case 2:
                            pop();
                            break;
                    case 3:
                            peek();
                            break;
                    case 4:
                            search();
                            break;
                    case 5:
                            display();
                            break;
                    case 6:
                            ch = false;
                            break;
                    default:
                            System.out.println("Enter correct choice");


                }


            }
	}
	void push(){
		System.out.println("enter new element");
		int element = s.nextInt();
		
		Stack[top] =  element;
                top += 1;
                System.out.println("element added");
	}
	void pop(){
            Stack[top] = '\0';
            top -= 1;
            System.out.println("element removed");
        }
	void peek(){
         
            System.out.println("peek is : "+ Stack[top]);

	}
	void search(){
            System.out.println("enter element to search");
            int el = s.nextInt();
            int flag = 0;
            for(int i =0 ; i <= Stack.length-1 ; i++){
                if(Stack[i]==el){
                    flag = 1;
                    break;
                }
                else{flag = 0;
                break;
                }
                
            
                }
            if(flag == 1){
                System.out.println("found");
            }
            else{System.out.println("Not found");}
            
        }
	void display(){
            for(int i=0; i<=Stack.length-1; i++){
                int temp = Stack[i];
                if(temp != 0){
                System.out.println(Stack[i]);
                }
        }
        }
}
