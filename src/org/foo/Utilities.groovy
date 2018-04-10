package org.foo;

class Utilities {

	def steps
  	Utilities(steps) {this.steps = steps}
  	def mvn(args, out) {
    	//steps.sh "${steps.tool 'Maven'}/bin/mvn -o ${args}"
    	//out.println "in static mvn"
    	steps.echo "using steps.echo"
  	}
}


