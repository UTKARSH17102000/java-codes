package tries;

public class Triesclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tries trie =new Tries();
		trie.addWord("arts");
		trie.addWord("art");
		trie.addWord("bug");
		trie.addWord("boy");
		trie.addWord("sea");
		trie.addWord("seen");
		trie.addWord("see");
		trie.addWord("amit");
		trie.display();
		
//System.out.println(trie.search("art"));
//System.out.println(trie.search("seen"));
//System.out.println(trie.search("arpit"));
   trie.remove("arts");
   trie.display();
   trie.remove("art");
   trie.display();

	}

}
