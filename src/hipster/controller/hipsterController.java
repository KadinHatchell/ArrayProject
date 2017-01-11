package hipster.controller;

import hipster.model.Hipster;
import hipster.view.hipsterFrame;

public class hipsterController
{
	private String [] words = {"this", "is", "the", "next", "level", "of", "Hipster", "the", "initialization", "sequence"};
	private Hipster [] hipsters;
	private int [] numbers;
	private hipsterFrame appFrame;
	
	public hipsterController()
	{
		showHipsterLevelThree();
		hipsters = new Hipster [5];
		
		for (int index= 0; index < hipsters.length; index++)
		{
			hipsters[index] = new Hipster("Hipster #" + index);
		}
		
		appFrame = new hipsterFrame(this);
		
		
		
	}
	
	
	
	public void start()
	{
		hipsters[0].setName("asdasd");
		
		for (Hipster current : hipsters)
		{
			System.out.println(current);
		}
		
		
	}

	private void showHipsterLevelThree()
	{
		numbers = new int [] {1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1};
	}
	
	public Hipster[] getHipsters()
	{
		return hipsters;
	}
	public String[] getWords()
	{
		return words;
	}
	public int[] numbers()
	{
		return numbers;
	}
}
