def call(env){
  echo "hey user, this is ${env} build stage!"
  bat "mvn clean install"
}
