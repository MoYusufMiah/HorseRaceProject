import java.util.concurrent.TimeUnit;
import java.lang.Math;
import java.util.ArrayList;

/**
 * A three-horse race, each horse running in its own lane
 * for a given distance
 *
 * @author Mohammad Yusuf Miah
 * @version 1.0
 */
public class Race
{
    private int raceLength;
    private Horse lane1Horse;
    private Horse lane2Horse;
    private Horse lane3Horse;
    private String Winner;

    public String getWinner() {
        return Winner;
    }

    /**
     * Constructor for objects of class Race
     * Initially there are no horses in the lanes
     *
     * @param distance the length of the racetrack (in metres/yards...)
     */

    public Race(int distance)
    {
        // initialise instance variables
        raceLength = distance;
        lane1Horse = null;
        lane2Horse = null;
        lane3Horse = null;
    }

    /**
     * Adds a horse to the race in a given lane
     *
     * @param theHorse the horse to be added to the race
     * @param laneNumber the lane that the horse will be added to
     */
    public void addHorse(Horse theHorse, int laneNumber)
    {
        if (laneNumber == 1)
        {
            lane1Horse = theHorse;
        }
        else if (laneNumber == 2)
        {
            lane2Horse = theHorse;
        }
        else if (laneNumber == 3)
        {
            lane3Horse = theHorse;
        }
        else
        {
            System.out.println("Cannot add horse to lane " + laneNumber + " because there is no such lane");
        }
    }

    /**
     * Start the race
     * The horse are brought to the start and
     * then repeatedly moved forward until the
     * race is finished
     */
    public String[] startRace()
    {
        ArrayList<String> states = new ArrayList<String>();
        //declare a local variable to tell us when the race is finished
        boolean finished = false;

        //reset all the lanes (all horses not fallen and back to 0).
        lane1Horse.goBackToStart();
        lane2Horse.goBackToStart();
        lane3Horse.goBackToStart();

        while (!finished)
        {
            //move each horse
            moveHorse(lane1Horse);
            moveHorse(lane2Horse);
            moveHorse(lane3Horse);

            //print the race positions
             states.add(printRace());

            //if any of the three horses has won the race is finished
            if ( raceWonBy(lane1Horse))
            {
                finished = true;
                Winner = lane1Horse.getName();
                if ((RunGame.getHorse().equals(lane1Horse.getName())))
                {
                    Cash.getCash(lane1Horse.getWorth());
                }
            }
	    else if ( raceWonBy(lane2Horse))
            {
                finished = true;
                Winner = lane2Horse.getName();
            if ((RunGame.getHorse().equals(lane2Horse.getName()))) {
                Cash.getCash(lane2Horse.getWorth());
            }
	    }
	    else if ( raceWonBy(lane3Horse)) {
            finished = true;
            Winner = lane3Horse.getName();
            if ((RunGame.getHorse().equals(lane3Horse.getName()))) {

                Cash.getCash(lane3Horse.getWorth());
            }
	    }
        else if ( lane1Horse.hasFallen() && lane2Horse.hasFallen()&& lane3Horse.hasFallen())
        {
            finished = true;
            Winner = "no winner";

        }

            //wait for 100 milliseconds
            try{
                TimeUnit.MILLISECONDS.sleep(100);
            }catch(Exception e){}
        }
        String[] array = new String[states.size()];
        array = states.toArray(array);

    return array;
}


    /**
     * Randomly make a horse move forward or fall depending
     * on its confidence rating
     * A fallen horse cannot move
     *
     * @param theHorse the horse to be moved
     */
    private void moveHorse(Horse theHorse)
    {
        //if the horse has fallen it cannot move,
        //so only run if it has not fallen
        if  (!theHorse.hasFallen())
        {
            //the probability that the horse will move forward depends on the confidence;
            if (Math.random() < theHorse.getConfidence())
            {
               theHorse.moveForward();
            }

            //the probability that the horse will fall is very small (max is 0.1)
            //but will also will depends exponentially on confidence
            //so if you double the confidence, the probability that it will fall is *2
            if (Math.random() < (0.1*theHorse.getConfidence()*theHorse.getConfidence()))
            {
                theHorse.fall();
            }
        }
    }

    /**
     * Determines if a horse has won the race
     *
     * @param theHorse The horse we are testing
     * @return true if the horse has won, false otherwise.
     */
    private boolean raceWonBy(Horse theHorse)
    {
        if (theHorse.getDistanceTravelled() == raceLength)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /***
     * Print the race on the terminal
     */
    public String printRace()
    {
        StringBuilder sb = new StringBuilder();
        String Built ="";
        for (int i = 0; i < raceLength+3; i++){
            Built += "=";
        }
        sb.append("<html><body>");
        sb.append("<p>");
        sb.append(Built);
        sb.append("</p>");
        sb.append("<p>");
        sb.append(printLane(lane1Horse));
        sb.append("</p>");
        sb.append("<p>");
        sb.append(printLane(lane2Horse));
        sb.append("</p>");
        sb.append("<p>");
        sb.append(printLane(lane3Horse));
        sb.append("</p>");
        sb.append("<p>");
        sb.append(Built);
        sb.append("</p>");
        sb.append("</html></body>");
        return sb.toString();
    }

    /**
     * print a horse's lane during the race
     * for example
     * |           X                      |
     * to show how far the horse has run
     */
    private String printLane(Horse theHorse)
    {
        //calculate how many spaces are needed before
        //and after the horse
        int spacesBefore = theHorse.getDistanceTravelled();
        int spacesAfter = raceLength - theHorse.getDistanceTravelled();
        String built = "";


        built = built +"|";

        for (int i = 0; i < spacesBefore; i++){
            built = built + "..";
        }

        //if the horse has fallen then print dead
        //else print the horse's symbol
        if(theHorse.hasFallen())
        {
            built = built + "X";
        }
        else
        {
            built = built + theHorse.getSymbol();
        }

        for (int i = 0; i < spacesAfter; i++){
            built = built + "..";
        }

        //print the | for the end of the track
        built = built + "|";
        return built;
    }




}
