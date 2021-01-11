#include <iostream>
#include <assert.h>

using namespace std;

class Node{
    public:
        int data;
        Node *next;
};

void push(Node** head_ref, int new_data)
{
    /* 1. allocate node */
    Node* new_node = new Node();
    /* 2. put in the data */
    new_node->data = new_data;
    /* 3. Make next of new node as head */
    new_node->next = (*head_ref);
    /* 4. move the head to point to the new node */
    (*head_ref) = new_node;
}

void insertAfter(Node* prev_node, int new_data)
{
    /*1. check if the given prev_node is NULL */
    if (prev_node == NULL)
    {
        cout<<"the given previous node cannot be NULL";
        return;
    }
    /* 2. allocate new node */
    Node* new_node = new Node();
    /* 3. put in the data */
    new_node->data = new_data;
    /* 4. Make next of new node as next of prev_node */
    new_node->next = prev_node->next;
    /* 5. move the next of prev_node as new_node */
    prev_node->next = new_node;
}

void append(Node** head_ref, int new_data){
    Node *new_node = new Node();
    new_node->data = new_data;
    new_node->next = NULL;
    /* 4. If the Linked List is empty,  then make the new node as head */
    if (*head_ref == NULL){
        *head_ref = new_node;
        return;
    }
    // /* 5. Else traverse till the last node */
    Node *last = *head_ref;
    while (last->next != NULL)
        last = last->next;
    /* 6. Change the next of last node */
    last->next = new_node;
    return;
}


void printList(Node *node){
    if( node == NULL){
        cout << "List is empty" << endl;
        return;
    }
    while (node != NULL) {
        cout << node->data << " ";
        node = node->next;
    }
    cout << endl;
}

void deleteNode(Node **head_ref, int key){
    Node *tmp = *head_ref;
    if( tmp != NULL && tmp->data == key ){
        *head_ref = tmp->next;
        free(tmp);
        return;
    }
    Node *prev;
    while(tmp != NULL && tmp->data != key){
        prev = tmp;
        tmp = tmp->next;
    }
    if( tmp == NULL)
        return;
    prev->next = tmp->next;
    free(tmp);
}

void deleteNodeAt(Node **head_ref, int index){
    if(*head_ref == NULL){
        cout << "Empty list" << endl;
        return;
    }
    Node *tmp = *head_ref;
    if(index == 0){
        *head_ref = tmp->next;
        free(tmp);
        return;
    }
    for(int i = 0; tmp != NULL && i < index-1; i++)
        tmp = tmp->next;
    if(tmp == NULL && tmp->next == NULL)
        return;
    Node *forward = tmp->next->next;
    free(tmp->next);
    tmp->next = forward;
}

void deleteList(Node **head_ref){
    Node *current = *head_ref;
    Node *forward;
    while(current != NULL){
        forward = current->next;
        free(current);
        current = forward;
    }
    *head_ref = NULL;
}

int getCount(Node *head){
    int i = 0;
    Node *current = head;
    while(current != NULL){
        i++;
        current = current->next;
    }
    free(current);
    return i;
}
int getCountRec(Node *head){
    if(head == NULL)
        return 0;
    return 1+getCountRec(head->next);
}

bool search(Node *head, int x){
    while(head != NULL && head->data != x)
        head = head->next;
    if(head == NULL)
        return false;
    return true;
}
bool searchRec(Node *head, int x){
    if(head == NULL)
        return false;
    if(head->data == x)
        return true;
    return searchRec(head->next, x);
}

void swap(int* a,int* b){
    int tmp = *a;
    *a = *b;
    *b = tmp;
}
void replace(Node **head, int x,int y){
    if(search(*head,x) == false){
        cout << "Brak elementu do zamienienia" <<endl;
        return;
    }
    Node *tmp = *head;
    while(tmp != NULL && tmp->data != x){
        tmp = tmp->next;
    }
    swap(tmp->data,y);
    return;
}

int getNth(Node *head, int index){
    if( index < 0 ||  index >= getCount(head) )
        return false;
    int count = 1;
    while(head != NULL){
        if(index == count)
            return head->data;
        count++;
        head = head->next;
    }
    // return false;
    assert(0);
}
int getNthRec(Node *head, int index){
    if( index < 0 ||  index >= getCount(head) )
        return false;
    int count = 1;
    if(index == count)
        return head->data;
    return getNthRec(head->next,index-1);
}
int getNthBackdoor(Node* head, int n){
    if( n < 0 || n >= getCount(head) )
        return false;
    int index = getCount(head) + 1 - n;
    return getNth(head, index);
}

void polacz(Node **head1, Node **head2){
    Node *p1 = *head1;
    Node *prev;
    while(p1 != NULL){
        prev = p1;
        p1 = p1->next;
    }
    prev->next = *head2;
}

int main(){
    Node* head = NULL;
    append(&head, 6);
    push(&head, 7);
    push(&head, 1);
    append(&head, 4);
    insertAfter(head->next, 8);

    deleteNode(&head, 6);
    deleteNodeAt(&head, 1);
    printList(head);

    cout << getNth(head, 2) << endl;
    cout << getNthRec(head, 2) << endl;
    cout << getNthBackdoor(head, 2) << endl;

    Node* head2 = NULL;
    append(&head2, 1);
    push(&head2, 1);
    push(&head2, 3);
    append(&head2, 4);
    insertAfter(head2->next, 5);

    polacz(&head,&head2);
    printList(head);
    printList(head2);

    return 0;
}
