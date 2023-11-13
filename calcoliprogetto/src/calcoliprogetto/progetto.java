package calcoliprogetto;

public class progetto
{
	private int BAC;
	private int AttPiani;
	private int CostoPiani;
	public progetto(int bAC, int attPiani, int attAttuali, int costoPiani, int costoAtt) {
		super();
		BAC = bAC;
		AttPiani = attPiani;
		AttAttuali = attAttuali;
		CostoPiani = costoPiani;
		CostoAtt = costoAtt;
	}
	
	public int ACWP(int CostoAttuale,int AttivitaAttuali) 
	{
		return CostoAttuale*AttivitaAttuali;
	}
	

}
