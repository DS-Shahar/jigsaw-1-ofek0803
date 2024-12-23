public static boolean exsis(Node<Integer> list, int a) {
	    int count = 0;
	    Node<Integer> current = list;

	    while (current != null) {
	        if (current.getValue() == a) {
	            count++;
	        }
	        current = current.getNext();
	        if (count > 1) {
	            return true;
	        }
	    }
	    return false;
	}

	public static Node<Integer> del(Node<Integer> L1) {
	    Node<Integer> current = L1;
	    Node<Integer> prev = null;

	    while (current.hasNext()) {
	        if (exsis(L1, current.getValue())) {
	            if (prev != null) {
	                prev.setNext(current.getNext());
	            } else {
	                L1 = current.getNext(); // אם הצומת הראשון הוא כפול, עדכן את L1
	            }
	        } else {
	            prev = current;
	        }
	        current = current.getNext();
	    }

	    return L1;
	}
//בלי פונקצית עזר
	
	public static Node<Integer> del2(Node<Integer> L1) {
	    Node<Integer> head = L1;
	    Node<Integer> current1 = L1;
	    Node<Integer> current2 = L1;


	    while (current1.hasNext()) {
	    	current2=current1;
		    while (current2.hasNext()) {
		    	if(current1.getValue()==current2.getNext().getValue()) {
		    		current2.setNext(current2.getNext().getNext());
		    	}
		    	else {
		    		current2=current2.getNext();
		    	}
		    	
		    }
    		current1=current1.getNext();

	    	
	    }
    	return head;
