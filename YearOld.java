class YearOld 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		//创建键盘扫描对象
		//调用Scanner对象的next（）方法接收键盘输入
		java.util.Scanner s = new java.util.Scanner(System.in);
		int  year = s.nextInt();
		System.out.println("你输入的是"+year);
		if(year<0 || year>150)
		{
			System.out.println("输入错误");
		}
			else if(year>=56 && year<=150)
			{
				System.out.println("此人处于老年阶段");
			}
				else if(year>=36 && year<=55){
					System.out.println("此人处于中年阶段");
				}
					else if(year>=19 && year<=35)
				{
					System.out.println("此人处于青年阶段");
				}
					else if(year>=10 && year<=18)
					{
						System.out.println("此人处于少年阶段");
					}
						else if(year>=5 && year<=9)
						{
							System.out.println("此人处于幼年阶段!!");
						}
							else if(year>=0 && year<=4)
							{
								System.out.println("此人处于孩童阶段");
							}

	}
}
