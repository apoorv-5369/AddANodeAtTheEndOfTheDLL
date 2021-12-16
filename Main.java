void append(int new_data){
/* 1. Allocate Node.
* 2. Put in the data.*/
Node new_Node = new Node(new_data);
Node last = head; /* Used in step 5.*/
/* 3. This new node is going to be the last node, so make next of it as NULL.*/
new_Node.next=NULL;
/* 4. If the DLL is empty, then make the new node as head.*/
if(head==null){
new_Node.prev=null;
head=new_Node;
return;
}
/* 5. Else traverse till the last node.*/
while(last.next!=null){
last=last.next;
}
/* 6. Change the next of the last node.*/
last.next=new_Node;
/* 7. Make last node of the DLL as previous of new_Node.*/
new_Node.prev=last;
}
