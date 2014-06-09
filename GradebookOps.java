public class GradebookOps
{
	public static int findStudent(String studentName, String[] allStudentNames, boolean alphabetical)
	{
		for (int i = 0; i < allStudentNames.length; i++){
			int count = 1;
			if(allStudentNames[i].equalsIgnoreCase(studentName)){
			return i;}
			
			else{
				count ++;
				if (count == allStudentNames.length){
					break;
				}
				
				}
			}
		
		return -1;}

	public static double computeGrade(int studentIndex, int[][] scoreTable, int[] itemPointValues)
	{
		double totalPoints = 0;
		double totalPossible = 0;
	
		for (int i = 0; i<scoreTable[studentIndex][i]; i++){
			if (scoreTable[studentIndex][i]!=-1){
				totalPoints += scoreTable[studentIndex][i];
				totalPossible += itemPointValues[i];
			}
			else{
				continue;
			}
		}
		double numericalPercentage = (totalPoints/totalPossible)*100;
		return numericalPercentage;}
	
	public static double[] computeAllGrades(int[][] scoreTable, int[] itemPointValues)
	{
		double [] grades = new double [scoreTable.length];
		for (int r = 0; r<scoreTable.length; r++){
			double totalPoints = 0;
			double totalPossible = 0;
		
			for (int i = 0; i<scoreTable[r].length; i++){
				if (scoreTable[r][i]!=-1){
					totalPoints += scoreTable[r][i];
					totalPossible += itemPointValues[i];
				}
				else{
					continue;
				}
			}
			double numericalPercentage = (totalPoints/totalPossible)*100;
			grades[r] = numericalPercentage;
		
		}
		return grades;}
	

	public static double computeClassAverage(int item, int[][] scoreTable)
	{
		double classAverage = 0;
		for (int i = 0; i<scoreTable.length; i++){
			if (scoreTable[i][item]!=-1){
				classAverage += scoreTable[i][item];
			}
			else {
				continue;
			}
			
		}
		
		double realAverage = classAverage/scoreTable.length;
		return realAverage;
	}
		
	public static void swapStudents(
		int index1, int index2,
		String[] allStudentNames, int[][] scoreTable, double[] grades)
	{
		String k = allStudentNames[index1];
		allStudentNames[index1] = allStudentNames[index2];
		allStudentNames[index2] = k;
		
		double s = grades[index1];
		grades[index1] = grades[index2];
		grades[index2] = s;
		
		for (int i = 0; i<scoreTable[index1].length; i++){
			int f = scoreTable[index1][i];
			scoreTable[index1][i]=scoreTable[index2][i];
			scoreTable[index2][i]= f;
		}
		
		
	}

}