class Stack {

    constructor() {
        this.items = [];
        this.count = 0;
    }

    push( data ) {
        this.items[ this.count ] = data;
        this.count++;
        return this.count-1;
    }

    pop() {
        if ( this.count == 0 ) return undefined;
        const deletedItems = this.items[ this.count - 1 ];
        this.count--;
        return deletedItems;
    }

    peek() {
        return this.items[ this.count-1 ];
    }

    isEmpty() {
        return this.count == 0;
    }

    size() {
        return this.count;
    }

    clear() {
        this.items = [];
        this.count = 0;
        return this.items;
    }

    print() {
        let str = '';
        for(let i = 0; i < this.count; i++) {
            str += this.items[i] + ' ';
        }
        console.log(str);
    }
}

const stack = new Stack();

stack.push(100);
stack.push(200);
stack.print();
stack.pop();
console.log(stack.isEmpty());
stack.print();
stack.push(300);
stack.push(400);
stack.print();
console.log(stack.peek());
console.log(stack.size());
stack.clear();
console.log(stack.peek());
console.log(stack.isEmpty());