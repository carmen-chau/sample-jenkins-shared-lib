void call(String gitURLVarName, String buildStageVarName) {
    try {

        // Variable reassignment, logging values for verification
        def gitRepoName = env[gitUrlVarName]
        def buildStageName = env[buildStageVarName]
        echo "Inside the helper script, the value of ${gitURLVarName} is: ${gitRepoName}"
        echo "Inside the helper script, the value of ${buildStageVarName} is: ${buildStageName}"

        //
    }
    catch (Exception e){
        echo "Scan failed"
        throw e
    }
}