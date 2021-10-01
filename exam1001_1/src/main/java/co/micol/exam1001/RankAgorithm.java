package co.micol.exam1001;

public class RankAgorithm {
	private int[] grade = {80, 100, 50, 80, 73, 42};
	private int[] rank;
	private void rank() {
//		int[] rank = new int[grade.length]; 지역변수
		rank= new int [grade.length];
		for(int i=0; i< rank.length;i++) { //rank 배열 초기화
			rank[i] =1;
		}

//		for(int i:rank) {
//			i=1;
//		} 변수값이 1임, 요소값이 1이 되지 않음 입력할 때 사용하지 않음, 값을 불러와서 넣을 때 사용가능
		
		
		for(int i=0; i<grade.length -1; i++) {
			for(int j=i+1 ; j<grade.length;j++) {
				if(grade[i]>grade[j]) {
					rank[j] ++;
				}else if(grade[i] < grade[j]) {
					rank[i] ++;
				}
			}
		}
	}
	
	public String toString() {
		rank();
		for(int g : grade) { //forEach구문 값을 읽을 때 사용한다
			System.out.print(g+ " ");
		}
		System.out.println();
		for(int r: rank) {
			System.out.print(r+ " ");
		}
		return null;
	}
}
