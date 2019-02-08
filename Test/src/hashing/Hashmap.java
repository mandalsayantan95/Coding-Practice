package hashing;

public class Hashmap<K,V> {
	//Entry top;
	int capacity;
	Entry[] Arr;
	
	class Entry<K,V>{
		Entry next;
		K key;
		V value;
		Entry(K key,V value){
			this.key = key;
			this.value = value;
			next = null;
		}
		
	}
	Hashmap(){
		this.capacity = 16;
		Arr = new Entry[capacity];
	}
	Hashmap(int d){
		this.capacity = d;
		Arr = new Entry[capacity];
	}
	public int hashing(K key){
		return Math.abs(key.hashCode()%(this.capacity-1));
	}
	
	public void put(K key,V value){
		System.out.println(key.hashCode());
	    int index = hashing(key);
	    Entry new_entry = new Entry(key,value);
	    if(Arr[index]==null){
	    	Arr[index] = new_entry;
	    }else{
	    	 Entry current = Arr[index];
	    	 while(current.next != null){
	    		 current = current.next;
	    	 }
	    	 current.next = new_entry;
	    }
	}
	
	public void get(K key){
		int index = hashing(key);
		if(key == null)
			return;
		
		if(Arr[index].key.equals(key)){
			System.out.println(Arr[index].value);
		}else{
			Entry current = Arr[index];
			
			while(current != null){
				
				if(current.key.equals(key)){
					System.out.println(current.value);
				}
				current = current.next;
			}
			
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Hashmap h = new Hashmap();
          h.put("FB", 31);
          h.put("Ea", 32);
          h.put("SM", 232);
          h.get("SM");
          
	}

}
