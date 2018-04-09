package org.foo;
import hudson.model.*

class Utilities {

	def steps
  	Utilities(steps) {this.steps = steps}
  	def mvn(args, out) {
    	//steps.sh "${steps.tool 'Maven'}/bin/mvn -o ${args}"
    	//out.println "in static mvn"
    	steps.echo "using steps.echo"
  	}


/*	
	static def mvn(script, args) {
    	out.println "in static mvn"
  	}
*/
}

/*
// Get the out variable
def config = new HashMap()
def bindings = getBinding()
config.putAll(bindings.getVariables())

def out = config['out']
out.println("Before mvn")
*/