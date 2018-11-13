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

	// ��带 �Է� �޾� �� ��ü�� �ϳ��� �������� ����� ����
	public void make_set(Node x){
		x.parent=x;
	}
S
	public void union(Node a, Node b) {

		a=find(a);
		b=find(b);
		//�̹� ���� ���� Ʈ���� ���� ���
		if(a==b) return;
		
		// x�� y�� �θ� �ٸ��� ��ģ��.
		b.parent=a;
	}

	//���x�� ���� ������ �˾Ƴ��� �Լ�(��Ʈ��� ��ȯ)
	public Node find(Node x) {
		if (x.parent.equals(x)) { // ��Ʈ ����� ��ȯ
			return x;
		}
		return find(x.parent); // �ƴϸ� �θ� ��带 ã�� �ö󰣴�.
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
