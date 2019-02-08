package hashing;


public class HashMapImplement<K,V> {
	
	int capacity;
	Entry[] arr;

	class Entry<K,V>{
		K key;
		V value;
		Entry next;
		Entry(K key,V value){
			this.key=key;
			this.value=value;
			next=null;
		}
	}
	
	HashMapImplement(){
		this.capacity=16;
		arr=new Entry[capacity];
	}
	
	HashMapImplement(int capacity){
		this.capacity=capacity;
		arr = new Entry[capacity];
	}
	
	public int hashing(K key){
		return Math.abs(key.hashCode())%(this.capacity-1);
	}
	
	public void put(K key,V value){
		int index = hashing(key);
		Entry new_entry = new Entry(key,value);
		if(arr[index]==null){
			arr[index]=new_entry;
		}
		else{
			Entry current = arr[index];
			while(current.next!=null){
				current = current.next;
			}
			current.next=new_entry;
		}
	}
		
	public void get(K key){
		int index = hashing(key);
		if(key==null)
			return;
		
		if(arr[index].key.equals(key)){
			System.out.println(arr[index].value);
		}else{
			Entry current = arr[index];
			while(current!=null){
				if(current.key.equals(key)){
					System.out.println(current.value);
				}
				current = current.next;
			}
		}
	}
	
	public static void main(String[] args) {
		
		HashMapImplement obj = new HashMapImplement();
		obj.put("sayantan", 123);
		obj.put("sdsa",45);
		obj.put("Ea", 12);
		obj.put("FB", 158);
		
		obj.get("Ea");

	}

}
