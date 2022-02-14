import java.util.ArrayList;

public class Delimiters
{
    /** The open and close delimiters **/
    private String openDel;
    private String closeDel;

    /** Constructs a Delimiters object where open is the open delimiter and close is the
     *  close delimiter.
     *  Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close)
    {
        openDel = open;
        closeDel = close;
    }

    /** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
    public ArrayList<String> getDelimitersList(String[] tokens)
    {
        ArrayList<String> list = new ArrayList<String>();
        for (String token : tokens)
        {
            if (token.equals(openDel) || token.equals(closeDel))
            {
                list.add(token);
            }
        }
        return list;
    }

    /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     *  Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters)
    {
        String[] list = new String[delimiters.size()];
        for (int i = 0; i < list.length; i++)
        {
            list[i] = delimiters.get(i);
        }
        if (list.length % 2 == 1)
        {
            return false;
        }
        for (int i = 0; i < list.length; i++)
        {
            if (i % 2 == 0 && !list[i].equals(openDel))
            {
                return false;
            }
            else if (i % 2 == 1 && !list[i].equals(closeDel))
            {
                return false;
            }
        }
        return true;
    }
}