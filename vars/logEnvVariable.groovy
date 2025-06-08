void call(String envVariableName) {
    echo "Value of ${envVariableName} is: ${env[envVariableName]}"
}