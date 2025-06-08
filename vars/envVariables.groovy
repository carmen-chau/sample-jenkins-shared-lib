// A file that attempts to assign/create new env variables
void call(){
    try {
        env.nexusIQStage = "build"
    }
    catch (Exception e){
        echo "Variable assignment or creation has failed"
        throw e
    }
}