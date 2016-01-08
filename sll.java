import java.util.*;

public class Sll
{
  private int data;
  private Sll next;
public Sll(int data)
{
this.data=data;
}
public void setData(int data)
{
this.data=data;
}
public void getData()
{
return data;
}
public void setNext(Sll next)
{
this.next=next;
}
public Sll getNext()
{
return this.next;
}
}

int ListLength(Sll headNode)
{
int length=0;
Sll currentNode=headNode;
while(currentNode!=null)
{
length++;
currentNode=currentNode.getNext();
}
return length;
}
public Sll InsertInLinkedList(Sll headNode,Sll nodeToInsert,int position)
{
if(headNode==null) //insert at the beginning
return nodeToInsert;
int size= ListLength(Headnode);
if(position>size+1|| position<1)
{
System.out.println("position of node to insert is invalid" +(size+1));
return headNode;
}
if(position==1)  // inserting at the beginning
{
nodeToInsert.setNext(headNode);
return nodeToInsert;
}
else
{
// inserting at the end or middle
Sll perviousNode=headNode;
int count=1;
while(count<position-1)
{
prevoiusNode=previousNode.getNext();
 count++;
}
Sll currentNode=previousNode.getNext();
nodeToInsert.setNext(currentNode);
previousNode.setNext(nodeToInsert);
}
return headNode;
} 
