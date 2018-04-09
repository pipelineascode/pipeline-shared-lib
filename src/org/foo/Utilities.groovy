package org.foo;
import hudson.model.*

// Get the out variable
def config = new HashMap()
def bindings = getBinding()
config.putAll(bindings.getVariables())

def out = config['out']
out.println("Before mvn")


class Utilities {

	def steps
  	Utilities(steps) {this.steps = steps}
  	def mvn(args, out) {
    	//steps.sh "${steps.tool 'Maven'}/bin/mvn -o ${args}"
    	out.println "in static mvn"
  	}


/*	
	static def mvn(script, args) {
    	out.println "in static mvn"
  	}
*/
}