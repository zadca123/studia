#include <iostream>
using namespace std;

class Node
{
	public:
		Node();
		Node(const Node &);
		~Node();
		int atom;
		char info;
		Node* next;
		Node* clink;
};



class List
{
	private:
		Node* head;
	public:
		// Constructor
		List(); 
		// Copy constructor
		List(const List &);
		// Destructor
		~List();
		// overloading =
		List& operator = (const List&); 
		Node* copy(Node*);
		List& cons(char,List&);
		List& cons(List&,List&);
		List& car(List&);
		List& cdr(List&);
		void printNode(Node*);
		void printList();
		void release(Node*);
};



Node::Node() { atom = 1; info = '\0'; next = clink = NULL; }

Node::~Node() {}

Node::Node(const Node& nd)
{
	atom = nd.atom;
	info = nd.info;
	next = nd.next;
	clink = nd.clink;
}


List::List() { head = NULL; }

List::List(const List& larg)
{
	if(larg.head == NULL) head = NULL;
	else head = copy(larg.head);
}


List::~List()
{
	if(head) { release(head); }
	delete head;
}


List& List::operator = (const List& larg)
{
	if(larg.head == NULL) head = NULL;
	else head = copy(larg.head);
	return *this;
}



Node* List::copy(Node* narg)
{
	Node* res = new Node;
	if(narg != NULL)
	{
		res->atom = narg->atom;
		if(res->atom)
		{
			res->info = narg->info;
			res->clink = NULL;
		}
		else res->clink = copy(narg -> clink);
		res->next = copy(narg -> next);
	}
	else res = NULL;
	return res;
}


List& List::cons(char newatom, List& oldlist)
{
	List* res =new List(oldlist);
	Node* newNode;
	newNode = new Node;
	newNode -> atom = 1;
	newNode -> info = newatom;
	newNode -> clink = NULL;
	newNode -> next = res->head;
	res->head = newNode;
	return *res;
}


List& List::cons(List& newList, List& oldList)
{
	List* res = new List(oldList);
	Node* newNode;
	newNode = new Node;
	newNode -> atom = 0 ;
	newNode -> clink = copy(newList.head);
	newNode -> next = copy(oldList.head);
	res->head = newNode;
	return *res;
}


List& List::car(List& oldList)
{
	List* res = new List(oldList);
	List empty;
	List* carList = new List();
	if(res->head -> clink == NULL)
	*carList=cons(res->head->info,empty);
	else carList->head = copy(res->head->clink);
	return *carList;
}


List& List::cdr(List& oldList)
{
	List* res = new List(oldList);
	res->head = res->head->next;
	return *res;
}


void List::printNode(Node* narg)
{
	Node* tmp;
	tmp = copy(narg);
	cout << " ( " ;
	while(tmp != NULL)
	{
		if(tmp->atom) cout << tmp->info << " ";
		else printNode(tmp->clink);
		tmp = tmp->next;
	}		
	cout << " ) " ;
}


void List::printList() { printNode(head); }


void List::release(Node* ptr)
{
	Node* tmp;
	{
		if((tmp = ptr -> next) != NULL)
		{
			release(tmp); delete tmp;
			tmp = NULL;
		}
		if((tmp = ptr -> clink) != NULL)
		{
			release(tmp); delete tmp;
			tmp = NULL;
		}
	}
}


int main(void)
{
	List empty;
	
	List L;
	L = L.cons('G',empty);
	cout << "L = ";
	L.printList() ;
	cout << endl;

	List M;
	M= M.cons('E', M.cons( 'K', M.cons('L', empty)));
	
	cout << "M = ";
	M.printList() ;
	cout << endl;

	List Mcar = M.car(M);
	cout << "car (M) = ";
	Mcar.printList() ;
	cout << endl;

	cout << "M = ";
	M.printList() ;
	cout << endl;

	List Mcdr = M.cdr(M);
	cout << "cdr (M) = ";
	Mcdr.printList() ;
	cout << endl;


	List Mcdrcdr = M.cdr(M.cdr(M));
	cout << "cdrcdr (M) = ";
	Mcdrcdr.printList() ;
	cout << endl;


	return 0;
}



