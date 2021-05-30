class Node {
    constructor( data, next = null ) {
        this.data = data;
        this.next = next;
    }
}

class LinkedList {
    constructor() {
        this.head = null;
        this.size = 0;
    }

    insertFirst( data ) {
        this.head = new Node( data, this.head );
        this.size++;
    }

    insertLast( data ) {

        let node = new Node( data );
        let current;

        if (!this.head) {
            this.head = node;
        } else {
            current = this.head;

            while ( current.next ) {
                current = current.next
            }

            current.next = node;
        }
        this.size++;

    }

    insertAt( data, pos ) {

        if (pos > 1 && pos > this.size+1) {
            return;
        }

        if ( pos == 1 ) {
            this.insertFirst( data );
            return;
        }
        
        if ( pos == this.size+1 ) {
            this.insertLast( data );
            return;
        }

        let current = this.head;
        let previous;
        let currPos = 1;
        const node = new Node( data );

        while ( currPos < pos ) {
            previous = current;
            current = current.next;
            currPos++;
        }

        node.next = current;
        previous.next = node;
        this.size++;
    }

    getAt( pos ) {

        let current = this.head;
        let currentPos = 1;

        while ( currentPos != pos ) {
            current = current.next;
            currentPos++;
        }
        console.log( current.data );

    }

    removeAt( pos ) {

        if( pos > 1 && pos > this.size+1  ) return;

        let previous;
        let current = this.head;
        let currentPos = 1;

        while( currentPos != pos ) {
            previous = current;
            current = current.next;
            currentPos++;
        }
        previous.next = current.next;
        current.next = null;
        this.size--;
    }

    clearList() {
        this.head = null;
        this.size = 0;
    }

    printLinkedList() {

        let current = this.head;
        while(current) {
            console.log(current.data)
            current = current.next;
        }

    }
}

const ll = new LinkedList();
// ll.insertLast(100);
ll.insertLast(200);
ll.insertFirst(82);
// ll.insertAt(300, 4)
// ll.getAt(2);
// ll.removeAt(2)
// ll.printLinkedList();
// ll.clearList()
// ll.printLinkedList();
console.log(ll)
