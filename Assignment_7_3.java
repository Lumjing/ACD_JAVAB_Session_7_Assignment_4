package assignment_7_3;
//This Assignment to master the concepts of capacity of String buffer and String builder.
 

public class Assignment_7_3 {

	public static void main(String[] args) {
		
			//STRING BUFFER--------
				StringBuffer sampleBuffer = new StringBuffer("");    //Creating empty StringBuffer.
				System.out.println("Initially Empty StringBuffer : ");    //Printing Statement.
				System.out.println("Length of StringBuffer -> "+sampleBuffer.length());    //Printing Length.
				System.out.println("Capacity of StringBuffer -> "+sampleBuffer.capacity());    //Printing capacity.
				sampleBuffer.append("microsoft agency for food and");
				System.out.println("After appending the word \"microsoft agency for food and\" :");
				System.out.println("Length of StringBuffer -> "+sampleBuffer.length());    //Printing Length.
				System.out.println("Capacity of StringBuffer -> "+sampleBuffer.capacity());    //Printing capacity.
				sampleBuffer.append("");
				System.out.println("After appending the word \"soft\" :");
				System.out.println("Length of StringBuffer -> "+sampleBuffer.length());    //Printing Length.
				System.out.println("Capacity of StringBuffer -> "+sampleBuffer.capacity());    //Printing capacity.
				
				//from the output of above code, you can see that capacity of String Builder increases as (initial*2+2).
				System.out.println("\n\n");   //Line break;
				
				
				//STRING BUILDER--------
						StringBuilder sampleBuilder = new StringBuilder("");    //Creating empty StringBuilder.
						System.out.println("Initially Empty StringBuilder : ");    //Printing Statement.
						System.out.println("Length of StringBuilder -> "+sampleBuilder.length());    //Printing Length.
						System.out.println("Capacity of StringBuilder -> "+sampleBuilder.capacity());    //Printing capacity.
						sampleBuilder.append("microsoft agency for food and");
						System.out.println("After appending the word \"microsoft agency for food and\" :");
						System.out.println("Length of StringBuilder -> "+sampleBuilder.length());    //Printing Length.
						System.out.println("Capacity of StringBuilder -> "+sampleBuilder.capacity());    //Printing capacity.
						sampleBuilder.append("");
						System.out.println("After appending the word \"soft\" :");
						System.out.println("Length of StringBuilder -> "+sampleBuilder.length());    //Printing Length.
						System.out.println("Capacity of StringBuffer -> "+sampleBuilder.capacity());    //Printing capacity.
						
						//from the output of above code, you can see that capacity of String Builder increases as (initial*2+2).
						
			}    //End of main function.

		}   //End of class.
