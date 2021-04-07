
/**
Class for the storage type queue. It has all the methods required of a queue
including the add, remove, isFull, and isEmpty methods.
@author vanderveldem
*/
public class Queue 
{
   private Object[] items;
   private int front, rear, count;
   
   /**
   Public constructor for the class queue, it takes an integer value and
   creates a queue of that size.
   @param size The number of available items the queue will hold. 
   */
   public Queue( int size )
   {
      items = new Object[size];
      front = rear = count = 0;
   }
   
   /**
   The add method takes an object and stores it in the array in class queue.
   It increments the count number and moves the rear of the array so that the
   class maintains first-in, first-out priority when adding and removing
   objects.
   @param obj An object which will be stored in the array.
   */
   public void add( Object obj )
   {
      items[rear] = obj;
      rear = (rear + 1) % items.length;
      count ++;
   }
   
   /**
   The remove method picks the first object from the array and returns it to
   the user. We maintain the first-in, first-out order by moving the front 
   of the array.
   @return An object from the front of the array to the user.
   */
   public Object remove()
   {
      Object obj = items[front];
      front = (front + 1) % items.length;
      count --;
      return obj;
   }
   
   /**
   The isEmpty method checks the array to see if there are any objects 
   stored within. It accomplishes this by checking the count value.
   @return True if there are no items (count = 0), false otherwise.
   */
   public boolean isEmpty()
   {
      return count == 0;
   }
   
   /**
   Checks to see if the array of objects is full by checking the number of
   items within (count) against the length of the array.
   @return True if the count is equal to the length (array is full) false
           otherwise
   */
   public boolean isFull()
   {
      return count == items.length;
   }
   
}
