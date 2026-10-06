class Solution 
{
    public String sortSentence(String s) 
    {
        int n=s.length();
        String[] word =s.split(" ");
        String[] arr=new String[word.length];
        for(int i=0;i<word.length;i++) 
        {   
            arr[Integer.parseInt(word[i].substring(word[i].length()-1,word[i].length()))-1]=word[i].substring(0,word[i].length()-1);
        }
        return String.join(" ",arr);
    }
}
