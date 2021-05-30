class Queue {

    constructor() {
        this.list = [];
    }

    enqueue(item) {
        this.list.unshift(item);
    }

    dequeue() {
        this.list.pop();
    }

    front() {
        return this.list[ this.list.length ];
    }

    isEmpty() {
        return this.list.length == 0;
    }

    printQueue() {
        console.log(this.list);
    }

}

const queue = new Queue();

queue.enqueue(5);
queue.enqueue(2);
queue.enqueue(3);
queue.enqueue(7);
queue.printQueue();
queue.isEmpty();
queue.front();
queue.dequeue();
queue.dequeue();
queue.printQueue();