def call(int numberOfStages) {
    pipeline {
		agent any
		stages 
		{
			for (i = 0; i <numberOfStages; i++) {
				stage('Even Stage') 
				{
					steps {
						echo "Stage ${i} is executed"
					}
				}	
			}
		}
	}
}