package disjointSet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class DisjointSet {
	File file = new File("C:/Users/Administrator/Desktop/Result1.txt");
	BufferedWriter bw = null;
	PrintWriter pw = null;

	//static String[] parent = new String[20];

	// 노드를 입력 받아 그 자체를 하나의 집합으로 만드는 과정
	public void make_set(Node x){
		x.parent=x;
	}
S
	public void union(Node a, Node b) {

		a=find(a);
		b=find(b);
		//이미 둘이 같은 트리에 속한 경우
		if(a==b) return;
		
		// x와 y의 부모가 다르면 합친다.
		b.parent=a;
	}

	//노드x가 속한 집합을 알아내는 함수(루트노드 반환)
	public Node find(Node x) {
		if (x.parent.equals(x)) { // 루트 노드라면 반환
			return x;
		}
		return find(x.parent); // 아니면 부모 노드를 찾아 올라간다.
	}

	public static void main(String[] args) throws IOException {
		DisjointSet ds = new DisjointSet();
		Node newNode;
		BufferedReader br = new BufferedReader(new FileReader("E:/algorithm/Al07_20181112/src/disjointSet/Data.txt"));
		int i = 0;
		List<String> listChar = new ArrayList<>();
		List<Integer> listNum = new ArrayList<>();

		while (true) {
			String line = br.readLine();
			if (line == null) {
				break;
			} else {
				String[] list = line.split("\t");
				listChar.add(list[0]);
				listNum.add(Integer.parseInt(list[1]));
				
				newNode = new Node(listChar.get(i),listNum.get(i));
				ds.make_set(newNode);
			}
			if(i>1) {
				union(,);
			}
			i++;
		}
		br.close();
	}

}
