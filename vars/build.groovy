def call(env){
  echo "hey user, this is ${env} build stage!"
  sh "mvn clean install"
}
