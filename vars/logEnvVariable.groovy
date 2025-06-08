void call(String envVariableName) {
    echo "Inside the helper script, the value of ${envVariableName} is: ${env[envVariableName]}"
}