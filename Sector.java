import java.util.Random;


public class Sector{
    String location = "";
    

    public void chest(){
        // Creating  a random object
        Random random = new Random();

        // get a radom array size
        int numberOfArtifacts = random.nextInt(5);

        Artifact[] chestArtfacts = new Artifact[numberOfArtifacts];

        for(int i=0 ; i <= numberOfArtifacts ; i++){

            int indexOfArtifact  = random.nextInt(9);
            
            Artifact artifact = new Artifact(indexOfArtifact);
            
            artifact.ser
            chestArtfacts[i] = artifact
            
        }

    }
}