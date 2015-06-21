package Tree_Problems;

import Queue.LLQueue;
import Trees.BTNode;

public class BTMAXSumLevel {
	
	public int maxSumLevel(BTNode root){
		int maxLevel =0, currentLevelSum = 0, maxLevelSum =0, currentLevel =0;
		if(root==null){
			System.out.println("No Tree");
			return 0;
		}
		LLQueue q = new LLQueue();
		q.enQueueObject(root);
		q.enQueueObject(null);
		while(!q.isEmpty()){
			BTNode temp = (BTNode) q.deQueueObject();
			if(temp==null){
					if (currentLevelSum > maxLevelSum){
						maxLevelSum = currentLevelSum;
						maxLevel = currentLevel;
					}
					currentLevel++;							// Beware where you are incrementing the level. Don't increment 
															// it before comparing the sum.
					currentLevelSum = 0;
					if(!q.isEmpty()){						// Beware of this check. Use it to only place the null for the next level.
						q.enQueueObject(null);
					}
			}
			else{
				currentLevelSum = currentLevelSum + temp.getData();
				if(temp.getLeft()!=null)
					q.enQueueObject(temp.getLeft());
				if(temp.getRight()!=null)
					q.enQueueObject(temp.getRight());
			}
		}
		return maxLevel;
	}

}
