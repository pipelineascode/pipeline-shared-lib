package org.foo;

class Utilities {
  static def mvn(script, args, out) {
    //script.sh "${script.tool 'Maven'}/bin/mvn -s ${script.env.HOME}/jenkins.xml -o ${args}"
    out.println "in static mvn"
  }
}