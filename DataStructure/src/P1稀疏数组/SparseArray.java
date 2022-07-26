package P1稀疏数组;

/**
 * @Description 实现稀疏数组及恢复
 * 课后练习：IO流
 * @Param [session]
 * @Return java.lang.String
 * @Throws
 * @Author clovenine
 * @Date 2022/7/23 10:04
 * @Version 1.0
 */
public class SparseArray {

	public static void main(String[] args) {
		// 创建11*11的数组
		// 0:没有棋子 1：黑子 2：白子
		int chessArr1[][] = new int[11][11];
		chessArr1[1][2] = 1;
		chessArr1[2][3] = 2;
		// 原始二维数组
		for(int[] row : chessArr1){
			for(int data : row){
				System.out.printf("%d\t" , data);
			}
			System.out.println();
		}
		// 行
		System.out.println("chessArr1.length = " + chessArr1.length);
		// 列
		System.out.println("chessArr1[0].length = " + chessArr1[0].length);
		int sum = 0;
		for(int[] row : chessArr1){
			for(int data : row){
				if(data != 0){
					sum++;
				}
			}
		}
		System.out.println("sum = " + sum);

		// 创建对应的稀疏数组
		int sparseArray[][] = new int[sum + 1][3];
		// 给稀疏数组赋值
		sparseArray[0][0] = chessArr1.length;
		sparseArray[0][1] = chessArr1[0].length;
		sparseArray[0][2] = sum;
		// 用于记录第几个非0数据
		int tag = 0;
		 // 遍历二维数组， 将非0值放到稀疏数组中
		for(int i = 0; i < chessArr1.length; i++){
			for(int j = 0; j < chessArr1[0].length; j++){
				if(chessArr1[i][j] != 0){
					tag++;
					sparseArray[tag][0] = i;
					sparseArray[tag][1] = j;
					sparseArray[tag][2] = chessArr1[i][j];
				}


			}
		}

		// 输出稀疏数组
		System.out.println("输出稀疏数组:");
		for(int[] row : sparseArray){
			for(int data : row){
				System.out.printf("%d\t", data);
			}
			System.out.println();
		}

		// 将稀疏数组恢复成原来数组
		int[][] chessArray = new int[sparseArray[0][0]][sparseArray[0][1]];
		for(int i = 1; i <= sparseArray[0][2]; i++){
			chessArray[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
		}

		// 输出恢复后的二维数组
		System.out.println("输出恢复后的二维数组");
		for(int[] row : chessArray){
			for(int data : row){
				System.out.printf("%d\t", data);
			}
			System.out.println();
		}
	}

}

