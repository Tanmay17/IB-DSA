class Node {
    constructor ( left=null, data, right=null ){
        this.left = left;
        this.data = data;
        this.right = right;
    }
}

class BST {
    constructor () {
        this.root = null;
    }

    add ( data ) {
        const node = this.root; 
        if ( node == null ) {
            this.root = new Node( data );
            return;
        } else {
            const searchTree = ( node )=> {

                if ( data < node.data ) {

                    if ( node.left == null ) {
                        node.left = new Node( data );
                        return;
                    }
                    else {
                        return searchTree( node.left );
                    }

                } else if ( data > node.data ) {

                    if ( node.right == null ) {
                        node.right = new Node( data );
                        return;
                    }
                    else {
                        return searchTree( node.right );
                    }

                } else {
                    return null;
                }

            }
            return searchTree( node );
        }
    }

    findMin() {

        let current = this.root;
        while ( current.left !== null ) {
            current = current.left;
        }
        return current.data;

    }

    findMax() {

        let current = this.root;
        while ( current.right !== null ) {
            current = current.right;
        }
        return current.data;

    }

    find ( data ) {
        let current = this.root;
        while ( current.data !== data ) {
            if (current === null) {
                return null;
            }

            if ( data < current.data ) {
                current = current.left;
            } else if ( data > current.data ) {
                current = current.right;
            }
        }
        return current;
    }

    isPresent ( data ) {
        let current = this.root;
        while (current) {
            if (data === current.data) {
                return true;
            }
            if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    remove ( data ) {
        
    }

}