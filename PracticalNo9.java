class PracticalNo9{
	public static void main(String[] args){
		String str = "UTSAV" ;
		long StartTime = 0;
		long EndTime = 0;
		long TotalTime = 0;
		for(int i=0; i<=2026; i++){
			StartTime = System.nanoTime();
			str = str+"_"+i ;
			EndTime = System.nanoTime();
			TotalTime = EndTime - StartTime;
		}
		System.out.println(str);
		System.out.println("Time required: "+TotalTime);

		StringBuffer s1 = new StringBuffer("UTSAV");
		for(int i=0; i<=2026; i++){
			StartTime = System.nanoTime();
			s1.append("_"+i);
			EndTime = System.nanoTime();
			TotalTime = EndTime - StartTime;
		}
		System.out.println(s1);
		System.out.println("Time required: "+TotalTime);

		StringBuilder s2 = new StringBuilder("UTSAV");
		for(int i=0; i<=2026; i++){
			StartTime = System.nanoTime();
			s2.append("_"+i);
			EndTime = System.nanoTime();
			TotalTime = EndTime - StartTime;
		}
		System.out.println(s1);
		System.out.println("Time required: "+TotalTime);


	}
}