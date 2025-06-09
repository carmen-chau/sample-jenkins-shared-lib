void call(String gitUrlVarName, String buildStageVarName) {
    try {

        // Variable reassignment, logging values for verification
        // Note: Even when the variable is null, this shouldn't throw any errors nor exceptions
        def gitRepoName = env[gitUrlVarName]
        def buildStageName = env[buildStageVarName]
        echo "Inside the helper script, the value of ${gitUrlVarName} is: ${gitRepoName}"
        echo "Inside the helper script, the value of ${buildStageVarName} is: ${buildStageName}"

        // Attempt to call a string function for variable gitRepoName
        // Key Idea: If the variable stores a null value, this should throw an exception
        def revisedGitRepoName = gitRepoName.split(" ")
        echo "Inside the helper script, the value of revisedGitRepoName is: ${revisedGitRepoName}"
    }
    catch (Exception e){
        echo "Scan failed"
        throw e
    }
}