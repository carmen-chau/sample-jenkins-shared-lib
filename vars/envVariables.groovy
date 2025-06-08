// A file that attempts to assign/create new env variables
void call(){
    try {
        env.FAV_FRUIT = "strawberry"
    }
    catch (Exception e){
        echo "Variable assignment or creation has failed"
        throw e
    }
}