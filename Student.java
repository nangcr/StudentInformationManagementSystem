public class Student {
	private int Id;
	private String Name;
	private String Sex;
	private String Classroom;
	private int ChineseScore;
	private int EnglishScore;
	private int TotalScore;

	public void setId(int id) {
		this.Id = id;
	}

	public int getId() {
		return this.Id;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getName() {
		return this.Name;
	}

	public void setSex(String sex) {
		this.Sex = sex;
	}

	public String getSex() {
		return this.Sex;
	}

	public void setClassroom(String classroom) {
		this.Classroom = classroom;
	}

	public String getClassroom() {
		return this.Classroom;
	}

	public void setChineseScore(int chineseScore) {
		this.ChineseScore = chineseScore;
	}

	public int getChineseScore() {
		return this.ChineseScore;
	}

	public void setEnglishScore(int englishScore) {
		this.EnglishScore = englishScore;
	}

	public int getEnglishScore() {
		return this.EnglishScore;
	}

	public void genTotalScore() {
		this.TotalScore = this.ChineseScore + this.EnglishScore;
	}

	public int getTotalScore() {
		return this.TotalScore;
	}

	public void showInfo() {
		System.out.printf("%-15d%-15s%-15s%-15s%-15d%-15d%-15d\n",
				this.getId(), this.getName(), this.getSex(), this
						.getClassroom(), this.ChineseScore, this.EnglishScore,
				this.TotalScore);
	}

}
