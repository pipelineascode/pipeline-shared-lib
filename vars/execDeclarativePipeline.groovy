def call(String stageName) {
    pipeline {
		agent any
		stages 
		{
			stage("${stageName}") 
			{
				steps 
				{
					echo "Stage ${stageName} is executed"
				}
			}	
		}
	}
}