package trie;

import java.util.HashMap;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Trie_Tree trie = new Trie_Tree();
	     trie.insert("I");
	     trie.insert("Love");
	     trie.insert("China");
	     trie.insert("China");
	     trie.insert("China");
	     trie.insert("China");
	     trie.insert("China");
	     trie.insert("xiaoliang");
	     trie.insert("xiaoliang");
	     trie.insert("man");
	     trie.insert("handsome");
	     trie.insert("love");
	     trie.insert("chinaha");
	     trie.insert("her");
	     trie.insert("know");
	   
	     HashMap<String,Integer> map=trie.getAllWords();
	     
	     for(String key:map.keySet()){
	      System.out.println(key+" ����: "+ map.get(key)+"��");
	     }
	     
	     
	     map=trie.getWordsForPrefix("chin");
	     
	     System.out.println("\n\n����chin����������ǰ׺�ĵ��ʼ����ִ�����");
	     for(String key:map.keySet()){
	      System.out.println(key+" ����: "+ map.get(key)+"��");
	     }
	     
	     if(trie.isExist("xiaoming")==false){
	      System.out.println("\n\n�ֵ����в����ڣ�xiaoming ");
	     }
	     
	     
	}

}
